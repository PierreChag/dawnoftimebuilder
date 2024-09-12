package org.dawnoftimebuilder.client.gui.creative;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import org.dawnoftimebuilder.registry.DoTBBlocksRegistry;
import org.dawnoftimebuilder.registry.DoTBItemsRegistry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.dawnoftimebuilder.DoTBCommon.MOD_ID;

public enum CreativeInventoryCategories {
    GENERAL("general",
            DoTBBlocksRegistry.INSTANCE.RAMMED_DIRT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_BAMBOO.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_BAMBOO_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_BAMBOO_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_BAMBOO_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_BAMBOO_EDGE.get().asItem(),
            Blocks.ACACIA_PLANKS.asItem(),
            Blocks.ACACIA_STAIRS.asItem(),
            DoTBBlocksRegistry.INSTANCE.ACACIA_PLANKS_PLATE.get().asItem(),
            Blocks.ACACIA_SLAB.asItem(),
            DoTBBlocksRegistry.INSTANCE.ACACIA_PLANKS_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.ACACIA_SUPPORT_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.ACACIA_SUPPORT_BEAM.get().asItem(),
            Blocks.STRIPPED_ACACIA_LOG.asItem(),
            DoTBBlocksRegistry.INSTANCE.ACACIA_BEAM.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.ACACIA_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.ACACIA_PERGOLA.get().asItem(),
            Blocks.ACACIA_FENCE.asItem(),
            Blocks.ACACIA_FENCE_GATE.asItem(),
            DoTBBlocksRegistry.INSTANCE.ACACIA_LATTICE.get().asItem(),
            Blocks.ACACIA_DOOR.asItem(),
            Blocks.ACACIA_TRAPDOOR.asItem(),
            Blocks.ACACIA_LEAVES.asItem(),
            Blocks.BIRCH_PLANKS.asItem(),
            Blocks.BIRCH_STAIRS.asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_PLANKS_PLATE.get().asItem(),
            Blocks.BIRCH_SLAB.asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_PLANKS_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_SUPPORT_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_SUPPORT_BEAM.get().asItem(),
            Blocks.STRIPPED_BIRCH_LOG.asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_BEAM.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_PERGOLA.get().asItem(),
            Blocks.BIRCH_FENCE.asItem(),
            Blocks.BIRCH_FENCE_GATE.asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_LATTICE.get().asItem(),
            Blocks.BIRCH_DOOR.asItem(),
            Blocks.BIRCH_TRAPDOOR.asItem(),
            Blocks.BIRCH_LEAVES.asItem(),
            Blocks.CRIMSON_PLANKS.asItem(),
            Blocks.CRIMSON_STAIRS.asItem(),
            DoTBBlocksRegistry.INSTANCE.CRIMSON_PLANKS_PLATE.get().asItem(),
            Blocks.CRIMSON_SLAB.asItem(),
            DoTBBlocksRegistry.INSTANCE.CRIMSON_PLANKS_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CRIMSON_SUPPORT_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CRIMSON_SUPPORT_BEAM.get().asItem(),
            Blocks.STRIPPED_CRIMSON_STEM.asItem(),
            DoTBBlocksRegistry.INSTANCE.CRIMSON_BEAM.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CRIMSON_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CRIMSON_PERGOLA.get().asItem(),
            Blocks.CRIMSON_FENCE.asItem(),
            Blocks.CRIMSON_FENCE_GATE.asItem(),
            DoTBBlocksRegistry.INSTANCE.CRIMSON_LATTICE.get().asItem(),
            Blocks.CRIMSON_DOOR.asItem(),
            Blocks.CRIMSON_TRAPDOOR.asItem(),
            Blocks.NETHER_WART_BLOCK.asItem(),
            Blocks.DARK_OAK_PLANKS.asItem(),
            Blocks.DARK_OAK_STAIRS.asItem(),
            DoTBBlocksRegistry.INSTANCE.DARK_OAK_PLANKS_PLATE.get().asItem(),
            Blocks.DARK_OAK_SLAB.asItem(),
            DoTBBlocksRegistry.INSTANCE.DARK_OAK_PLANKS_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.DARK_OAK_SUPPORT_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.DARK_OAK_SUPPORT_BEAM.get().asItem(),
            Blocks.STRIPPED_DARK_OAK_LOG.asItem(),
            DoTBBlocksRegistry.INSTANCE.DARK_OAK_BEAM.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.DARK_OAK_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.DARK_OAK_PERGOLA.get().asItem(),
            Blocks.DARK_OAK_FENCE.asItem(),
            Blocks.DARK_OAK_FENCE_GATE.asItem(),
            DoTBBlocksRegistry.INSTANCE.DARK_OAK_LATTICE.get().asItem(),
            Blocks.DARK_OAK_DOOR.asItem(),
            Blocks.DARK_OAK_TRAPDOOR.asItem(),
            Blocks.DARK_OAK_LEAVES.asItem(),
            Blocks.JUNGLE_PLANKS.asItem(),
            Blocks.JUNGLE_STAIRS.asItem(),
            DoTBBlocksRegistry.INSTANCE.JUNGLE_PLANKS_PLATE.get().asItem(),
            Blocks.JUNGLE_SLAB.asItem(),
            DoTBBlocksRegistry.INSTANCE.JUNGLE_PLANKS_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.JUNGLE_SUPPORT_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.JUNGLE_SUPPORT_BEAM.get().asItem(),
            Blocks.STRIPPED_JUNGLE_LOG.asItem(),
            DoTBBlocksRegistry.INSTANCE.JUNGLE_BEAM.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.JUNGLE_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.JUNGLE_PERGOLA.get().asItem(),
            Blocks.JUNGLE_FENCE.asItem(),
            Blocks.JUNGLE_FENCE_GATE.asItem(),
            DoTBBlocksRegistry.INSTANCE.JUNGLE_LATTICE.get().asItem(),
            Blocks.JUNGLE_DOOR.asItem(),
            Blocks.JUNGLE_TRAPDOOR.asItem(),
            Blocks.JUNGLE_LEAVES.asItem(),
            Blocks.OAK_PLANKS.asItem(),
            Blocks.OAK_STAIRS.asItem(),
            DoTBBlocksRegistry.INSTANCE.OAK_PLANKS_PLATE.get().asItem(),
            Blocks.OAK_SLAB.asItem(),
            DoTBBlocksRegistry.INSTANCE.OAK_PLANKS_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.OAK_SUPPORT_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.OAK_SUPPORT_BEAM.get().asItem(),
            Blocks.STRIPPED_OAK_LOG.asItem(),
            DoTBBlocksRegistry.INSTANCE.OAK_BEAM.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.OAK_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.OAK_PERGOLA.get().asItem(),
            Blocks.OAK_FENCE.asItem(),
            Blocks.OAK_FENCE_GATE.asItem(),
            DoTBBlocksRegistry.INSTANCE.OAK_LATTICE.get().asItem(),
            Blocks.OAK_DOOR.asItem(),
            Blocks.OAK_TRAPDOOR.asItem(),
            Blocks.OAK_LEAVES.asItem(),
            Blocks.SPRUCE_PLANKS.asItem(),
            Blocks.SPRUCE_STAIRS.asItem(),
            DoTBBlocksRegistry.INSTANCE.SPRUCE_PLANKS_PLATE.get().asItem(),
            Blocks.SPRUCE_SLAB.asItem(),
            DoTBBlocksRegistry.INSTANCE.SPRUCE_PLANKS_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SPRUCE_SUPPORT_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SPRUCE_SUPPORT_BEAM.get().asItem(),
            Blocks.STRIPPED_SPRUCE_LOG.asItem(),
            DoTBBlocksRegistry.INSTANCE.SPRUCE_BEAM.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SPRUCE_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SPRUCE_PERGOLA.get().asItem(),
            Blocks.SPRUCE_FENCE.asItem(),
            Blocks.SPRUCE_FENCE_GATE.asItem(),
            DoTBBlocksRegistry.INSTANCE.SPRUCE_LATTICE.get().asItem(),
            Blocks.SPRUCE_DOOR.asItem(),
            Blocks.SPRUCE_TRAPDOOR.asItem(),
            Blocks.SPRUCE_LEAVES.asItem(),
            Blocks.WARPED_PLANKS.asItem(),
            Blocks.WARPED_STAIRS.asItem(),
            DoTBBlocksRegistry.INSTANCE.WARPED_PLANKS_PLATE.get().asItem(),
            Blocks.WARPED_SLAB.asItem(),
            DoTBBlocksRegistry.INSTANCE.WARPED_PLANKS_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WARPED_SUPPORT_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WARPED_SUPPORT_BEAM.get().asItem(),
            Blocks.STRIPPED_WARPED_STEM.asItem(),
            DoTBBlocksRegistry.INSTANCE.WARPED_BEAM.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WARPED_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WARPED_PERGOLA.get().asItem(),
            Blocks.WARPED_FENCE.asItem(),
            Blocks.WARPED_FENCE_GATE.asItem(),
            DoTBBlocksRegistry.INSTANCE.WARPED_LATTICE.get().asItem(),
            Blocks.WARPED_DOOR.asItem(),
            Blocks.WARPED_TRAPDOOR.asItem(),
            Blocks.WARPED_WART_BLOCK.asItem(),
            DoTBBlocksRegistry.INSTANCE.GOLD_PLATED_SMOOTH_BLOCK.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GOLD_PLATED_SMOOTH_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GOLD_PLATED_SMOOTH_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GOLD_PLATED_SMOOTH_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GOLD_PLATED_SMOOTH_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GOLD_PLATED_SMOOTH_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WATER_SOURCE_TRICKLE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.IRON_COLUMN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.IRON_PORTCULLIS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WROUGHT_IRON_FENCE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.IRON_FANCY_LANTERN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.FIREPLACE.get().asItem(),
            Items.FLINT_AND_STEEL
    ),
    FRENCH("french",
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RAMMED_DIRT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.COBBLED_LIMESTONE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.LIMESTONE_BRICKS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.LIMESTONE_BRICKS_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.LIMESTONE_BRICKS_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.LIMESTONE_BRICKS_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.LIMESTONE_BRICKS_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.LIMESTONE_SIDED_COLUMN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.LIMESTONE_BRICKS_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.LIMESTONE_BALUSTER.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.LIMESTONE_GARGOYLE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.FIREPLACE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.LIMESTONE_FIREPLACE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.LIMESTONE_CHIMNEY.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.ROOFING_SLATES.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.ROOFING_SLATES_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.ROOFING_SLATES_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.ROOFING_SLATES_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.ROOFING_SLATES_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.ROOFING_SLATES_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CANDLESTICK.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.BLACK_WROUGHT_IRON_BALUSTER.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.BLACK_WROUGHT_IRON_FENCE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.REINFORCED_BLACK_WROUGHT_IRON_FENCE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.REINFORCED_GOLDEN_WROUGHT_IRON_FENCE.get().asItem(),
            DoTBItemsRegistry.INSTANCE.GRAPE.get(),
            DoTBItemsRegistry.INSTANCE.GRAPE_SEEDS.get(),
            DoTBBlocksRegistry.INSTANCE.BOXWOOD_BUSH.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.BOXWOOD_SMALL_HEDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.BOXWOOD_TALL_HEDGE.get().asItem(),
            Items.FLINT_AND_STEEL
    ),
    GERMAN("german",
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RAMMED_DIRT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_FRAMED_RAMMED_DIRT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_FRAMED_RAMMED_DIRT_PILLAR.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_TIMBER_FRAME.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_TIMBER_FRAME_PILLAR.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_TIMBER_FRAME_CORNER.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_TIMBER_FRAME_CROSSED.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_TIMBER_FRAME_SQUARED.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_PLANKS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_PLANKS_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_PLANKS_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_PLANKS_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_PLANKS_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_SUPPORT_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_SUPPORT_BEAM.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_LOG_STRIPPED.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_BEAM.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_PERGOLA.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_FENCE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_FENCE_GATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_BALUSTER.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_LATTICE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_DOOR.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_TRAPDOOR.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_SMALL_SHUTTER.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_SHUTTER.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_BRICKS_MASONRY.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_BRICKS_MASONRY_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_BRICKS_MASONRY_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_BRICKS_MASONRY_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_BRICKS_MASONRY_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_BRICKS_MASONRY_WALL.get().asItem(),
            Blocks.STONE_BRICKS.asItem(),
            Blocks.STONE_BRICK_STAIRS.asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_BRICKS_PLATE.get().asItem(),
            Blocks.STONE_BRICK_SLAB.asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_BRICKS_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_BRICKS_ARROWSLIT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_BRICKS_MACHICOLATION.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.FLAT_ROOF_TILES.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.FLAT_ROOF_TILES_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.FLAT_ROOF_TILES_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.FLAT_ROOF_TILES_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.FLAT_ROOF_TILES_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.FLAT_ROOF_TILES_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.LATTICE_GLASS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.LATTICE_GLASS_PANE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.LATTICE_WAXED_OAK_WINDOW.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.LATTICE_STONE_BRICKS_WINDOW.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.FIREPLACE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_BRICKS_FIREPLACE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_BRICKS_CHIMNEY.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CANDLESTICK.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_CHANDELIER.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_TABLE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_CHAIR.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.IRON_PORTCULLIS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WROUGHT_IRON_FENCE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_BRICKS_POOL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_BRICKS_SMALL_POOL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_BRICKS_FAUCET.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_BRICKS_WATER_JET.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WATER_SOURCE_TRICKLE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GERANIUM_PINK.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PLANTER_GERANIUM_PINK.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.IVY.get().asItem(),
            Items.FLINT_AND_STEEL
    ),
    JAPANESE("japanese",
            Blocks.GRAVEL.asItem(),
            DoTBBlocksRegistry.INSTANCE.STRAIGHT_RAKED_GRAVEL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CURVED_RAKED_GRAVEL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STEPPING_STONES.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STEPPING_STONES_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_BAMBOO.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_BAMBOO_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_BAMBOO_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_BAMBOO_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_BAMBOO_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RAMMED_DIRT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_PLANKS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_PLANKS_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_PLANKS_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_PLANKS_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_PLANKS_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_SUPPORT_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_SUPPORT_BEAM.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_FOUNDATION.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_FOUNDATION_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_BOARDS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_LOG_STRIPPED.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_BEAM.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_PERGOLA.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_FENCE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_FENCE_GATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_RAILING.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_FANCY_RAILING.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_LATTICE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_DOOR.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_TRAPDOOR.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_SHUTTERS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_TALL_SHUTTERS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_ROOF_SUPPORT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_TIMBER_FRAME.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHARRED_SPRUCE_TIMBER_FRAME_PILLAR.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GRAY_ROOF_TILES.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GRAY_ROOF_TILES_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GRAY_ROOF_TILES_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GRAY_ROOF_TILES_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GRAY_ROOF_TILES_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GRAY_ROOF_TILES_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PAPER_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PAPER_WALL_FLAT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PAPER_WALL_WINDOWS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PAPER_WALL_FLOWERY.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PAPER_DOOR.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RED_PAINTED_BEAM.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PAPER_FOLDING_SCREEN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.FIREPLACE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.IRORI_FIREPLACE.get().asItem(),
            DoTBItemsRegistry.INSTANCE.UNFIRED_CLAY_ROOF_TILE.get(),
            DoTBItemsRegistry.INSTANCE.GRAY_CLAY_ROOF_TILE.get(),
            DoTBBlocksRegistry.INSTANCE.WHITE_LITTLE_FLAG.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RED_PAPER_LANTERN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PAPER_LAMP.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.STONE_LANTERN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SMALL_TATAMI_MAT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.TATAMI_MAT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.LIGHT_GRAY_FUTON.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SPRUCE_LOW_TABLE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SPRUCE_LEGLESS_CHAIR.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.IKEBANA_FLOWER_POT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SAKE_BOTTLE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SAKE_CUP.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CAST_IRON_TEAPOT_GRAY.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CAST_IRON_TEACUP_GRAY.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CAST_IRON_TEAPOT_GREEN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CAST_IRON_TEACUP_GREEN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CAST_IRON_TEAPOT_DECORATED.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CAST_IRON_TEACUP_DECORATED.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MAPLE_RED_SAPLING.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.BAMBOO_DRYING_TRAY.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CAMELLIA.get().asItem(),
            DoTBItemsRegistry.INSTANCE.CAMELLIA_LEAVES.get(),
            DoTBItemsRegistry.INSTANCE.TEA_LEAVES.get(),
            DoTBBlocksRegistry.INSTANCE.STICK_BUNDLE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MULBERRY.get().asItem(),
            DoTBItemsRegistry.INSTANCE.MULBERRY_LEAVES.get(),
            DoTBItemsRegistry.INSTANCE.SILK_WORM_EGGS.get(),
            DoTBItemsRegistry.INSTANCE.SILK_WORMS_HATCHERY.get(),
            DoTBItemsRegistry.INSTANCE.SILK_WORMS.get(),
            DoTBItemsRegistry.INSTANCE.SILK_COCOONS.get(),
            DoTBItemsRegistry.INSTANCE.SILK.get(),
            DoTBBlocksRegistry.INSTANCE.RICE.get().asItem(),
            Items.FLINT_AND_STEEL
    ),
    PERSIAN("persian",
            Blocks.SMOOTH_SANDSTONE.asItem(),
            Blocks.SMOOTH_SANDSTONE_STAIRS.asItem(),
            DoTBBlocksRegistry.INSTANCE.SMOOTH_SANDSTONE_PLATE.get().asItem(),
            Blocks.SMOOTH_SANDSTONE_SLAB.asItem(),
            DoTBBlocksRegistry.INSTANCE.SMOOTH_SANDSTONE_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_BRICKS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_BRICKS_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_BRICKS_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_BRICKS_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_BRICKS_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_BRICKS_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_BRICKS_TURQUOISE_PATTERN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_BRICKS_TURQUOISE_PATTERN_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_BRICKS_TURQUOISE_PATTERN_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_BRICKS_TURQUOISE_PATTERN_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_BRICKS_TURQUOISE_PATTERN_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_BRICKS_TURQUOISE_PATTERN_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_SCULPTED_RELIEF.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_CRENELATION.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MORAQ_MOSAIC_TRADITIONAL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MORAQ_MOSAIC_DELICATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MORAQ_MOSAIC_BORDER.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MORAQ_MOSAIC_PATTERN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MORAQ_MOSAIC_GEOMETRIC.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MORAQ_MOSAIC_RECESS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MORAQ_MOSAIC_RELIEF.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MORAQ_MOSAIC_COLUMN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GOLD_PLATED_SMOOTH_BLOCK.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GOLD_PLATED_SMOOTH_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GOLD_PLATED_SMOOTH_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GOLD_PLATED_SMOOTH_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GOLD_PLATED_SMOOTH_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GOLD_PLATED_SMOOTH_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_PLANKS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_PLANKS_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_PLANKS_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_PLANKS_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_PLANKS_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_SUPPORT_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_SUPPORT_BEAM.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_LOG_STRIPPED.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_BEAM.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_PERGOLA.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_FENCE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_FENCE_GATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WAXED_OAK_LATTICE.get().asItem(),
            DoTBItemsRegistry.INSTANCE.UNFIRED_CLAY_TILE.get(),
            DoTBItemsRegistry.INSTANCE.CLAY_TILE.get(),
            DoTBItemsRegistry.INSTANCE.CLAY_TILE_WHITE.get(),
            DoTBItemsRegistry.INSTANCE.CLAY_TILE_CYAN.get(),
            DoTBItemsRegistry.INSTANCE.CLAY_TILE_BLUE.get(),
            DoTBBlocksRegistry.INSTANCE.PERSIAN_CARPET_RED.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PERSIAN_CARPET_DELICATE_RED.get().asItem()
    ),
    PRE_COLOMBIAN("pre_columbian",
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.THATCH_WHEAT_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RAMMED_DIRT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PLASTERED_STONE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PLASTERED_STONE_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PLASTERED_STONE_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PLASTERED_STONE_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PLASTERED_STONE_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RED_PLASTERED_STONE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RED_PLASTERED_STONE_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RED_PLASTERED_STONE_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RED_PLASTERED_STONE_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RED_PLASTERED_STONE_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RED_ORNAMENTED_PLASTERED_STONE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHISELED_PLASTERED_STONE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CHISELED_PLASTERED_STONE_FRIEZE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.ORNAMENTED_CHISELED_PLASTERED_STONE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RED_CHISELED_PLASTERED_STONE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RED_ORNAMENTED_CHISELED_PLASTERED_STONE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RED_PLASTERED_STONE_FRIEZE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RED_ORNAMENTED_PLASTERED_STONE_FRIEZE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RED_SCULPTED_PLASTERED_STONE_FRIEZE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.RED_SMALL_PLASTERED_STONE_FRIEZE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GREEN_CHISELED_PLASTERED_STONE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GREEN_ORNAMENTED_CHISELED_PLASTERED_STONE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GREEN_PLASTERED_STONE_FRIEZE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GREEN_ORNAMENTED_PLASTERED_STONE_FRIEZE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GREEN_SCULPTED_PLASTERED_STONE_FRIEZE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GREEN_SMALL_PLASTERED_STONE_FRIEZE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PLASTERED_STONE_COLUMN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PLASTERED_STONE_WINDOW.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PLASTERED_STONE_CRESSET.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.FEATHERED_SERPENT_SCULPTURE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SERPENT_SCULPTED_COLUMN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.COMMELINA.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WILD_MAIZE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MAIZE.get().asItem(),
            Items.FLINT_AND_STEEL
    ),
    ROMAN("roman",
            Blocks.SANDSTONE.asItem(),
            Blocks.SANDSTONE_STAIRS.asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_PLATE.get().asItem(),
            Blocks.SANDSTONE_SLAB.asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_EDGE.get().asItem(),
            Blocks.SANDSTONE_WALL.asItem(),
            Blocks.CUT_SANDSTONE.asItem(),
            DoTBBlocksRegistry.INSTANCE.CUT_SANDSTONE_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CUT_SANDSTONE_PLATE.get().asItem(),
            Blocks.CUT_SANDSTONE_SLAB.asItem(),
            DoTBBlocksRegistry.INSTANCE.CUT_SANDSTONE_EDGE.get().asItem(),
            Blocks.SMOOTH_SANDSTONE.asItem(),
            Blocks.SMOOTH_SANDSTONE_STAIRS.asItem(),
            DoTBBlocksRegistry.INSTANCE.SMOOTH_SANDSTONE_PLATE.get().asItem(),
            Blocks.SMOOTH_SANDSTONE_SLAB.asItem(),
            DoTBBlocksRegistry.INSTANCE.SMOOTH_SANDSTONE_EDGE.get().asItem(),
            Blocks.CHISELED_SANDSTONE.asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_COLUMN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.SANDSTONE_SIDED_COLUMN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.ROMAN_FRESCO_BLACK.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.ROMAN_FRESCO_RED.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.COVERED_SANDSTONE_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.OCHRE_ROOF_TILES.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.OCHRE_ROOF_TILES_STAIRS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.OCHRE_ROOF_TILES_PLATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.OCHRE_ROOF_TILES_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.OCHRE_ROOF_TILES_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.OCHRE_ROOF_TILES_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MARBLE_COLUMN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MARBLE_SIDED_COLUMN.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MARBLE_COFFER.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MARBLE_COFFER_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.TERRACOTTA_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MOSAIC_FLOOR.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MOSAIC_FLOOR_DELICATE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MOSAIC_FLOOR_ROSETTE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MARBLE_STATUE_MARS.get().asItem(),
            Blocks.BIRCH_PLANKS.asItem(),
            Blocks.BIRCH_STAIRS.asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_PLANKS_PLATE.get().asItem(),
            Blocks.BIRCH_SLAB.asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_PLANKS_EDGE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_SUPPORT_SLAB.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_SUPPORT_BEAM.get().asItem(),
            Blocks.STRIPPED_BIRCH_LOG.asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_BEAM.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_WALL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_PERGOLA.get().asItem(),
            Blocks.BIRCH_FENCE.asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_LATTICE.get().asItem(),
            Blocks.BIRCH_DOOR.asItem(),
            Blocks.BIRCH_TRAPDOOR.asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_FANCY_FENCE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_FOOTSTOOL.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.BIRCH_COUCH.get().asItem(),
            DoTBItemsRegistry.INSTANCE.UNFIRED_CLAY_TILE.get(),
            DoTBItemsRegistry.INSTANCE.CLAY_TILE.get(),
            DoTBItemsRegistry.INSTANCE.CLAY_TILE_ORANGE.get(),
            DoTBItemsRegistry.INSTANCE.CLAY_TILE_BLACK.get(),
            DoTBBlocksRegistry.INSTANCE.BIG_FLOWER_POT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MARBLE_FANCY_FENCE.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.MARBLE_BIG_FLOWER_POT.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.GERANIUM_PINK.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.PLANTER_GERANIUM_PINK.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.CYPRESS.get().asItem(),
            DoTBBlocksRegistry.INSTANCE.WILD_GRAPE.get().asItem(),
            DoTBItemsRegistry.INSTANCE.GRAPE.get(),
            DoTBItemsRegistry.INSTANCE.GRAPE_SEEDS.get()
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