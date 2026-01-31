package net.moxnate.wekkonmod.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.moxnate.wekkonmod.item.ModItems;
import net.moxnate.wekkonmod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {


    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.PURE_PROXIUM)
                .add(Items.DANDELION);

        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS_ONE)
                .add(Items.AMETHYST_BLOCK);


        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.PINK_PROXIUM_SWORD)
                .add(ModItems.ORANGE_PROXIUM_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.PINK_PROXIUM_PICKAXE)
                .add(ModItems.ORANGE_PROXIUM_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.PINK_PROXIUM_AXE)
                .add(ModItems.ORANGE_PROXIUM_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.PINK_PROXIUM_SHOVEL)
                .add(ModItems.ORANGE_PROXIUM_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.PINK_PROXIUM_HOE)
                .add(ModItems.ORANGE_PROXIUM_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.WEKKON_HELMET)
                .add(ModItems.WEKKON_CHESTPLATE)
                .add(ModItems.WEKKON_LEGGINGS)
                .add(ModItems.WEKKON_BOOTS);


    }
}
