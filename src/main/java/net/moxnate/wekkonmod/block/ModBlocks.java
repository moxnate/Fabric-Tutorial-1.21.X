package net.moxnate.wekkonmod.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.moxnate.wekkonmod.WekkonMod;
import net.moxnate.wekkonmod.block.custom.MagicBlock;
import net.moxnate.wekkonmod.block.custom.WekkonLampBlock;

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
            new ButtonBlock(BlockSetType.ACACIA, 2, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block PINK_PROXIUM_PRESSURE_PLATE = registerBlock("pink_proxium_pressure_plate",
            new PressurePlateBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block PINK_PROXIUM_FENCE = registerBlock("pink_proxium_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PINK_PROXIUM_FENCE_GATE = registerBlock("pink_proxium_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PINK_PROXIUM_WALL = registerBlock("pink_proxium_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block PINK_PROXIUM_DOOR = registerBlock("pink_proxium_door",
            new DoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block PINK_PROXIUM_TRAPDOOR = registerBlock("pink_proxium_trapdoor",
            new TrapdoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));


    public static final Block ORANGE_PROXIUM_STAIRS = registerBlock("orange_proxium_stairs",
            new StairsBlock(ModBlocks.PINK_PROXIUM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(5f).requiresTool()));
    public static final Block ORANGE_PROXIUM_SLAB = registerBlock("orange_proxium_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(5f).requiresTool()));

    public static final Block ORANGE_PROXIUM_BUTTON = registerBlock("orange_proxium_button",
            new ButtonBlock(BlockSetType.IRON, 20, AbstractBlock.Settings.create().strength(5f).requiresTool().noCollision()));
    public static final Block ORANGE_PROXIUM_PRESSURE_PLATE = registerBlock("orange_proxium_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(5f).requiresTool()));

    public static final Block ORANGE_PROXIUM_FENCE = registerBlock("orange_proxium_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(5f).requiresTool()));
    public static final Block ORANGE_PROXIUM_FENCE_GATE = registerBlock("orange_proxium_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(5f).requiresTool()));
    public static final Block ORANGE_PROXIUM_WALL = registerBlock("orange_proxium_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(5f).requiresTool()));

    public static final Block ORANGE_PROXIUM_DOOR = registerBlock("orange_proxium_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(5f).requiresTool().nonOpaque()));
    public static final Block ORANGE_PROXIUM_TRAPDOOR = registerBlock("orange_proxium_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(5f).requiresTool().nonOpaque()));


    public static final Block ORANGE_PROXIUM_BLOCK = registerBlock("orange_proxium_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block ORANGE_PROXIUM_ORE = registerBlock("orange_proxium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(6, 8),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));


    public static final Block PURE_PROXIUM_BLOCK = registerBlock("pure_proxium_block",
            new Block(AbstractBlock.Settings.create().strength(10f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block DECORATED_PURE_PROXIUM_BLOCK = registerBlock("decorated_pure_proxium_block",
            new Block(AbstractBlock.Settings.create().strength(10f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));



    public static final Block MAGIC_BLOCK = registerBlock("magic_block",
            new MagicBlock(AbstractBlock.Settings.create().strength(0f)));

    public static final Block WEKKON_LAMP = registerBlock("wekkon_lamp",
            new WekkonLampBlock(AbstractBlock.Settings.create()
                    .strength(1f).luminance(state -> state.get(WekkonLampBlock.CLICKED) ? 15 : 0)));

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

