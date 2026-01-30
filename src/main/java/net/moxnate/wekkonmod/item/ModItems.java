package net.moxnate.wekkonmod.item;

import net.minecraft.entity.ai.goal.HorseBondWithPlayerGoal;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.moxnate.wekkonmod.WekkonMod;
import net.moxnate.wekkonmod.item.custom.ChiselItem;
import net.moxnate.wekkonmod.item.custom.DrinkItem;
import net.moxnate.wekkonmod.item.custom.HammerItem;

import java.util.List;

public class ModItems {

    public static final Item PINK_PROXIUM = registerItem("pink_proxium", new Item(new Item.Settings()));
    public static final Item RAW_PINK_PROXIUM = registerItem("raw_pink_proxium", new Item(new Item.Settings()));
    public static final Item REINFORCED_PINK_PROXIUM = registerItem("reinforced_pink_proxium", new Item(new Item.Settings()));

    public static final Item ORANGE_PROXIUM = registerItem("orange_proxium", new Item(new Item.Settings()));
    public static final Item RAW_ORANGE_PROXIUM = registerItem("raw_orange_proxium", new Item(new Item.Settings()));
    public static final Item REINFORCED_ORANGE_PROXIUM = registerItem("reinforced_orange_proxium", new Item(new Item.Settings()));

    public static final Item RAW_PINK_PROXIUM_ROD = registerItem("raw_pink_proxium_rod", new Item(new Item.Settings()));
    public static final Item PINK_PROXIUM_ROD = registerItem("pink_proxium_rod", new Item(new Item.Settings()));
    public static final Item RAW_ORANGE_PROXIUM_ROD = registerItem("raw_orange_proxium_rod", new Item(new Item.Settings()));
    public static final Item ORANGE_PROXIUM_ROD = registerItem("orange_proxium_rod", new Item(new Item.Settings()));
    public static final Item PINK_PROXIUM_SWORD = registerItem("pink_proxium_sword",
            new SwordItem(ModToolMaterials.PINK_PROXIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PINK_PROXIUM, 3, -2.4f))));
    public static final Item PINK_PROXIUM_PICKAXE = registerItem("pink_proxium_pickaxe",
            new PickaxeItem(ModToolMaterials.PINK_PROXIUM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PINK_PROXIUM, 1, -2.8f))));
    public static final Item PINK_PROXIUM_SHOVEL = registerItem("pink_proxium_shovel",
            new ShovelItem(ModToolMaterials.PINK_PROXIUM, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PINK_PROXIUM, 1.5f, -3.0f))));
    public static final Item PINK_PROXIUM_AXE = registerItem("pink_proxium_axe",
            new AxeItem(ModToolMaterials.PINK_PROXIUM, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PINK_PROXIUM, 6, -3.2f))));
    public static final Item PINK_PROXIUM_HOE = registerItem("pink_proxium_hoe",
            new HoeItem(ModToolMaterials.PINK_PROXIUM, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PINK_PROXIUM, 0, -3f))));

    public static final Item PINK_PROXIUM_HAMMER = registerItem("pink_proxium_hammer",
            new HammerItem(ModToolMaterials.PINK_PROXIUM, new Item.Settings()
                    .attributeModifiers(HammerItem.createAttributeModifiers(ModToolMaterials.PINK_PROXIUM, 7, -3.4f))));
    public static final Item ORANGE_PROXIUM_HAMMER = registerItem("orange_proxium_hammer",
            new HammerItem(ModToolMaterials.ORANGE_PROXIUM, new Item.Settings()
                    .attributeModifiers(HammerItem.createAttributeModifiers(ModToolMaterials.ORANGE_PROXIUM, 14, -3.2f))));

    public static final Item ORANGE_PROXIUM_SWORD = registerItem("orange_proxium_sword",
            new SwordItem(ModToolMaterials.ORANGE_PROXIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ORANGE_PROXIUM, 3, -2.4f))));
    public static final Item ORANGE_PROXIUM_PICKAXE = registerItem("orange_proxium_pickaxe",
            new PickaxeItem(ModToolMaterials.ORANGE_PROXIUM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ORANGE_PROXIUM, 1, -2.8f))));
    public static final Item ORANGE_PROXIUM_SHOVEL = registerItem("orange_proxium_shovel",
            new ShovelItem(ModToolMaterials.ORANGE_PROXIUM, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ORANGE_PROXIUM, 1.5f, -3.0f))));
    public static final Item ORANGE_PROXIUM_AXE = registerItem("orange_proxium_axe",
            new AxeItem(ModToolMaterials.ORANGE_PROXIUM, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ORANGE_PROXIUM, 6, -3.2f))));
    public static final Item ORANGE_PROXIUM_HOE = registerItem("orange_proxium_hoe",
            new HoeItem(ModToolMaterials.ORANGE_PROXIUM, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ORANGE_PROXIUM, 0, -3f))));

    public static final Item PURE_PROXIUM = registerItem("pure_proxium", new Item(new Item.Settings()));


    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(8)));


    public static final Item RED_CANDY_CANE = registerItem("red_candy_cane", new Item(new Item.Settings()
            .food(ModFoodComponents.RED_CANDY_CANE)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.wekkonmod.red_candy_cane"));
            tooltip.add(Text.translatable("tooltip.wekkonmod.red_candy_cane.1"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
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

