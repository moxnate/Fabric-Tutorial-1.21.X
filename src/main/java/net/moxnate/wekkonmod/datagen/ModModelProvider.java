package net.moxnate.wekkonmod.datagen;

import com.ibm.icu.text.Normalizer2;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.moxnate.wekkonmod.block.ModBlocks;
import net.moxnate.wekkonmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_PROXIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_PROXIUM_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_PROXIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_PROXIUM_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_PROXIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_PROXIUM_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_PROXIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_PROXIUM_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURE_PROXIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PINK_PROXIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PINK_PROXIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_PINK_PROXIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.ORANGE_PROXIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ORANGE_PROXIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_ORANGE_PROXIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.YELLOW_PROXIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_YELLOW_PROXIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_YELLOW_PROXIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.RED_PROXIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RED_PROXIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_RED_PROXIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.PURE_PROXIUM, Models.GENERATED);



        itemModelGenerator.register(ModItems.RED_CANDY_CANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEET_BERRIES_JUICE, Models.GENERATED);


        itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BURNING_STAR, Models.GENERATED);












    }
}
