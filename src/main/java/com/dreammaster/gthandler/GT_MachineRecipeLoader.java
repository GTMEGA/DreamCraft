package com.dreammaster.gthandler;

import cpw.mods.fml.common.Loader;
import forestry.api.recipes.IFermenterRecipe;
import gregtech.api.GregTech_API;
import gregtech.api.enums.*;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Recipe;
import gregtech.api.util.GT_Utility;
import ic2.core.Ic2Items;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;

import java.lang.reflect.Field;

import static gregtech.api.enums.GT_Values.*;

public class GT_MachineRecipeLoader implements Runnable {
    @Override
    public void run() {
        GT_Values.RA.addAssemblerRecipe(CustomItemList.NagaScaleChip.get(4L), GT_Utility.getIntegratedCircuit(4), Materials.Thaumium.getMolten(72L), CustomItemList.NagaScaleFragment.get(1L), 200, 48);
        GT_Values.RA.addAssemblerRecipe(CustomItemList.NagaScaleFragment.get(6L), GT_Utility.getIntegratedCircuit(6), Materials.Thaumium.getMolten(216L), GT_ModHandler.getModItem("TwilightForest", "item.nagaScale", 1L, 0), 200, 96);
        GT_Values.RA.addAssemblerRecipe(CustomItemList.LichBoneChip.get(4L), GT_Utility.getIntegratedCircuit(4), Materials.Thaumium.getMolten(72L), CustomItemList.LichBoneFragment.get(1L), 250, 120);
        GT_Values.RA.addAssemblerRecipe(CustomItemList.LichBoneFragment.get(6L), GT_Utility.getIntegratedCircuit(6), Materials.Thaumium.getMolten(216L), CustomItemList.LichBone.get(1L), 250, 256);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 4L, 14), GT_ModHandler.getModItem("TwilightForest", "item.trophy", 0L, 2), CustomItemList.LichBone.get(1L), 900, 256);
        GT_Values.RA.addAssemblerRecipe(CustomItemList.CarminiteChip.get(4L), GT_Utility.getIntegratedCircuit(4), Materials.Thaumium.getMolten(72L), CustomItemList.CarminiteFragment.get(1L), 350, 1024);
        GT_Values.RA.addAssemblerRecipe(CustomItemList.CarminiteFragment.get(6L), GT_Utility.getIntegratedCircuit(6), Materials.Thaumium.getMolten(216L), GT_ModHandler.getModItem("TwilightForest", "item.carminite", 1L, 0), 350, 1920);
        GT_Values.RA.addAssemblerRecipe(CustomItemList.SnowQueenBloodDrop.get(24L), GT_Utility.getIntegratedCircuit(24), Materials.Thaumium.getMolten(216L), CustomItemList.SnowQueenBlood.get(1L), 400, 4096);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 10L, 14), GT_ModHandler.getModItem("TwilightForest", "item.trophy", 0L, 4), CustomItemList.SnowQueenBlood.get(1L), 1800, 7680);
        GT_Values.RA.addAssemblerRecipe(CustomItemList.ArcaneShardChip.get(4L), GT_Utility.getIntegratedCircuit(4), FluidRegistry.getFluidStack("endergoo", 100), CustomItemList.ArcaneShardFragment.get(1L), 200, 120);
        GT_Values.RA.addAssemblerRecipe(CustomItemList.ArcaneShardFragment.get(6L), GT_Utility.getIntegratedCircuit(6), FluidRegistry.getFluidStack("endergoo", 200), GT_ModHandler.getModItem("HardcoreEnderExpansion", "arcane_shard", 1L, 0), 200, 240);
        //HEE Runes
        GT_Values.RA.addAssemblerRecipe(CustomItemList.RuneOfPowerFragment.get(9L), GT_Utility.getIntegratedCircuit(9), FluidRegistry.getFluidStack("endergoo", 1000), GT_ModHandler.getModItem("HardcoreEnderExpansion", "rune", 1L, 0), 2400, 7680);
        GT_Values.RA.addAssemblerRecipe(CustomItemList.RuneOfAgilityFragment.get(9L), GT_Utility.getIntegratedCircuit(9), FluidRegistry.getFluidStack("endergoo", 1000), GT_ModHandler.getModItem("HardcoreEnderExpansion", "rune", 1L, 1), 2400, 7680);
        GT_Values.RA.addAssemblerRecipe(CustomItemList.RuneOfVigorFragment.get(9L), GT_Utility.getIntegratedCircuit(9), FluidRegistry.getFluidStack("endergoo", 1000), GT_ModHandler.getModItem("HardcoreEnderExpansion", "rune", 1L, 2), 2400, 7680);
        GT_Values.RA.addAssemblerRecipe(CustomItemList.RuneOfDefenseFragment.get(9L), GT_Utility.getIntegratedCircuit(9), FluidRegistry.getFluidStack("endergoo", 1000), GT_ModHandler.getModItem("HardcoreEnderExpansion", "rune", 1L, 3), 2400, 7680);
        GT_Values.RA.addAssemblerRecipe(CustomItemList.RuneOfMagicFragment.get(9L), GT_Utility.getIntegratedCircuit(9), FluidRegistry.getFluidStack("endergoo", 1000), GT_ModHandler.getModItem("HardcoreEnderExpansion", "rune", 1L, 4), 2400, 7680);
        GT_Values.RA.addAssemblerRecipe(CustomItemList.RuneOfVoidFragment.get(9L), GT_Utility.getIntegratedCircuit(9), FluidRegistry.getFluidStack("endergoo", 1000), GT_ModHandler.getModItem("HardcoreEnderExpansion", "rune", 1L, 5), 2400, 7680);
        //Hermetic casings
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.Plastic, 1L), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 8L), GT_Utility.getIntegratedCircuit(4)}, GT_Values.NF, ItemList.Casing_Tank_1.get(1L), 100, 16);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.PolyvinylChloride, 1L), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Aluminium, 8L), GT_Utility.getIntegratedCircuit(4)}, GT_Values.NF, ItemList.Casing_Tank_2.get(1L), 100, 16);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.Polytetrafluoroethylene, 1L), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.StainlessSteel, 8L), GT_Utility.getIntegratedCircuit(4)}, GT_Values.NF, ItemList.Casing_Tank_3.get(1L), 100, 16);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.StainlessSteel, 1L), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Titanium, 8L), GT_Utility.getIntegratedCircuit(4)}, GT_Values.NF, ItemList.Casing_Tank_4.get(1L), 100, 16);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.Titanium, 1L), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.TungstenSteel, 8L), GT_Utility.getIntegratedCircuit(4)}, GT_Values.NF, ItemList.Casing_Tank_5.get(1L), 100, 16);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.TungstenSteel, 1L), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Chrome, 8L), GT_Utility.getIntegratedCircuit(4)}, GT_Values.NF, ItemList.Casing_Tank_6.get(1L), 100, 16);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.NiobiumTitanium, 1L), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iridium, 8L), GT_Utility.getIntegratedCircuit(4)}, GT_Values.NF, ItemList.Casing_Tank_7.get(1L), 100, 16);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.Enderium, 1L), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Osmium, 8L), GT_Utility.getIntegratedCircuit(4)}, GT_Values.NF, ItemList.Casing_Tank_8.get(1L), 100, 16);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.Naquadah, 1L), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Neutronium, 8L), GT_Utility.getIntegratedCircuit(4)}, GT_Values.NF, ItemList.Casing_Tank_9.get(1L), 100, 16);

        GT_Values.RA.addAssemblerRecipe(new ItemStack(Items.string, 3, 0), GT_Utility.getIntegratedCircuit(1), new ItemStack(Blocks.wool, 1, 0), 100, 4);

        GT_Values.RA.addAutoclaveRecipe(GT_ModHandler.getModItem("EnderZoo", "enderFragment", 4L, 0), GT_Utility.getIntegratedCircuit(1), Materials.Water.getFluid(100), new ItemStack(Items.ender_pearl, 1, 0), 8000, 1200, 30, false);
        GT_Values.RA.addAutoclaveRecipe(GT_ModHandler.getModItem("EnderZoo", "enderFragment", 4L, 0), GT_Utility.getIntegratedCircuit(2), GT_ModHandler.getDistilledWater(50L), new ItemStack(Items.ender_pearl, 1, 0), 9000, 900, 30, false);
        GT_Values.RA.addAutoclaveRecipe(GT_ModHandler.getModItem("EnderZoo", "enderFragment", 4L, 0), GT_Utility.getIntegratedCircuit(3), Materials.Void.getMolten(18), new ItemStack(Items.ender_pearl, 1, 0), 10000, 600, 30, false);

        GT_Values.RA.addAutoclaveRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.EnderPearl, 1L), GT_Utility.getIntegratedCircuit(1), Materials.Water.getFluid(100), new ItemStack(Items.ender_pearl, 1, 0), 8000, 1500, 30, false);
        GT_Values.RA.addAutoclaveRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.EnderPearl, 1L), GT_Utility.getIntegratedCircuit(2), GT_ModHandler.getDistilledWater(75L), new ItemStack(Items.ender_pearl, 1, 0), 9000, 1200, 30, false);
        GT_Values.RA.addAutoclaveRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.EnderPearl, 1L), GT_Utility.getIntegratedCircuit(3), Materials.Void.getMolten(36), new ItemStack(Items.ender_pearl, 1, 0), 10000, 900, 30, false);

        GT_Values.RA.addCentrifugeRecipe(GT_ModHandler.getModItem("Forestry", "beeCombs", 1L, 9), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_ModHandler.getModItem("Forestry", "beeswax", 1L, 0), GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Iridium, 1L), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Values.NI, new int[]{10000, 100}, 300, 7680);

        GT_Values.RA.addCentrifugeRecipe(new ItemStack(Items.fire_charge, 1, 0), GT_Values.NI, GT_Values.NF, GT_Values.NF, new ItemStack(Items.blaze_powder, 1, 0), new ItemStack(Items.gunpowder, 1, 0), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Coal, 1L), GT_Values.NI, GT_Values.NI, GT_Values.NI, new int[]{10000, 10000, 10000}, 400, 8);

        GT_Values.RA.addElectrolyzerRecipe(ItemList.Cell_Empty.get(1), GT_ModHandler.getModItem("TwilightForest", "tile.TFAuroraBrick", 1L, 0), GT_Values.NF, Materials.Helium_3.getFluid(100), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 1L), GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Helium, 1), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Values.NI, null, 600, 480);
        GT_Values.RA.addElectrolyzerRecipe(ItemList.Cell_Empty.get(1), GT_ModHandler.getModItem("TwilightForest", "tile.AuroraPillar", 1L, 0), GT_Values.NF, Materials.Helium_3.getFluid(200), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 1L), GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Helium, 1), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Values.NI, null, 600, 480);
        GT_Values.RA.addElectrolyzerRecipe(ItemList.Cell_Empty.get(1), GT_ModHandler.getModItem("TwilightForest", "tile.AuroraSlab", 2L, 0), GT_Values.NF, Materials.Helium_3.getFluid(50), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 1L), GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Helium, 1), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Values.NI, null, 600, 480);
        GT_Values.RA.addElectrolyzerRecipe(ItemList.Cell_Empty.get(1), GT_ModHandler.getModItem("TwilightForest", "tile.AuroraDoubleSlab", 1L, 0), GT_Values.NF, Materials.Helium_3.getFluid(100), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 1L), GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Helium, 1), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Values.NI, null, 600, 480);
        if (Loader.isModLoaded("gendustry"))
            GT_Values.RA.addCentrifugeRecipe(CustomItemList.FieryBloodDrop.get(1L), GT_Values.NI, GT_Values.NF, Materials.FierySteel.getFluid(10L), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Values.NI, new int[]{10000}, 12, 480);
        GT_Values.RA.addCentrifugeRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Brick, 19L), ItemList.Cell_Empty.get(12L), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Aluminium, 4L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Silicon, 3L), GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Oxygen, 12L), GT_Values.NI, GT_Values.NI, GT_Values.NI, new int[]{10000, 10000, 10000}, 400, 120);
        GT_Values.RA.addCentrifugeRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Fireclay, 19L), ItemList.Cell_Empty.get(12L), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Aluminium, 4L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Silicon, 3L), GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Oxygen, 12L), GT_Values.NI, GT_Values.NI, GT_Values.NI, new int[]{10000, 10000, 10000}, 200, 120);

        GT_Values.RA.addCentrifugeRecipe(GT_ModHandler.getModItem("Thaumcraft", "blockEldritch", 1L, 4), GT_Values.NI, GT_Values.NF, GT_Values.NF, new ItemStack(Items.glowstone_dust, 1, 0), GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 1L, 14), GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 1L, 14), GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 1L, 14), GT_Values.NI, GT_Values.NI, new int[]{10000, 3300, 1000, 200}, 300, 480);
        GT_Values.RA.addCentrifugeRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.QuartzSand, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Stone, 1L), GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.CertusQuartz, 1L), GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.NetherQuartz, 1L), GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Quartzite, 1L), GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Cassiterite, 1L), GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Silicon, 1L), new int[]{4000, 3000, 2000, 1500, 1000, 750}, 600, 16);
        GT_Values.RA.addCentrifugeRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Electrotine, 8L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Electrum, 1L), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Values.NI, new int[]{10000, 10000}, 800, 30);

        GT_Values.RA.addCentrifugeRecipe(ItemList.Cell_Air.get(5L), GT_Values.NI, GT_Values.NF, Materials.Nitrogen.getGas(3900L), Materials.Oxygen.getCells(1), ItemList.Cell_Empty.get(4L), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Values.NI, new int[]{10000, 10000}, 1600, 8);
        GT_Values.RA.addChemicalBathRecipe(new ItemStack(Items.leather, 2, 0), Materials.PhosphoricAcid.getFluid(144), GT_ModHandler.getModItem("Backpack", "tannedLeather", 1L, 0), GT_Values.NI, GT_Values.NI, new int[]{10000}, 300, 30);

        GT_Values.RA.addCompressorRecipe(GT_ModHandler.getModItem("IC2", "itemWeed", 16L), ItemList.IC2_Plantball.get(1L), 300, 2);
        GT_Values.RA.addCompressorRecipe(GT_ModHandler.getModItem("ExtraTrees", "food", 64L, 24), ItemList.IC2_Plantball.get(1L), 300, 2);
        GT_Values.RA.addCompressorRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sunnarium, 1L), GT_ModHandler.getModItem("AdvancedSolarPanel", "asp_crafting_items", 1L, 0), 300, 2);
        GT_Values.RA.addCompressorRecipe(GT_ModHandler.getModItem("AdvancedSolarPanel", "asp_crafting_items", 9L, 9), GT_ModHandler.getModItem("AdvancedSolarPanel", "asp_crafting_items", 1L, 0), 300, 2);
        GT_Values.RA.addCompressorRecipe(GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.WroughtIron, 9L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.WroughtIron, 1L), 300, 2);
        GT_Values.RA.addCompressorRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.CertusQuartz, 1L), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.CertusQuartz, 1L), 300, 2);
        GT_Values.RA.addCompressorRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.NetherQuartz, 1L), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.NetherQuartz, 1L), 300, 2);
        GT_Values.RA.addCompressorRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Quartzite, 1L), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Quartzite, 1L), 300, 2);
        GT_Values.RA.addCompressorRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Lazurite, 1L), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Lazurite, 1L), 300, 2);
        GT_Values.RA.addCompressorRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sodalite, 1L), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Sodalite, 1L), 300, 2);
        GT_Values.RA.addCompressorRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.EnhancedGalgadorian, 9L), GT_ModHandler.getModItem("StevesCarts", "ModuleComponents", 1L, 48), 300, 2);

        GT_Values.RA.addCompressorRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Carbon, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Carbon, 1L), 300, 2);
        GT_Values.RA.addCompressorRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Cobalt, 9L), GT_OreDictUnificator.get(OrePrefixes.block, Materials.Cobalt, 1L), 300, 2);

        this.run2();
    }

    public void run2() {
        if (Loader.isModLoaded("AdvancedSolarPanel")) {
            GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("AdvancedSolarPanel", "asp_crafting_items", 1L, 0), new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sunnarium, 1L)}, new int[]{10000}, 300, 2);
            GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("AdvancedSolarPanel", "asp_crafting_items", 1L, 9), new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Sunnarium, 1L)}, new int[]{10000}, 30, 2);
        }

        if (Loader.isModLoaded("BiomesOPlenty")) {
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("BiomesOPlenty", "flowers", 2L, 3), new ItemStack(Items.glowstone_dust, 1, 0), 300, 2);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("BiomesOPlenty", "mushrooms", 2L, 3), new ItemStack(Items.glowstone_dust, 1, 0), 300, 2);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("BiomesOPlenty", "coral1", 2L, 15), new ItemStack(Items.glowstone_dust, 1, 0), 300, 2);
        }

        if (Loader.isModLoaded("Natura")) {
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "Glowshroom", 2L, 0), new ItemStack(Items.glowstone_dust, 1, 0), 300, 2);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "Glowshroom", 2L, 1), new ItemStack(Items.glowstone_dust, 1, 0), 300, 2);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "Glowshroom", 2L, 2), new ItemStack(Items.glowstone_dust, 1, 0), 300, 2);
        }

        if (Loader.isModLoaded("BiomesOPlenty")) {
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("BiomesOPlenty", "flowers", 2L, 13), new ItemStack(Items.spider_eye, 1, 0), 300, 2);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("BiomesOPlenty", "mudball", 1L, 0), new ItemStack(Items.clay_ball, 1, 0), 200, 2);
        }

        if (Loader.isModLoaded("Natura")) {
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "florasapling", 1L, 5), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 1L), 100, 120);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "floraleavesnocolor", 4L, 2), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 1L), 100, 120);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "bloodwood", 1L, 0), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 1L), 100, 120);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "bloodwood", 1L, 15), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 1L), 100, 120);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "florasapling", 2L, 7), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Gunpowder, 1L), 100, 120);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "Dark Leaves", 8L, 3), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Gunpowder, 1L), 100, 120);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "Dark Tree", 2L, 1), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Gunpowder, 1L), 100, 120);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "florasapling", 2L, 6), ItemList.IC2_Fertilizer.get(1), 100, 120);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "Dark Leaves", 8L, 0), ItemList.IC2_Fertilizer.get(1), 100, 120);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "Dark Tree", 2L, 0), ItemList.IC2_Fertilizer.get(1), 100, 120);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "Natura.netherfood", 1L, 0), ItemList.IC2_Fertilizer.get(4), 100, 120);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "florasapling", 2L, 4), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Bone, 1L), 100, 120);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "floraleavesnocolor", 4L, 1), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Bone, 1L), 100, 120);
            GT_Values.RA.addExtractorRecipe(GT_ModHandler.getModItem("Natura", "tree", 2L, 2), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Bone, 1L), 100, 120);

            GT_Values.RA.addChemicalRecipe(GT_ModHandler.getModItem("Natura", "florasapling", 2L, 6), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Apatite, 1L), Materials.Water.getFluid(1000L), GT_Values.NF, ItemList.IC2_Fertilizer.get(2), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sulfur, 1L), 200, 120);
            GT_Values.RA.addChemicalRecipe(GT_ModHandler.getModItem("Natura", "Dark Leaves", 8L, 0), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Apatite, 1L), Materials.Water.getFluid(1000L), GT_Values.NF, ItemList.IC2_Fertilizer.get(2), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sulfur, 1L), 200, 120);
            GT_Values.RA.addChemicalRecipe(GT_ModHandler.getModItem("Natura", "Dark Tree", 2L, 0), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Apatite, 1L), Materials.Water.getFluid(1000L), GT_Values.NF, ItemList.IC2_Fertilizer.get(8), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.TricalciumPhosphate, 1L), 200, 120);
            GT_Values.RA.addChemicalRecipe(GT_ModHandler.getModItem("Natura", "Natura.netherfood", 1L, 0), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Apatite, 1L), Materials.Water.getFluid(1000L), GT_Values.NF, ItemList.IC2_Fertilizer.get(32), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.TricalciumPhosphate, 1L), 200, 120);
        }

        GT_Values.RA.addDistillationTowerRecipe(new FluidStack(FluidRegistry.getFluid("pollution"), 1600), new FluidStack[]{Materials.SulfuricAcid.getFluid(50L), Materials.NitrogenDioxide.getGas(50L), Materials.Methane.getGas(50L), Materials.Mercury.getFluid(1L)}, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Ash, 1L), 600, 1920);

        GT_Values.RA.addFluidSolidifierRecipe(ItemList.Shape_Mold_Ball.get(0L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyeblack"), 72), GT_ModHandler.getModItem("gregtech", "gt.metaitem.02", 1L, 32414), 100, 16);
        GT_Values.RA.addFluidSolidifierRecipe(ItemList.Shape_Mold_Ball.get(0L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyered"), 72), GT_ModHandler.getModItem("gregtech", "gt.metaitem.02", 1L, 32415), 100, 16);
        GT_Values.RA.addFluidSolidifierRecipe(ItemList.Shape_Mold_Ball.get(0L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyegreen"), 72), GT_ModHandler.getModItem("gregtech", "gt.metaitem.02", 1L, 32416), 100, 16);
        GT_Values.RA.addFluidSolidifierRecipe(ItemList.Shape_Mold_Ball.get(0L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyebrown"), 72), GT_ModHandler.getModItem("gregtech", "gt.metaitem.02", 1L, 32417), 100, 16);
        GT_Values.RA.addFluidSolidifierRecipe(ItemList.Shape_Mold_Ball.get(0L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyeblue"), 72), GT_ModHandler.getModItem("gregtech", "gt.metaitem.02", 1L, 32418), 100, 16);
        GT_Values.RA.addFluidSolidifierRecipe(ItemList.Shape_Mold_Ball.get(0L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyepurple"), 72), GT_ModHandler.getModItem("gregtech", "gt.metaitem.02", 1L, 32419), 100, 16);
        GT_Values.RA.addFluidSolidifierRecipe(ItemList.Shape_Mold_Ball.get(0L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyecyan"), 72), GT_ModHandler.getModItem("gregtech", "gt.metaitem.02", 1L, 32420), 100, 16);
        GT_Values.RA.addFluidSolidifierRecipe(ItemList.Shape_Mold_Ball.get(0L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyelightgray"), 72), GT_ModHandler.getModItem("gregtech", "gt.metaitem.02", 1L, 32421), 100, 16);
        GT_Values.RA.addFluidSolidifierRecipe(ItemList.Shape_Mold_Ball.get(0L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyegray"), 72), GT_ModHandler.getModItem("gregtech", "gt.metaitem.02", 1L, 32422), 100, 16);
        GT_Values.RA.addFluidSolidifierRecipe(ItemList.Shape_Mold_Ball.get(0L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyepink"), 72), GT_ModHandler.getModItem("gregtech", "gt.metaitem.02", 1L, 32423), 100, 16);
        GT_Values.RA.addFluidSolidifierRecipe(ItemList.Shape_Mold_Ball.get(0L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyelime"), 72), GT_ModHandler.getModItem("gregtech", "gt.metaitem.02", 1L, 32424), 100, 16);
        GT_Values.RA.addFluidSolidifierRecipe(ItemList.Shape_Mold_Ball.get(0L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyeyellow"), 72), GT_ModHandler.getModItem("gregtech", "gt.metaitem.02", 1L, 32425), 100, 16);
        GT_Values.RA.addFluidSolidifierRecipe(ItemList.Shape_Mold_Ball.get(0L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyelightblue"), 72), GT_ModHandler.getModItem("gregtech", "gt.metaitem.02", 1L, 32426), 100, 16);
        GT_Values.RA.addFluidSolidifierRecipe(ItemList.Shape_Mold_Ball.get(0L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyemagenta"), 72), GT_ModHandler.getModItem("gregtech", "gt.metaitem.02", 1L, 32427), 100, 16);
        GT_Values.RA.addFluidSolidifierRecipe(ItemList.Shape_Mold_Ball.get(0L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyeorange"), 72), GT_ModHandler.getModItem("gregtech", "gt.metaitem.02", 1L, 32428), 100, 16);
        GT_Values.RA.addFluidSolidifierRecipe(ItemList.Shape_Mold_Ball.get(0L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyewhite"), 72), GT_ModHandler.getModItem("gregtech", "gt.metaitem.02", 1L, 32429), 100, 16);

        GT_Values.RA.addForgeHammerRecipe(new ItemStack(Items.nether_star, 1, 0), CustomItemList.NetherStarFragment.get(2L), 16, 30);

        if (Loader.isModLoaded("Thaumcraft"))
            GT_Values.RA.addForgeHammerRecipe(GT_ModHandler.getModItem("Thaumcraft", "ItemEldritchObject", 1L, 3), CustomItemList.PrimordialPearlFragment.get(3L), 16, 7680);

        GT_Values.RA.addBenderRecipe(GT_OreDictUnificator.get(OrePrefixes.plateQuadruple, Materials.Steel, 1L), ItemList.Shape_Empty.get(1L), 200, 120);
        GT_Values.RA.addFormingPressRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Glass, 1L), ItemList.Shape_Mold_Bottle.get(0L), ItemList.Bottle_Empty.get(1L), 32, 8);
        GT_Values.RA.addFormingPressRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Glass, 1L), ItemList.Shape_Mold_Block.get(0L), new ItemStack(Blocks.glass, 1, 0), 100, 30);

        if (Loader.isModLoaded("BloodArsenal"))
            GT_Values.RA.addFormingPressRecipe(GT_ModHandler.getModItem("BloodArsenal", "glass_shard", 2L, 0), ItemList.Shape_Mold_Block.get(0L), new ItemStack(Blocks.glass, 1, 0), 100, 30);
        GT_Values.RA.addExtruderRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.WroughtIron, 1L), ItemList.Shape_Extruder_Pipe_Tiny.get(0L), GT_OreDictUnificator.get(OrePrefixes.pipeTiny, Materials.WroughtIron, 2L), 4, 120);
        GT_Values.RA.addExtruderRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.WroughtIron, 1L), ItemList.Shape_Extruder_Pipe_Small.get(0L), GT_OreDictUnificator.get(OrePrefixes.pipeSmall, Materials.WroughtIron, 1L), 8, 120);
        GT_Values.RA.addExtruderRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.WroughtIron, 3L), ItemList.Shape_Extruder_Pipe_Medium.get(0L), GT_OreDictUnificator.get(OrePrefixes.pipeMedium, Materials.WroughtIron, 1L), 24, 120);
        GT_Values.RA.addExtruderRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.WroughtIron, 6L), ItemList.Shape_Extruder_Pipe_Large.get(0L), GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.WroughtIron, 1L), 48, 120);
        GT_Values.RA.addExtruderRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.WroughtIron, 12L), ItemList.Shape_Extruder_Pipe_Huge.get(0L), GT_OreDictUnificator.get(OrePrefixes.pipeHuge, Materials.WroughtIron, 1L), 96, 120);

        GT_Values.RA.addExtruderRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.StainlessSteel, 2L), ItemList.Shape_Extruder_Hoe.get(0L), GT_OreDictUnificator.get(OrePrefixes.toolHeadHoe, Materials.StainlessSteel, 1L), 150, 120);

        GT_Values.RA.addDistilleryRecipe(GT_Utility.getIntegratedCircuit(1), Materials.Milk.getFluid(1000L), FluidRegistry.getFluidStack("fluidmilk", 1000), 100, 2, false);
        GT_Values.RA.addDistilleryRecipe(GT_Utility.getIntegratedCircuit(1), FluidRegistry.getFluidStack("fluidmilk", 1000), Materials.Milk.getFluid(1000L), 100, 2, false);

        GT_Values.RA.addImplosionRecipe(CustomItemList.NetherStarFragment.get(2L), 1, new ItemStack(Items.nether_star, 1, 0), GT_Values.NI);

        //extra utils
        if (Loader.isModLoaded("ExtraUtilities")) {
        	//CC
        	GT_Values.RA.addImplosionRecipe(GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 0), 1, GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 1), GT_Values.NI);
        	GT_Values.RA.addImplosionRecipe(GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 1), 1, GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 2), GT_Values.NI);
        	GT_Values.RA.addImplosionRecipe(GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 2), 1, GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 3), GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 3), 1, GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 4), GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 4), 8, GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 5), GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 5), 10, GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 6), GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 6), 16, GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 7), GT_Values.NI);
            //CD
            GT_Values.RA.addImplosionRecipe(GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 8), 1, GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 9), GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 9), 2, GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 10), GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 10), 4, GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 11), GT_Values.NI);
            //CG
            GT_Values.RA.addImplosionRecipe(GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 12), 1, GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 13), GT_Values.NI);
            //CS
            GT_Values.RA.addImplosionRecipe(GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 14), 1, GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 15), GT_Values.NI);

            GT_Values.RA.addImplosionRecipe(GT_ModHandler.getModItem("ExtraUtilities", "bedrockiumIngot", 9), 8, GT_ModHandler.getModItem("ExtraUtilities", "block_bedrockium", 1L), GT_Values.NI);
        }

        if (Loader.isModLoaded("StevesCarts"))
            GT_Values.RA.addImplosionRecipe(GT_ModHandler.getModItem("StevesCarts", "ModuleComponents", 1L, 18), 1, GT_ModHandler.getModItem("StevesCarts", "ModuleComponents", 1L, 19), GT_Values.NI);

        GT_Values.RA.addImplosionRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Diamond, 1L), 2, GT_ModHandler.getModItem("Translocator", "diamondNugget", 2L, 0), GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.DarkAsh, 1L));

        if (Loader.isModLoaded("EnderIO"))
            GT_Values.RA.addMixerRecipe(GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 14), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Gold, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Emerald, 1L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.CrystallineAlloy, 3L), 100, 8);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.MelodicAlloy, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.NetherStar, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Naquadah, 1L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.StellarAlloy, 3L), 100, 8);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Steel, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Coal, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Silicon, 1L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.ElectricalSteel, 3L), 100, 8);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Iron, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.EnderPearl, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.RedstoneAlloy, 1L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.PulsatingIron, 3L), 100, 8);
        GT_Values.RA.addMixerRecipe(new ItemStack(Blocks.soul_sand, 1, 0), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Gold, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Ash, 1L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Soularium, 3L), 100, 8);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.ElectricalSteel, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Coal, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Obsidian, 1L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.DarkSteel, 3L), 100, 8);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.DarkSteel, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Endstone, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Tungsten, 1L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.EndSteel, 3L), 100, 8);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Tin, 2L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Silver, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Platinum, 1L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.EnderiumBase, 4L), 400, 8);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.EnderiumBase, 2L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Thaumium, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.EnderPearl, 1L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Enderium, 4L), 200, 8);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Cadmium, 5L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Magnesium, 1L), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), Materials.Oxygen.getGas(6000), GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Pentacadmiummagnesiumhexaoxid, 12L), 1200, 120);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Titanium, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Barium, 9L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Copper, 10L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), Materials.Oxygen.getGas(20000), GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Titaniumonabariumdecacoppereikosaoxid, 40L), 2400, 120);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Uranium, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Platinum, 3L), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Uraniumtriplatinid, 4L), 400, 480);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Vanadium, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Indium, 3L), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Vanadiumtriindinid, 4L), 400, 480);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Indium, 4L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Tin, 2L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Barium, 2L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Titanium, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Copper, 7L), GT_Utility.getIntegratedCircuit(3), Materials.Oxygen.getGas(14000), GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid, 30L), 2400, 1920);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Naquadah, 4L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Indium, 2L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Palladium, 6L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Osmium, 1L), GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Tetranaquadahdiindiumhexaplatiumosminid, 13L), 1200, 1920);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Naquadria, 4L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Osmiridium, 3L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Europium, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Samarium, 1L), GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Longasssuperconductornameforuvwire, 9L), 1800, 7680);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Draconium, 6L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.CosmicNeutronium, 7L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Tritanium, 5L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Americium, 6L), GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Longasssuperconductornameforuhvwire, 24L), 3600, 30720);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Cobalt, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Ardite, 1L), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Manyullyn, 2L), 400, 8);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSSG, 6L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Iridium, 2L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Osmium, 1L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.getDust(Materials.HSSS, 9L * OrePrefixes.dust.mMaterialAmount), (int) (800L * OrePrefixes.dust.mMaterialAmount / 3628800L), 4500);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Naquadah, 2L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Trinium, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Carbon, 1L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.getDust(Materials.NaquadahAlloy, 4L * OrePrefixes.dust.mMaterialAmount), (int) (400L * OrePrefixes.dust.mMaterialAmount / 3628800L), 8000);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Yttrium, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Barium, 2L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.AnyCopper, 3L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), Materials.Oxygen.getGas(7000), GT_Values.NF, GT_OreDictUnificator.getDust(Materials.YttriumBariumCuprate, 6L * OrePrefixes.dust.mMaterialAmount), (int) (600L * OrePrefixes.dust.mMaterialAmount / 3628800L), 2000);
        GT_Values.RA.addMixerRecipe(ItemList.IC2_Energium_Dust.get(9L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Lapis, 6L), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, CustomItemList.LapotronDust.get(15L), 600, 480);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Flint, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.QuartzSand, 16L), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(4), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Glass, 16L), 800, 8);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Flint, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Quartzite, 16L), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(4), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Glass, 20L), 640, 8);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Gallium, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Arsenic, 1L), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.GalliumArsenide, 2L), 300, 30);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Vanadium, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Chrome, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Steel, 7L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.VanadiumSteel, 9L), 100, 30);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Copper, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Gold, 4L), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.RoseGold, 5L), 200, 120);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.RoseGold, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.InfusedGold, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.AstralSilver, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.SterlingSilver, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.SolderingAlloy, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.RedSteel, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.BlueSteel, 1l), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Naquadah, 1L), GT_Utility.getIntegratedCircuit(4), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.ElectrumFlux, 4L), 50, 900);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Steel, 9L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Nickel, 6L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Coal, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Silicon, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Manganese, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Chrome, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Molybdenum, 1L), GT_Values.NI, GT_Utility.getIntegratedCircuit(18), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.DamascusSteel, 18L), 225, 900);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Steel, 9L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Manganese, 4L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Chrome, 4L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Coal, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Silicon, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Vanadium, 1L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(9), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.DamascusSteel, 18L), 225, 900);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Electrum, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 1L), GT_Utility.getIntegratedCircuit(1), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Electrotine, 1L), 200, 8);

        if (Loader.isModLoaded("ExtraTrees"))
            GT_Values.RA.addMixerRecipe(GT_ModHandler.getModItem("ExtraTrees", "misc", 4L, 2), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(1), Materials.Water.getFluid(500L), GT_Values.NF, ItemList.FR_Mulch.get(1L), 600, 2);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Clay, 8L), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_ModHandler.getWater(1000L), GT_Values.NF, new ItemStack(Items.clay_ball, 4, 0), 100, 8);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Copper, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 4L), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.RedAlloy, 1L), 100, 16);

        if (Loader.isModLoaded("BiomesOPlenty"))
            GT_Values.RA.addMixerRecipe(new ItemStack(Blocks.dirt, 1, 0), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(4), Materials.Water.getFluid(1000L), GT_Values.NF, GT_ModHandler.getModItem("BiomesOPlenty", "mudball", 4L, 0), 50, 8);
            GT_Values.RA.addMixerRecipe(new ItemStack(Blocks.dirt, 1, 0), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Wood, 2L), new ItemStack(Blocks.sand, 4, 0), GT_Values.NI, Materials.Water.getFluid(1000L), GT_Values.NF, ItemList.IC2_Fertilizer.get(4), 100, 30);
            GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Lead, 4L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Antimony, 1L), GT_Values.NI, GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.BatteryAlloy, 5L), 100, 4);
            GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Tin, 9L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Antimony, 1L), GT_Values.NI, GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.SolderingAlloy, 10L), 100, 8);
            GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Magnesium, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Aluminium, 2L), GT_Values.NI, GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Magnalium, 3L), 100, 4);
            GT_Values.RA.addFermentingRecipe(FluidRegistry.getFluidStack("concrete", 1000), Materials.Concrete.getMolten(1000L), 20, 16, false);
            GT_Values.RA.addFermentingRecipe(Materials.Concrete.getMolten(1000L), Materials.ConstructionFoam.getFluid(1000), 20, 16, false);
            GT_Values.RA.addFermentingRecipe(Materials.ConstructionFoam.getFluid(1000), FluidRegistry.getFluidStack("concrete", 1000), 20, 16, false);
            GT_Values.RA.addForgeHammerRecipe(new ItemStack(Items.nether_star, 1, 0), CustomItemList.NetherStarFragment.get(2L), 16, 30);

        this.run3();
    }

    public void run3() {

        if (Loader.isModLoaded("JABBA")) {
            GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("JABBA", "barrel", 1L, 0), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Wood, 2), GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2)}, GT_Values.NF, GT_ModHandler.getModItem("JABBA", "upgradeStructural", 1L, 0), 200, 16);
            GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("JABBA", "barrel", 1L, 0), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Copper, 2), GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Copper, 2)}, GT_Values.NF, GT_ModHandler.getModItem("JABBA", "upgradeStructural", 1L, 1), 200, 16);
            GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("JABBA", "barrel", 1L, 0), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 2), GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Iron, 2)}, GT_Values.NF, GT_ModHandler.getModItem("JABBA", "upgradeStructural", 1L, 2), 200, 16);
            GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("JABBA", "barrel", 1L, 0), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Brass, 2), GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Brass, 2)}, GT_Values.NF, GT_ModHandler.getModItem("JABBA", "upgradeStructural", 1L, 3), 200, 16);
            GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("JABBA", "barrel", 1L, 0), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 2), GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Steel, 2)}, GT_Values.NF, GT_ModHandler.getModItem("JABBA", "upgradeStructural", 1L, 4), 200, 16);
            GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("JABBA", "barrel", 1L, 0), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Aluminium, 2), GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Aluminium, 2)}, GT_Values.NF, GT_ModHandler.getModItem("JABBA", "upgradeStructural", 1L, 5), 200, 16);
            GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("JABBA", "barrel", 1L, 0), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.StainlessSteel, 2), GT_OreDictUnificator.get(OrePrefixes.stick, Materials.StainlessSteel, 2)}, GT_Values.NF, GT_ModHandler.getModItem("JABBA", "upgradeStructural", 1L, 6), 200, 16);
            GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("JABBA", "barrel", 1L, 0), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Titanium, 2), GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Titanium, 2)}, GT_Values.NF, GT_ModHandler.getModItem("JABBA", "upgradeStructural", 1L, 7), 200, 16);
            GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("JABBA", "barrel", 1L, 0), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.TungstenSteel, 2), GT_OreDictUnificator.get(OrePrefixes.stick, Materials.TungstenSteel, 2)}, GT_Values.NF, GT_ModHandler.getModItem("JABBA", "upgradeStructural", 1L, 8), 200, 16);
            GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("JABBA", "barrel", 1L, 0), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Chrome, 2), GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Chrome, 2)}, GT_Values.NF, GT_ModHandler.getModItem("JABBA", "upgradeStructural", 1L, 9), 200, 16);
            GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("JABBA", "barrel", 1L, 0), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iridium, 2), GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Iridium, 2)}, GT_Values.NF, GT_ModHandler.getModItem("JABBA", "upgradeStructural", 1L, 10), 200, 16);
            GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("JABBA", "barrel", 1L, 0), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Osmium, 2), GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Osmium, 2)}, GT_Values.NF, GT_ModHandler.getModItem("JABBA", "upgradeStructural", 1L, 11), 200, 16);
            GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("JABBA", "barrel", 1L, 0), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Neutronium, 2), GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Neutronium, 2)}, GT_Values.NF, GT_ModHandler.getModItem("JABBA", "upgradeStructural", 1L, 12), 200, 16);
        }

        GT_Values.RA.addSifterRecipe(GT_OreDictUnificator.get(OrePrefixes.crushedPurified, Materials.Cinnabar, 1L), new ItemStack[]{Materials.Mercury.getGems(1), Materials.Mercury.getGems(1), Materials.Mercury.getGems(1), Materials.Mercury.getGems(1), Materials.Mercury.getGems(1), Materials.Mercury.getGems(1), Materials.Mercury.getGems(1), Materials.Mercury.getGems(1), Materials.Cinnabar.getDust(1)}, new int[]{100, 300, 500, 1000, 1000, 1500, 2300, 2500, 3500}, 600, 16);

        if (Loader.isModLoaded("thaumicbases"))
            GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("thaumicbases", "resource", 1L, 7), new ItemStack[]{GT_ModHandler.getModItem("thaumicbases", "tobaccoPowder", 1L, 0)}, new int[]{10000}, 10, 2);

        for (int i = 0; i < OreDictionary.getOres("cropCotton").size(); ++i)
            GT_Values.RA.addAssemblerRecipe(new ItemStack[]{new ItemStack(Items.string, 4), OreDictionary.getOres("cropCotton").get(i).splitStack(3)}, GT_Values.NF, GT_ModHandler.getModItem("harvestcraft", "wovencottonItem", 1L, 0), 400, 30, false);

        //recipes for everything that uses sand
        for (int i = 0; i < OreDictionary.getOres("sand").size(); ++i) {
            GT_Values.RA.addPulveriserRecipe(OreDictionary.getOres("sand").get(i), new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.dust, Materials.QuartzSand, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.QuartzSand, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.QuartzSand, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.QuartzSand, 1L)}, new int[]{10000, 2500, 2000, 1500}, 200, 2);
        }

        GT_Values.RA.addChemicalRecipe(new ItemStack(Items.ghast_tear), GT_Utility.getIntegratedCircuit(1), Materials.Water.getFluid(1000L), Materials.SaltWater.getFluid(1000L), Materials.Potassium.getDustTiny(1), Materials.Lithium.getDustTiny(1), 400, 30, false);
        GT_Values.RA.addChemicalRecipe(new ItemStack(Items.ghast_tear, 9, 0), GT_Utility.getIntegratedCircuit(9), Materials.Water.getFluid(9000L), Materials.SaltWater.getFluid(9000L), Materials.Potassium.getDust(1), Materials.Lithium.getDust(1), 3600, 30, false);
        GT_Values.RA.addChemicalBathRecipe(GT_ModHandler.getModItem("IC2", "itemBiochaff", 1L, 0), Materials.Water.getFluid(750L), GT_ModHandler.getModItem("Forestry", "mulch", 8L, 0), GT_ModHandler.getModItem("Forestry", "mulch", 4L, 0), GT_ModHandler.getModItem("Forestry", "mulch", 4L, 0), new int[]{10000, 3300, 2000}, 500, 30);

        //EnderIO Fused Quartz and Glass
        if (Loader.isModLoaded("EnderIO")) {
            GT_Values.RA.addAlloySmelterRecipe(Materials.CertusQuartz.getDust(2), Materials.Glass.getDust(1), GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L), 500, 30);
            GT_Values.RA.addAlloySmelterRecipe(Materials.NetherQuartz.getDust(2), Materials.Glass.getDust(1), GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L), 500, 30);
            GT_Values.RA.addAlloySmelterRecipe(Materials.CertusQuartz.getDust(2), Materials.Quartzite.getDust(2), GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L), 500, 30);
            GT_Values.RA.addAlloySmelterRecipe(Materials.NetherQuartz.getDust(2), Materials.Quartzite.getDust(2), GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L), 500, 30);
            GT_Values.RA.addAlloySmelterRecipe(Materials.CertusQuartz.getDust(1), Materials.BorosilicateGlass.getDust(1), GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L), 500, 90);
            GT_Values.RA.addAlloySmelterRecipe(Materials.NetherQuartz.getDust(1), Materials.BorosilicateGlass.getDust(1), GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L), 500, 90);

            GT_Values.RA.addAlloySmelterRecipe(Materials.Glass.getDust(3), GT_Utility.getIntegratedCircuit(1), GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L, 1), 500, 30);
            GT_Values.RA.addAlloySmelterRecipe(Materials.Quartzite.getDust(4), GT_Utility.getIntegratedCircuit(1), GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L, 1), 500, 30);
            GT_Values.RA.addAlloySmelterRecipe(Materials.BorosilicateGlass.getDust(1), GT_Utility.getIntegratedCircuit(1), GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 2L, 1), 500, 90);

            GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L), Materials.Glowstone.getDust(4), GT_Utility.getIntegratedCircuit(1)}, GT_Values.NF, GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L, 2), 500, 30);
            GT_Values.RA.addAlloySmelterRecipe(GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L, 1), Materials.Glowstone.getDust(4), GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L, 3), 500, 30);
            GT_Values.RA.addAlloySmelterRecipe(GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L, 1), new ItemStack(Blocks.glowstone), GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L, 3), 500, 30);

            GT_Values.RA.addBlastRecipe(Materials.CertusQuartz.getDust(2), Materials.Glass.getDust(1), GT_Values.NF, GT_Values.NF, GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L), GT_Values.NI, 100, 120, 1000);
            GT_Values.RA.addBlastRecipe(Materials.NetherQuartz.getDust(2), Materials.Glass.getDust(1), GT_Values.NF, GT_Values.NF, GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L), GT_Values.NI, 100, 120, 1000);
            GT_Values.RA.addBlastRecipe(Materials.CertusQuartz.getDust(2), Materials.Quartzite.getDust(2), GT_Values.NF, GT_Values.NF, GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L), GT_Values.NI, 100, 120, 1000);
            GT_Values.RA.addBlastRecipe(Materials.NetherQuartz.getDust(2), Materials.Quartzite.getDust(2), GT_Values.NF, GT_Values.NF, GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L), GT_Values.NI, 100, 120, 1000);
            GT_Values.RA.addBlastRecipe(Materials.CertusQuartz.getDust(1), Materials.BorosilicateGlass.getDust(1), GT_Values.NF, GT_Values.NF, GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L), GT_Values.NI, 200, 120, 1000);
            GT_Values.RA.addBlastRecipe(Materials.NetherQuartz.getDust(1), Materials.BorosilicateGlass.getDust(1), GT_Values.NF, GT_Values.NF, GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L), GT_Values.NI, 200, 120, 1000);

            for (int i = 0; i < OreDictionary.getOres("dyeBlack").size(); i++) {
                GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L), OreDictionary.getOres("dyeBlack").get(i).splitStack(4), GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L, 4), 500, 30);
                GT_Values.RA.addAlloySmelterRecipe(GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L, 1), OreDictionary.getOres("dyeBlack").get(i).splitStack(4), GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L, 5), 500, 30);
            }

            GT_Values.RA.addChemicalBathRecipe(GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyeblack"), 72), GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L, 4), GT_Values.NI, GT_Values.NI, new int[]{10000}, 500, 30);
            GT_Values.RA.addChemicalBathRecipe(GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L, 1), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyeblack"), 72), GT_ModHandler.getModItem("EnderIO", "blockFusedQuartz", 1L, 5), GT_Values.NI, GT_Values.NI, new int[]{10000}, 500, 30);
        }

        if (Loader.isModLoaded("OpenComputers")) {
            //floppys w NBT
            make_floppy("OpenOS (Operating System)", "openos", 2, 1);
            make_floppy("Plan9k (Operating System)", "plan9k", 1, 2);
            make_floppy("Network (Network Stack)", "network", 10, 3);
            make_floppy("Data Card Software", "data", 9, 4);
            make_floppy("OpenLoader (Boot Loader)", "openloader", 13, 5);
            make_floppy("Builder", "builder", 11, 6);
            make_floppy("Generator", "generator", 5, 7);
            make_floppy("OPPM (Package Manager)", "oppm", 6, 8);
            make_floppy("Digger", "dig", 3, 9);
            make_floppy("Mazer", "maze", 14, 10);
            make_floppy("OpenIRC (IRC Client)", "irc", 12, 11);
         }

        if (Loader.isModLoaded("OpenBlocks") && Loader.isModLoaded("AWWayofTime")) {
            ItemStack[] trophies = {
                    GT_ModHandler.getModItem("OpenBlocks", "trophy", 1L),
                    GT_ModHandler.getModItem("OpenBlocks", "trophy", 1L),
                    GT_ModHandler.getModItem("OpenBlocks", "trophy", 1L),
                    GT_ModHandler.getModItem("OpenBlocks", "trophy", 1L),
            };

            NBTTagCompound[] tag = {
                    new NBTTagCompound(),
                    new NBTTagCompound(),
                    new NBTTagCompound(),
                    new NBTTagCompound(),
            };

            tag[0].setString("entity", "Bat");
            tag[1].setString("entity", "Cow");
            tag[2].setString("entity", "Chicken");
            tag[3].setString("entity", "Sheep");

            ItemStack flightpotion = GT_ModHandler.getModItem("AWWayofTime", "alchemyFlask", 1L);
            NBTTagCompound flighttag = new NBTTagCompound();
            NBTTagList flighsubtag = new NBTTagList();
            NBTTagCompound temp;

            temp = new NBTTagCompound();
            temp.setInteger("concentration", 0);
            temp.setInteger("durationFactor", 2);
            temp.setInteger("potionID", 104);
            temp.setInteger("tickDuration", 1200);
            flighsubtag.appendTag(temp);

            flighttag.setTag("CustomFlaskEffects", flighsubtag);
            flightpotion.setTagCompound(flighttag);

            for (int i = 0; i < 4; ++i)
                trophies[i].setTagCompound(tag[i]);

            GT_Values.RA.addAssemblerRecipe(trophies[0], new ItemStack(Items.golden_carrot), new ItemStack(Items.potionitem, 1, 8262), 120, 120);
            GT_Values.RA.addAssemblerRecipe(trophies[1], new ItemStack(Items.iron_sword), new ItemStack(Items.leather, 64), 120, 120);
            GT_Values.RA.addAssemblerRecipe(trophies[2], new ItemStack(Items.feather), flightpotion, 120, 120);
            GT_Values.RA.addAssemblerRecipe(trophies[3], new ItemStack(Items.shears), new ItemStack(Blocks.wool, 64), 120, 120);
        }


        //Neutron reflector recipes. NR is in IC2 script, INR in GT script
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("IC2", "reactorReflector", 1L, 1), GT_Utility.getIntegratedCircuit(1)}, GT_Values.NF, CustomItemList.NeutronReflectorSmallParts.get(1), 300, 120);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{CustomItemList.NeutronReflectorSmallParts.get(5L), GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Beryllium, 2L)}, GT_Values.NF, GT_ModHandler.getModItem("IC2", "reactorReflectorThick", 1L, 0), 600, 64);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{CustomItemList.NeutronReflectorSmallParts.get(5L), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.TungstenCarbide, 2L)}, GT_Values.NF, GT_ModHandler.getModItem("IC2", "reactorReflectorThick", 1L, 0), 600, 64);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("IC2", "reactorReflectorThick", 1L, 0), GT_Utility.getIntegratedCircuit(1)}, GT_Values.NF, CustomItemList.NeutronReflectorParts.get(1), 600, 120);

        //Arcane Slabs -> Arcane Stone
        if (Loader.isModLoaded("Thaumcraft"))
            GT_Values.RA.addCompressorRecipe(GT_ModHandler.getModItem("Thaumcraft", "blockCosmeticSlabStone", 4L), GT_ModHandler.getModItem("Thaumcraft", "blockCosmeticSolid", 1L, 6), 160, 4);

        //Astral Silver & Soldering Alloy + reverse
        GT_Values.RA.addMixerRecipe(Materials.Silver.getDust(2), Materials.Thaumium.getDust(1), GT_Utility.getIntegratedCircuit(1), null, null, null, Materials.AstralSilver.getDust(3), 60, 480);
        GT_Values.RA.addMixerRecipe(Materials.Tin.getDust(9), Materials.Antimony.getDust(1), GT_Utility.getIntegratedCircuit(1), null, null, null, Materials.SolderingAlloy.getDust(10), 60, 30);
        GT_Values.RA.addCentrifugeRecipe(Materials.AstralSilver.getDust(3), null, null, null, Materials.Silver.getDust(2), Materials.Thaumium.getDust(1), null, null, null, null, null, 300, 480);
        GT_Values.RA.addCentrifugeRecipe(Materials.SolderingAlloy.getDust(10), null, null, null, Materials.Tin.getDust(9), Materials.Antimony.getDust(1), null, null, null, null, null, 300, 30);
    }

    private static boolean make_floppy(String displayname, String name, int color, int circuit) {
        ItemStack floppy = GT_ModHandler.getModItem("OpenComputers", "item", 1L, 4);
        NBTTagCompound tag = new NBTTagCompound(),
                subtag = new NBTTagCompound();
        subtag.setString("Name", displayname);
        tag.setTag("display", subtag);
        subtag = new NBTTagCompound();
        subtag.setString("oc:fs.label", name);
        tag.setTag("oc:data", subtag);
        tag.setInteger("oc:color", color);
        tag.setString("oc:lootFactory", "OpenComputers:" + name);
        floppy.setTagCompound(tag);
        return GT_Values.RA.addLaserEngraverRecipe(GT_ModHandler.getModItem("OpenComputers", "item", 1L, 4), GT_Utility.getIntegratedCircuit(circuit), floppy, 200, 120);
    }

    private static boolean make_lua_bios() {
        ItemStack lua = GT_ModHandler.getModItem("OpenComputers", "eeprom", 1L, 0);
        NBTTagCompound tag = new NBTTagCompound(),
                subtag = new NBTTagCompound();
        subtag.setString("oc:label", "EEPROM (Lua Bios)");
        subtag.setBoolean("oc:readonly", false);
        final byte[] b = {
                108, 111, 99, 97, 108, 32, 99, 111, 109, 112, 111, 110, 101, 110, 116, 95, 105, 110, 118, 111, 107,
                101, 32, 61, 32, 99, 111, 109, 112, 111, 110, 101, 110, 116, 46, 105, 110, 118, 111, 107, 101, 10, 102, 117,
                110, 99, 116, 105, 111, 110, 32, 98, 111, 111, 116, 95, 105, 110, 118, 111, 107, 101, 40, 97, 100, 100, 114,
                101, 115, 115, 44, 32, 109, 101, 116, 104, 111, 100, 44, 32, 46, 46, 46, 41, 10, 32, 32, 108, 111, 99, 97,
                108, 32, 114, 101, 115, 117, 108, 116, 32, 61, 32, 116, 97, 98, 108, 101, 46, 112, 97, 99, 107, 40, 112, 99,
                97, 108, 108, 40, 99, 111, 109, 112, 111, 110, 101, 110, 116, 95, 105, 110, 118, 111, 107, 101, 44, 32, 97,
                100, 100, 114, 101, 115, 115, 44, 32, 109, 101, 116, 104, 111, 100, 44, 32, 46, 46, 46, 41, 41, 10, 32, 32,
                105, 102, 32, 110, 111, 116, 32, 114, 101, 115, 117, 108, 116, 91, 49, 93, 32, 116, 104, 101, 110, 10, 32, 32,
                32, 32, 114, 101, 116, 117, 114, 110, 32, 110, 105, 108, 44, 32, 114, 101, 115, 117, 108, 116, 91, 50, 93, 10,
                32, 32, 101, 108, 115, 101, 10, 32, 32, 32, 32, 114, 101, 116, 117, 114, 110, 32, 116, 97, 98, 108, 101, 46,
                117, 110, 112, 97, 99, 107, 40, 114, 101, 115, 117, 108, 116, 44, 32, 50, 44, 32, 114, 101, 115, 117, 108, 116,
                46, 110, 41, 10, 32, 32, 101, 110, 100, 10, 101, 110, 100, 10, 10, 45, 45, 32, 98, 97, 99, 107, 119, 97, 114,
                100, 115, 32, 99, 111, 109, 112, 97, 116, 105, 98, 105, 108, 105, 116, 121, 44, 32, 109, 97, 121, 32, 114, 101,
                109, 111, 118, 101, 32, 108, 97, 116, 101, 114, 10, 108, 111, 99, 97, 108, 32, 101, 101, 112, 114, 111, 109, 32,
                61, 32, 99, 111, 109, 112, 111, 110, 101, 110, 116, 46, 108, 105, 115, 116, 40, 34, 101, 101, 112, 114, 111, 109,
                34, 41, 40, 41, 10, 99, 111, 109, 112, 117, 116, 101, 114, 46, 103, 101, 116, 66, 111, 111, 116, 65, 100, 100,
                114, 101, 115, 115, 32, 61, 32, 102, 117, 110, 99, 116, 105, 111, 110, 40, 41, 10, 32, 32, 114, 101, 116, 117,
                114, 110, 32, 98, 111, 111, 116, 95, 105, 110, 118, 111, 107, 101, 40, 101, 101, 112, 114, 111, 109, 44, 32, 34,
                103, 101, 116, 68, 97, 116, 97, 34, 41, 10, 101, 110, 100, 10, 99, 111, 109, 112, 117, 116, 101, 114, 46, 115,
                101, 116, 66, 111, 111, 116, 65, 100, 100, 114, 101, 115, 115, 32, 61, 32, 102, 117, 110, 99, 116, 105, 111, 110,
                40, 97, 100, 100, 114, 101, 115, 115, 41, 10, 32, 32, 114, 101, 116, 117, 114, 110, 32, 98, 111, 111, 116, 95,
                105, 110, 118, 111, 107, 101, 40, 101, 101, 112, 114, 111, 109, 44, 32, 34, 115, 101, 116, 68, 97, 116, 97, 34,
                44, 32, 97, 100, 100, 114, 101, 115, 115, 41, 10, 101, 110, 100, 10, 10, 100, 111, 10, 32, 32, 108, 111, 99, 97,
                108, 32, 115, 99, 114, 101, 101, 110, 32, 61, 32, 99, 111, 109, 112, 111, 110, 101, 110, 116, 46, 108, 105, 115,
                116, 40, 34, 115, 99, 114, 101, 101, 110, 34, 41, 40, 41, 10, 32, 32, 108, 111, 99, 97, 108, 32, 103, 112, 117,
                32, 61, 32, 99, 111, 109, 112, 111, 110, 101, 110, 116, 46, 108, 105, 115, 116, 40, 34, 103, 112, 117, 34, 41,
                40, 41, 10, 32, 32, 105, 102, 32, 103, 112, 117, 32, 97, 110, 100, 32, 115, 99, 114, 101, 101, 110, 32, 116, 104,
                101, 110, 10, 32, 32, 32, 32, 98, 111, 111, 116, 95, 105, 110, 118, 111, 107, 101, 40, 103, 112, 117, 44, 32, 34,
                98, 105, 110, 100, 34, 44, 32, 115, 99, 114, 101, 101, 110, 41, 10, 32, 32, 101, 110, 100, 10, 101, 110, 100, 10,
                108, 111, 99, 97, 108, 32, 102, 117, 110, 99, 116, 105, 111, 110, 32, 116, 114, 121, 76, 111, 97, 100, 70, 114,
                111, 109, 40, 97, 100, 100, 114, 101, 115, 115, 41, 10, 32, 32, 108, 111, 99, 97, 108, 32, 104, 97, 110, 100, 108,
                101, 44, 32, 114, 101, 97, 115, 111, 110, 32, 61, 32, 98, 111, 111, 116, 95, 105, 110, 118, 111, 107, 101, 40, 97,
                100, 100, 114, 101, 115, 115, 44, 32, 34, 111, 112, 101, 110, 34, 44, 32, 34, 47, 105, 110, 105, 116, 46, 108, 117,
                97, 34, 41, 10, 32, 32, 105, 102, 32, 110, 111, 116, 32, 104, 97, 110, 100, 108, 101, 32, 116, 104, 101, 110, 10,
                32, 32, 32, 32, 114, 101, 116, 117, 114, 110, 32, 110, 105, 108, 44, 32, 114, 101, 97, 115, 111, 110, 10, 32, 32,
                101, 110, 100, 10, 32, 32, 108, 111, 99, 97, 108, 32, 98, 117, 102, 102, 101, 114, 32, 61, 32, 34, 34, 10, 32, 32,
                114, 101, 112, 101, 97, 116, 10, 32, 32, 32, 32, 108, 111, 99, 97, 108, 32, 100, 97, 116, 97, 44, 32, 114, 101, 97,
                115, 111, 110, 32, 61, 32, 98, 111, 111, 116, 95, 105, 110, 118, 111, 107, 101, 40, 97, 100, 100, 114, 101, 115, 115,
                44, 32, 34, 114, 101, 97, 100, 34, 44, 32, 104, 97, 110, 100, 108, 101, 44, 32, 109, 97, 116, 104, 46, 104, 117, 103,
                101, 41, 10, 32, 32, 32, 32, 105, 102, 32, 110, 111, 116, 32, 100, 97, 116, 97, 32, 97, 110, 100, 32, 114, 101, 97,
                115, 111, 110, 32, 116, 104, 101, 110, 10, 32, 32, 32, 32, 32, 32, 114, 101, 116, 117, 114, 110, 32, 110, 105, 108,
                44, 32, 114, 101, 97, 115, 111, 110, 10, 32, 32, 32, 32, 101, 110, 100, 10, 32, 32, 32, 32, 98, 117, 102, 102, 101,
                114, 32, 61, 32, 98, 117, 102, 102, 101, 114, 32, 46, 46, 32, 40, 100, 97, 116, 97, 32, 111, 114, 32, 34, 34, 41, 10,
                32, 32, 117, 110, 116, 105, 108, 32, 110, 111, 116, 32, 100, 97, 116, 97, 10, 32, 32, 98, 111, 111, 116, 95, 105, 110,
                118, 111, 107, 101, 40, 97, 100, 100, 114, 101, 115, 115, 44, 32, 34, 99, 108, 111, 115, 101, 34, 44, 32, 104, 97, 110,
                100, 108, 101, 41, 10, 32, 32, 114, 101, 116, 117, 114, 110, 32, 108, 111, 97, 100, 40, 98, 117, 102, 102, 101, 114, 44,
                32, 34, 61, 105, 110, 105, 116, 34, 41, 10, 101, 110, 100, 10, 108, 111, 99, 97, 108, 32, 105, 110, 105, 116, 44, 32,
                114, 101, 97, 115, 111, 110, 10, 105, 102, 32, 99, 111, 109, 112, 117, 116, 101, 114, 46, 103, 101, 116, 66, 111, 111,
                116, 65, 100, 100, 114, 101, 115, 115, 40, 41, 32, 116, 104, 101, 110, 10, 32, 32, 105, 110, 105, 116, 44, 32, 114, 101,
                97, 115, 111, 110, 32, 61, 32, 116, 114, 121, 76, 111, 97, 100, 70, 114, 111, 109, 40, 99, 111, 109, 112, 117, 116, 101,
                114, 46, 103, 101, 116, 66, 111, 111, 116, 65, 100, 100, 114, 101, 115, 115, 40, 41, 41, 10, 101, 110, 100, 10, 105, 102,
                32, 110, 111, 116, 32, 105, 110, 105, 116, 32, 116, 104, 101, 110, 10, 32, 32, 99, 111, 109, 112, 117, 116, 101, 114, 46,
                115, 101, 116, 66, 111, 111, 116, 65, 100, 100, 114, 101, 115, 115, 40, 41, 10, 32, 32, 102, 111, 114, 32, 97, 100, 100,
                114, 101, 115, 115, 32, 105, 110, 32, 99, 111, 109, 112, 111, 110, 101, 110, 116, 46, 108, 105, 115, 116, 40, 34, 102,
                105, 108, 101, 115, 121, 115, 116, 101, 109, 34, 41, 32, 100, 111, 10, 32, 32, 32, 32, 105, 110, 105, 116, 44, 32, 114,
                101, 97, 115, 111, 110, 32, 61, 32, 116, 114, 121, 76, 111, 97, 100, 70, 114, 111, 109, 40, 97, 100, 100, 114, 101, 115,
                115, 41, 10, 32, 32, 32, 32, 105, 102, 32, 105, 110, 105, 116, 32, 116, 104, 101, 110, 10, 32, 32, 32, 32, 32, 32, 99,
                111, 109, 112, 117, 116, 101, 114, 46, 115, 101, 116, 66, 111, 111, 116, 65, 100, 100, 114, 101, 115, 115, 40, 97, 100,
                100, 114, 101, 115, 115, 41, 10, 32, 32, 32, 32, 32, 32, 98, 114, 101, 97, 107, 10, 32, 32, 32, 32, 101, 110, 100, 10,
                32, 32, 101, 110, 100, 10, 101, 110, 100, 10, 105, 102, 32, 110, 111, 116, 32, 105, 110, 105, 116, 32, 116, 104, 101,
                110, 10, 32, 32, 101, 114, 114, 111, 114, 40, 34, 110, 111, 32, 98, 111, 111, 116, 97, 98, 108, 101, 32, 109, 101, 100,
                105, 117, 109, 32, 102, 111, 117, 110, 100, 34, 32, 46, 46, 32, 40, 114, 101, 97, 115, 111, 110, 32, 97, 110, 100, 32,
                40, 34, 58, 32, 34, 32, 46, 46, 32, 116, 111, 115, 116, 114, 105, 110, 103, 40, 114, 101, 97, 115, 111, 110, 41, 41, 32,
                111, 114, 32, 34, 34, 41, 44, 32, 48, 41, 10, 101, 110, 100, 10, 99, 111, 109, 112, 117, 116, 101, 114, 46, 98, 101, 101,
                112, 40, 49, 48, 48, 48, 44, 32, 48, 46, 50, 41, 10, 105, 110, 105, 116, 40, 41
        };
        subtag.setByteArray("oc:eeprom", b);
        tag.setTag("oc:data", subtag);
        lua.setTagCompound(tag);
        return GT_Values.RA.addLaserEngraverRecipe(GT_ModHandler.getModItem("OpenComputers", "eeprom", 1L, 0), GT_Utility.getIntegratedCircuit(1), lua, 200, 120);
    }
}
