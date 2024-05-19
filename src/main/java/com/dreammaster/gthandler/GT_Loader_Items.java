package com.dreammaster.gthandler;

import com.dreammaster.item.ItemList;
import gregtech.common.items.GT_MetaGenerated_Item_01;


public class GT_Loader_Items
{
	public void run()
	{
		GT = GT_MetaGenerated_Item_01.INSTANCE;
		registerItems();
	}

	private GT_MetaGenerated_Item_01 GT;
	
	private void registerItems()
	{
		// ID Range: 600 - 699
		// Ingame offset: 32000

		// 600 - 609 Motors
		// 610 - 619 Pumps
		// 620 - 629 Rotors (Unused now, but don't re-use these IDs. Might cause world corruption)
		// 630 - 639 Conveyors
		// 640 - 649 Pistons
		// 650 - 659 Robot Arms
		// 660 - 664 Fluid Regulators
		// 670 - 679 Field Generators
		// 680 - 689 Emitters
		// 690 - 699 Sensors

		// ===================
		// ==== LuV Items ====
		// Materials: Chrome, Osmium Wire, Naquadah Cable
		// ===================
//		GT_ModHandler.addCraftingRecipe(ItemList.Electric_Motor_LuV.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "CWR", "WIW", "RWC",
//			'I', OrePrefixes.stick.get(Materials.NeodymiumMagnetic),
//			'R', OrePrefixes.stick.get(Materials.Chrome),
//			'W', OrePrefixes.wireGt04.get(Materials.Platinum),
//			'C', OrePrefixes.cableGt04.get(Materials.Naquadah) });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Electric_Piston_LuV.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "PPP", "CSS", "CMG",
//			'P', OrePrefixes.plate.get(Materials.Chrome),
//			'S', OrePrefixes.stick.get(Materials.Chrome),
//			'G', OrePrefixes.gearGtSmall.get(Materials.Chrome),
//			'M', ItemList.Electric_Motor_LuV,
//			'C', AdvancedGTMaterials.LuV.getCable() });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Robot_Arm_LuV.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "CCC", "MSM", "PES",
//			'S', OrePrefixes.stick.get(Materials.Chrome),
//			'M', ItemList.Electric_Motor_LuV,
//			'P', ItemList.Electric_Piston_LuV,
//			'E', AdvancedGTMaterials.LuV.getCircuit(),
//			'C', AdvancedGTMaterials.LuV.getCable() });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Conveyor_Module_LuV.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "RRR", "MCM", "RRR",
//			'M', ItemList.Electric_Motor_LuV,
//			'C', AdvancedGTMaterials.LuV.getCable(),
//			'R', OrePrefixes.plate.get(Materials.Rubber) });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Field_Generator_LuV.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "WCW", "CGC", "WCW",
//			'G', AdvancedGTMaterials.LuV.getPowerGem(),
//			'C', AdvancedGTMaterials.LuV.getCircuit(),
//			'W', AdvancedGTMaterials.LuV.getWire() });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Electric_Pump_LuV.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "SXO", "dPw", "OMW",
//			'M', ItemList.Electric_Motor_LuV,
//			'O', OrePrefixes.ring.get(Materials.Rubber),
//			'X', OrePrefixes.rotor.get(Materials.Chrome),
//			'S', OrePrefixes.screw.get(Materials.Chrome),
//			'W', AdvancedGTMaterials.LuV.getCable(),
//			'P', AdvancedGTMaterials.LuV.getPipe() });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Emitter_LuV.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "SSC", "WQS", "CWS",
//			'Q', AdvancedGTMaterials.LuV.getGem(),
//			'S', OrePrefixes.stick.get(Materials.Osmiridium),
//			'C', AdvancedGTMaterials.LuV.getCircuit(),
//			'W', AdvancedGTMaterials.LuV.getCable() });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Sensor_LuV.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "P Q", "PS ", "CPP",
//			'Q', AdvancedGTMaterials.LuV.getGem(),
//			'S', OrePrefixes.stick.get(Materials.Osmiridium),
//			'P', OrePrefixes.plate.get(Materials.Chrome),
//			'C', AdvancedGTMaterials.LuV.getCircuit() });
//
//		// ===================
//		// ==== ZPM Items ====
//		// Materials: Iridium, Naquadah Wire, NaquadaAlloy Cable
//		// ===================
//		GT_ModHandler.addCraftingRecipe(ItemList.Electric_Motor_ZPM.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "CWR", "WIW", "RWC",
//			'I', OrePrefixes.stick.get(Materials.NeodymiumMagnetic),
//			'R', OrePrefixes.stick.get(Materials.Iridium),
//			'W', OrePrefixes.wireGt04.get(Materials.Osmium),
//			'C', OrePrefixes.cableGt04.get(Materials.NaquadahAlloy) });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Electric_Piston_ZPM.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "PPP", "CSS", "CMG",
//			'P', OrePrefixes.plate.get(Materials.Iridium),
//			'S', OrePrefixes.stick.get(Materials.Iridium),
//			'G', OrePrefixes.gearGtSmall.get(Materials.Iridium),
//			'M', ItemList.Electric_Motor_ZPM,
//			'C', AdvancedGTMaterials.ZPM.getCable() });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Robot_Arm_ZPM.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "CCC", "MSM", "PES",
//			'S', OrePrefixes.stick.get(Materials.Iridium),
//			'M', ItemList.Electric_Motor_ZPM,
//			'P', ItemList.Electric_Piston_ZPM,
//			'E', AdvancedGTMaterials.ZPM.getCircuit(),
//			'C', AdvancedGTMaterials.ZPM.getCable() });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Conveyor_Module_ZPM.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "RRR", "MCM", "RRR",
//			'M', ItemList.Electric_Motor_ZPM,
//			'C', AdvancedGTMaterials.ZPM.getCable(),
//			'R', OrePrefixes.plate.get(Materials.Rubber) });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Field_Generator_ZPM.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "WCW", "CGC", "WCW",
//			'G', AdvancedGTMaterials.ZPM.getPowerGem(),
//			'C', AdvancedGTMaterials.ZPM.getCircuit(),
//			'W', AdvancedGTMaterials.ZPM.getWire() });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Electric_Pump_ZPM.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "SXO", "dPw", "OMW",
//			'M', ItemList.Electric_Motor_ZPM,
//			'O', OrePrefixes.ring.get(Materials.HSLA),
//			'X', OrePrefixes.rotor.get(Materials.Iridium),
//			'S', OrePrefixes.screw.get(Materials.Iridium),
//			'W', AdvancedGTMaterials.ZPM.getCable(),
//			'P', AdvancedGTMaterials.ZPM.getPipe() });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Emitter_ZPM.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "SSC", "WQS", "CWS",
//			'Q', AdvancedGTMaterials.ZPM.getGem(),
//			'S', OrePrefixes.stick.get(Materials.NaquadahAlloy),
//			'C', AdvancedGTMaterials.ZPM.getCircuit(),
//			'W', AdvancedGTMaterials.ZPM.getCable() });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Sensor_ZPM.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "P Q", "PS ", "CPP",
//			'Q', AdvancedGTMaterials.ZPM.getGem(),
//			'S', OrePrefixes.stick.get(Materials.NaquadahAlloy),
//			'P', OrePrefixes.plate.get(Materials.Iridium),
//			'C', AdvancedGTMaterials.ZPM.getCircuit() });
//		// ==================
//		// ==== UV Items ====
//		// Materials: Osmium, NaquadaAlloyWire, ElectrumFlux Cable
//		// ==================
//		GT_ModHandler.addCraftingRecipe(ItemList.Electric_Motor_UV.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "CWR", "WIW", "RWC",
//			'I', OrePrefixes.stick.get(Materials.NeodymiumMagnetic),
//			'R', OrePrefixes.stick.get(Materials.Osmium),
//			'W', OrePrefixes.wireGt04.get(Materials.NaquadahAlloy),
//			'C', OrePrefixes.cableGt04.get(Materials.ElectrumFlux) });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Electric_Piston_UV.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "PPP", "CSS", "CMG",
//			'P', OrePrefixes.plate.get(Materials.Osmium),
//			'S', OrePrefixes.stick.get(Materials.Osmium),
//			'G', OrePrefixes.gearGtSmall.get(Materials.Osmium),
//			'M', ItemList.Electric_Motor_UV,
//			'C', AdvancedGTMaterials.UV.getCable() });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Robot_Arm_UV.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "CCC", "MSM", "PES",
//			'S', OrePrefixes.stick.get(Materials.Osmium),
//			'M', ItemList.Electric_Motor_UV,
//			'P', ItemList.Electric_Piston_UV,
//			'E', AdvancedGTMaterials.UV.getCircuit(),
//			'C', AdvancedGTMaterials.UV.getCable() });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Conveyor_Module_UV.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "RRR", "MCM", "RRR",
//			'M', ItemList.Electric_Motor_UV,
//			'C', AdvancedGTMaterials.UV.getCable(),
//			'R', OrePrefixes.plate.get(Materials.Rubber) });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Field_Generator_UV.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "WCW", "CGC", "WCW",
//			'G', AdvancedGTMaterials.UV.getPowerGem(),
//			'C', AdvancedGTMaterials.UV.getCircuit(),
//			'W', AdvancedGTMaterials.UV.getWire() });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Electric_Pump_UV.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[] { "SXO", "dPw", "OMW",
//			'M', ItemList.Electric_Motor_UV,
//			'O', OrePrefixes.ring.get(Materials.HSLA),
//			'X', OrePrefixes.rotor.get(Materials.Osmium),
//			'S', OrePrefixes.screw.get(Materials.Osmium),
//			'W', AdvancedGTMaterials.UV.getCable(),
//			'P', AdvancedGTMaterials.UV.getPipe() });
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Emitter_UV.get(1L, new Object[0]),
//                GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//                new Object[]{"SSC", "WQS", "CWS",
//                        'Q', AdvancedGTMaterials.UV.getGem(),
//                        'S', OrePrefixes.stick.get(Materials.ElectrumFlux),
//                        'C', AdvancedGTMaterials.UV.getCircuit(),
//                        'W', AdvancedGTMaterials.UV.getCable()});
//
//		GT_ModHandler.addCraftingRecipe(ItemList.Sensor_UV.get(1L, new Object[0]),
//				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE,
//				new Object[]{"P Q", "PS ", "CPP",
//						'Q', AdvancedGTMaterials.UV.getGem(),
//						'S', OrePrefixes.stick.get(Materials.ElectrumFlux),
//						'P', OrePrefixes.plate.get(Materials.Osmium),
//						'C', AdvancedGTMaterials.UV.getCircuit()});
//
//
        //CoreMod Items
		CustomItemList.SteelBars.set(ItemList.SteelBars.getIS());
		CustomItemList.AluminiumBars.set(ItemList.AluminiumBars.getIS());
		CustomItemList.StainlessSteelBars.set(ItemList.StainlessSteelBars.getIS());
		CustomItemList.TungstenBars.set(ItemList.TungstenBars.getIS());
		CustomItemList.TungstenSteelBars.set(ItemList.TungstenSteelBars.getIS());
		CustomItemList.IridiumBars.set(ItemList.IridiumBars.getIS());
		CustomItemList.OsmiumBars.set(ItemList.OsmiumBars.getIS());
		CustomItemList.ChromeBars.set(ItemList.ChromeBars.getIS());
		CustomItemList.TitaniumBars.set(ItemList.TitaniumBars.getIS());
		CustomItemList.NeutroniumBars.set(ItemList.NeutroniumBars.getIS());
		CustomItemList.RedstoneAlloyBars.set(ItemList.RedstoneAlloyBars.getIS());
		CustomItemList.ElectricalSteelBars.set(ItemList.ElectricalSteelBars.getIS());
		CustomItemList.ConductiveIronBars.set(ItemList.ConductiveIronBars.getIS());
		CustomItemList.EnergeticAlloyBars.set(ItemList.EnergeticAlloyBars.getIS());
		CustomItemList.VibrantAlloyBars.set(ItemList.VibrantAlloyBars.getIS());
		CustomItemList.PulsatingIronBars.set(ItemList.PulsatingIronBars.getIS());
		CustomItemList.SoulariumBars.set(ItemList.SoulariumBars.getIS());
		CustomItemList.EnderiumBaseBars.set(ItemList.EnderiumBaseBars.getIS());
		CustomItemList.EnderiumBars.set(ItemList.EnderiumBars.getIS());
		CustomItemList.NagaScaleChip.set(ItemList.NagaScaleChip.getIS());
		CustomItemList.NagaScaleFragment.set(ItemList.NagaScaleFragment.getIS());
		CustomItemList.LichBoneChip.set(ItemList.LichBoneChip.getIS());
		CustomItemList.LichBoneFragment.set(ItemList.LichBoneFragment.getIS());
		CustomItemList.LichBone.set(ItemList.LichBone.getIS());
        CustomItemList.FieryBloodDrop.set(ItemList.FieryBloodDrop.getIS());
		CustomItemList.CarminiteChip.set(ItemList.CarminiteChip.getIS());
		CustomItemList.CarminiteFragment.set(ItemList.CarminiteFragment.getIS());
		CustomItemList.SnowQueenBloodDrop.set(ItemList.SnowQueenBloodDrop.getIS());
		CustomItemList.SnowQueenBlood.set(ItemList.SnowQueenBlood.getIS());

        CustomItemList.IridiumAlloyItemCasing.set(ItemList.IridiumAlloyItemCasing.getIS());
		CustomItemList.ReinforcedGlassPLate.set(ItemList.ReinforcedGlassPlate.getIS());
        CustomItemList.ReinforcedGlassLense.set(ItemList.ReinforcedGlassLense.getIS());
		CustomItemList.MarshmallowForm.set(ItemList.MarshmallowForm.getIS());
		CustomItemList.MarshmallowFormMold.set(ItemList.MarshmallowFormMold.getIS());
		CustomItemList.UncookedSlush.set(ItemList.UncookedSlush.getIS());
		CustomItemList.MalformedSlush.set(ItemList.MalformedSlush.getIS());
		CustomItemList.GlowingMarshmallow.set(ItemList.GlowingMarshmallow.getIS());
		CustomItemList.Marshmallow.set(ItemList.Marshmallow.getIS());
		CustomItemList.IchoriumCap.set(ItemList.IchoriumCap.getIS());

		CustomItemList.WetTofu.set(ItemList.WetTofu.getIS());
		CustomItemList.NetherStarFragment.set(ItemList.NetherStarFragment.getIS());
		CustomItemList.WeakOrb.set(ItemList.WeakOrb.getIS());
		CustomItemList.ApprenticeOrb.set(ItemList.ApprenticeOrb.getIS());
		CustomItemList.MasterOrb.set(ItemList.MasterOrb.getIS());
		CustomItemList.MagicianOrb.set(ItemList.MagicianOrb.getIS());
		CustomItemList.ArchmageOrb.set(ItemList.ArchmageOrb.getIS());
		CustomItemList.TranscendentOrb.set(ItemList.TranscendentOrb.getIS());
		CustomItemList.ArcaneSlate.set(ItemList.ArcaneSlate.getIS());
		CustomItemList.RawOrbTier1.set(ItemList.RawOrbTier1.getIS());
		CustomItemList.RawOrbTier2.set(ItemList.RawOrbTier2.getIS());
		CustomItemList.RawOrbTier3.set(ItemList.RawOrbTier3.getIS());
		CustomItemList.RawOrbTier4.set(ItemList.RawOrbTier4.getIS());
		CustomItemList.RawOrbTier5.set(ItemList.RawOrbTier5.getIS());
		CustomItemList.RawOrbTier6.set(ItemList.RawOrbTier6.getIS());
		CustomItemList.TeleposerFrame.set(ItemList.TeleposerFrame.getIS());
		CustomItemList.WoodenCasing.set(ItemList.WoodenCasing.getIS());

		CustomItemList.IndustryFrame.set(ItemList.IndustryFrame.getIS());
		CustomItemList.VoidSeed.set(ItemList.VoidSeed.getIS());

		CustomItemList.MicaBasedPulp.set(ItemList.MicaBasedPulp.getIS());
        CustomItemList.MicaBasedSheet.set(ItemList.MicaBasedSheet.getIS());
		CustomItemList.MicaInsulatorSheet.set(ItemList.MicaInsulatorSheet.getIS());
		CustomItemList.MicaInsulatorFoil.set(ItemList.MicaInsulatorFoil.getIS());
		CustomItemList.HotNetherrackBrick.set(ItemList.HotNetherrackBrick.getIS());
		CustomItemList.InfernalBrick.set(ItemList.InfernalBrick.getIS());
		CustomItemList.AdvancedCokeOvenBrick.set(ItemList.AdvancedCokeOvenBrick.getIS());
		CustomItemList.AdvancedCokeOvenBrickDust.set(ItemList.AdvancedCokeOvenBrickDust.getIS());
		CustomItemList.CokeOvenBrick.set(ItemList.CokeOvenBrick.getIS());
		CustomItemList.CokeOvenBrickDust.set(ItemList.CokeOvenBrickDust.getIS());
		CustomItemList.MedalDerp.set(ItemList.MedalDerp.getIS());
		CustomItemList.MedalDerp.getItem().setMaxStackSize(1);
		CustomItemList.MedalGTExplosion.set(ItemList.MedalGTExplosion.getIS());
		CustomItemList.MedalGTExplosion.getItem().setMaxStackSize(1);
		CustomItemList.MedalBuilder.set(ItemList.MedalBuilder.getIS());
		CustomItemList.MedalBuilder.getItem().setMaxStackSize(1);
		CustomItemList.MedalEngineer.set(ItemList.MedalEngineer.getIS());
		CustomItemList.MedalEngineer.getItem().setMaxStackSize(1);
		CustomItemList.MedalWarp.set(ItemList.MedalWarp.getIS());
		CustomItemList.MedalWarp.getItem().setMaxStackSize(1);
		CustomItemList.AluminoSilicateWool.set(ItemList.AluminoSilicateWool.getIS());
		CustomItemList.MaceratedPlantmass.set(ItemList.MaceratedPlantmass.getIS());
		CustomItemList.BedrockiumPlate.set(ItemList.BedrockiumPlate.getIS());
		CustomItemList.EngineCore.set(ItemList.EngineCore.getIS());
		CustomItemList.AlumiteDust.set(ItemList.AlumiteDust.getIS());
		CustomItemList.TwilightCrystal.set(ItemList.TwilightCrystal.getIS());
		CustomItemList.UnfiredClayBrick.set(ItemList.UnfiredClayBrick.getIS());
		CustomItemList.UnfiredSearedBrick.set(ItemList.UnfiredSearedBrick.getIS());
		CustomItemList.UnfiredCokeOvenBrick.set(ItemList.UnfiredCokeOvenBrick.getIS());
		CustomItemList.UnfiredSlimeSoulBrick.set(ItemList.UnfiredSlimeSoulBrick.getIS());
		CustomItemList.RawLapotronCrystal.set(ItemList.RawLapotronCrystal.getIS());
		CustomItemList.LapotronDust.set(ItemList.LapotronDust.getIS());
		CustomItemList.SandDust.set(ItemList.SandDust.getIS());
		CustomItemList.AluminiumIronPlate.set(ItemList.AluminiumIronPlate.getIS());
		CustomItemList.ReinforcedAluminiumIronPlate.set(ItemList.ReinforcedAluminiumIronPlate.getIS());
		CustomItemList.IrradiantReinforcedAluminiumPlate.set(ItemList.IrradiantReinforcedAluminiumPlate.getIS());
		CustomItemList.IrradiantReinforcedTitaniumPlate.set(ItemList.IrradiantReinforcedTitaniumPlate.getIS());
		CustomItemList.IrradiantReinforcedTungstenPlate.set(ItemList.IrradiantReinforcedTungstenPlate.getIS());
		CustomItemList.IrradiantReinforcedTungstenSteelPlate.set(ItemList.IrradiantReinforcedTungstenSteelPlate.getIS());
		CustomItemList.IrradiantReinforcedChromePlate.set(ItemList.IrradiantReinforcedChromePlate.getIS());
		CustomItemList.IrradiantReinforcedNaquadriaPlate.set(ItemList.IrradiantReinforcedNaquadriaPlate.getIS());
		CustomItemList.IrradiantReinforcedNeutroniumPlate.set(ItemList.IrradiantReinforcedNeutroniumPlate.getIS());
		CustomItemList.IrradiantReinforcedBedrockiumPlate.set(ItemList.IrradiantReinforcedBedrockiumPlate.getIS());
		CustomItemList.PrimordialPearlFragment.set(ItemList.PrimordialPearlFragment.getIS());
		CustomItemList.SandStoneRod.set(ItemList.SandStoneRod.getIS());
		CustomItemList.TheBigEgg.set(ItemList.TheBigEgg.getIS());
		CustomItemList.MutatedEgg.set(ItemList.MutatedEgg.getIS());
		CustomItemList.DraconiumEgg.set(ItemList.DraconiumEgg.getIS());
		CustomItemList.EnderEgg.set(ItemList.EnderEgg.getIS());
		CustomItemList.ChargedCertusQuartzDust.set(ItemList.ChargedCertusQuartzDust.getIS());
		CustomItemList.NeutronReflectorSmallParts.set(ItemList.NeutronReflectorSmallParts.getIS());
		CustomItemList.NeutronReflectorParts.set(ItemList.NeutronReflectorParts.getIS());
		CustomItemList.Empty180SpCell.set(ItemList.Empty180SpCell.getIS());
		CustomItemList.Empty360SpCell.set(ItemList.Empty360SpCell.getIS());
		CustomItemList.Empty540SpCell.set(ItemList.Empty540SpCell.getIS());
		CustomItemList.Empty1080SpCell.set(ItemList.Empty1080SpCell.getIS());
		CustomItemList.ArtificialLeather.set(ItemList.ArtificialLeather.getIS());
		CustomItemList.EctoplasmaChip.set(ItemList.EctoplasmaChip.getIS());
		CustomItemList.EctoplasmaFragment.set(ItemList.EctoplasmaFragment.getIS());
		CustomItemList.ArcaneShardChip.set(ItemList.ArcaneShardChip.getIS());
		CustomItemList.ArcaneShardFragment.set(ItemList.ArcaneShardFragment.getIS());
		CustomItemList.RuneOfPowerFragment.set(ItemList.RuneOfPowerFragment.getIS());
		CustomItemList.RuneOfAgilityFragment.set(ItemList.RuneOfAgilityFragment.getIS());
		CustomItemList.RuneOfVigorFragment.set(ItemList.RuneOfVigorFragment.getIS());
		CustomItemList.RuneOfDefenseFragment.set(ItemList.RuneOfDefenseFragment.getIS());
		CustomItemList.RuneOfMagicFragment.set(ItemList.RuneOfMagicFragment.getIS());
		CustomItemList.RuneOfVoidFragment.set(ItemList.RuneOfVoidFragment.getIS());
	}
}
