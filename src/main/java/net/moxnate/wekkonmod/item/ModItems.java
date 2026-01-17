package net.moxnate.wekkonmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moxnate.wekkonmod.WekkonMod;
import net.moxnate.wekkonmod.item.custom.ChiselItem;
import net.moxnate.wekkonmod.item.custom.DrinkItem;

public class ModItems {

    public static final Item PINK_PROXIUM = registerItem("pink_proxium", new Item(new Item.Settings()));
    public static final Item RAW_PINK_PROXIUM = registerItem("raw_pink_proxium", new Item(new Item.Settings()));
    public static final Item REINFORCED_PINK_PROXIUM = registerItem("reinforced_pink_proxium", new Item(new Item.Settings()));

    public static final Item ORANGE_PROXIUM = registerItem("orange_proxium", new Item(new Item.Settings()));
    public static final Item RAW_ORANGE_PROXIUM = registerItem("raw_orange_proxium", new Item(new Item.Settings()));
    public static final Item REINFORCED_ORANGE_PROXIUM = registerItem("reinforced_orange_proxium", new Item(new Item.Settings()));

    public static final Item YELLOW_PROXIUM = registerItem("yellow_proxium", new Item(new Item.Settings()));
    public static final Item RAW_YELLOW_PROXIUM = registerItem("raw_yellow_proxium", new Item(new Item.Settings()));
    public static final Item REINFORCED_YELLOW_PROXIUM = registerItem("reinforced_yellow_proxium", new Item(new Item.Settings()));

    public static final Item RED_PROXIUM = registerItem("red_proxium", new Item(new Item.Settings()));
    public static final Item RAW_RED_PROXIUM = registerItem("raw_red_proxium", new Item(new Item.Settings()));
    public static final Item REINFORCED_RED_PROXIUM = registerItem("reinforced_red_proxium", new Item(new Item.Settings()));

    public static final Item PURE_PROXIUM = registerItem("pure_proxium", new Item(new Item.Settings()));


    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(8)));


    public static final Item RED_CANDY_CANE = registerItem("red_candy_cane", new Item(new Item.Settings().food(ModFoodComponents.RED_CANDY_CANE)));
    public static final Item SWEET_BERRIES_JUICE = registerItem("sweet_berries_juice",
            new DrinkItem(new Item.Settings().food(ModFoodComponents.SWEET_BERRIES_JUICE)));


    public static final Item BURNING_STAR = registerItem("burning_star", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WekkonMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WekkonMod.LOGGER.info("Registering Mod Items for" + WekkonMod.MOD_ID);
        };
    }

