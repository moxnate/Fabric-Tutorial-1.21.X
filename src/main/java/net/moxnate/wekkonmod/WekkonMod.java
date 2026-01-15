package net.moxnate.wekkonmod;

import net.fabricmc.api.ModInitializer;

import net.moxnate.wekkonmod.block.ModBlocks;
import net.moxnate.wekkonmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WekkonMod implements ModInitializer {
	public static final String MOD_ID = "wekkonmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}