package com.dreammaster.galacticgreg;

import micdoodle8.mods.galacticraft.core.items.GCItems;
import micdoodle8.mods.galacticraft.planets.asteroids.items.AsteroidsItems;
import micdoodle8.mods.galacticraft.planets.asteroids.recipe.CanisterRecipes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

import java.util.ArrayList;
import java.util.List;

public class Recipes {
    public static void load() {
        List<ItemStack> list1 = new ArrayList();
        List<ItemStack> list2 = new ArrayList();
        List<ItemStack> list3 = new ArrayList();
        List<ItemStack> list4 = new ArrayList();
        List<ItemStack> list5 = new ArrayList();
        list1.add(new ItemStack(AsteroidsItems.canisterLOX, 1, 700));
        list2.add(new ItemStack(AsteroidsItems.canisterLOX, 1, 800));
        list3.add(new ItemStack(AsteroidsItems.canisterLOX, 1, 900));
        list4.add(new ItemStack(AsteroidsItems.canisterLOX, 1, 600));
        list5.add(new ItemStack(AsteroidsItems.canisterLOX, 1, 500));
        list1.add(new ItemStack(GCItems.oxTankHeavy, 1, 3000));
        list2.add(new ItemStack(GCItems.oxTankMedium, 1, 2000));
        list3.add(new ItemStack(GCItems.oxTankLight, 1, 1000));
        list4.add(new ItemStack(GCItems.oxTankSuperHeavy, 1, 4000));
        list5.add(new ItemStack(GCItems.oxTankUltraHeavy, 1, 5000));
        CraftingManager.getInstance().getRecipeList().add(new CanisterRecipes(new ItemStack(GCItems.oxTankHeavy, 1, 0), list1));
        CraftingManager.getInstance().getRecipeList().add(new CanisterRecipes(new ItemStack(GCItems.oxTankMedium, 1, 0), list2));
        CraftingManager.getInstance().getRecipeList().add(new CanisterRecipes(new ItemStack(GCItems.oxTankLight, 1, 0), list3));
        CraftingManager.getInstance().getRecipeList().add(new CanisterRecipes(new ItemStack(GCItems.oxTankSuperHeavy, 1, 0), list4));
        CraftingManager.getInstance().getRecipeList().add(new CanisterRecipes(new ItemStack(GCItems.oxTankUltraHeavy, 1, 0), list5));
    }
}
