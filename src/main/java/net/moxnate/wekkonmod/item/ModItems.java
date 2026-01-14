package net.moxnate.wekkonmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moxnate.wekkonmod.WekkonMod;

public class ModItems {

    public static final Item PINK_PROXIUM = registerItem("pink_proxium", new Item(new Item.Settings()));
    public static final Item RAW_PINK_PROXIUM = registerItem("raw_pink_proxium", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WekkonMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WekkonMod.LOGGER.info("Registering Mod Items for" + WekkonMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_PROXIUM);
            entries.add(RAW_PINK_PROXIUM);
        });
    }
}
