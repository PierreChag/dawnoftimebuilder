package org.dawnoftimebuilder.client.gui.creative;

import net.minecraft.item.Item;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.ArrayList;
import java.util.Arrays;

import static net.minecraft.block.Blocks.*;
import static net.minecraft.item.Items.FLINT_AND_STEEL;
import static org.dawnoftimebuilder.DawnOfTimeBuilder.MOD_ID;
import static org.dawnoftimebuilder.registry.DoTBBlocksRegistry.*;
import static org.dawnoftimebuilder.registry.DoTBItemsRegistry.*;

@OnlyIn(Dist.CLIENT)
public enum CreativeInventoryCategories {

	GENERAL("general",
			RAMMED_DIRT.get().asItem(),
			THATCH_WHEAT.get().asItem(),
			THATCH_WHEAT_STAIRS.get().asItem(),
			THATCH_WHEAT_PLATE.get().asItem(),
			THATCH_WHEAT_SLAB.get().asItem(),
			THATCH_WHEAT_EDGE.get().asItem(),
			THATCH_BAMBOO.get().asItem(),
			THATCH_BAMBOO_STAIRS.get().asItem(),
			THATCH_BAMBOO_PLATE.get().asItem(),
			THATCH_BAMBOO_SLAB.get().asItem(),
			THATCH_BAMBOO_EDGE.get().asItem(),
			ACACIA_PLANKS.asItem(),
			ACACIA_STAIRS.asItem(),
			ACACIA_PLANKS_PLATE.get().asItem(),
			ACACIA_SLAB.asItem(),
			ACACIA_PLANKS_EDGE.get().asItem(),
			ACACIA_SUPPORT_SLAB.get().asItem(),
			ACACIA_SUPPORT_BEAM.get().asItem(),
			STRIPPED_ACACIA_LOG.asItem(),
			ACACIA_BEAM.get().asItem(),
			ACACIA_WALL.get().asItem(),
			ACACIA_PERGOLA.get().asItem(),
			ACACIA_FENCE.asItem(),
			ACACIA_FENCE_GATE.asItem(),
			ACACIA_LATTICE.get().asItem(),
			ACACIA_DOOR.asItem(),
			ACACIA_TRAPDOOR.asItem(),
			ACACIA_LEAVES.asItem(),
			BIRCH_PLANKS.asItem(),
			BIRCH_STAIRS.asItem(),
			BIRCH_PLANKS_PLATE.get().asItem(),
			BIRCH_SLAB.asItem(),
			BIRCH_PLANKS_EDGE.get().asItem(),
			BIRCH_SUPPORT_SLAB.get().asItem(),
			BIRCH_SUPPORT_BEAM.get().asItem(),
			STRIPPED_BIRCH_LOG.asItem(),
			BIRCH_BEAM.get().asItem(),
			BIRCH_WALL.get().asItem(),
			BIRCH_PERGOLA.get().asItem(),
			BIRCH_FENCE.asItem(),
			BIRCH_FENCE_GATE.asItem(),
			BIRCH_LATTICE.get().asItem(),
			BIRCH_DOOR.asItem(),
			BIRCH_TRAPDOOR.asItem(),
			BIRCH_LEAVES.asItem(),
			DARK_OAK_PLANKS.asItem(),
			DARK_OAK_STAIRS.asItem(),
			DARK_OAK_PLANKS_PLATE.get().asItem(),
			DARK_OAK_SLAB.asItem(),
			DARK_OAK_PLANKS_EDGE.get().asItem(),
			DARK_OAK_SUPPORT_SLAB.get().asItem(),
			DARK_OAK_SUPPORT_BEAM.get().asItem(),
			STRIPPED_DARK_OAK_LOG.asItem(),
			DARK_OAK_BEAM.get().asItem(),
			DARK_OAK_WALL.get().asItem(),
			DARK_OAK_PERGOLA.get().asItem(),
			DARK_OAK_FENCE.asItem(),
			DARK_OAK_FENCE_GATE.asItem(),
			DARK_OAK_LATTICE.get().asItem(),
			DARK_OAK_DOOR.asItem(),
			DARK_OAK_TRAPDOOR.asItem(),
			DARK_OAK_LEAVES.asItem(),
			JUNGLE_PLANKS.asItem(),
			JUNGLE_STAIRS.asItem(),
			JUNGLE_PLANKS_PLATE.get().asItem(),
			JUNGLE_SLAB.asItem(),
			JUNGLE_PLANKS_EDGE.get().asItem(),
			JUNGLE_SUPPORT_SLAB.get().asItem(),
			JUNGLE_SUPPORT_BEAM.get().asItem(),
			STRIPPED_JUNGLE_LOG.asItem(),
			JUNGLE_BEAM.get().asItem(),
			JUNGLE_WALL.get().asItem(),
			JUNGLE_PERGOLA.get().asItem(),
			JUNGLE_FENCE.asItem(),
			JUNGLE_FENCE_GATE.asItem(),
			JUNGLE_LATTICE.get().asItem(),
			JUNGLE_DOOR.asItem(),
			JUNGLE_TRAPDOOR.asItem(),
			JUNGLE_LEAVES.asItem(),
			OAK_PLANKS.asItem(),
			OAK_STAIRS.asItem(),
			OAK_PLANKS_PLATE.get().asItem(),
			OAK_SLAB.asItem(),
			OAK_PLANKS_EDGE.get().asItem(),
			OAK_SUPPORT_SLAB.get().asItem(),
			OAK_SUPPORT_BEAM.get().asItem(),
			STRIPPED_OAK_LOG.asItem(),
			OAK_BEAM.get().asItem(),
			OAK_WALL.get().asItem(),
			OAK_PERGOLA.get().asItem(),
			OAK_FENCE.asItem(),
			OAK_FENCE_GATE.asItem(),
			OAK_LATTICE.get().asItem(),
			OAK_DOOR.asItem(),
			OAK_TRAPDOOR.asItem(),
			OAK_LEAVES.asItem(),
			SPRUCE_PLANKS.asItem(),
			SPRUCE_STAIRS.asItem(),
			SPRUCE_PLANKS_PLATE.get().asItem(),
			SPRUCE_SLAB.asItem(),
			SPRUCE_PLANKS_EDGE.get().asItem(),
			SPRUCE_SUPPORT_SLAB.get().asItem(),
			SPRUCE_SUPPORT_BEAM.get().asItem(),
			STRIPPED_SPRUCE_LOG.asItem(),
			SPRUCE_BEAM.get().asItem(),
			SPRUCE_WALL.get().asItem(),
			SPRUCE_PERGOLA.get().asItem(),
			SPRUCE_FENCE.asItem(),
			SPRUCE_FENCE_GATE.asItem(),
			SPRUCE_LATTICE.get().asItem(),
			SPRUCE_DOOR.asItem(),
			SPRUCE_TRAPDOOR.asItem(),
			SPRUCE_LEAVES.asItem(),
			FIREPLACE.get().asItem(),
			FLINT_AND_STEEL
	),

