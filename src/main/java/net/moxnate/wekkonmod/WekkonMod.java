package net.moxnate.wekkonmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.moxnate.wekkonmod.block.ModBlocks;
import net.moxnate.wekkonmod.component.ModDataComponentTypes;
import net.moxnate.wekkonmod.item.ModItemGroups;
import net.moxnate.wekkonmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WekkonMod implements ModInitializer {
	public static final String MOD_ID = "wekkonmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModDataComponentTypes.registerDataComponentTypes();

        FuelRegistry.INSTANCE.add(ModItems.BURNING_STAR, 6400);
        FuelRegistry.INSTANCE.add(ModItems.PURE_PROXIUM, 20_000);
	}
}