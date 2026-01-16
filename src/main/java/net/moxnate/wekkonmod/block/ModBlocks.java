package net.moxnate.wekkonmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.moxnate.wekkonmod.WekkonMod;

public class ModBlocks {
    public static final Block PINK_PROXIUM_BLOCK = registerBlock("pink_proxium_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block PINK_PROXIUM_ORE = registerBlock("pink_proxium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 8),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(WekkonMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(WekkonMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        WekkonMod.LOGGER.info("Registering Mod Blocks for" + WekkonMod.MOD_ID);

 //       ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
  //          entries.add(ModBlocks.PINK_PROXIUM_BLOCK);
 //           entries.add(ModBlocks.PINK_PROXIUM_ORE);
        // Это если не добавлять в пользовательскую группу предметов
        };
    }

