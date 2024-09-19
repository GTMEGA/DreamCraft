package com.dreammaster.gthandler;

import com.dreammaster.item.ItemList;
import com.dreammaster.item.food.QuantumBread;
import com.dreammaster.modfixes.enderIO.FrankenskullFix;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/**
 * How to add new Stuff:
 * Ask Namikon
 */
public class GT_CustomLoader
{
    /*
     * Changed to static final for performance and clear design reasons.
     * Since these Classes arent modified anymore, final is a good choice here.
     * Final variables will help the compiler optimize the code statically, which may result in faster code.
     */
    private static final GT_Loader_Items ItemLoader = new GT_Loader_Items();
    private static final GT_Loader_Machines MachineLoader = new GT_Loader_Machines();
    private static final GT_Loader_FluidPipes FluidPipeLoader = new GT_Loader_FluidPipes();
    private static final GT_Loader_Materials MaterialLoader = new GT_Loader_Materials();
    private static final GT_Loader_Wires WireLoader = new GT_Loader_Wires();
    private static final GT_Loader_Batteries BatteryLoader = new GT_Loader_Batteries();
    private static final GT_MachineRecipeLoader MachineRecipeLoader = new GT_MachineRecipeLoader();
    private static final GT_CraftingRecipeLoader CraftingRecipeLoader = new GT_CraftingRecipeLoader();
//    private static final GT_Loader_OreDictionary OreDictionary = new GT_Loader_OreDictionary();
    private static final GT_Recipe_Remover Remover = new GT_Recipe_Remover();

    public void run()
    {
    	GameRegistry.registerItem(QuantumBread.Instance(), "itemQuantumToast");
    	if (Loader.isModLoaded("EnderIO"))
            FrankenskullFix.fixEnderIO();
    	MaterialLoader.run();
    	FluidPipeLoader.run();
    	WireLoader.run();
    	ItemLoader.run();
    	MachineLoader.run();
    	BatteryLoader.run();
    	Remover.run();
        MachineRecipeLoader.run();
        CraftingRecipeLoader.run();
//        OreDictionary.run();
    }
}