	EGYPTIAN("egyptian",
			PHARAOH_ARMOR_HEAD.get(),
			PHARAOH_ARMOR_CHEST.get(),
			PHARAOH_ARMOR_LEGS.get(),
			PHARAOH_ARMOR_FEET.get()
	),

	FRENCH("french",
			THATCH_WHEAT.get().asItem(),
			THATCH_WHEAT_STAIRS.get().asItem(),
			THATCH_WHEAT_PLATE.get().asItem(),
			THATCH_WHEAT_SLAB.get().asItem(),
			THATCH_WHEAT_EDGE.get().asItem(),
			RAMMED_DIRT.get().asItem(),
			COBBLED_LIMESTONE.get().asItem(),
			LIMESTONE_BRICKS.get().asItem(),
			LIMESTONE_BRICKS_STAIRS.get().asItem(),
			LIMESTONE_BRICKS_PLATE.get().asItem(),
			LIMESTONE_BRICKS_SLAB.get().asItem(),
			LIMESTONE_BRICKS_EDGE.get().asItem(),
			LIMESTONE_BRICKS_WALL.get().asItem(),
			LIMESTONE_BALUSTER.get().asItem(),
			LIMESTONE_GARGOYLE.get().asItem(),
			FIREPLACE.get().asItem(),
			LIMESTONE_FIREPLACE.get().asItem(),
			LIMESTONE_CHIMNEY.get().asItem(),
			ROOFING_SLATES.get().asItem(),
			ROOFING_SLATES_STAIRS.get().asItem(),
			ROOFING_SLATES_PLATE.get().asItem(),
			ROOFING_SLATES_SLAB.get().asItem(),
			ROOFING_SLATES_EDGE.get().asItem(),
			CANDLESTICK.get().asItem(),
			GRAPE.get(),
			GRAPE_SEEDS.get(),
			FLINT_AND_STEEL
	),

