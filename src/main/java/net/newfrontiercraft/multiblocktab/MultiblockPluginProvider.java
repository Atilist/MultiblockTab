package net.newfrontiercraft.multiblocktab;

import net.glasslauncher.mods.alwaysmoreitems.api.*;
import net.minecraft.nbt.NbtCompound;
import net.modificationstation.stationapi.api.util.Identifier;
import net.newfrontiercraft.multiblocktab.plugins.MultiBlockRecipeCategory;
import net.newfrontiercraft.multiblocktab.plugins.MultiBlockRecipeHandler;
import net.newfrontiercraft.multiblocktab.recipe.MultiBlockRecipeRegistry;

public class MultiblockPluginProvider implements ModPluginProvider {
    @Override
    public String getName() {
        return "Multiblock Tab";
    }

    @Override
    public Identifier getId() {
        return MultiblockTab.NAMESPACE.id("mutliblocktab");
    }

    @Override
    public void onAMIHelpersAvailable(AMIHelpers amiHelpers) {

    }

    @Override
    public void onItemRegistryAvailable(ItemRegistry itemRegistry) {

    }

    @Override
    public void register(ModRegistry registry) {
        registry.addRecipeCategories(new MultiBlockRecipeCategory());

        registry.addRecipeHandlers(new MultiBlockRecipeHandler());
        registry.addRecipes(MultiBlockRecipeRegistry.INSTANCE.getRecipes());

    }

    @Override
    public void onRecipeRegistryAvailable(RecipeRegistry recipeRegistry) {

    }

    @Override
    public SyncableRecipe deserializeRecipe(NbtCompound recipe) {
        return null;
    }

    @Override
    public void updateBlacklist(AMIHelpers amiHelpers) {

    }
}
