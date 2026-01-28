package net.moxnate.wekkonmod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.moxnate.wekkonmod.WekkonMod;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_PINK_PROXIUM_TOOL = createTag("needs_pink_proxium_tool");
        public static final TagKey<Block> INCORRECT_FOR_PINK_PROXIUM_TOOL = createTag("incorrect_for_pink_proxium_tool");
        public static final TagKey<Block> NEEDS_ORANGE_PROXIUM_TOOL = createTag("needs_orange_proxium_tool");
        public static final TagKey<Block> INCORRECT_FOR_ORANGE_PROXIUM_TOOL = createTag("incorrect_for_orange_proxium_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(WekkonMod.MOD_ID, name));
        }

    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");
        public static final TagKey<Item> TRANSFORMABLE_ITEMS_ONE = createTag("transformable_items_one");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(WekkonMod.MOD_ID, name));
        }
    }
}
