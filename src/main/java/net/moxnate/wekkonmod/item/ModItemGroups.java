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
                    }).build());

    public static final ItemGroup PROXIUM_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(WekkonMod.MOD_ID, "proxium_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_PROXIUM_BLOCK))
                    .displayName(Text.translatable("itemgroup.wekkonmod.proxium_blocks"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModBlocks.PINK_PROXIUM_BLOCK);
                      entries.add(ModBlocks.PINK_PROXIUM_ORE);
                    }).build());

    public static final ItemGroup OTHER_WEKKON_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(WekkonMod.MOD_ID, "other_wekkon_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHISEL))
                    .displayName(Text.translatable("itemgroup.wekkonmod.other_wekkon_items"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.CHISEL);
                    }).build());



    public static void registerItemGroups() {
        WekkonMod.LOGGER.info("Registering Item Groups for" + WekkonMod.MOD_ID);
    }
}
