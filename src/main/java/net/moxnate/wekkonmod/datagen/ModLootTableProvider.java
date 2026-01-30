package net.moxnate.wekkonmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.moxnate.wekkonmod.block.ModBlocks;
import net.moxnate.wekkonmod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.WEKKON_LAMP);
        addDrop(ModBlocks.MAGIC_BLOCK);
        addDrop(ModBlocks.PINK_PROXIUM_BLOCK);
        addDrop(ModBlocks.ORANGE_PROXIUM_BLOCK);
        addDrop(ModBlocks.PURE_PROXIUM_BLOCK);
        addDrop(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK);

        addDrop(ModBlocks.PINK_PROXIUM_ORE, multipleOreDrops(ModBlocks.PINK_PROXIUM_ORE, ModItems.RAW_PINK_PROXIUM, 3, 6));
        addDrop(ModBlocks.ORANGE_PROXIUM_ORE, multipleOreDrops(ModBlocks.ORANGE_PROXIUM_ORE, ModItems.RAW_ORANGE_PROXIUM, 4, 7));

        addDrop(ModBlocks.PINK_PROXIUM_STAIRS);
        addDrop(ModBlocks.PINK_PROXIUM_SLAB, slabDrops(ModBlocks.PINK_PROXIUM_SLAB));

        addDrop(ModBlocks.PINK_PROXIUM_BUTTON);
        addDrop(ModBlocks.PINK_PROXIUM_PRESSURE_PLATE);

        addDrop(ModBlocks.PINK_PROXIUM_WALL);
        addDrop(ModBlocks.PINK_PROXIUM_FENCE);
        addDrop(ModBlocks.PINK_PROXIUM_FENCE_GATE);

        addDrop(ModBlocks.PINK_PROXIUM_DOOR, doorDrops(ModBlocks.PINK_PROXIUM_DOOR));
        addDrop(ModBlocks.PINK_PROXIUM_TRAPDOOR);

        addDrop(ModBlocks.PINK_PROXIUM_STAIRS);
        addDrop(ModBlocks.PINK_PROXIUM_SLAB, slabDrops(ModBlocks.PINK_PROXIUM_SLAB));

        addDrop(ModBlocks.ORANGE_PROXIUM_BUTTON);
        addDrop(ModBlocks.ORANGE_PROXIUM_PRESSURE_PLATE);

        addDrop(ModBlocks.ORANGE_PROXIUM_WALL);
        addDrop(ModBlocks.ORANGE_PROXIUM_FENCE);
        addDrop(ModBlocks.ORANGE_PROXIUM_FENCE_GATE);

        addDrop(ModBlocks.ORANGE_PROXIUM_DOOR, doorDrops(ModBlocks.ORANGE_PROXIUM_DOOR));
        addDrop(ModBlocks.ORANGE_PROXIUM_TRAPDOOR);




    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
