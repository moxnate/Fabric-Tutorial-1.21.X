package net.moxnate.wekkonmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent RED_CANDY_CANE = new FoodComponent.Builder().snack().nutrition(2).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200), 0.90f).build();
    public static final FoodComponent SWEET_BERRIES_JUICE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.25f).build();
}