	GERMAN("german",
			THATCH_WHEAT.get().asItem(),
			THATCH_WHEAT_STAIRS.get().asItem(),
			THATCH_WHEAT_PLATE.get().asItem(),
			THATCH_WHEAT_SLAB.get().asItem(),
			THATCH_WHEAT_EDGE.get().asItem(),
			RAMMED_DIRT.get().asItem(),
			WAXED_OAK_FRAMED_RAMMED_DIRT.get().asItem(),
			WAXED_OAK_TIMBER_FRAME.get().asItem(),
			WAXED_OAK_TIMBER_FRAME_PILLAR.get().asItem(),
			WAXED_OAK_TIMBER_FRAME_CORNER.get().asItem(),
			WAXED_OAK_TIMBER_FRAME_CROSSED.get().asItem(),
			WAXED_OAK_TIMBER_FRAME_SQUARED.get().asItem(),
			WAXED_OAK_PLANKS.get().asItem(),
			WAXED_OAK_PLANKS_STAIRS.get().asItem(),
			WAXED_OAK_PLANKS_PLATE.get().asItem(),
			WAXED_OAK_PLANKS_SLAB.get().asItem(),
			WAXED_OAK_PLANKS_EDGE.get().asItem(),
			WAXED_OAK_SUPPORT_SLAB.get().asItem(),
			WAXED_OAK_SUPPORT_BEAM.get().asItem(),
			WAXED_OAK_LOG_STRIPPED.get().asItem(),
			WAXED_OAK_BEAM.get().asItem(),
			WAXED_OAK_WALL.get().asItem(),
			WAXED_OAK_PERGOLA.get().asItem(),
			WAXED_OAK_FENCE.get().asItem(),
			WAXED_OAK_FENCE_GATE.get().asItem(),
			WAXED_OAK_BALUSTER.get().asItem(),
			WAXED_OAK_LATTICE.get().asItem(),
			WAXED_OAK_DOOR.get().asItem(),
			WAXED_OAK_TRAPDOOR.get().asItem(),
			WAXED_OAK_SMALL_SHUTTER.get().asItem(),
			WAXED_OAK_SHUTTER.get().asItem(),
			STONE_BRICKS_MASONRY.get().asItem(),
			STONE_BRICKS.asItem(),
			STONE_BRICK_STAIRS.asItem(),
			STONE_BRICKS_PLATE.get().asItem(),
			STONE_BRICK_SLAB.asItem(),
			STONE_BRICKS_EDGE.get().asItem(),
			STONE_BRICKS_ARROWSLIT.get().asItem(),
			STONE_BRICKS_MACHICOLATION.get().asItem(),
			LATTICE_GLASS.get().asItem(),
			LATTICE_GLASS_PANE.get().asItem(),
			LATTICE_WAXED_OAK_WINDOW.get().asItem(),
			LATTICE_STONE_BRICKS_WINDOW.get().asItem(),
			FIREPLACE.get().asItem(),
			STONE_BRICKS_FIREPLACE.get().asItem(),
			STONE_BRICKS_CHIMNEY.get().asItem(),
			CANDLESTICK.get().asItem(),
			WAXED_OAK_CHANDELIER.get().asItem(),
			WAXED_OAK_TABLE.get().asItem(),
			WAXED_OAK_CHAIR.get().asItem(),
			PLANTER_GERANIUM_PINK.get().asItem(),
			FLAT_ROOF_TILES.get().asItem(),
			FLAT_ROOF_TILES_STAIRS.get().asItem(),
			FLAT_ROOF_TILES_PLATE.get().asItem(),
			FLAT_ROOF_TILES_SLAB.get().asItem(),
			FLAT_ROOF_TILES_EDGE.get().asItem(),
			IRON_PORTCULLIS.get().asItem(),
			IRON_PLATE_ARMOR_HEAD.get(),
			IRON_PLATE_ARMOR_CHEST.get(),
			IRON_PLATE_ARMOR_LEGS.get(),
			IRON_PLATE_ARMOR_FEET.get(),
			HOLY_ARMOR_HEAD.get(),
			HOLY_ARMOR_CHEST.get(),
			HOLY_ARMOR_LEGS.get(),
			HOLY_ARMOR_FEET.get(),
			FLINT_AND_STEEL
	),

