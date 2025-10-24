package net.newfrontiercraft.multiblocktab.plugins;

import net.glasslauncher.mods.alwaysmoreitems.api.recipe.RecipeHandler;
import net.glasslauncher.mods.alwaysmoreitems.api.recipe.RecipeWrapper;
import net.newfrontiercraft.multiblocktab.recipe.MultiBlockRecipe;
import org.jetbrains.annotations.NotNull;

public class MultiBlockRecipeHandler implements RecipeHandler<MultiBlockRecipe> {
    @Override
    public @NotNull Class<MultiBlockRecipe> getRecipeClass() {
        return MultiBlockRecipe.class;
    }

    @Override
    public @NotNull String getRecipeCategoryUid() {
        return "multi_block";
    }

    @Override
    public @NotNull RecipeWrapper getRecipeWrapper(@NotNull MultiBlockRecipe multiBlockRecipe) {
        return new MultiBlockRecipeWrapper(multiBlockRecipe);
    }

    @Override
    public boolean isRecipeValid(@NotNull MultiBlockRecipe multiBlockRecipe) {
        return true;
    }
}
