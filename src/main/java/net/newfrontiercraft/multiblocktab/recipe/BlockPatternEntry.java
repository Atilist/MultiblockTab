package net.newfrontiercraft.multiblocktab.recipe;

import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.block.BlockState;

import javax.annotation.Nullable;

public record BlockPatternEntry(char pattern, BlockState blockstate, int meta, @Nullable ItemStack item){}