	PERSIAN("persian",
			PERSIAN_CARPET_RED.get().asItem(),
			PERSIAN_CARPET_DELICATE_RED.get().asItem(),
			MORAQ_MOSAIC_TILES_DELICATE.get().asItem(),
			MORAQ_MOSAIC_TILES_TRADITIONAL.get().asItem(),
			MORAQ_MOSAIC_TILES_BORDER.get().asItem(),
			MORAQ_MOSAIC_RECESS.get().asItem()
	),

	JAPANESE("japanese",
			STEPPING_STONES.get().asItem(),
			STEPPING_STONES_SLAB.get().asItem(),
			THATCH_BAMBOO.get().asItem(),
			THATCH_BAMBOO_STAIRS.get().asItem(),
			THATCH_BAMBOO_PLATE.get().asItem(),
			THATCH_BAMBOO_SLAB.get().asItem(),
			THATCH_BAMBOO_EDGE.get().asItem(),
			RAMMED_DIRT.get().asItem(),
			CHARRED_SPRUCE_PLANKS.get().asItem(),
			CHARRED_SPRUCE_PLANKS_STAIRS.get().asItem(),
			CHARRED_SPRUCE_PLANKS_PLATE.get().asItem(),
			CHARRED_SPRUCE_PLANKS_SLAB.get().asItem(),
			CHARRED_SPRUCE_PLANKS_EDGE.get().asItem(),
			CHARRED_SPRUCE_SUPPORT_SLAB.get().asItem(),
			CHARRED_SPRUCE_SUPPORT_BEAM.get().asItem(),
			CHARRED_SPRUCE_FOUNDATION.get().asItem(),
			CHARRED_SPRUCE_FOUNDATION_SLAB.get().asItem(),
			CHARRED_SPRUCE_BOARDS.get().asItem(),
			CHARRED_SPRUCE_LOG_STRIPPED.get().asItem(),
			CHARRED_SPRUCE_BEAM.get().asItem(),
			CHARRED_SPRUCE_WALL.get().asItem(),
			CHARRED_SPRUCE_PERGOLA.get().asItem(),
			CHARRED_SPRUCE_FENCE.get().asItem(),
			CHARRED_SPRUCE_FENCE_GATE.get().asItem(),
			CHARRED_SPRUCE_RAILING.get().asItem(),
			CHARRED_SPRUCE_LATTICE.get().asItem(),
			CHARRED_SPRUCE_DOOR.get().asItem(),
			CHARRED_SPRUCE_TRAPDOOR.get().asItem(),
			CHARRED_SPRUCE_SHUTTERS.get().asItem(),
			CHARRED_SPRUCE_TALL_SHUTTERS.get().asItem(),
			CHARRED_SPRUCE_ROOF_SUPPORT.get().asItem(),
			CHARRED_SPRUCE_TIMBER_FRAME.get().asItem(),
			CHARRED_SPRUCE_TIMBER_FRAME_PILLAR.get().asItem(),
			GRAY_ROOF_TILES.get().asItem(),
			GRAY_ROOF_TILES_STAIRS.get().asItem(),
			GRAY_ROOF_TILES_PLATE.get().asItem(),
			GRAY_ROOF_TILES_SLAB.get().asItem(),
			GRAY_ROOF_TILES_EDGE.get().asItem(),
			GRAY_ROOF_TILES_WALL.get().asItem(),
			PAPER_WALL.get().asItem(),
			PAPER_WALL_FLAT.get().asItem(),
			PAPER_WALL_WINDOWS.get().asItem(),
			PAPER_WALL_FLOWERY.get().asItem(),
			PAPER_DOOR.get().asItem(),
			RED_PAINTED_BEAM.get().asItem(),
			PAPER_FOLDING_SCREEN.get().asItem(),
			FIREPLACE.get().asItem(),
			IRORI_FIREPLACE.get().asItem(),
			GRAY_TILE.get(),
			GRAY_CLAY_TILE.get(),
			WHITE_LITTLE_FLAG.get().asItem(),
			RED_PAPER_LANTERN.get().asItem(),
			PAPER_LAMP.get().asItem(),
			STONE_LANTERN.get().asItem(),
			SMALL_TATAMI_MAT.get().asItem(),
			TATAMI_MAT.get().asItem(),
			LIGHT_GRAY_FUTON.get().asItem(),
			SPRUCE_LOW_TABLE.get().asItem(),
			SPRUCE_LEGLESS_CHAIR.get().asItem(),
			IKEBANA_FLOWER_POT.get().asItem(),
			SAKE_BOTTLE.get().asItem(),
			SAKE_CUP.get().asItem(),
			CAST_IRON_TEAPOT_GRAY.get().asItem(),
			CAST_IRON_TEACUP_GRAY.get().asItem(),
			CAST_IRON_TEAPOT_GREEN.get().asItem(),
			CAST_IRON_TEACUP_GREEN.get().asItem(),
			CAST_IRON_TEAPOT_DECORATED.get().asItem(),
			CAST_IRON_TEACUP_DECORATED.get().asItem(),
			BAMBOO_DRYING_TRAY.get().asItem(),
			CAMELLIA.get().asItem(),
			CAMELLIA_LEAVES.get(),
			TEA_LEAVES.get(),
			STICK_BUNDLE.get().asItem(),
			MULBERRY.get().asItem(),
			MULBERRY_LEAVES.get(),
			SILK_WORM_EGGS.get(),
			SILK_WORMS_HATCHERY.get(),
			SILK_WORMS.get(),
			SILK_COCOONS.get(),
			SILK.get(),
			RICE.get().asItem(),
			BAMBOO_HAT.get(),
			JAPANESE_LIGHT_ARMOR_HEAD.get(),
			JAPANESE_LIGHT_ARMOR_CHEST.get(),
			JAPANESE_LIGHT_ARMOR_LEGS.get(),
			JAPANESE_LIGHT_ARMOR_FEET.get(),
			O_YOROI_ARMOR_HEAD.get(),
			O_YOROI_ARMOR_CHEST.get(),
			O_YOROI_ARMOR_LEGS.get(),
			O_YOROI_ARMOR_FEET.get(),
			RAIJIN_ARMOR_HEAD.get(),
			RAIJIN_ARMOR_CHEST.get(),
			RAIJIN_ARMOR_LEGS.get(),
			RAIJIN_ARMOR_FEET.get(),
			FLINT_AND_STEEL
	),

