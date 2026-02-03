package net.moxnate.wekkonmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.StonecuttingRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.moxnate.wekkonmod.WekkonMod;
import net.moxnate.wekkonmod.block.ModBlocks;
import net.moxnate.wekkonmod.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        List<ItemConvertible> PINK_PROXIUM_SMELTABLES = List.of(ModItems.RAW_PINK_PROXIUM, ModBlocks.PINK_PROXIUM_ORE);
        offerSmelting(recipeExporter, PINK_PROXIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_PROXIUM, 0.5f, 200, "pink_prxoium");
        offerBlasting(recipeExporter, PINK_PROXIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_PROXIUM, 0.5f, 100, "pink_prxoium");
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.REINFORCED_PINK_PROXIUM, RecipeCategory.DECORATIONS,
                ModBlocks.PINK_PROXIUM_BLOCK);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_PROXIUM, 24)
                .input(ModBlocks.PINK_PROXIUM_BLOCK)
                .criterion(hasItem(ModBlocks.PINK_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PINK_PROXIUM_BLOCK))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_PINK_PROXIUM)
                .input('P', ModItems.PINK_PROXIUM)
                .pattern("PPP")
                .pattern("PPP")
                .pattern("PPP")
                .criterion(hasItem(ModItems.PINK_PROXIUM), conditionsFromItem(ModItems.PINK_PROXIUM))
                .offerTo(recipeExporter, Identifier.of(WekkonMod.MOD_ID, "reinfroced_pink_proxium_from_pink_proxium"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_PROXIUM_DOOR, 2)
                .input('P', ModItems.REINFORCED_PINK_PROXIUM)
                .pattern("PP ")
                .pattern("PP ")
                .pattern("PP ")
                .criterion(hasItem(ModItems.REINFORCED_PINK_PROXIUM), conditionsFromItem(ModItems.REINFORCED_PINK_PROXIUM))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_PROXIUM_TRAPDOOR)
                .input('P', ModItems.REINFORCED_PINK_PROXIUM)
                .pattern("   ")
                .pattern("PPP")
                .pattern("PPP")
                .criterion(hasItem(ModItems.REINFORCED_PINK_PROXIUM), conditionsFromItem(ModItems.REINFORCED_PINK_PROXIUM))
                .offerTo(recipeExporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.PINK_PROXIUM_BLOCK), RecipeCategory.MISC,
                ModBlocks.PINK_PROXIUM_FENCE, 8)
                        .criterion(hasItem(ModBlocks.PINK_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PINK_PROXIUM_BLOCK))
                        .offerTo(recipeExporter, convertBetween(ModBlocks.PINK_PROXIUM_FENCE, ModBlocks.PINK_PROXIUM_BLOCK) + "_stonecutting");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_PROXIUM_FENCE, 16)
                .input('P', ModBlocks.PINK_PROXIUM_BLOCK)
                .pattern("   ")
                .pattern("PPP")
                .pattern("P P")
                .criterion(hasItem(ModBlocks.PINK_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PINK_PROXIUM_BLOCK))
                .offerTo(recipeExporter, Identifier.of("pink_proxium_fence_from_pink_proxium_block"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.PINK_PROXIUM_BLOCK), RecipeCategory.MISC,
                        ModBlocks.PINK_PROXIUM_FENCE_GATE, 8)
                .criterion(hasItem(ModBlocks.PINK_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PINK_PROXIUM_BLOCK))
                .offerTo(recipeExporter, convertBetween(ModBlocks.PINK_PROXIUM_FENCE_GATE, ModBlocks.PINK_PROXIUM_BLOCK) + "_stonecutting");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_PROXIUM_FENCE_GATE, 16)
                .input('P', ModBlocks.PINK_PROXIUM_BLOCK)
                .pattern("   ")
                .pattern("P P")
                .pattern("P P")
                .criterion(hasItem(ModBlocks.PINK_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PINK_PROXIUM_BLOCK))
                .offerTo(recipeExporter, Identifier.of("pink_proxium_fence_gate_from_pink_proxium_block"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.PINK_PROXIUM_BLOCK), RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.PINK_PROXIUM_WALL, 8)
                .criterion(hasItem(ModBlocks.PINK_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PINK_PROXIUM_BLOCK))
                .offerTo(recipeExporter, convertBetween(ModBlocks.PINK_PROXIUM_WALL, ModBlocks.PINK_PROXIUM_BLOCK) + "_stonecutting");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_PROXIUM_WALL, 16)
                .input('B', ModBlocks.PINK_PROXIUM_BLOCK)
                .pattern("   ")
                .pattern("BBB")
                .pattern("BBB")
                .criterion(hasItem(ModBlocks.PINK_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PINK_PROXIUM_BLOCK))
                .offerTo(recipeExporter, Identifier.of("pink_proxium_wall_from_pink_proxium_block"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PINK_PROXIUM_PRESSURE_PLATE)
                .input('P', ModItems.REINFORCED_PINK_PROXIUM)
                .pattern("  ")
                .pattern("PP")
                .criterion(hasItem(ModItems.REINFORCED_PINK_PROXIUM), conditionsFromItem(ModItems.REINFORCED_PINK_PROXIUM))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PINK_PROXIUM_BUTTON, 4)
                .input(ModItems.REINFORCED_PINK_PROXIUM)
                .criterion(hasItem(ModItems.REINFORCED_PINK_PROXIUM), conditionsFromItem(ModItems.REINFORCED_PINK_PROXIUM))
                .offerTo(recipeExporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.PINK_PROXIUM_BLOCK), RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.PINK_PROXIUM_SLAB, 4)
                .criterion(hasItem(ModBlocks.PINK_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PINK_PROXIUM_BLOCK))
                .offerTo(recipeExporter, convertBetween(ModBlocks.PINK_PROXIUM_SLAB, ModBlocks.PINK_PROXIUM_BLOCK) + "_stonecutting");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_PROXIUM_SLAB, 8)
                .input('P', ModBlocks.PINK_PROXIUM_BLOCK)
                .pattern("   ")
                .pattern("   ")
                .pattern("PPP")
                .criterion(hasItem(ModBlocks.PINK_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PINK_PROXIUM_BLOCK))
                .offerTo(recipeExporter, Identifier.of("pink_proxium_slab_from_pink_proxium_block"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.PINK_PROXIUM_BLOCK), RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.PINK_PROXIUM_STAIRS, 16)
                .criterion(hasItem(ModBlocks.PINK_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PINK_PROXIUM_BLOCK))
                .offerTo(recipeExporter, convertBetween(ModBlocks.PINK_PROXIUM_STAIRS, ModBlocks.PINK_PROXIUM_BLOCK) + "_stonecutting");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_PROXIUM_STAIRS, 32)
                .input('P', ModBlocks.PINK_PROXIUM_BLOCK)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .criterion(hasItem(ModBlocks.PINK_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PINK_PROXIUM_BLOCK))
                .offerTo(recipeExporter, Identifier.of("pink_proxium_stairs_from_pink_proxium_block"));




        List<ItemConvertible> ORANGE_PROXIUM_SMELTABLES = List.of(ModItems.RAW_ORANGE_PROXIUM, ModBlocks.ORANGE_PROXIUM_ORE);
        offerSmelting(recipeExporter, ORANGE_PROXIUM_SMELTABLES, RecipeCategory.DECORATIONS, ModItems.ORANGE_PROXIUM, 0.3f, 200, "orange_prxoium");
        offerBlasting(recipeExporter, ORANGE_PROXIUM_SMELTABLES, RecipeCategory.DECORATIONS, ModItems.ORANGE_PROXIUM, 0.3f, 100, "orange_prxoium");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_PROXIUM_BLOCK)
                .input('B', ModItems.REINFORCED_ORANGE_PROXIUM)
                .pattern("BB")
                .pattern("BB")
                .criterion(hasItem(ModItems.REINFORCED_ORANGE_PROXIUM), conditionsFromItem(ModItems.REINFORCED_ORANGE_PROXIUM))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.REINFORCED_ORANGE_PROXIUM, 3)
                .input(ModBlocks.ORANGE_PROXIUM_BLOCK)
                .criterion(hasItem(ModBlocks.ORANGE_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.ORANGE_PROXIUM_BLOCK))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.REINFORCED_ORANGE_PROXIUM)
                .input('P', ModItems.ORANGE_PROXIUM)
                .pattern("   ")
                .pattern("PPP")
                .pattern("PPP")
                .criterion(hasItem(ModItems.ORANGE_PROXIUM), conditionsFromItem(ModItems.ORANGE_PROXIUM))
                .offerTo(recipeExporter, Identifier.of(WekkonMod.MOD_ID, "reinforged_orange_proxium_from_orange_proxium"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.PURE_PROXIUM)
                .input('P', ModItems.REINFORCED_PINK_PROXIUM)
                .input('O', ModItems.REINFORCED_ORANGE_PROXIUM)
                .pattern("PO")
                .pattern("PO")
                .criterion(hasItem(ModItems.REINFORCED_PINK_PROXIUM), conditionsFromItem(ModItems.REINFORCED_PINK_PROXIUM))
                .criterion(hasItem(ModItems.REINFORCED_ORANGE_PROXIUM), conditionsFromItem(ModItems.REINFORCED_ORANGE_PROXIUM))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURE_PROXIUM_BLOCK)
                .input('P', ModItems.PURE_PROXIUM)
                .pattern("PPP")
                .pattern("PPP")
                .pattern("PPP")
                .criterion(hasItem(ModItems.PURE_PROXIUM), conditionsFromItem(ModItems.PURE_PROXIUM))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DECORATED_PURE_PROXIUM_BLOCK)
                .input('B', ModBlocks.PURE_PROXIUM_BLOCK)
                .input('C', ModItems.CHISEL)
                .pattern("  ")
                .pattern("CB")
                .criterion(hasItem(ModBlocks.PURE_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PURE_PROXIUM_BLOCK))
                .criterion(hasItem(ModItems.CHISEL), conditionsFromItem(ModItems.CHISEL))
                .offerTo(recipeExporter);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DECORATED_PURE_PROXIUM_BLOCK, ModBlocks.PURE_PROXIUM_BLOCK, 1);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PURE_PROXIUM, 7)
                .input(ModBlocks.PURE_PROXIUM_BLOCK)
                .criterion(hasItem(ModBlocks.PURE_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PURE_PROXIUM_BLOCK))
                .offerTo(recipeExporter, Identifier.of(WekkonMod.MOD_ID, "pure_proxium_from_pure_proxium_block"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PURE_PROXIUM, 7)
                .input(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK)
                .criterion(hasItem(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK))
                .offerTo(recipeExporter, Identifier.of(WekkonMod.MOD_ID, "pure_proxium_from_decorated_pure_proxium_block"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MAGIC_BLOCK)
                .input('D', ModBlocks.DECORATED_PURE_PROXIUM_BLOCK)
                .input('P', Items.DIAMOND)
                .pattern("PPP")
                .pattern("PDP")
                .pattern("PPP")
                .criterion(hasItem(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.WEKKON_LAMP)
                .input('R', Items.REDSTONE)
                .input('P', ModItems.PURE_PROXIUM)
                .pattern("PRR")
                .pattern("RPR")
                .pattern("RRP")
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(ModItems.PURE_PROXIUM), conditionsFromItem(ModItems.PURE_PROXIUM))
                .offerTo(recipeExporter);




        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModItems.CHISEL)
                .pattern("  P")
                .pattern(" S ")
                .pattern("S  ")
                .input('P', ModBlocks.PINK_PROXIUM_BLOCK)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.PINK_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PINK_PROXIUM_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.RED_CANDY_CANE)
                .pattern("SBB")
                .pattern("SS ")
                .pattern("S  ")
                .input('S', Items.SUGAR)
                .input('B', Items.SWEET_BERRIES)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SWEET_BERRIES_JUICE)
                .pattern("BBB")
                .pattern("BGB")
                .pattern("BPB")
                .input('G', Items.GLASS_BOTTLE)
                .input('B', Items.SWEET_BERRIES)
                .input('P', ModItems.PURE_PROXIUM)
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(Items.GLASS_BOTTLE))
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                .criterion(hasItem(ModItems.PURE_PROXIUM), conditionsFromItem(ModItems.PURE_PROXIUM))
                .offerTo(recipeExporter);


        List<ItemConvertible> PINK_PROXIUM_ROD_SMELTABLES = List.of(ModItems.RAW_PINK_PROXIUM_ROD);
        offerBlasting(recipeExporter, PINK_PROXIUM_ROD_SMELTABLES, RecipeCategory.TOOLS, ModItems.PINK_PROXIUM_ROD,
                0.5f, 150, "pink_proxium_rod");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_PROXIUM_SWORD)
                .pattern(" P ")
                .pattern("PPP")
                .pattern(" R ")
                .input('P', ModItems.REINFORCED_PINK_PROXIUM)
                .input('R', ModItems.PINK_PROXIUM_ROD)
                .criterion(hasItem(ModItems.REINFORCED_PINK_PROXIUM), conditionsFromItem(ModItems.REINFORCED_PINK_PROXIUM))
                .criterion(hasItem(ModItems.PINK_PROXIUM_ROD), conditionsFromItem(ModItems.PINK_PROXIUM_ROD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_PROXIUM_PICKAXE)
                .pattern("PPP")
                .pattern(" P ")
                .pattern(" R ")
                .input('P', ModItems.REINFORCED_PINK_PROXIUM)
                .input('R', ModItems.PINK_PROXIUM_ROD)
                .criterion(hasItem(ModItems.REINFORCED_PINK_PROXIUM), conditionsFromItem(ModItems.REINFORCED_PINK_PROXIUM))
                .criterion(hasItem(ModItems.PINK_PROXIUM_ROD), conditionsFromItem(ModItems.PINK_PROXIUM_ROD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_PROXIUM_AXE)
                .pattern(" PP")
                .pattern(" PP")
                .pattern(" R ")
                .input('P', ModItems.REINFORCED_PINK_PROXIUM)
                .input('R', ModItems.PINK_PROXIUM_ROD)
                .criterion(hasItem(ModItems.REINFORCED_PINK_PROXIUM), conditionsFromItem(ModItems.REINFORCED_PINK_PROXIUM))
                .criterion(hasItem(ModItems.PINK_PROXIUM_ROD), conditionsFromItem(ModItems.PINK_PROXIUM_ROD))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_PROXIUM_AXE)
                .pattern("PP ")
                .pattern("PP ")
                .pattern(" R ")
                .input('P', ModItems.REINFORCED_PINK_PROXIUM)
                .input('R', ModItems.PINK_PROXIUM_ROD)
                .criterion(hasItem(ModItems.REINFORCED_PINK_PROXIUM), conditionsFromItem(ModItems.REINFORCED_PINK_PROXIUM))
                .criterion(hasItem(ModItems.PINK_PROXIUM_ROD), conditionsFromItem(ModItems.PINK_PROXIUM_ROD))
                .offerTo(recipeExporter, Identifier.of("pink_proxium_axe_in_other_direction"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_PROXIUM_SHOVEL)
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" R ")
                .input('P', ModItems.REINFORCED_PINK_PROXIUM)
                .input('R', ModItems.PINK_PROXIUM_ROD)
                .criterion(hasItem(ModItems.REINFORCED_PINK_PROXIUM), conditionsFromItem(ModItems.REINFORCED_PINK_PROXIUM))
                .criterion(hasItem(ModItems.PINK_PROXIUM_ROD), conditionsFromItem(ModItems.PINK_PROXIUM_ROD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_PROXIUM_HOE)
                .pattern(" PP")
                .pattern(" P ")
                .pattern(" R ")
                .input('P', ModItems.REINFORCED_PINK_PROXIUM)
                .input('R', ModItems.PINK_PROXIUM_ROD)
                .criterion(hasItem(ModItems.REINFORCED_PINK_PROXIUM), conditionsFromItem(ModItems.REINFORCED_PINK_PROXIUM))
                .criterion(hasItem(ModItems.PINK_PROXIUM_ROD), conditionsFromItem(ModItems.PINK_PROXIUM_ROD))
                .offerTo(recipeExporter);

        List<ItemConvertible> ORANGE_PROXIUM_ROD_SMELTABLES = List.of(ModItems.RAW_ORANGE_PROXIUM_ROD);
        offerBlasting(recipeExporter, ORANGE_PROXIUM_ROD_SMELTABLES, RecipeCategory.TOOLS, ModItems.ORANGE_PROXIUM_ROD,
                0.5f, 150, "orange_proxium_rod");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ORANGE_PROXIUM_SWORD)
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" R ")
                .input('P', ModItems.REINFORCED_ORANGE_PROXIUM)
                .input('R', ModItems.PINK_PROXIUM_ROD)
                .criterion(hasItem(ModItems.REINFORCED_ORANGE_PROXIUM), conditionsFromItem(ModItems.REINFORCED_ORANGE_PROXIUM))
                .criterion(hasItem(ModItems.ORANGE_PROXIUM_ROD), conditionsFromItem(ModItems.ORANGE_PROXIUM_ROD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ORANGE_PROXIUM_PICKAXE)
                .pattern("PPP")
                .pattern(" R ")
                .pattern(" R ")
                .input('P', ModItems.REINFORCED_ORANGE_PROXIUM)
                .input('R', ModItems.ORANGE_PROXIUM_ROD)
                .criterion(hasItem(ModItems.REINFORCED_ORANGE_PROXIUM), conditionsFromItem(ModItems.REINFORCED_ORANGE_PROXIUM))
                .criterion(hasItem(ModItems.ORANGE_PROXIUM_ROD), conditionsFromItem(ModItems.ORANGE_PROXIUM_ROD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ORANGE_PROXIUM_AXE)
                .pattern(" PP")
                .pattern(" RP")
                .pattern(" R ")
                .input('P', ModItems.REINFORCED_ORANGE_PROXIUM)
                .input('R', ModItems.ORANGE_PROXIUM_ROD)
                .criterion(hasItem(ModItems.REINFORCED_ORANGE_PROXIUM), conditionsFromItem(ModItems.REINFORCED_ORANGE_PROXIUM))
                .criterion(hasItem(ModItems.ORANGE_PROXIUM_ROD), conditionsFromItem(ModItems.ORANGE_PROXIUM_ROD))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ORANGE_PROXIUM_AXE)
                .pattern("PP ")
                .pattern("PR ")
                .pattern(" R ")
                .input('P', ModItems.REINFORCED_ORANGE_PROXIUM)
                .input('R', ModItems.ORANGE_PROXIUM_ROD)
                .criterion(hasItem(ModItems.REINFORCED_ORANGE_PROXIUM), conditionsFromItem(ModItems.REINFORCED_ORANGE_PROXIUM))
                .criterion(hasItem(ModItems.ORANGE_PROXIUM_ROD), conditionsFromItem(ModItems.ORANGE_PROXIUM_ROD))
                .offerTo(recipeExporter, Identifier.of("orange_proxium_axe_in_other_direction"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ORANGE_PROXIUM_SHOVEL)
                .pattern(" P ")
                .pattern(" R ")
                .pattern(" R ")
                .input('P', ModItems.REINFORCED_ORANGE_PROXIUM)
                .input('R', ModItems.ORANGE_PROXIUM_ROD)
                .criterion(hasItem(ModItems.REINFORCED_ORANGE_PROXIUM), conditionsFromItem(ModItems.REINFORCED_ORANGE_PROXIUM))
                .criterion(hasItem(ModItems.ORANGE_PROXIUM_ROD), conditionsFromItem(ModItems.ORANGE_PROXIUM_ROD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ORANGE_PROXIUM_HOE)
                .pattern(" PP")
                .pattern(" R ")
                .pattern(" R ")
                .input('P', ModItems.REINFORCED_ORANGE_PROXIUM)
                .input('R', ModItems.ORANGE_PROXIUM_ROD)
                .criterion(hasItem(ModItems.REINFORCED_ORANGE_PROXIUM), conditionsFromItem(ModItems.REINFORCED_ORANGE_PROXIUM))
                .criterion(hasItem(ModItems.ORANGE_PROXIUM_ROD), conditionsFromItem(ModItems.ORANGE_PROXIUM_ROD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RAW_ORANGE_PROXIUM_ROD)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', ModItems.REINFORCED_ORANGE_PROXIUM)
                .criterion(hasItem(ModItems.REINFORCED_ORANGE_PROXIUM), conditionsFromItem(ModItems.REINFORCED_ORANGE_PROXIUM))
                .criterion(hasItem(ModItems.ORANGE_PROXIUM_ROD), conditionsFromItem(ModItems.ORANGE_PROXIUM_ROD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RAW_PINK_PROXIUM_ROD)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', ModItems.REINFORCED_PINK_PROXIUM)
                .criterion(hasItem(ModItems.REINFORCED_PINK_PROXIUM), conditionsFromItem(ModItems.REINFORCED_PINK_PROXIUM))
                .criterion(hasItem(ModItems.PINK_PROXIUM_ROD), conditionsFromItem(ModItems.PINK_PROXIUM_ROD))
                .offerTo(recipeExporter);


        offerSmithingTrimRecipe(recipeExporter, ModItems.MOXNATE_SMITHING_TEMPLATE, Identifier.of(WekkonMod.MOD_ID, "moxnate"));

    }
}
