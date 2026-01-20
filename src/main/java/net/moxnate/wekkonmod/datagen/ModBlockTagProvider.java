package net.moxnate.wekkonmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.moxnate.wekkonmod.block.ModBlocks;

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
                .add(ModBlocks.YELLOW_PROXIUM_BLOCK)
                .add(ModBlocks.YELLOW_PROXIUM_ORE)
                .add(ModBlocks.RED_PROXIUM_BLOCK)
                .add(ModBlocks.RED_PROXIUM_ORE)
                .add(ModBlocks.PURE_PROXIUM_BLOCK)
                .add(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK)
                .add(ModBlocks.MAGIC_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.PINK_PROXIUM_ORE)
                .add(ModBlocks.ORANGE_PROXIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ORANGE_PROXIUM_ORE)
                .add(ModBlocks.YELLOW_PROXIUM_BLOCK)
                .add(ModBlocks.YELLOW_PROXIUM_ORE)
                .add(ModBlocks.YELLOW_PROXIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RED_PROXIUM_ORE)
                .add(ModBlocks.RED_PROXIUM_BLOCK)
                .add(ModBlocks.PURE_PROXIUM_BLOCK)
                .add(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK);


    }
}