	PRE_COLOMBIAN("pre-columbian",
			THATCH_WHEAT.get().asItem(),
			THATCH_WHEAT_STAIRS.get().asItem(),
			THATCH_WHEAT_PLATE.get().asItem(),
			THATCH_WHEAT_SLAB.get().asItem(),
			THATCH_WHEAT_EDGE.get().asItem(),
			RAMMED_DIRT.get().asItem(),
			PLASTERED_STONE.get().asItem(),
			PLASTERED_STONE_STAIRS.get().asItem(),
			PLASTERED_STONE_PLATE.get().asItem(),
			PLASTERED_STONE_SLAB.get().asItem(),
			PLASTERED_STONE_EDGE.get().asItem(),
			RED_PLASTERED_STONE.get().asItem(),
			RED_PLASTERED_STONE_STAIRS.get().asItem(),
			RED_PLASTERED_STONE_PLATE.get().asItem(),
			RED_PLASTERED_STONE_SLAB.get().asItem(),
			RED_PLASTERED_STONE_EDGE.get().asItem(),
			RED_ORNAMENTED_PLASTERED_STONE.get().asItem(),
			CHISELED_PLASTERED_STONE.get().asItem(),
			CHISELED_PLASTERED_STONE_FRIEZE.get().asItem(),
			ORNAMENTED_CHISELED_PLASTERED_STONE.get().asItem(),
			RED_CHISELED_PLASTERED_STONE.get().asItem(),
			RED_ORNAMENTED_CHISELED_PLASTERED_STONE.get().asItem(),
			RED_PLASTERED_STONE_FRIEZE.get().asItem(),
			RED_ORNAMENTED_PLASTERED_STONE_FRIEZE.get().asItem(),
			RED_SCULPTED_PLASTERED_STONE_FRIEZE.get().asItem(),
			RED_SMALL_PLASTERED_STONE_FRIEZE.get().asItem(),
			GREEN_CHISELED_PLASTERED_STONE.get().asItem(),
			GREEN_ORNAMENTED_CHISELED_PLASTERED_STONE.get().asItem(),
			GREEN_PLASTERED_STONE_FRIEZE.get().asItem(),
			GREEN_ORNAMENTED_PLASTERED_STONE_FRIEZE.get().asItem(),
			GREEN_SCULPTED_PLASTERED_STONE_FRIEZE.get().asItem(),
			GREEN_SMALL_PLASTERED_STONE_FRIEZE.get().asItem(),
			PLASTERED_STONE_COLUMN.get().asItem(),
			PLASTERED_STONE_WINDOW.get().asItem(),
			PLASTERED_STONE_CRESSET.get().asItem(),
			FEATHERED_SERPENT_SCULPTURE.get().asItem(),
			SERPENT_SCULPTED_COLUMN.get().asItem(),
			COMMELINA.get().asItem(),
			WILD_MAIZE.get().asItem(),
			MAIZE.get().asItem(),
			FLINT_AND_STEEL
	),

