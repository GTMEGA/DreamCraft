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
