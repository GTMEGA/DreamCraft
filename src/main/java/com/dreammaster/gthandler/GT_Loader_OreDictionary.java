package com.dreammaster.gthandler;

import com.dreammaster.item.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_Log;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GT_Loader_OreDictionary extends gregtech.loaders.preload.GT_Loader_OreDictionary
        implements Runnable {
    @Override
    public void run() {
        GT_Log.out.println("Core-Mod: Register OreDict Entries of Non-GT-Items.");


        //Custom Stuff GT New Horizons 1.3.X.X
        GT_OreDictUnificator.registerOre("ingotBloodInfusedIron", GT_ModHandler.getModItem("BloodArsenal", "blood_infused_iron", 1L, 0));
        GT_OreDictUnificator.registerOre("blockBloodInfusedIron", GT_ModHandler.getModItem("BloodArsenal", "blood_infused_iron_block", 1L, 0));

        GT_OreDictUnificator.registerOre(OrePrefixes.log, Materials.Wood, GT_ModHandler.getModItem("BiomesOPlenty", "logs4", 1L, 3));
        GT_OreDictUnificator.registerOre("cropCarrot", GT_ModHandler.getModItem("BiomesOPlenty", "food", 1L, 2));

        GT_OreDictUnificator.registerOre(OrePrefixes.stick, Materials.Stone, ItemList.CobbleStoneRod.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.plate, Materials.Stone, ItemList.StonePlate.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.plate, Materials.Void, ItemList.VoidPlate.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.stick, Materials.Void, ItemList.VoidRod.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.ring, Materials.Void, ItemList.VoidRing.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.foil, Materials.Void, ItemList.VoidFoil.getIS());
        GT_OreDictUnificator.registerOre("stickSandstone", ItemList.SandStoneRod.getIS());
        GT_OreDictUnificator.registerOre("lensReinforcedGlass", ItemList.ReinforcedGlassLense.getIS());
        GT_OreDictUnificator.registerOre("plateReinforcedGlass", ItemList.ReinforcedGlassPlate.getIS());
//        GT_OreDictUnificator.registerOre("blockQuantium", GT_ModHandler.getModItem("dreamcraft", "tile.Quantinum", 1L, 0));
        //GT_OreDictUnificator.registerOre(OrePrefixes.lens, Materials.MysteriousCrystal, ItemList.MysteriousCrystalLens.getIS());
        //GT_OreDictUnificator.registerOre(OrePrefixes.gemFlawless, Materials.MysteriousCrystal, ItemList.MysteriousCrystalGemFlawless.getIS());
        //GT_OreDictUnificator.registerOre(OrePrefixes.gemExquisite, Materials.MysteriousCrystal, ItemList.MysteriousCrystalGemExquisite.getIS());
        //GT_OreDictUnificator.registerOre(OrePrefixes.gem, Materials.MysteriousCrystal, ItemList.MysteriousCrystal.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.plate, Materials.Bedrockium, GT_ModHandler.getModItem("dreamcraft", "item.BedrockiumPlate", 1L, 0));
        GT_OreDictUnificator.registerOre(OrePrefixes.plate, Materials.Manyullyn, GT_ModHandler.getModItem("dreamcraft", "item.ManyullynPlate", 1L, 0));
        GT_OreDictUnificator.registerOre(OrePrefixes.plate, Materials.Ardite, GT_ModHandler.getModItem("dreamcraft", "item.ArditePlate", 1L, 0));
        GT_OreDictUnificator.registerOre(OrePrefixes.dust, Materials.Alumite, ItemList.AlumiteDust.getIS());
        GT_OreDictUnificator.registerOre("dustQuartzSand", GT_ModHandler.getModItem("dreamcraft", "item.SandDust", 1L, 0));
        GT_OreDictUnificator.registerOre("dustChargedCertusQuartz", GT_ModHandler.getModItem("dreamcraft", "item.ChargedCertusQuartzDust", 1L, 0));
        GT_OreDictUnificator.registerOre("plateChargedCertusQuartz", GT_ModHandler.getModItem("dreamcraft", "item.ChargedCertusQuartzPlate", 1L, 0));
        GT_OreDictUnificator.registerOre("stickChargedCertusQuartz", GT_ModHandler.getModItem("dreamcraft", "item.ChargedCertusQuartzRod", 1L, 0));
        GT_OreDictUnificator.registerOre("dustCokeOvenBrick", GT_ModHandler.getModItem("dreamcraft", "item.CokeOvenBrickDust", 1L, 0));
        GT_OreDictUnificator.registerOre("ingotCokeOvenBrick", GT_ModHandler.getModItem("dreamcraft", "item.CokeOvenBrick", 1L, 0));
        GT_OreDictUnificator.registerOre("leather", GT_ModHandler.getModItem("dreamcraft", "item.ArtificialLeather", 1L, 0));
        GT_OreDictUnificator.registerOre("itemLeather", GT_ModHandler.getModItem("dreamcraft", "item.ArtificialLeather", 1L, 0));

        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.Aluminium, ItemList.AluminiumBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.Chrome, ItemList.ChromeBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.ConductiveIron, ItemList.ConductiveIronBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.ElectricalSteel, ItemList.ElectricalSteelBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.EnergeticAlloy, ItemList.EnergeticAlloyBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.Enderium, ItemList.EnderiumBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.EnderiumBase, ItemList.EnderiumBaseBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.Iridium, ItemList.IridiumBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.Neutronium, ItemList.NeutroniumBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.Osmium, ItemList.OsmiumBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.PulsatingIron, ItemList.PulsatingIronBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.RedstoneAlloy, ItemList.RedstoneAlloyBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.Soularium, ItemList.SoulariumBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.Soularium, GT_ModHandler.getModItem("EnderIO", "blockSoulariumBars", 1L, 0));
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.StainlessSteel, ItemList.StainlessSteelBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.Steel, ItemList.SteelBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.Titanium, ItemList.TitaniumBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.Tungsten, ItemList.TungstenBars.getIS());
        GT_OreDictUnificator.registerOre(OrePrefixes.bars, Materials.TungstenSteel, ItemList.TungstenSteelBars.getIS());

        GT_OreDictUnificator.registerOre(OrePrefixes.ore, Materials.Ilmenite, GT_ModHandler.getModItem("GalacticraftMars", "tile.asteroidsBlock", 1L, 4));

        GT_OreDictUnificator.registerOre(OrePrefixes.ingot, Materials.HeeEndium, GT_ModHandler.getModItem("HardcoreEnderExpansion", "tile.endium_ingot", 1L, 0));
        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.HeeEndium, GT_ModHandler.getModItem("HardcoreEnderExpansion", "endium_block", 1L, 0));

        GT_OreDictUnificator.registerOre("oreAdamantium", GT_ModHandler.getModItem("GalaxySpace", "oberonblocks", 1L, 3));
        GT_OreDictUnificator.registerOre("ingotAdamantium", GT_ModHandler.getModItem("GalaxySpace", "item.Ingots", 1L, 0));
        GT_OreDictUnificator.registerOre("oreCobalt", GT_ModHandler.getModItem("GalaxySpace", "phobosblocks", 1L, 4));
        GT_OreDictUnificator.registerOre("ingotCobalt", GT_ModHandler.getModItem("GalaxySpace", "item.Ingots", 1L, 1));

        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.Lead, GT_ModHandler.getModItem("GalaxySpace", "metalsblock", 1L, 0));
        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.Adamantium, GT_ModHandler.getModItem("GalaxySpace", "metalsblock", 1L, 1));
        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.Cobalt, GT_ModHandler.getModItem("GalaxySpace", "metalsblock", 1L, 2));
        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.Magnesium, GT_ModHandler.getModItem("GalaxySpace", "metalsblock", 1L, 3));
        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.Mithril, GT_ModHandler.getModItem("GalaxySpace", "metalsblock", 1L, 4));
        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.Nickel, GT_ModHandler.getModItem("GalaxySpace", "metalsblock", 1L, 5));
        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.Platinum, GT_ModHandler.getModItem("GalaxySpace", "metalsblock", 1L, 7));
        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.Tungsten, GT_ModHandler.getModItem("GalaxySpace", "metalsblock", 1L, 8));
        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.Copper, GT_ModHandler.getModItem("GalaxySpace", "metalsblock", 1L, 9));

        GT_OreDictUnificator.registerOre("craftingToolShears", new ItemStack(Items.shears, 1, 32767));

        GT_OreDictUnificator.registerOre("cropBarley", GT_ModHandler.getModItem("Natura", "barleyFood", 1L, 0));

        GT_OreDictUnificator.registerOre("craftingToolShears", GT_ModHandler.getModItem("ExtraUtilities", "shears", 1L, 32767));
        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.Unstable, GT_ModHandler.getModItem("ExtraUtilities", "decorativeBlock1", 1L, 5));

        GT_OreDictUnificator.registerOre("logWood", GT_ModHandler.getModItem("ForbiddenMagic", "TaintLog", 1L, 32767));
        GT_OreDictUnificator.registerOre("plankWood", GT_ModHandler.getModItem("ForbiddenMagic", "TaintPlank", 1L, 32767));

        GT_OreDictUnificator.registerOre("beeComb", GT_ModHandler.getModItem("gendustry", "HoneyComb", 1L));

        GT_OreDictUnificator.registerOre("itemBeeswax", GT_ModHandler.getModItem("harvestcraft", "beeswaxItem", 1L, 0));
        GT_OreDictUnificator.registerOre("foodFlour", GT_ModHandler.getModItem("harvestcraft", "flourItem", 1L, 0));
        GT_OreDictUnificator.registerOre("listAllmeatcooked", GT_ModHandler.getModItem("gregtech", "gt.metaitem.01", 1L, 2893));
        GT_OreDictUnificator.registerOre("listAllporkcooked", GT_ModHandler.getModItem("gregtech", "gt.metaitem.01", 1L, 2893));
        GT_OreDictUnificator.registerOre("listAllchickencooked", GT_ModHandler.getModItem("gregtech", "gt.metaitem.01", 1L, 2893));
        GT_OreDictUnificator.registerOre("listAllbeefcooked", GT_ModHandler.getModItem("gregtech", "gt.metaitem.01", 1L, 2893));
        GT_OreDictUnificator.registerOre("listAllmeatraw", GT_ModHandler.getModItem("gregtech", "gt.metaitem.01", 1L, 2892));
        GT_OreDictUnificator.registerOre("listAllporkraw", GT_ModHandler.getModItem("gregtech", "gt.metaitem.01", 1L, 2892));
        GT_OreDictUnificator.registerOre("listAllchickenraw", GT_ModHandler.getModItem("gregtech", "gt.metaitem.01", 1L, 2892));
        GT_OreDictUnificator.registerOre("listAllbeefraw", GT_ModHandler.getModItem("gregtech", "gt.metaitem.01", 1L, 2892));
        GT_OreDictUnificator.registerOre("foodSalt", GT_ModHandler.getModItem("gregtech", "gt.metaitem.01", 1L, 2817));
        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.Salt, GT_ModHandler.getModItem("harvestcraft", "spamcompressedsaltBlockalt", 1L, 0));

        GT_OreDictUnificator.registerOre(OrePrefixes.dust, Materials.Wheat, GT_ModHandler.getModItem("harvestcraft", "flourItem", 1L, 0));

        GT_OreDictUnificator.registerOre("beeComp", GT_ModHandler.getModItem("computronics", "computronics.partsForestry", 1L, 0));

        GT_OreDictUnificator.registerOre("craftingToolShears", GT_ModHandler.getModItem("Railcraft", "tool.steel.shears", 1L, 0));
        GT_OreDictUnificator.registerOre(OrePrefixes.plate, Materials.Lead, GT_ModHandler.getModItem("Railcraft", "part.plate", 1L, 4));
        GT_OreDictUnificator.registerOre("craftingToolCrowbar", GT_ModHandler.getModItem("Railcraft", "tool.crowbar", 1L, 0));
        GT_OreDictUnificator.registerOre("craftingToolCrowbar", GT_ModHandler.getModItem("Railcraft", "tool.crowbar.reinforced", 1L, 0));
        GT_OreDictUnificator.registerOre("craftingToolCrowbar", GT_ModHandler.getModItem("Railcraft", "tool.crowbar.magic", 1L, 0));
        GT_OreDictUnificator.registerOre("craftingToolCrowbar", GT_ModHandler.getModItem("Railcraft", "tool.crowbar.void", 1L, 0));

        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.Reinforced, GT_ModHandler.getModItem("StevesCarts", "BlockMetalStorage", 1L, 0));
        //GT_OreDictUnificator.registerOre(OrePrefixes.ingot, Materials.Reinforced, GT_ModHandler.getModItem("StevesCarts", "ModuleComponents", 1L, 22));
        //GT_OreDictUnificator.registerOre(OrePrefixes.ingot, Materials.Galgadorian, GT_ModHandler.getModItem("StevesCarts", "ModuleComponents", 1L, 47));
        //GT_OreDictUnificator.registerOre(OrePrefixes.ingot, Materials.EnhancedGalgadorian, GT_ModHandler.getModItem("StevesCarts", "ModuleComponents", 1L, 49));
        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.Galgadorian, GT_ModHandler.getModItem("StevesCarts", "BlockMetalStorage", 1L, 1));
        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.EnhancedGalgadorian, GT_ModHandler.getModItem("StevesCarts", "BlockMetalStorage", 1L, 2));

        GT_OreDictUnificator.registerOre(OrePrefixes.nugget, Materials.Void, GT_ModHandler.getModItem("Thaumcraft", "ItemNugget", 1L, 7));
        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.Amber, GT_ModHandler.getModItem("Thaumcraft", "item.blockCosmeticOpaque", 1L, 0));

        GT_OreDictUnificator.registerOre(OrePrefixes.ingot, Materials.Bedrockium, GT_ModHandler.getModItem("ExtraUtilities", "bedrockiumIngot", 1L, 0));

        GT_OreDictUnificator.registerOre(OrePrefixes.block, Materials.Shadow, GT_ModHandler.getModItem("TaintedMagic", "BlockShadowmetal", 1L, 0));
        GT_OreDictUnificator.registerOre(OrePrefixes.ingot, Materials.Shadow, GT_ModHandler.getModItem("TaintedMagic", "ItemMaterial", 1L, 0));

        GT_OreDictUnificator.registerOre(OrePrefixes.ingot, Materials.Ichorium, GT_ModHandler.getModItem("ThaumicTinkerer", "kamiResource", 1L, 2));
        GT_OreDictUnificator.registerOre(OrePrefixes.nugget, Materials.Ichorium, GT_ModHandler.getModItem("ThaumicTinkerer", "kamiResource", 1L, 3));

        GT_OreDictUnificator.registerOre("dyeLime", GT_ModHandler.getModItem("gregtech", "gt.metaitem.01", 1L, 2877));

        GT_OreDictUnificator.registerOre(OrePrefixes.log, Materials.Wood, GT_ModHandler.getModItem("IC2", "blockRubWood", 1L, 0));

        //GTNH-Circuits
//        GT_OreDictUnificator.registerOre(OrePrefixes.circuit,Materials.Piko,ItemList.PikoCircuit.getIS());
//        GT_OreDictUnificator.registerOre(OrePrefixes.circuit,Materials.Quantum,ItemList.QuantumCircuit.getIS());
//        GT_OreDictUnificator.registerOre(OrePrefixes.circuit,Materials.Nano,ItemList.NanoCircuit.getIS());

        // Add ore dictionary entries for sand and red sand to craft unfired coke oven bricks.
        GT_OreDictUnificator.registerOre("sand", new ItemStack(Blocks.sand, 1, 0));
        GT_OreDictUnificator.registerOre("sand", new ItemStack(Blocks.sand, 1, 1));
    }
}
