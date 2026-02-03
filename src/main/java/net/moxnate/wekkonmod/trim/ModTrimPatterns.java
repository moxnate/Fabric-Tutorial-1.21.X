package net.moxnate.wekkonmod.trim;

import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimPattern;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.moxnate.wekkonmod.WekkonMod;
import net.moxnate.wekkonmod.item.ModItems;

public class ModTrimPatterns {
    public static final RegistryKey<ArmorTrimPattern> MOXNATE = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(WekkonMod.MOD_ID, "moxnate"));

    public static void bootstrap(Registerable<ArmorTrimPattern> context) {
        register(context, ModItems.MOXNATE_SMITHING_TEMPLATE, MOXNATE);

    }

    private static void register(Registerable<ArmorTrimPattern> context, Item item,
                                 RegistryKey<ArmorTrimPattern> key) {
        ArmorTrimPattern trimPattern = new ArmorTrimPattern(key.getValue(), Registries.ITEM.getEntry(item),
                Text.translatable(Util.createTranslationKey("trim_pattern", key.getValue())), false);

        context.register(key, trimPattern);
    }

}
