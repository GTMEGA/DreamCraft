package com.dreammaster.main;

import com.dreammaster.Const;
import com.dreammaster.Tags;
import com.dreammaster.TwilightForest.TF_Loot_Chests;
import com.dreammaster.block.BlockList;
import com.dreammaster.command.*;
import com.dreammaster.config.CoreModConfig;
import com.dreammaster.fluids.FluidList;
import com.dreammaster.gthandler.*;
import com.dreammaster.item.ItemList;
import com.dreammaster.loginhandler.LoginHandler;
import com.dreammaster.modctt.CustomToolTipsHandler;
import com.dreammaster.modcustomdrops.CustomDropsHandler;
import com.dreammaster.modcustomfuels.CustomFuelsHandler;
import com.dreammaster.modfixes.GTpp.GregTechPlusPlusAbandonedAspectsFix;
import com.dreammaster.modfixes.ModFixesMaster;
import com.dreammaster.modfixes.avaritia.SkullFireSwordDropFix;
import com.dreammaster.modfixes.gravisuite.HoverModeFix;
import com.dreammaster.modfixes.minetweaker.MinetweakerFurnaceFix;
import com.dreammaster.modfixes.oilgen.OilGeneratorFix;
import com.dreammaster.modhazardousitems.HazardousItemsHandler;
import com.dreammaster.network.CoreModDispatcher;
//import com.dreammaster.railcraftStones.NH_GeodePopulator;
//import com.dreammaster.railcraftStones.NH_QuarryPopulator;
//import com.dreammaster.witchery.WitcheryPlugin;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import eu.usrv.yamcore.YAMCore;
import eu.usrv.yamcore.auxiliary.IngameErrorLog;
import eu.usrv.yamcore.auxiliary.LogHelper;
import eu.usrv.yamcore.blocks.ModBlockManager;
import eu.usrv.yamcore.client.NotificationTickHandler;
import eu.usrv.yamcore.creativetabs.CreativeTabsManager;
import eu.usrv.yamcore.fluids.ModFluidManager;
import eu.usrv.yamcore.items.ModItemManager;
import gregtech.GT_Mod;
import gregtech.api.GregTech_API;
import gregtech.api.util.GT_LanguageManager;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

import java.io.File;
import java.util.Random;

import static gregtech.api.enums.Dyes.MACHINE_METAL;

@Mod(
        modid = Tags.MOD_ID,
        name = Tags.MOD_NAME,
        version = Tags.MOD_VERSION,
        dependencies =

            "required-before:gregtech;"

        +	"required-after:Forge@[10.13.2.1291,);"
        +	"required-after:YAMCore@[0.5.76,);"

		+   "after:EnderIO;"
        +   "after:HardcoreEnderExpansion;"
	    ,
		certificateFingerprint = "1cca375192a26693475fb48268f350a462208dce")
public class MainRegistry
{

