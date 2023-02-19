package com.dreammaster.fluids;


import com.dreammaster.creativetab.ModTabList;
import com.dreammaster.main.MainRegistry;
import com.dreammaster.Tags;
import eu.usrv.yamcore.fluids.ModFluidManager;
import eu.usrv.yamcore.fluids.ModSimpleBaseFluid;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

public enum FluidList {
	SodiumPotassium(new ModSimpleBaseFluid(ModFluidManager.GetNewFluid("SodiumPotassium"), Material.water), ModTabList.ModFluidsTab),
	Concrete(new ModSimpleBaseFluid(ModFluidManager.GetNewFluid("Concrete"), Material.water), ModTabList.ModFluidsTab),
	EnrichedBacterialSludge(ExtendedFluidCollection.getEnrichedBacterialSludge(), ModTabList.ModFluidsTab),
	FermentedBacterialSludge(ExtendedFluidCollection.getFermentedBacterialSludge(), ModTabList.ModFluidsTab),
	NitricAcid(ExtendedFluidCollection.getNitricAcid(),ModTabList.ModFluidsTab),
	Ammonia(ExtendedFluidCollection.getAmmonia(), ModTabList.ModFluidsTab),
	CompressedOxygen(ExtendedFluidCollection.getCompressedOxygen(), ModTabList.ModFluidsTab),
	CompressedNitrogen(ExtendedFluidCollection.getCompressedNitrogen(), ModTabList.ModFluidsTab),
	Pollution(ExtendedFluidCollection.getPollution(), ModTabList.ModFluidsTab),
	// Do not delete this
	EndOfList(null, null);
	
	// ################################################################################
	public ModSimpleBaseFluid Fluid;
	FluidList(ModSimpleBaseFluid pFluid, String pCreativeTabName)
	{
		Fluid = pFluid;
		if (Fluid != null)
		{
			Fluid.SetModID(Tags.MODID);
			Fluid.setCreativeTabName(pCreativeTabName);
		}
	}
	
	public static boolean AddToItemManager(ModFluidManager pFluidManager)
	{
		Fluid t = null;
		boolean tResult = true;
		for (FluidList il : FluidList.values())
		{
			if (il.Fluid != null) {
                if (!pFluidManager.AddItemToManagedRegistry(il.Fluid)) {
                    MainRegistry.Logger.error(String.format("Fluid [%s] failed to register", il.toString()));
                    tResult = false;
                }
            }
		}
		
		return tResult;
	}

	public FluidStack getFluidStack(){
		return getFluidStack(1000L);
	}

	public FluidStack getFluidStack(long ammount){
		return new FluidStack(this.Fluid.getFluid(),(int)ammount);
	}
}
