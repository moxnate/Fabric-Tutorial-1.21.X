package net.moxnate.wekkonmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.moxnate.wekkonmod.block.ModBlocks;
import net.moxnate.wekkonmod.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PINK_PROXIUM_BLOCK)
                .add(ModBlocks.PINK_PROXIUM_ORE)
                .add(ModBlocks.ORANGE_PROXIUM_ORE)
                .add(ModBlocks.ORANGE_PROXIUM_BLOCK)
                .add(ModBlocks.PURE_PROXIUM_BLOCK)
                .add(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK)
                .add(ModBlocks.MAGIC_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.ORANGE_PROXIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ORANGE_PROXIUM_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.PURE_PROXIUM_BLOCK)
                .add(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.PINK_PROXIUM_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.PINK_PROXIUM_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.PINK_PROXIUM_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.ORANGE_PROXIUM_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.ORANGE_PROXIUM_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.ORANGE_PROXIUM_WALL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PINK_PROXIUM_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ORANGE_PROXIUM_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.PINK_PROXIUM_ORE)
                .add(ModBlocks.ORANGE_PROXIUM_FENCE_GATE)
                .add(ModBlocks.ORANGE_PROXIUM_FENCE)
                .add(ModBlocks.ORANGE_PROXIUM_WALL)
                .add(ModBlocks.ORANGE_PROXIUM_BUTTON)
                .add(ModBlocks.ORANGE_PROXIUM_PRESSURE_PLATE)
                .add(ModBlocks.ORANGE_PROXIUM_DOOR)
                .add(ModBlocks.ORANGE_PROXIUM_TRAPDOOR)
                .add(ModBlocks.ORANGE_PROXIUM_SLAB)
                .add(ModBlocks.ORANGE_PROXIUM_STAIRS);


    }
}
