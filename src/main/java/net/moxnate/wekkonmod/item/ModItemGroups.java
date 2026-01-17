package net.moxnate.wekkonmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.moxnate.wekkonmod.WekkonMod;
import net.moxnate.wekkonmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup PROXIUM_CRYSTALS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(WekkonMod.MOD_ID, "proxium_crystals"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_PROXIUM))
                    .displayName(Text.translatable("itemgroup.wekkonmod.proxium_crystals"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.PINK_PROXIUM);
                      entries.add(ModItems.REINFORCED_PINK_PROXIUM);
                      entries.add(ModItems.RAW_PINK_PROXIUM);
                      entries.add(ModItems.ORANGE_PROXIUM);
                      entries.add(ModItems.REINFORCED_ORANGE_PROXIUM);
                      entries.add(ModItems.RAW_ORANGE_PROXIUM);
                      entries.add(ModItems.YELLOW_PROXIUM);
                      entries.add(ModItems.REINFORCED_YELLOW_PROXIUM);
                      entries.add(ModItems.RAW_YELLOW_PROXIUM);
                      entries.add(ModItems.RED_PROXIUM);
                      entries.add(ModItems.REINFORCED_RED_PROXIUM);
                      entries.add(ModItems.RAW_RED_PROXIUM);
                      entries.add(ModItems.PURE_PROXIUM);

                    }).build());

    public static final ItemGroup PROXIUM_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(WekkonMod.MOD_ID, "proxium_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_PROXIUM_BLOCK))
                    .displayName(Text.translatable("itemgroup.wekkonmod.proxium_blocks"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModBlocks.PINK_PROXIUM_BLOCK);
                      entries.add(ModBlocks.PINK_PROXIUM_ORE);
                      entries.add(ModBlocks.ORANGE_PROXIUM_BLOCK);
                      entries.add(ModBlocks.ORANGE_PROXIUM_ORE);
                      entries.add(ModBlocks.YELLOW_PROXIUM_BLOCK);
                      entries.add(ModBlocks.YELLOW_PROXIUM_ORE);
                      entries.add(ModBlocks.RED_PROXIUM_BLOCK);
                      entries.add(ModBlocks.RED_PROXIUM_ORE);
                      entries.add(ModBlocks.PURE_PROXIUM_BLOCK);
                      entries.add(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK);
                    }).build());

    public static final ItemGroup OTHER_WEKKON_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(WekkonMod.MOD_ID, "other_wekkon_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHISEL))
                    .displayName(Text.translatable("itemgroup.wekkonmod.other_wekkon_items"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.CHISEL);
                      entries.add(ModItems.BURNING_STAR);
                    }).build());

    public static final ItemGroup OTHER_WEKKON_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(WekkonMod.MOD_ID, "other_wekkon_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.MAGIC_BLOCK))
                    .displayName(Text.translatable("itemgroup.wekkonmod.other_wekkon_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.MAGIC_BLOCK);
                    }).build());

    public static final ItemGroup WEKKON_FOOD = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(WekkonMod.MOD_ID, "wekkon_food"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RED_CANDY_CANE))
                    .displayName(Text.translatable("itemgroup.wekkonmod.wekkon_food"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RED_CANDY_CANE);
                        entries.add(ModItems.SWEET_BERRIES_JUICE);
                    }).build());



    public static void registerItemGroups() {
        WekkonMod.LOGGER.info("Registering Item Groups for" + WekkonMod.MOD_ID);
    }
}
