package org.dawnoftimebuilder.client.gui.creative;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static net.minecraft.world.item.Items.FLINT_AND_STEEL;
import static net.minecraft.world.level.block.Blocks.*;
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
            CRIMSON_PLANKS.asItem(),
            CRIMSON_STAIRS.asItem(),
            CRIMSON_PLANKS_PLATE.get().asItem(),
            CRIMSON_SLAB.asItem(),
            CRIMSON_PLANKS_EDGE.get().asItem(),
            CRIMSON_SUPPORT_SLAB.get().asItem(),
            CRIMSON_SUPPORT_BEAM.get().asItem(),
            STRIPPED_CRIMSON_STEM.asItem(),
            CRIMSON_BEAM.get().asItem(),
            CRIMSON_WALL.get().asItem(),
            CRIMSON_PERGOLA.get().asItem(),
            CRIMSON_FENCE.asItem(),
            CRIMSON_FENCE_GATE.asItem(),
            CRIMSON_LATTICE.get().asItem(),
            CRIMSON_DOOR.asItem(),
            CRIMSON_TRAPDOOR.asItem(),
            NETHER_WART_BLOCK.asItem(),
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
            MANGROVE_PLANKS.asItem(),
            MANGROVE_STAIRS.asItem(),
            MANGROVE_PLANKS_PLATE.get().asItem(),
            MANGROVE_SLAB.asItem(),
            MANGROVE_PLANKS_EDGE.get().asItem(),
            MANGROVE_SUPPORT_SLAB.get().asItem(),
            MANGROVE_SUPPORT_BEAM.get().asItem(),
            STRIPPED_MANGROVE_LOG.asItem(),
            MANGROVE_BEAM.get().asItem(),
            MANGROVE_WALL.get().asItem(),
            MANGROVE_PERGOLA.get().asItem(),
            MANGROVE_FENCE.asItem(),
            MANGROVE_FENCE_GATE.asItem(),
            MANGROVE_LATTICE.get().asItem(),
            MANGROVE_DOOR.asItem(),
            MANGROVE_TRAPDOOR.asItem(),
            MANGROVE_LEAVES.asItem(),
            CHERRY_PLANKS.asItem(),
            CHERRY_STAIRS.asItem(),
            CHERRY_PLANKS_PLATE.get().asItem(),
            CHERRY_SLAB.asItem(),
            CHERRY_PLANKS_EDGE.get().asItem(),
            CHERRY_SUPPORT_SLAB.get().asItem(),
            CHERRY_SUPPORT_BEAM.get().asItem(),
            STRIPPED_CHERRY_LOG.asItem(),
            CHERRY_BEAM.get().asItem(),
            CHERRY_WALL.get().asItem(),
            CHERRY_PERGOLA.get().asItem(),
            CHERRY_FENCE.asItem(),
            CHERRY_FENCE_GATE.asItem(),
            CHERRY_LATTICE.get().asItem(),
            CHERRY_DOOR.asItem(),
            CHERRY_TRAPDOOR.asItem(),
            CHERRY_LEAVES.asItem(),
            BAMBOO_PLANKS.asItem(),
            BAMBOO_STAIRS.asItem(),
            BAMBOO_PLANKS_PLATE.get().asItem(),
            BAMBOO_SLAB.asItem(),
            BAMBOO_PLANKS_EDGE.get().asItem(),
            BAMBOO_SUPPORT_SLAB.get().asItem(),
            BAMBOO_SUPPORT_BEAM.get().asItem(),
            BAMBOO_BLOCK.asItem(),
            STRIPPED_BAMBOO_BLOCK.asItem(),
            BAMBOO_BEAM.get().asItem(),
            BAMBOO_WALL.get().asItem(),
            BAMBOO_PERGOLA.get().asItem(),
            BAMBOO_FENCE.asItem(),
            BAMBOO_FENCE_GATE.asItem(),
            BAMBOO_LATTICE.get().asItem(),
            BAMBOO_DOOR.asItem(),
            BAMBOO_TRAPDOOR.asItem(),
            WARPED_PLANKS.asItem(),
            WARPED_STAIRS.asItem(),
            WARPED_PLANKS_PLATE.get().asItem(),
            WARPED_SLAB.asItem(),
            WARPED_PLANKS_EDGE.get().asItem(),
            WARPED_SUPPORT_SLAB.get().asItem(),
            WARPED_SUPPORT_BEAM.get().asItem(),
            STRIPPED_WARPED_STEM.asItem(),
            WARPED_BEAM.get().asItem(),
            WARPED_WALL.get().asItem(),
            WARPED_PERGOLA.get().asItem(),
            WARPED_FENCE.asItem(),
            WARPED_FENCE_GATE.asItem(),
            WARPED_LATTICE.get().asItem(),
            WARPED_DOOR.asItem(),
            WARPED_TRAPDOOR.asItem(),
            WARPED_WART_BLOCK.asItem(),
            GOLD_PLATED_SMOOTH_BLOCK.get().asItem(),
            GOLD_PLATED_SMOOTH_STAIRS.get().asItem(),
            GOLD_PLATED_SMOOTH_PLATE.get().asItem(),
            GOLD_PLATED_SMOOTH_SLAB.get().asItem(),
            GOLD_PLATED_SMOOTH_EDGE.get().asItem(),
            GOLD_PLATED_SMOOTH_WALL.get().asItem(),
            WATER_SOURCE_TRICKLE.get().asItem(),
            IRON_COLUMN.get().asItem(),
            IRON_PORTCULLIS.get().asItem(),
            WROUGHT_IRON_FENCE.get().asItem(),
            IRON_FANCY_LANTERN.get().asItem(),
            FIREPLACE.get().asItem(),
            FLINT_AND_STEEL
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
            LIMESTONE_SIDED_COLUMN.get().asItem(),
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
            ROOFING_SLATES_WALL.get().asItem(),
            CANDLESTICK.get().asItem(),
            BLACK_WROUGHT_IRON_BALUSTER.get().asItem(),
            BLACK_WROUGHT_IRON_FENCE.get().asItem(),
            REINFORCED_BLACK_WROUGHT_IRON_FENCE.get().asItem(),
            REINFORCED_GOLDEN_WROUGHT_IRON_FENCE.get().asItem(),
            GRAPE.get(),
            GRAPE_SEEDS.get(),
            BOXWOOD_BUSH.get().asItem(),
            BOXWOOD_SMALL_HEDGE.get().asItem(),
            BOXWOOD_TALL_HEDGE.get().asItem(),
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
            WAXED_OAK_FRAMED_RAMMED_DIRT_PILLAR.get().asItem(),
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
            STONE_BRICKS_MASONRY_STAIRS.get().asItem(),
            STONE_BRICKS_MASONRY_PLATE.get().asItem(),
            STONE_BRICKS_MASONRY_SLAB.get().asItem(),
            STONE_BRICKS_MASONRY_EDGE.get().asItem(),
            STONE_BRICKS_MASONRY_WALL.get().asItem(),
            STONE_BRICKS.asItem(),
            STONE_BRICK_STAIRS.asItem(),
            STONE_BRICKS_PLATE.get().asItem(),
            STONE_BRICK_SLAB.asItem(),
            STONE_BRICKS_EDGE.get().asItem(),
            STONE_BRICKS_ARROWSLIT.get().asItem(),
            STONE_BRICKS_MACHICOLATION.get().asItem(),
            FLAT_ROOF_TILES.get().asItem(),
            FLAT_ROOF_TILES_STAIRS.get().asItem(),
            FLAT_ROOF_TILES_PLATE.get().asItem(),
            FLAT_ROOF_TILES_SLAB.get().asItem(),
            FLAT_ROOF_TILES_EDGE.get().asItem(),
            FLAT_ROOF_TILES_WALL.get().asItem(),
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
            IRON_PORTCULLIS.get().asItem(),
            WROUGHT_IRON_FENCE.get().asItem(),
            STONE_BRICKS_POOL.get().asItem(),
            STONE_BRICKS_SMALL_POOL.get().asItem(),
            STONE_BRICKS_FAUCET.get().asItem(),
            STONE_BRICKS_WATER_JET.get().asItem(),
            WATER_SOURCE_TRICKLE.get().asItem(),
            GERANIUM_PINK.get().asItem(),
            PLANTER_GERANIUM_PINK.get().asItem(),
            IVY.get().asItem(),
            FLINT_AND_STEEL
    ),
    JAPANESE("japanese",
            GRAVEL.asItem(),
            STRAIGHT_RAKED_GRAVEL.get().asItem(),
            CURVED_RAKED_GRAVEL.get().asItem(),
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
            CHARRED_SPRUCE_FANCY_RAILING.get().asItem(),
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
            UNFIRED_CLAY_ROOF_TILE.get(),
            GRAY_CLAY_ROOF_TILE.get(),
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
            MAPLE_RED_SAPLING.get().asItem(),
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
            FLINT_AND_STEEL
    ),
    PERSIAN("persian",
            SMOOTH_SANDSTONE.asItem(),
            SMOOTH_SANDSTONE_STAIRS.asItem(),
            SMOOTH_SANDSTONE_PLATE.get().asItem(),
            SMOOTH_SANDSTONE_SLAB.asItem(),
            SMOOTH_SANDSTONE_EDGE.get().asItem(),
            SANDSTONE_BRICKS.get().asItem(),
            SANDSTONE_BRICKS_STAIRS.get().asItem(),
            SANDSTONE_BRICKS_PLATE.get().asItem(),
            SANDSTONE_BRICKS_SLAB.get().asItem(),
            SANDSTONE_BRICKS_EDGE.get().asItem(),
            SANDSTONE_BRICKS_WALL.get().asItem(),
            SANDSTONE_BRICKS_TURQUOISE_PATTERN.get().asItem(),
            SANDSTONE_BRICKS_TURQUOISE_PATTERN_STAIRS.get().asItem(),
            SANDSTONE_BRICKS_TURQUOISE_PATTERN_PLATE.get().asItem(),
            SANDSTONE_BRICKS_TURQUOISE_PATTERN_SLAB.get().asItem(),
            SANDSTONE_BRICKS_TURQUOISE_PATTERN_EDGE.get().asItem(),
            SANDSTONE_BRICKS_TURQUOISE_PATTERN_WALL.get().asItem(),
            SANDSTONE_SCULPTED_RELIEF.get().asItem(),
            SANDSTONE_CRENELATION.get().asItem(),
            MORAQ_MOSAIC_TRADITIONAL.get().asItem(),
            MORAQ_MOSAIC_DELICATE.get().asItem(),
            MORAQ_MOSAIC_BORDER.get().asItem(),
            MORAQ_MOSAIC_PATTERN.get().asItem(),
            MORAQ_MOSAIC_GEOMETRIC.get().asItem(),
            MORAQ_MOSAIC_RECESS.get().asItem(),
            MORAQ_MOSAIC_RELIEF.get().asItem(),
            MORAQ_MOSAIC_COLUMN.get().asItem(),
            GOLD_PLATED_SMOOTH_BLOCK.get().asItem(),
            GOLD_PLATED_SMOOTH_STAIRS.get().asItem(),
            GOLD_PLATED_SMOOTH_PLATE.get().asItem(),
            GOLD_PLATED_SMOOTH_SLAB.get().asItem(),
            GOLD_PLATED_SMOOTH_EDGE.get().asItem(),
            GOLD_PLATED_SMOOTH_WALL.get().asItem(),
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
            WAXED_OAK_LATTICE.get().asItem(),
            UNFIRED_CLAY_TILE.get(),
            CLAY_TILE.get(),
            CLAY_TILE_WHITE.get(),
            CLAY_TILE_CYAN.get(),
            CLAY_TILE_BLUE.get(),
            PERSIAN_CARPET_RED.get().asItem(),
            PERSIAN_CARPET_DELICATE_RED.get().asItem()
    ),
    PRE_COLOMBIAN("pre_columbian",
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
            SANDSTONE_SIDED_COLUMN.get().asItem(),
            ROMAN_FRESCO_BLACK.get().asItem(),
            ROMAN_FRESCO_RED.get().asItem(),
            COVERED_SANDSTONE_WALL.get().asItem(),
            OCHRE_ROOF_TILES.get().asItem(),
            OCHRE_ROOF_TILES_STAIRS.get().asItem(),
            OCHRE_ROOF_TILES_PLATE.get().asItem(),
            OCHRE_ROOF_TILES_SLAB.get().asItem(),
            OCHRE_ROOF_TILES_EDGE.get().asItem(),
            OCHRE_ROOF_TILES_WALL.get().asItem(),
            MARBLE_COLUMN.get().asItem(),
            MARBLE_SIDED_COLUMN.get().asItem(),
            MARBLE_COFFER.get().asItem(),
            MARBLE_COFFER_SLAB.get().asItem(),
            TERRACOTTA_WALL.get().asItem(),
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
            BIRCH_FANCY_FENCE.get().asItem(),
            BIRCH_FOOTSTOOL.get().asItem(),
            BIRCH_COUCH.get().asItem(),
            UNFIRED_CLAY_TILE.get(),
            CLAY_TILE.get(),
            CLAY_TILE_ORANGE.get(),
            CLAY_TILE_BLACK.get(),
            BIG_FLOWER_POT.get().asItem(),
            MARBLE_FANCY_FENCE.get().asItem(),
            MARBLE_BIG_FLOWER_POT.get().asItem(),
            GERANIUM_PINK.get().asItem(),
            PLANTER_GERANIUM_PINK.get().asItem(),
            CYPRESS.get().asItem(),
            WILD_GRAPE.get().asItem(),
            GRAPE.get(),
            GRAPE_SEEDS.get()
    );

    private final String name;
    private final Component translation;
    private final ArrayList<Item> items = new ArrayList<>();

    CreativeInventoryCategories(String name, Item... items) {
        this.name = name;
        this.translation = Component.translatable("gui." + MOD_ID + "." + name);
        this.items.addAll(Arrays.asList(items));
    }

    public String getName() {
        return this.name;
    }

    public Component getTranslation() {
        return this.translation;
    }

    public List<Item> getItems() {
        return this.items;
    }
}