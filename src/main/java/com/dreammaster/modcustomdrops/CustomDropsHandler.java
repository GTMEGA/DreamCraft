package com.dreammaster.modcustomdrops;

import com.dreammaster.main.MainRegistry;
import com.dreammaster.Tags;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import eu.usrv.yamcore.auxiliary.ItemDescriptor;
import eu.usrv.yamcore.auxiliary.LogHelper;
import eu.usrv.yamcore.auxiliary.PlayerChatHelper;
import eu.usrv.yamcore.persisteddata.PersistedDataBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomDropsHandler
{
    private LogHelper _mLogger = MainRegistry.Logger;
    private String _mConfigFileName;
    private CustomDropsFactory _mCfF = new CustomDropsFactory();
    private CustomDrops _mCustomDrops;
    private PersistedDataBase _mPersistedDB;
    private List<UUID> _mDeathDebugPlayers;

    public CustomDropsHandler(File pConfigBaseDir)
    {
        _mConfigFileName = String.format("config/%s/CustomDrops.xml", Tags.COLLECTIONID);
        // _mPersistedDB = new PersistedDataBase(pConfigBaseDir,
        // "CustomDrops.ser", Refstrings.COLLECTIONID);
        _mDeathDebugPlayers = new ArrayList<>();
    }

    public void InitSampleConfig()
    {
        CustomDrops.CustomDrop.Drop pigDiamondLimitedDrop = _mCfF.createDrop("minecraft:diamond", "sample_Pig_DiamondDrop", "{Lore: [\"Oh, shiny!\"]}", 1, false, 100, 5);
        CustomDrops.CustomDrop.Drop pigCakeUnlimitedDrop = _mCfF.createDrop("minecraft:cake", "sample_Pig_CakeDrop", 1, false, 100, 0);
        CustomDrops.CustomDrop.Drop pigRandomCharcoalDrop = _mCfF.createDrop("minecraft:coal:1", "sample_Pig_CharcoalDrop", 5, true, 100, 0);

        CustomDrops.CustomDrop pigDrop = _mCfF.createCustomDropEntry("eu.usrv.dummyEntity.ImbaSampleDragon");
        pigDrop.getDrops().add(pigDiamondLimitedDrop);
        pigDrop.getDrops().add(pigCakeUnlimitedDrop);
        pigDrop.getDrops().add(pigRandomCharcoalDrop);

        _mCustomDrops = new CustomDrops();
        _mCustomDrops.getCustomDrops().add(pigDrop);
    }

    public boolean SaveCustomDrops()
    {
        try
        {
            JAXBContext tJaxbCtx = JAXBContext.newInstance(CustomDrops.class);
            Marshaller jaxMarsh = tJaxbCtx.createMarshaller();
            jaxMarsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxMarsh.marshal(_mCustomDrops, new FileOutputStream(_mConfigFileName, false));

            _mLogger.debug("Config file written");
            return true;
        }
        catch (Exception e)
        {
            _mLogger.error("Unable to create new CustomDrops.xml. What did you do??");
            e.printStackTrace();
            return false;
        }
    }

    public void LoadConfig()
    {
        _mLogger.debug("CustomDrops entering state: LOAD CONFIG");
        File tConfigFile = new File(_mConfigFileName);
        if (!tConfigFile.exists())
        {
            _mLogger.debug("CustomDrops Config file not found, assuming first-start. Creating default one");
            InitSampleConfig();
            SaveCustomDrops();
        }

        // Fix for broken XML file; If it can't be loaded on reboot, keep it
        // there to be fixed, but load
        // default setting instead, so an Op/Admin can do reload ingame
        if (!ReloadCustomDrops())
        {
            _mLogger.warn("Configuration File seems to be damaged, loading does-nothing-evil default config. You should fix your file and reload it");
            MainRegistry.AddLoginError("[CustomDrops] Config file not loaded due errors");
            InitSampleConfig();
        }
    }

    private boolean VerifyConfig(CustomDrops pDropListToCheck)
    {
        boolean tSuccess = true;

        for (CustomDrops.CustomDrop X : pDropListToCheck.getCustomDrops())
        {
            for (CustomDrops.CustomDrop.Drop Y : X.getDrops())
            {
                if (ItemDescriptor.fromString(Y.getItemName()) == null)
                {
                    _mLogger.error(String.format("In ItemDropID: [%s], can't find item [%s]", Y.getIdentifier(), Y.getItemName()));
                    tSuccess = false;
                }

                if (Y.mTag != null && !Y.mTag.isEmpty())
                {
                    try
                    {
                        NBTTagCompound tNBT = (NBTTagCompound) JsonToNBT.func_150315_a(Y.mTag);
                        if (tNBT == null) {
                            tSuccess = false;
                        }
                    }
                    catch (Exception e)
                    {
                        _mLogger.error(String.format("In ItemDropID: [%s], NBTTag is invalid", Y.getIdentifier()));
                        tSuccess = false;
                    }
                }
            }
        }
        return tSuccess;
    }

    public boolean ReloadCustomDrops()
    {
        boolean tResult = false;

        _mLogger.debug("CustomDropsHandler will now try to load its configuration");
        try
        {
            JAXBContext tJaxbCtx = JAXBContext.newInstance(CustomDrops.class);
            File tConfigFile = new File(_mConfigFileName);
            Unmarshaller jaxUnmarsh = tJaxbCtx.createUnmarshaller();
            CustomDrops tNewItemCollection = (CustomDrops) jaxUnmarsh.unmarshal(tConfigFile);
            _mLogger.debug("Config file has been loaded. Entering Verify state");

            if (!VerifyConfig(tNewItemCollection))
            {
                _mLogger.error("New config will NOT be activated. Please check your error-log and try again");
                tResult = false;
            }
            else
            {
                _mCustomDrops = tNewItemCollection;
                tResult = true;
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return tResult;
    }

    @SubscribeEvent
    public void onMobDrops(LivingDropsEvent pEvent)
    {
        try
        {
            EntityLivingBase tEntity = pEvent.entityLiving;
            UUID tUUID;
            EntityPlayer tEP = null;

            if (pEvent.source.getEntity() != null)
            {
                if (pEvent.source.getEntity() instanceof EntityPlayer)
                {
                    tEP = (EntityPlayer) pEvent.source.getEntity();
                    tUUID = tEP.getUniqueID();
                    if (_mDeathDebugPlayers.contains(tUUID)) {
                        PlayerChatHelper.SendInfo(tEP, String.format("Killed entity: [%s]", tEntity.getClass().getName()));
                    }
                }
            }

            if (tEP == null) // Not doing anything, only players are valid
            {
                return;
            }
            if (tEP instanceof FakePlayer) // Nope,
                                                                          // no
                                                                          // fakeplayers
            {
                return;
            }

            CustomDrops.CustomDrop tCustomDrop = _mCustomDrops.FindDropEntry(tEntity);
            if (tCustomDrop == null) {
                return; // no custom drop defined for this
            }
                                             // mob, skipping

            HandleCustomDrops(tCustomDrop, tEntity, tEP, pEvent.drops);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /*
     * @SubscribeEvent public void
     * LivingDeathEvent(net.minecraftforge.event.entity.living.LivingDeathEvent
     * pEvent) { try { EntityLivingBase tEntity = pEvent.entityLiving; UUID
     * tUUID = null; EntityPlayer tEP = null;
     *
     * if (pEvent.source.getEntity() != null) { if (pEvent.source.getEntity()
     * instanceof EntityPlayer) { tEP = (EntityPlayer)pEvent.source.getEntity();
     * tUUID = tEP.getUniqueID(); if (_mDeathDebugPlayers.contains(tUUID))
     * PlayerChatHelper.SendInfo(tEP, String.format("Killed entity: [%s]",
     * tEntity.getClass().getName())); } }
     *
     * if (tEP == null) // Not doing anything, only players are valid return; if
     * (tEP instanceof net.minecraftforge.common.util.FakePlayer) // Nope, no
     * fakeplayers return;
     *
     * CustomDrop tCustomDrop = _mCustomDrops.FindDropEntry(tEntity); if
     * (tCustomDrop == null) return; // no custom drop defined for this mob,
     * skipping
     *
     * HandleCustomDrops(tCustomDrop, tEntity, tEP); } catch (Exception e) {
     * e.printStackTrace(); } }
     */
    private void HandleCustomDrops(CustomDrops.CustomDrop tCustomDrop, EntityLivingBase tEntity, EntityPlayer tEP, ArrayList<EntityItem> pDropList)
    {
        try
        {
            if (_mPersistedDB == null)
            {
                _mPersistedDB = new PersistedDataBase(DimensionManager.getCurrentSaveRootDirectory(), "CustomDrops.dat", Tags.COLLECTIONID);
            }

            for (CustomDrops.CustomDrop.Drop dr : tCustomDrop.getDrops())
            {
                String tDropID = dr.getIdentifier();
                String tUserID = tEP.getUniqueID().toString();
                String tFinalDropID = String.format("%s.%s", tUserID, tDropID);
                int tFinalAmount = dr.getAmount();

                if (MainRegistry.Rnd.nextInt(100) > dr.getChance()) {
                    continue;
                }

                // Is this drop limited?
                if (dr.getLimitedDropCount() > 0)
                {
                    // if it is, check if player already got this item. If so,
                    // skip this drop
                    int tDropCount = _mPersistedDB.getValueAsInt(tFinalDropID, 0);
                    if (tDropCount >= dr.getLimitedDropCount()) {
                        continue;
                    } else
                    {
                        // Player will get the drop this time, increase his
                        // counter
                        _mPersistedDB.setValue(tFinalDropID, ++tDropCount);
                    }
                }

                if (dr.getIsRandomAmount()) {
                    tFinalAmount = 1 + MainRegistry.Rnd.nextInt(dr.getAmount() - 1);
                }

                ItemStack tDropStack = ItemDescriptor.fromString(dr.getItemName()).getItemStackwNBT(tFinalAmount, dr.mTag);
                if (tDropStack == null) {
                    _mLogger.error(String.format("CustomDrop ID %s failed to drop",dr.getIdentifier()));
                } else
                {
                    EntityItem tDropEntity = new EntityItem(tEntity.worldObj, tEntity.posX, tEntity.posY, tEntity.posZ, tDropStack);
                    pDropList.add(tDropEntity);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void toggleDeathInfoForPlayer(EntityPlayer pEP)
    {
        UUID tUUID = pEP.getUniqueID();
        if (_mDeathDebugPlayers.contains(tUUID))
        {
            _mDeathDebugPlayers.remove(tUUID);
            PlayerChatHelper.SendInfo(pEP, "Death-Debug is now diabled");
        }
        else
        {
            _mDeathDebugPlayers.add(tUUID);
            PlayerChatHelper.SendInfo(pEP, "Death-Debug is now enabled");
        }
    }
}
