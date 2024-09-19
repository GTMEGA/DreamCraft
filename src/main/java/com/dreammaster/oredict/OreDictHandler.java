package com.dreammaster.oredict;

import com.dreammaster.item.ItemList;
import cpw.mods.fml.common.Loader;
import gregtech.api.util.GT_ModHandler;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import static net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE;

public class OreDictHandler {
	public static void reg_additional() {
//		OreDictionary.registerOre("foodSalt", ItemList.EdibleSalt.getIS());

		//Olivine = Peridot
		for (int i = 0; i < OreDictionary.getOres("blockOlivine").size(); i++) {
			OreDictionary.registerOre("blockPeridot", OreDictionary.getOres("blockOlivine").get(i));
		}
	}
	
	public static void register_all() {
		reg_woodItems();
		reg_additional();
	}

	private static void reg_fenceWood() {
		for (ItemStack itemStack : new ItemStack[]{
				new ItemStack(Blocks.fence),
				GT_ModHandler.getModItem("ExtraTrees", "fence", 1, WILDCARD_VALUE),
				GT_ModHandler.getModItem("Natura", "Natura.fence", 1, WILDCARD_VALUE)
		}) {
			if (itemStack != null) OreDictionary.registerOre("fenceWood", itemStack);
		}
	}

	private static void reg_woodItems() {
		reg_fenceWood(); // Register fenceWood
	}
}
