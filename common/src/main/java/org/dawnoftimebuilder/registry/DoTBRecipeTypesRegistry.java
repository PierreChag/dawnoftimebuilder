package org.dawnoftimebuilder.registry;

import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import org.dawnoftimebuilder.recipe.DryerRecipe;

import java.util.function.Supplier;

public abstract class DoTBRecipeTypesRegistry {
    public static DoTBRecipeTypesRegistry INSTANCE;

    public final Supplier<RecipeType<DryerRecipe>> DRYING = register("drying");

    public abstract <T extends Recipe<?>> Supplier<RecipeType<T>> register(String name);
}
