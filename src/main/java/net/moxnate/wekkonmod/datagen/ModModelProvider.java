package net.moxnate.wekkonmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import net.moxnate.wekkonmod.block.ModBlocks;
import net.moxnate.wekkonmod.block.custom.WekkonLampBlock;
import net.moxnate.wekkonmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool pinkProxiumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_PROXIUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool orangeProxiumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_PROXIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_PROXIUM_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_PROXIUM_ORE);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURE_PROXIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);

        pinkProxiumPool.stairs(ModBlocks.PINK_PROXIUM_STAIRS);
        pinkProxiumPool.slab(ModBlocks.PINK_PROXIUM_SLAB);

        pinkProxiumPool.button(ModBlocks.PINK_PROXIUM_BUTTON);
        pinkProxiumPool.pressurePlate(ModBlocks.PINK_PROXIUM_PRESSURE_PLATE);

        pinkProxiumPool.wall(ModBlocks.PINK_PROXIUM_WALL);
        pinkProxiumPool.fence(ModBlocks.PINK_PROXIUM_FENCE);
        pinkProxiumPool.fenceGate(ModBlocks.PINK_PROXIUM_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.PINK_PROXIUM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_PROXIUM_TRAPDOOR);

        orangeProxiumPool.stairs(ModBlocks.ORANGE_PROXIUM_STAIRS);
        orangeProxiumPool.slab(ModBlocks.ORANGE_PROXIUM_SLAB);

        orangeProxiumPool.button(ModBlocks.ORANGE_PROXIUM_BUTTON);
        orangeProxiumPool.pressurePlate(ModBlocks.ORANGE_PROXIUM_PRESSURE_PLATE);

        orangeProxiumPool.wall(ModBlocks.ORANGE_PROXIUM_WALL);
        orangeProxiumPool.fence(ModBlocks.ORANGE_PROXIUM_FENCE);
        orangeProxiumPool.fenceGate(ModBlocks.ORANGE_PROXIUM_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.ORANGE_PROXIUM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ORANGE_PROXIUM_TRAPDOOR);

        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.WEKKON_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.WEKKON_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.WEKKON_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(WekkonLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PINK_PROXIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PINK_PROXIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_PINK_PROXIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.ORANGE_PROXIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ORANGE_PROXIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_ORANGE_PROXIUM, Models.GENERATED);


        itemModelGenerator.register(ModItems.PURE_PROXIUM, Models.GENERATED);



        itemModelGenerator.register(ModItems.RED_CANDY_CANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEET_BERRIES_JUICE, Models.GENERATED);


        itemModelGenerator.register(ModItems.CHISEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BURNING_STAR, Models.GENERATED);


        itemModelGenerator.register(ModItems.PINK_PROXIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_PROXIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_PROXIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_PROXIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_PROXIUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORANGE_PROXIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORANGE_PROXIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORANGE_PROXIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORANGE_PROXIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORANGE_PROXIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.PINK_PROXIUM_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORANGE_PROXIUM_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.RAW_PINK_PROXIUM_ROD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_PROXIUM_ROD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RAW_ORANGE_PROXIUM_ROD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORANGE_PROXIUM_ROD, Models.HANDHELD);


        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WEKKON_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WEKKON_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WEKKON_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WEKKON_BOOTS));

        itemModelGenerator.register(ModItems.WEKKON_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOXNATE_SMITHING_TEMPLATE, Models.GENERATED);












    }
}
