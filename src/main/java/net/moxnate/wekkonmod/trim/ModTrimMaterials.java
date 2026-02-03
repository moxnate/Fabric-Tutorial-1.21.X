package net.moxnate.wekkonmod.trim;

import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.moxnate.wekkonmod.WekkonMod;
import net.moxnate.wekkonmod.item.ModItems;

import java.util.Map;

public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> PURE_PROXIUM = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(WekkonMod.MOD_ID, "pure_proxium"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, PURE_PROXIUM, Registries.ITEM.getEntry(ModItems.PURE_PROXIUM),
                Style.EMPTY.withColor(TextColor.parse("#228665").getOrThrow()), 0.4f);

    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style, float itemModelIndex) {
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, itemModelIndex,
                Map.of(), Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimMaterial);
    }

}
