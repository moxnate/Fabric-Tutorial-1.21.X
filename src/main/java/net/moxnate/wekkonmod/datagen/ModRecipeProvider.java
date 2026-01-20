package net.moxnate.wekkonmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
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


        List<ItemConvertible> ORANGE_PROXIUM_SMELTABLES = List.of(ModItems.RAW_ORANGE_PROXIUM, ModBlocks.ORANGE_PROXIUM_ORE);
        offerSmelting(recipeExporter, ORANGE_PROXIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ORANGE_PROXIUM, 0.3f, 200, "orange_prxoium");
        offerBlasting(recipeExporter, ORANGE_PROXIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ORANGE_PROXIUM, 0.3f, 100, "orange_prxoium");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORANGE_PROXIUM_BLOCK)
                .input('B', ModItems.REINFORCED_ORANGE_PROXIUM)
                .pattern("BB")
                .pattern("BB")
                .criterion(hasItem(ModItems.REINFORCED_ORANGE_PROXIUM), conditionsFromItem(ModItems.REINFORCED_ORANGE_PROXIUM))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_ORANGE_PROXIUM, 3)
                .input(ModBlocks.ORANGE_PROXIUM_BLOCK)
                .criterion(hasItem(ModBlocks.ORANGE_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.ORANGE_PROXIUM_BLOCK))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_ORANGE_PROXIUM)
                .input('P', ModItems.ORANGE_PROXIUM)
                .pattern("   ")
                .pattern("PPP")
                .pattern("PPP")
                .criterion(hasItem(ModItems.ORANGE_PROXIUM), conditionsFromItem(ModItems.ORANGE_PROXIUM))
                .offerTo(recipeExporter, Identifier.of(WekkonMod.MOD_ID, "reinforged_orange_proxium_from_orange_proxium"));


        List<ItemConvertible> YELLOW_PROXIUM_SMELTABLES = List.of(ModItems.RAW_YELLOW_PROXIUM, ModBlocks.YELLOW_PROXIUM_ORE);
        offerSmelting(recipeExporter, YELLOW_PROXIUM_SMELTABLES, RecipeCategory.MISC, ModItems.YELLOW_PROXIUM, 0.15f, 200, "yellow_prxoium");
        offerBlasting(recipeExporter, YELLOW_PROXIUM_SMELTABLES, RecipeCategory.MISC, ModItems.YELLOW_PROXIUM, 0.15f, 100, "yellow_prxoium");
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.YELLOW_PROXIUM, RecipeCategory.DECORATIONS,
                ModBlocks.YELLOW_PROXIUM_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_YELLOW_PROXIUM)
                .input('P', ModItems.YELLOW_PROXIUM)
                .pattern("   ")
                .pattern("PPP")
                .pattern("PPP")
                .criterion(hasItem(ModItems.YELLOW_PROXIUM), conditionsFromItem(ModItems.YELLOW_PROXIUM))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.YELLOW_PROXIUM, 9)
                .input(ModBlocks.YELLOW_PROXIUM_BLOCK);


        List<ItemConvertible> RED_PROXIUM_SMELTABLES = List.of(ModItems.RAW_RED_PROXIUM, ModBlocks.RED_PROXIUM_ORE);
        offerSmelting(recipeExporter, RED_PROXIUM_SMELTABLES, RecipeCategory.MISC, ModItems.RED_PROXIUM, 0.05f, 200, "red_prxoium");
        offerBlasting(recipeExporter, RED_PROXIUM_SMELTABLES, RecipeCategory.MISC, ModItems.RED_PROXIUM, 0.05f, 100, "red_prxoium");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RED_PROXIUM_BLOCK)
                .input('B', ModItems.RED_PROXIUM)
                .pattern("BB")
                .pattern("BB")
                .criterion(hasItem(ModItems.RED_PROXIUM), conditionsFromItem(ModItems.RED_PROXIUM))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_PROXIUM, 4)
                .input(ModBlocks.RED_PROXIUM_BLOCK)
                .criterion(hasItem(ModBlocks.RED_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.RED_PROXIUM_BLOCK))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_RED_PROXIUM)
                .input('P', ModItems.RED_PROXIUM)
                .pattern("  ")
                .pattern("PP")
                .criterion(hasItem(ModItems.RED_PROXIUM), conditionsFromItem(ModItems.RED_PROXIUM))
                .offerTo(recipeExporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PURE_PROXIUM)
                .input('P', ModItems.REINFORCED_PINK_PROXIUM)
                .input('O', ModItems.REINFORCED_ORANGE_PROXIUM)
                .input('Y', ModItems.REINFORCED_YELLOW_PROXIUM)
                .input('R', ModItems.REINFORCED_RED_PROXIUM)
                .pattern("PO")
                .pattern("YR")
                .criterion(hasItem(ModItems.REINFORCED_PINK_PROXIUM), conditionsFromItem(ModItems.REINFORCED_PINK_PROXIUM))
                .criterion(hasItem(ModItems.REINFORCED_ORANGE_PROXIUM), conditionsFromItem(ModItems.REINFORCED_ORANGE_PROXIUM))
                .criterion(hasItem(ModItems.REINFORCED_YELLOW_PROXIUM), conditionsFromItem(ModItems.REINFORCED_YELLOW_PROXIUM))
                .criterion(hasItem(ModItems.REINFORCED_RED_PROXIUM), conditionsFromItem(ModItems.REINFORCED_RED_PROXIUM))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PURE_PROXIUM_BLOCK)
                .input('P', ModItems.PURE_PROXIUM)
                .pattern("PPP")
                .pattern("PPP")
                .pattern("PPP")
                .criterion(hasItem(ModItems.PURE_PROXIUM), conditionsFromItem(ModItems.PURE_PROXIUM))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DECORATED_PURE_PROXIUM_BLOCK)
                .input('B', ModBlocks.PURE_PROXIUM_BLOCK)
                .input('C', ModItems.CHISEL)
                .pattern("  ")
                .pattern("CB")
                .criterion(hasItem(ModBlocks.PURE_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PURE_PROXIUM_BLOCK))
                .criterion(hasItem(ModItems.CHISEL), conditionsFromItem(ModItems.CHISEL))
                .offerTo(recipeExporter);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.DECORATED_PURE_PROXIUM_BLOCK, ModBlocks.PURE_PROXIUM_BLOCK, 1);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PURE_PROXIUM, 7)
                .input(ModBlocks.PURE_PROXIUM_BLOCK)
                .criterion(hasItem(ModBlocks.PURE_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PURE_PROXIUM_BLOCK))
                .offerTo(recipeExporter, Identifier.of(WekkonMod.MOD_ID, "pure_proxium_from_pure_proxium_block"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PURE_PROXIUM, 7)
                .input(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK)
                .criterion(hasItem(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK))
                .offerTo(recipeExporter, Identifier.of(WekkonMod.MOD_ID, "pure_proxium_from_decorated_pure_proxium_block"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MAGIC_BLOCK)
                .input('D', ModBlocks.DECORATED_PURE_PROXIUM_BLOCK)
                .input('P', Items.DIAMOND)
                .pattern("PPP")
                .pattern("PDP")
                .pattern("PPP")
                .criterion(hasItem(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.DECORATED_PURE_PROXIUM_BLOCK))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(recipeExporter);




        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHISEL)
                .pattern("  P")
                .pattern(" S ")
                .pattern("S  ")
                .input('P', ModBlocks.PINK_PROXIUM_BLOCK)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.PINK_PROXIUM_BLOCK), conditionsFromItem(ModBlocks.PINK_PROXIUM_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_CANDY_CANE)
                .pattern("SBB")
                .pattern("SS ")
                .pattern("S  ")
                .input('S', Items.SUGAR)
                .input('B', Items.SWEET_BERRIES)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SWEET_BERRIES_JUICE)
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


    }
}
