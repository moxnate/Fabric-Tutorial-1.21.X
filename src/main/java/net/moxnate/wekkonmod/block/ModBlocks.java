package net.moxnate.wekkonmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.moxnate.wekkonmod.WekkonMod;
import net.moxnate.wekkonmod.block.custom.MagicBlock;

public class ModBlocks {
    public static final Block PINK_PROXIUM_BLOCK = registerBlock("pink_proxium_block",
            new Block(AbstractBlock.Settings.create().strength(2f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block PINK_PROXIUM_ORE = registerBlock("pink_proxium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(8, 16),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));

    public static final Block PINK_PROXIUM_STAIRS = registerBlock("pink_proxium_stairs",
            new StairsBlock(ModBlocks.PINK_PROXIUM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PINK_PROXIUM_SLAB = registerBlock("pink_proxium_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block PINK_PROXIUM_BUTTON = registerBlock("pink_proxium_button",
            new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block PINK_PROXIUM_PRESSURE_PLATE = registerBlock("pink_proxium_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block PINK_PROXIUM_FENCE = registerBlock("pink_proxium_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PINK_PROXIUM_FENCE_GATE = registerBlock("pink_proxium_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PINK_PROXIUM_WALL = registerBlock("pink_proxium_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block PINK_PROXIUM_DOOR = registerBlock("pink_proxium_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block PINK_PROXIUM_TRAPDOOR = registerBlock("pink_proxium_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));


    public static final Block YELLOW_PROXIUM_BLOCK = registerBlock("yellow_proxium_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block YELLOW_PROXIUM_ORE = registerBlock("yellow_proxium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 6),
                    AbstractBlock.Settings.create().strength(5f).requiresTool()));


    public static final Block ORANGE_PROXIUM_BLOCK = registerBlock("orange_proxium_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block ORANGE_PROXIUM_ORE = registerBlock("orange_proxium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(6, 8),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));


    public static final Block RED_PROXIUM_BLOCK = registerBlock("red_proxium_block",
            new Block(AbstractBlock.Settings.create().strength(5f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RED_PROXIUM_ORE = registerBlock("red_proxium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                    AbstractBlock.Settings.create().strength(6f).requiresTool()));


    public static final Block PURE_PROXIUM_BLOCK = registerBlock("pure_proxium_block",
            new Block(AbstractBlock.Settings.create().strength(10f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block DECORATED_PURE_PROXIUM_BLOCK = registerBlock("decorated_pure_proxium_block",
            new Block(AbstractBlock.Settings.create().strength(10f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));



    public static final Block MAGIC_BLOCK = registerBlock("magic_block",
            new MagicBlock(AbstractBlock.Settings.create().strength(0f)));

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