    @SidedProxy(clientSide = Tags.ROOT_PKG + ".main.ClientProxy", serverSide = Tags.ROOT_PKG + ".main.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(Tags.MOD_ID)
    public static MainRegistry instance;

    public static ModItemManager ItemManager;
    public static CreativeTabsManager TabManager;
    public static ModFluidManager FluidManager;
    public static ModBlockManager BlockManager;
    public static HazardousItemsHandler Module_HazardousItems;
    public static CustomToolTipsHandler Module_CustomToolTips;
    public static CustomFuelsHandler Module_CustomFuels;
    public static CustomDropsHandler Module_CustomDrops;
    public static IngameErrorLog Module_AdminErrorLogs;
    public static GT_CustomLoader GTCustomLoader;
    public static CoreModConfig CoreConfig;
    public static CoreModDispatcher NW;
    public static Random Rnd;
    public static LogHelper Logger = new LogHelper(Tags.MOD_ID);

    public static void AddLoginError(String pMessage)
    {
        if (Module_AdminErrorLogs != null) {
            Module_AdminErrorLogs.AddErrorLogOnAdminJoin(pMessage);
        }
    }

    @Mod.EventHandler
    public void PreLoad(FMLPreInitializationEvent PreEvent)
    {
        Logger.setDebugOutput(true);

        Rnd = new Random(System.currentTimeMillis());

        // ------------------------------------------------------------
        // Init coremod config file. Create it if it's not there
        CoreConfig = new CoreModConfig(PreEvent.getModConfigurationDirectory(), Const.COLLECTIONID, Tags.MOD_ID);
        if (!CoreConfig.LoadConfig()) {
            Logger.error(String.format("%s could not load its config file. Things are going to be weird!", Tags.MOD_ID));
        }
        // ------------------------------------------------------------

        if (CoreConfig.ModAdminErrorLogs_Enabled)
        {
            Logger.debug("Module_AdminErrorLogs is enabled");
            Module_AdminErrorLogs = new IngameErrorLog();
        }

        // ------------------------------------------------------------
        Logger.debug("PRELOAD Init TexturePage");
        File tFile = new File(new File(PreEvent.getModConfigurationDirectory(), "GregTech"), "GregTech.cfg");
        Configuration tMainConfig = new Configuration(tFile);
        tMainConfig.load();
        
        GregTech_API.sUseMachineMetal = tMainConfig.get("machines", "use_machine_metal_tint", true).getBoolean(true);
        if (GregTech_API.sUseMachineMetal)
            {
                // use default in GregTech Dyes enum.
            }
        else
            {
                // Override MACHINE_METAL dye color with white
                MACHINE_METAL.mRGBa[0]= 255;
                MACHINE_METAL.mRGBa[1]= 255;
                MACHINE_METAL.mRGBa[2]= 255;
            }

        proxy.addTexturePage();
        // ------------------------------------------------------------

        // ------------------------------------------------------------
        Logger.debug("PRELOAD Init NetworkChannel");
        NW = new CoreModDispatcher();
        NW.registerPackets();
        // ------------------------------------------------------------

        // ------------------------------------------------------------
        Logger.debug("PRELOAD Init itemmanager");
        ItemManager = new ModItemManager(Tags.MOD_ID);
        BlockManager = new ModBlockManager(Tags.MOD_ID);
        // ------------------------------------------------------------

        // ------------------------------------------------------------
//        Logger.debug("PRELOAD Init Tabmanager");
//        TabManager = new CreativeTabsManager();
//        ModTabList.InitModTabs(TabManager, ItemManager);
        // ------------------------------------------------------------

        //Materials init
        if (!GT_Mod.gregtechproxy.mEnableAllMaterials) {
            new GT_CoreModSupport();
        }

        // ------------------------------------------------------------
        Logger.debug("PRELOAD Create Items");
        if (!ItemList.AddToItemManager(ItemManager))
        {
            Logger.warn("Some items failed to register. Check the logfile for details");
            AddLoginError("[CoreMod-Items] Some items failed to register. Check the logfile for details");
        }
        // ------------------------------------------------------------

        // ------------------------------------------------------------
        Logger.info("PRELOAD Create Blocks");
        if (!BlockList.AddToItemManager(BlockManager))
        {
            Logger.warn("Some blocks failed to register. Check the logfile for details");
            AddLoginError("[CoreMod-Blocks] Some blocks failed to register. Check the logfile for details");
        }
        // ------------------------------------------------------------

        // ------------------------------------------------------------
        // Init Modules
        Logger.debug("PRELOAD Init Modules");

        if (CoreConfig.ModHazardousItems_Enabled)
        {
            Logger.debug("Module_HazardousItems is enabled");
            Module_HazardousItems = new HazardousItemsHandler();
            // Module_HazardousItems.LoadConfig();
        }

        if (CoreConfig.ModCustomToolTips_Enabled)
        {
            Logger.debug("Module_HazardousItems is enabled");
            Module_CustomToolTips = new CustomToolTipsHandler();
            // Module_CustomToolTips.LoadConfig();
        }

        if (CoreConfig.ModCustomFuels_Enabled)
        {
            Logger.debug("Module_CustomFuels is enabled");
            Module_CustomFuels = new CustomFuelsHandler();
            // Module_CustomFuels.LoadConfig();
        }

        if (CoreConfig.ModCustomDrops_Enabled)
        {
            Logger.debug("Module_CustomDrops is enabled");
            Module_CustomDrops = new CustomDropsHandler(PreEvent.getModConfigurationDirectory());
        }

        // ------------------------------------------------------------

        // ------------------------------------------------------------
        Logger.debug("PRELOAD Create Fluids");
        FluidManager = new ModFluidManager(Tags.MOD_ID);
        if (!FluidList.AddToItemManager(FluidManager))
        {
            Logger.warn("Some fluids failed to register. Check the logfile for details");
            AddLoginError("[CoreMod-Fluids] Some fluids failed to register. Check the logfile for details");
        }
        // ------------------------------------------------------------

        // register final list with valid items to forge
        Logger.debug("LOAD Register Items");
        ItemManager.RegisterItems(TabManager);

        Logger.debug("LOAD Register Blocks");
        BlockManager.RegisterItems(TabManager);

        Logger.debug("LOAD Register Fluids");
        FluidManager.RegisterItems(TabManager);

        // register all non-enum items
        Logger.debug("LOAD Register non enum Items");
        if (!RegisterNonEnumItems())
        {
            Logger.error("Some extended items could not be registered to the game registry");
            AddLoginError("[CoreMod-Items] Some extended items could not be registered to the game registry");
        }
        if (PreEvent.getSide() == Side.CLIENT)
        {
            FMLCommonHandler.instance().bus().register(new NotificationTickHandler());
        }
	    
        Logger.debug("LOAD abandoned GT++ Aspects");
        if (Loader.isModLoaded("Thaumcraft"))
        {
            new GregTechPlusPlusAbandonedAspectsFix();
        }

//        if (Loader.isModLoaded("witchery"))
//        	new WitcheryPlugin();

        if (CoreModConfig.ModLoginMessage_Enabled)
        {
            FMLCommonHandler.instance().bus().register(new LoginHandler());
        }
        Logger.warn( "==================================================" );
        Logger.warn( "This is: MEGA " + CoreModConfig.ModPackVersion );
        Logger.warn( "==================================================" );
    }

    private static boolean RegisterNonEnumItems()
    {
        boolean tResult = true;
//        NHItems.OVEN_GLOVE.place(new OvenGlove("OvenGlove", ModTabList.ModGenericTab));
//        if (!ItemManager.RegisterNonEnumItem(TabManager, NHItems.OVEN_GLOVE.get())) {
//            tResult = false;
//        }
//        NHItems.WITHER_PROTECTION_RING.place(new WitherProtectionRing("WitherProtectionRing", ModTabList.ModThaumcraftTab));
//        if (!ItemManager.RegisterNonEnumItem(TabManager, NHItems.WITHER_PROTECTION_RING.get())) {
//            tResult = false;
//        }

        return tResult;
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event)
    {
        // register events in modules
        RegisterModuleEvents();

        InitAdditionalBlocks();

        // Register additional OreDictionary Names
//        if(CoreConfig.OreDictItems_Enabled)
//        OreDictHandler.register_all();

        if (Loader.isModLoaded("TwilightForest"))
        TF_Loot_Chests.init();
    }

    private void InitAdditionalBlocks()
    {
        GT_Loader_CasingNH.load();
    }

    private void RegisterModuleEvents()
    {
        if (CoreConfig.ModAdminErrorLogs_Enabled) {
            FMLCommonHandler.instance().bus().register(Module_AdminErrorLogs);
        }

        if (CoreConfig.ModHazardousItems_Enabled) {
            FMLCommonHandler.instance().bus().register(Module_HazardousItems);
        }

        if (CoreConfig.ModCustomToolTips_Enabled)
        {
            MinecraftForge.EVENT_BUS.register(Module_CustomToolTips);
            FMLCommonHandler.instance().bus().register(Module_CustomToolTips);
        }

        if (CoreConfig.ModCustomFuels_Enabled) {
            GameRegistry.registerFuelHandler(Module_CustomFuels);
        }

        if (CoreConfig.ModCustomDrops_Enabled) {
            MinecraftForge.EVENT_BUS.register(Module_CustomDrops);
        }

//        if(Loader.isModLoaded("Railcraft")){
//            MinecraftForge.EVENT_BUS.register(NH_GeodePopulator.instance());//instead of RC
//            MinecraftForge.EVENT_BUS.register(NH_QuarryPopulator.instance());//instead of RC
//        }
    }

    @Mod.EventHandler
    public void PostLoad(FMLPostInitializationEvent PostEvent) {

        if (CoreConfig.ModHazardousItems_Enabled) {
            Module_HazardousItems.LoadConfig();
        }

        if (CoreConfig.ModCustomToolTips_Enabled) {
            Module_CustomToolTips.LoadConfig();
        }

        if (CoreConfig.ModCustomFuels_Enabled) {
            Module_CustomFuels.LoadConfig();
        }

        if (CoreConfig.ModCustomDrops_Enabled) {
            Module_CustomDrops.LoadConfig();
        }

        GT_Loader_ItemPipes.registerPipes();
        GTCustomLoader = new GT_CustomLoader();
        GTCustomLoader.run();

        registerModFixes();
        
        GT_LanguageManager.addStringLocalization("achievement.item.HeavyDutyAlloyIngotT4", "Rocket Plate Tier 4!");
        GT_LanguageManager.addStringLocalization("achievement.item.HeavyDutyAlloyIngotT4.desc", "On your way to the T4 Dims!");
        GT_LanguageManager.addStringLocalization("achievement.item.HeavyDutyAlloyIngotT5", "Rocket Plate Tier 5!");
        GT_LanguageManager.addStringLocalization("achievement.item.HeavyDutyAlloyIngotT5.desc", "On your way to the T5 Dims!");
        GT_LanguageManager.addStringLocalization("achievement.item.HeavyDutyAlloyIngotT6", "Rocket Plate Tier 6!");
        GT_LanguageManager.addStringLocalization("achievement.item.HeavyDutyAlloyIngotT6.desc", "On your way to the T6 Dims!");
        GT_LanguageManager.addStringLocalization("achievement.item.HeavyDutyAlloyIngotT7", "Rocket Plate Tier 7!");
        GT_LanguageManager.addStringLocalization("achievement.item.HeavyDutyAlloyIngotT7.desc", "On your way to the T7 Dims!");
        GT_LanguageManager.addStringLocalization("achievement.item.HeavyDutyAlloyIngotT8", "Rocket Plate Tier 8!");
        GT_LanguageManager.addStringLocalization("achievement.item.HeavyDutyAlloyIngotT8.desc", "On your way to the T8 Dims!");

        CoreMod_ProcessingArrayRecipeLoader.registerMaps();

        // Register modfixes in registerModFixes()
        // Don't call enableModFixes() yourself
        // Don't register fixes after enableModFixes() has been executed
        ModFixesMaster.enableModFixes();
    }

    /**
     * Register your mod-fixes here
     */
    private void registerModFixes() {
        if (CoreConfig.AvaritiaFixEnabled) {
            ModFixesMaster.registerModFix(new SkullFireSwordDropFix());
        }
        if (CoreConfig.OilFixConfig.OilFixEnabled) {
            ModFixesMaster.registerModFix(new OilGeneratorFix());
        }
        if (CoreConfig.MinetweakerFurnaceFixEnabled) {
            ModFixesMaster.registerModFix(new MinetweakerFurnaceFix());
        }
        if (CoreConfig.HoverModeFixEnabled) {
            ModFixesMaster.registerModFix(new HoverModeFix());
        }

    }

    /**
     * Do some stuff once the server starts
     *
     * @param pEvent
     */
    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent pEvent)
    {
        if (CoreConfig.ModHazardousItems_Enabled) {
            pEvent.registerServerCommand(new HazardousItemsCommand());
        }
        if (CoreConfig.ModCustomToolTips_Enabled) {
            pEvent.registerServerCommand(new CustomToolTipsCommand());
        }
        if (CoreConfig.ModItemInHandInfo_Enabled) {
            pEvent.registerServerCommand(new ItemInHandInfoCommand());
        }
        if (CoreConfig.ModCustomFuels_Enabled) {
            pEvent.registerServerCommand(new CustomFuelsCommand());
        }
        if (CoreConfig.ModCustomDrops_Enabled) {
            pEvent.registerServerCommand(new CustomDropsCommand());
        }
        if (YAMCore.isDebug()) {
            pEvent.registerServerCommand(new AllPurposeDebugCommand());
        }
    }
}