	ROMAN("roman",
			SANDSTONE.asItem(),
			SANDSTONE_STAIRS.asItem(),
			SANDSTONE_PLATE.get().asItem(),
			SANDSTONE_SLAB.asItem(),
			SANDSTONE_EDGE.get().asItem(),
			SANDSTONE_WALL.asItem(),
			CUT_SANDSTONE.asItem(),
			CUT_SANDSTONE_STAIRS.get().asItem(),
			CUT_SANDSTONE_PLATE.get().asItem(),
			CUT_SANDSTONE_SLAB.asItem(),
			CUT_SANDSTONE_EDGE.get().asItem(),
			SMOOTH_SANDSTONE.asItem(),
			SMOOTH_SANDSTONE_STAIRS.asItem(),
			SMOOTH_SANDSTONE_PLATE.get().asItem(),
			SMOOTH_SANDSTONE_SLAB.asItem(),
			SMOOTH_SANDSTONE_EDGE.get().asItem(),
			CHISELED_SANDSTONE.asItem(),
			SANDSTONE_COLUMN.get().asItem(),
			COVERED_SANDSTONE_WALL.get().asItem(),
			OCHRE_ROOF_TILES.get().asItem(),
			OCHRE_ROOF_TILES_STAIRS.get().asItem(),
			OCHRE_ROOF_TILES_PLATE.get().asItem(),
			OCHRE_ROOF_TILES_SLAB.get().asItem(),
			OCHRE_ROOF_TILES_EDGE.get().asItem(),
			OCHRE_ROOF_TILES_WALL.get().asItem(),
			MOSAIC_FLOOR.get().asItem(),
			MOSAIC_FLOOR_DELICATE.get().asItem(),
			MOSAIC_FLOOR_ROSETTE.get().asItem(),
			MARBLE_STATUE_MARS.get().asItem(),
			BIRCH_PLANKS.asItem(),
			BIRCH_STAIRS.asItem(),
			BIRCH_PLANKS_PLATE.get().asItem(),
			BIRCH_SLAB.asItem(),
			BIRCH_PLANKS_EDGE.get().asItem(),
			BIRCH_SUPPORT_SLAB.get().asItem(),
			BIRCH_SUPPORT_BEAM.get().asItem(),
			STRIPPED_BIRCH_LOG.asItem(),
			BIRCH_BEAM.get().asItem(),
			BIRCH_WALL.get().asItem(),
			BIRCH_PERGOLA.get().asItem(),
			BIRCH_FENCE.asItem(),
			BIRCH_LATTICE.get().asItem(),
			BIRCH_DOOR.asItem(),
			BIRCH_TRAPDOOR.asItem(),
			BIRCH_FOOTSTOOL.get().asItem(),
			BIRCH_COUCH.get().asItem(),
			CYPRESS.get().asItem(),
			WILD_GRAPE.get().asItem(),
			GRAPE.get(),
			GRAPE_SEEDS.get()
	);

	private final String name;
	private final ITextComponent translation;
	private final ArrayList<Item> items = new ArrayList<>();

	CreativeInventoryCategories(String name, Item... items) {
		this.name = name;
		this.translation = new TranslationTextComponent("gui." + MOD_ID + "." + name);
		this.items.addAll(Arrays.asList(items));
	}

	public String getName() {
		return this.name;
	}

	public ITextComponent getTranslation() {
		return this.translation;
	}

	public ArrayList<Item> getItems(){
		return this.items;
	}
}