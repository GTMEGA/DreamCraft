package com.dreammaster.gthandler;

import com.dreammaster.gthandler.nameRemover.NameRemover;
import com.dreammaster.gthandler.transformers.GT_MetaTileEntity_WetTransformer;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OreDictNames;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;

public class GT_Loader_Machines
{
	public void run()
	{
		registerMachines();
	}

	private void registerMachines()
	{
		long bitsd = GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE
				| GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED;

		//TODO:While adding recipes look at GT_Loader_MetaTileEntities there is some useful info
		//TODO:Add recipes where u see //TODO:recipes or null in the code

		// MetaTileEntity ID Range: look at end of file
		// GT 5.08.30


		// ===================================================================================================
		// World Accelerator Lv-UV
		// ===================================================================================================

//		CustomItemList.AcceleratorLV.set(new GT_MetaTileEntity_WorldAccelerator(
//				11100, "basicmachine.accelerator.tier.01", "Basic World Accelerator", 1).getStackForm(1L));
//		CustomItemList.AcceleratorMV.set(new GT_MetaTileEntity_WorldAccelerator(
//				11101, "basicmachine.accelerator.tier.02", "Advanced World Accelerator", 2).getStackForm(1L));
//		CustomItemList.AcceleratorHV.set(new GT_MetaTileEntity_WorldAccelerator(
//				11102, "basicmachine.accelerator.tier.03", "Advanced World Accelerator II", 3).getStackForm(1L));
//		CustomItemList.AcceleratorEV.set(new GT_MetaTileEntity_WorldAccelerator(
//				11103, "basicmachine.accelerator.tier.04", "Advanced World Accelerator III", 4).getStackForm(1L));
//		CustomItemList.AcceleratorIV.set(new GT_MetaTileEntity_WorldAccelerator(
//				11104, "basicmachine.accelerator.tier.05", "Advanced World Accelerator IV", 5).getStackForm(1L));
//		CustomItemList.AcceleratorLuV.set(new GT_MetaTileEntity_WorldAccelerator(
//				11105, "basicmachine.accelerator.tier.06", "Elite World Accelerator", 6).getStackForm(1L));
//		CustomItemList.AcceleratorZPM.set(new GT_MetaTileEntity_WorldAccelerator(
//				11106, "basicmachine.accelerator.tier.07", "Elite World Accelerator II", 7).getStackForm(1L));
//		CustomItemList.AcceleratorUV.set(new GT_MetaTileEntity_WorldAccelerator(
//				11107, "basicmachine.accelerator.tier.08", "Ultimate Time Anomaly", 8).getStackForm(1L));
		//Not adding either...

//		GT_ModHandler.addCraftingRecipe(CustomItemList.AcceleratorLV.get(1L),
//				bitsd,
//				new Object[]{"RMR", "PBC", "IMI",
//						'R', ItemList.Robot_Arm_LV,
//						'M', ItemList.Electric_Motor_LV,
//						'P', ItemList.Electric_Pump_LV,
//						'B', ItemList.Hull_LV,
//						'C', ItemList.Conveyor_Module_LV,
//						'I', ItemList.Electric_Piston_LV});

//		GT_ModHandler.addCraftingRecipe(CustomItemList.AcceleratorMV.get(1L),
//				bitsd,
//				new Object[]{"RMR", "PBC", "IMI",
//						'R', ItemList.Robot_Arm_MV,
//						'M', ItemList.Electric_Motor_MV,
//						'P', ItemList.Electric_Pump_MV,
//						'B', ItemList.Hull_MV,
//						'C', ItemList.Conveyor_Module_MV,
//						'I', ItemList.Electric_Piston_MV});

//		GT_ModHandler.addCraftingRecipe(CustomItemList.AcceleratorHV.get(1L),
//				bitsd,
//				new Object[]{"RMR", "PBC", "IMI",
//						'R', ItemList.Robot_Arm_HV,
//						'M', ItemList.Electric_Motor_HV,
//						'P', ItemList.Electric_Pump_HV,
//						'B', ItemList.Hull_HV,
//						'C', ItemList.Conveyor_Module_HV,
//						'I', ItemList.Electric_Piston_HV});

//		GT_ModHandler.addCraftingRecipe(CustomItemList.AcceleratorEV.get(1L),
//				bitsd,
//				new Object[]{"RMR", "PBC", "IMI",
//						'R', ItemList.Robot_Arm_EV,
//						'M', ItemList.Electric_Motor_EV,
//						'P', ItemList.Electric_Pump_EV,
//						'B', ItemList.Hull_EV,
//						'C', ItemList.Conveyor_Module_EV,
//						'I', ItemList.Electric_Piston_EV});

//		GT_ModHandler.addCraftingRecipe(CustomItemList.AcceleratorIV.get(1L),
//				bitsd,
//				new Object[]{"RMR", "PBC", "IMI",
//						'R', ItemList.Robot_Arm_IV,
//						'M', ItemList.Electric_Motor_IV,
//						'P', ItemList.Electric_Pump_IV,
//						'B', ItemList.Hull_IV,
//						'C', ItemList.Conveyor_Module_IV,
//						'I', ItemList.Electric_Piston_IV});

//		GT_ModHandler.addCraftingRecipe(CustomItemList.AcceleratorLuV.get(1L),
//				bitsd,
//				new Object[]{"RMR", "PBC", "IMI",
//						'R', ItemList.Robot_Arm_LuV,
//						'M', ItemList.Electric_Motor_LuV,
//						'P', ItemList.Electric_Pump_LuV,
//						'B', ItemList.Hull_LuV,
//						'C', ItemList.Conveyor_Module_LuV,
//						'I', ItemList.Electric_Piston_LuV});

//		GT_ModHandler.addCraftingRecipe(CustomItemList.AcceleratorZPM.get(1L),
//				bitsd,
//				new Object[]{"RMR", "PBC", "IMI",
//						'R', ItemList.Robot_Arm_ZPM,
//						'M', ItemList.Electric_Motor_ZPM,
//						'P', ItemList.Electric_Pump_ZPM,
//						'B', ItemList.Hull_ZPM,
//						'C', ItemList.Conveyor_Module_ZPM,
//						'I', ItemList.Electric_Piston_ZPM});

//		GT_ModHandler.addCraftingRecipe(CustomItemList.AcceleratorUV.get(1L),
//				bitsd,
//				new Object[]{"RMR", "PBC", "IMI",
//						'R', ItemList.Robot_Arm_UV,
//						'M', ItemList.Electric_Motor_UV,
//						'P', ItemList.Electric_Pump_UV,
//						'B', ItemList.Hull_UV,
//						'C', ItemList.Conveyor_Module_UV,
//						'I', ItemList.Electric_Piston_UV});


		// ===================================================================================================
		// Wet Transformers
		// ===================================================================================================
		CustomItemList.WetTransformer_LV_ULV.set(new GT_MetaTileEntity_WetTransformer(
				12000, "wettransformer.tier.00", "ULV 64A Transformer", 0,
				"LV -> ULV (Use Soft Mallet to invert)").getStackForm(1L));

		CustomItemList.WetTransformer_MV_LV.set(new GT_MetaTileEntity_WetTransformer(
				12001, "wetransformer.tier.01", "LV 64A Transformer", 1,
				"MV -> LV (Use Soft Mallet to invert)").getStackForm(1L));

		CustomItemList.WetTransformer_HV_MV.set(new GT_MetaTileEntity_WetTransformer(
				12002, "wettransformer.tier.02", "MV 64A Transformer", 2,
				"HV -> MV (Use Soft Mallet to invert)").getStackForm(1L));

		CustomItemList.WetTransformer_EV_HV.set(new GT_MetaTileEntity_WetTransformer(
				12003, "wettransformer.tier.03", "HV 64A Transformer", 3,
				"EV -> HV (Use Soft Mallet to invert)").getStackForm(1L));

		CustomItemList.WetTransformer_IV_EV.set(new GT_MetaTileEntity_WetTransformer(
				12004, "wettransformer.tier.04", "EV 64A Transformer", 4,
				"IV -> EV (Use Soft Mallet to invert)").getStackForm(1L));

		CustomItemList.WetTransformer_LuV_IV.set(new GT_MetaTileEntity_WetTransformer(
				12005, "wettransformer.tier.05", "IV 64A Transformer", 5,
				"LuV -> IV (Use Soft Mallet to invert)").getStackForm(1L));


        GT_ModHandler.addCraftingRecipe(CustomItemList.WetTransformer_LV_ULV.get(1L),
                bitsd,
                new Object[]{"XOC", "STA", "POC",
                        'A', OrePrefixes.springSmall.get(Materials.Lead),
                        'C', OrePrefixes.cableGt16.get(Materials.Lead),
                        'S', OrePrefixes.spring.get(Materials.Tin),
                        'X', OrePrefixes.cableGt08.get(Materials.Tin),
                        'O', OrePrefixes.cell.get(Materials.Lubricant),
                        'P', ItemList.Electric_Pump_LV,
                        'T', ItemList.Transformer_LV_ULV});

        GT_ModHandler.addCraftingRecipe(CustomItemList.WetTransformer_MV_LV.get(1L),
                bitsd,
                new Object[]{"XOC", "STA", "POC",
                        'A', OrePrefixes.springSmall.get(Materials.Tin),
                        'C', OrePrefixes.cableGt16.get(Materials.Tin),
                        'S', OrePrefixes.spring.get(Materials.AnyCopper),
                        'X', OrePrefixes.cableGt08.get(Materials.AnyCopper),
                        'O', OrePrefixes.cell.get(Materials.Lubricant),
                        'P', ItemList.Electric_Pump_LV,
                        'T', ItemList.Transformer_MV_LV});

        GT_ModHandler.addCraftingRecipe(CustomItemList.WetTransformer_HV_MV.get(1L),
                bitsd,
                new Object[]{"XOC", "STA", "POC",
                        'A', OrePrefixes.springSmall.get(Materials.AnyCopper),
                        'C', OrePrefixes.cableGt16.get(Materials.AnyCopper),
                        'S', OrePrefixes.spring.get(Materials.Gold),
                        'X', OrePrefixes.cableGt08.get(Materials.Gold),
                        'O', OrePrefixes.cell.get(Materials.Lubricant),
                        'P', ItemList.Electric_Pump_LV,
                        'T', ItemList.Transformer_HV_MV});

        GT_ModHandler.addCraftingRecipe(CustomItemList.WetTransformer_EV_HV.get(1L),
                bitsd,
                new Object[]{"XOC", "STA", "POC",
                        'A', OrePrefixes.springSmall.get(Materials.Gold),
                        'C', OrePrefixes.cableGt16.get(Materials.Gold),
                        'S', OrePrefixes.spring.get(Materials.Aluminium),
                        'X', OrePrefixes.cableGt08.get(Materials.Aluminium),
                        'O', OrePrefixes.cell.get(Materials.Lubricant),
                        'P', ItemList.Electric_Pump_LV,
                        'T', ItemList.Transformer_EV_HV});

        GT_ModHandler.addCraftingRecipe(CustomItemList.WetTransformer_IV_EV.get(1L),
                bitsd,
                new Object[]{"XOC", "STA", "POC",
                        'A', OrePrefixes.springSmall.get(Materials.Aluminium),
                        'C', OrePrefixes.cableGt16.get(Materials.Aluminium),
                        'S', OrePrefixes.spring.get(Materials.Tungsten),
                        'X', OrePrefixes.cableGt08.get(Materials.Tungsten),
                        'O', OrePrefixes.cell.get(Materials.Lubricant),
                        'P', ItemList.Electric_Pump_LV,
                        'T', ItemList.Transformer_IV_EV});

        GT_ModHandler.addCraftingRecipe(CustomItemList.WetTransformer_LuV_IV.get(1L),
                bitsd,
                new Object[]{"XOC", "STA", "POC",
                        'A', OrePrefixes.springSmall.get(Materials.Tungsten),
                        'C', OrePrefixes.cableGt16.get(Materials.Tungsten),
                        'S', OrePrefixes.spring.get(Materials.VanadiumGallium),
                        'X', OrePrefixes.cableGt08.get(Materials.VanadiumGallium),
                        'O', OrePrefixes.cell.get(Materials.Lubricant),
                        'P', ItemList.Electric_Pump_LV,
                        'T', ItemList.Transformer_LuV_IV});

		// ===================================================================================================
		// Turbo Chargers
		// ===================================================================================================

//		CustomItemList.Battery_TurboCharger_4by4_LV.set(new GT_MetaTileEntity_TurboCharger(
//				12041, "batteryturbocharger.16.tier.01", "Low Voltage Turbo Charger",1,"64A in /16A out, 120A/item, Disable to force Charge", 4).getStackForm(1L));

//		GT_ModHandler.addCraftingRecipe(CustomItemList.Battery_TurboCharger_4by4_LV.get(1L),
//				bitsd,
//				new Object[]{"BTB", "CMC", "BXB",
//						'T', CustomItemList.WetTransformer_MV_LV,
//						'M', ItemList.Battery_Charger_4by4_LV,
//						'B', ItemList.Battery_RE_LV_Lithium,
//						'C', OrePrefixes.cableGt16.get(Materials.Tin),
//						'X', OrePrefixes.circuit.get(Materials.Basic)});

//		CustomItemList.Battery_TurboCharger_4by4_MV.set(new GT_MetaTileEntity_TurboCharger(
//				12042, "batteryturbocharger.16.tier.02", "Medium Voltage Turbo Charger",2,"64A in /16A out, 120A/item, Disable to force Charge", 4).getStackForm(1L));

//		GT_ModHandler.addCraftingRecipe(CustomItemList.Battery_TurboCharger_4by4_MV.get(1L),
//				bitsd,
//				new Object[]{"BTB", "CMC", "BXB",
//						'T', CustomItemList.WetTransformer_HV_MV,
//						'M', ItemList.Battery_Charger_4by4_MV,
//						'B', ItemList.Battery_RE_MV_Lithium,
//						'C', OrePrefixes.cableGt16.get(Materials.AnyCopper),
//						'X', OrePrefixes.circuit.get(Materials.Good)});

//		CustomItemList.Battery_TurboCharger_4by4_HV.set(new GT_MetaTileEntity_TurboCharger(
//				12043, "batteryturbocharger.16.tier.03", "High Voltage Turbo Charger",3,"64A in /16A out, 120A/item, Disable to force Charge", 4).getStackForm(1L));

//		GT_ModHandler.addCraftingRecipe(CustomItemList.Battery_TurboCharger_4by4_HV.get(1L),
//				bitsd,
//				new Object[]{"BTB", "CMC", "BXB",
//						'T', CustomItemList.WetTransformer_EV_HV,
//						'M', ItemList.Battery_Charger_4by4_HV,
//						'B', ItemList.Battery_RE_HV_Lithium,
//						'C', OrePrefixes.cableGt16.get(Materials.Gold),
//						'X', OrePrefixes.circuit.get(Materials.Advanced)});

//		CustomItemList.Battery_TurboCharger_4by4_EV.set(new GT_MetaTileEntity_TurboCharger(
//				12044, "batteryturbocharger.16.tier.04", "Extreme Voltage Turbo Charger",4,"64A in /16A out, 120A/item, Disable to force Charge", 4).getStackForm(1L));

//		GT_ModHandler.addCraftingRecipe(CustomItemList.Battery_TurboCharger_4by4_EV.get(1L),
//				bitsd,
//				new Object[]{"BTB", "CMC", "BXB",
//						'T', CustomItemList.WetTransformer_IV_EV,
//						'M', ItemList.Battery_Charger_4by4_EV,
//						'B', OrePrefixes.battery.get(Materials.Master),
//						'C', OrePrefixes.cableGt16.get(Materials.Aluminium),
//						'X', OrePrefixes.circuit.get(Materials.Data)});

//		CustomItemList.Battery_TurboCharger_4by4_IV.set(new GT_MetaTileEntity_TurboCharger(
//				12045, "batteryturbocharger.16.tier.05", "Insane Voltage Turbo Charger",5,"64A in /16A out, 120A/item, Disable to force Charge", 4).getStackForm(1L));

//		GT_ModHandler.addCraftingRecipe(CustomItemList.Battery_TurboCharger_4by4_IV.get(1L),
//				bitsd,
//				new Object[]{"BTB", "CMC", "BXB",
//						'T', CustomItemList.WetTransformer_LuV_IV,
//						'M', ItemList.Battery_Charger_4by4_IV,
//						'B', ItemList.Energy_LapotronicOrb,
//						'C', OrePrefixes.cableGt16.get(Materials.Tungsten),
//						'X', OrePrefixes.circuit.get(Materials.Elite)});


		CustomItemList.nameRemover.set(new NameRemover(
				12070 , "fix.name.remover", "Name Remover", 0).getStackForm(1L));

		GT_ModHandler.addCraftingRecipe(CustomItemList.nameRemover.get(1L),
				bitsd,
				new Object[]{"SsS", "VMV", "SXS",
						'M', ItemList.Hull_ULV,
						'V', OrePrefixes.gearGtSmall.get(Materials.Brass),
						'S', OrePrefixes.screw.get(Materials.AnyIron),
						'X', OreDictNames.craftingPiston});

		/*
		 * TODO: WE USE RANGE 10750-12500
		 *
		 * ID's occupied from 15000-15500!! (in EM branch)
		 * ID's occupied from 12500-13000!! (bartimaeusnek)
		 * A List of all registered MetaTileEntities
		 * <p/>
		 * 0 -  1199 are used by GregTech.
		 * 1200 -  2047 are used for GregTech Cables.
		 * 2048 -  2559 are reserved for OvermindDL.
		 * 2560 -  3071 are reserved for Immibis.
		 * 3072 -  3583 are reserved for LinusPhoenix.
		 * 3584 -  4095 are reserved for BloodyAsp.
		 * 4096 -  5095 are used for GregTech Frames.
		 * 5096 -  6099 are used for GregTech Pipes.
		 * 6100 -  8191 are used for GregTech Decoration Blocks.
		 * 8192 -  8703 are reserved for ZL123.
		 * 8704 -  9215 are reserved for Mr10Movie.
		 * 9216 -  9727 are used for GregTech Automation Machines.
		 * 9728 - 10239 are reserved for 28Smiles.
		 * 10240 - 10751 are reserved for VirMan.
		 * 10752 - 11263 are reserved for Briareos81.
		 * 11264 - 12000 are reserved for the next one who asks me.
		 * 12500 - 13000 are reserved for bartimaeusnek
		 * 9728 - 32766 are currently free.
		 * <p/>
		 * Contact me if you need a free ID-Range, which doesn't conflict with other Addons.
		 * You could make an ID-Config, but we all know, what "stupid" customers think about conflicting ID's
		 * 27.01.2016 Namikon
		 * updated: 30.08.2019 bartimaeusnek
		 */
	}
}
