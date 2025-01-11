package org.dawnoftimebuilder.registry;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import org.dawnoftimebuilder.block.french.*;
import org.dawnoftimebuilder.block.general.*;
import org.dawnoftimebuilder.block.german.*;
import org.dawnoftimebuilder.block.japanese.*;
import org.dawnoftimebuilder.block.templates.LanternBlock;
import org.dawnoftimebuilder.block.persian.MoraqMosaicColumnBlock;
import org.dawnoftimebuilder.block.precolumbian.*;
import org.dawnoftimebuilder.block.roman.*;
import org.dawnoftimebuilder.block.templates.*;
import org.dawnoftimebuilder.item.IHasFlowerPot;
import org.dawnoftimebuilder.item.templates.PotAndBlockItem;
import org.dawnoftimebuilder.item.templates.SoilSeedsItem;
import org.dawnoftimebuilder.util.Foods;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

import static org.dawnoftimebuilder.util.VoxelShapes.*;

@SuppressWarnings({"unused", "unchecked"})
public abstract class DoTBBlocksRegistry {
    public static DoTBBlocksRegistry INSTANCE;
    public static Map<TagKey<Block>, Set<Supplier<Block>>> blockTagsMap = new HashMap<>();
    public static final HashMap<String, Block> POT_BLOCKS = new HashMap<>();
    public final Supplier<Block> ACACIA_PLANKS_EDGE = register("acacia_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> ACACIA_PLANKS_PLATE = register("acacia_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> ACACIA_PERGOLA = register("acacia_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> ACACIA_LATTICE = register("acacia_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> ACACIA_BEAM = register("acacia_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> ACACIA_WALL = register("acacia_wall", () -> new WallBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> ACACIA_SUPPORT_BEAM = register("acacia_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> ACACIA_SUPPORT_SLAB = register("acacia_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BAMBOO_PLANKS_EDGE = register("bamboo_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BAMBOO_PLANKS_PLATE = register("bamboo_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BAMBOO_PERGOLA = register("bamboo_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BAMBOO_LATTICE = register("bamboo_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BAMBOO_BEAM = register("bamboo_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BAMBOO_WALL = register("bamboo_wall", () -> new WallBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BAMBOO_SUPPORT_BEAM = register("bamboo_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BAMBOO_SUPPORT_SLAB = register("bamboo_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_PLANKS_EDGE = register("birch_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_PLANKS_PLATE = register("birch_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_PERGOLA = register("birch_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_LATTICE = register("birch_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_BEAM = register("birch_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_WALL = register("birch_wall", () -> new WallBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_SUPPORT_BEAM = register("birch_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_SUPPORT_SLAB = register("birch_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CANDLESTICK = register("candlestick", () -> new CandlestickBlock(Block.Properties.copy(Blocks.CAULDRON).lightLevel(litBlockEmission(10)), CANDLESTICK_SHAPES));
    public final Supplier<Block> CHERRY_PLANKS_EDGE = register("cherry_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHERRY_PLANKS_PLATE = register("cherry_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHERRY_PERGOLA = register("cherry_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHERRY_LATTICE = register("cherry_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHERRY_BEAM = register("cherry_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHERRY_WALL = register("cherry_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHERRY_SUPPORT_BEAM = register("cherry_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHERRY_SUPPORT_SLAB = register("cherry_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CRIMSON_PLANKS_EDGE = register("crimson_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CRIMSON_PLANKS_PLATE = register("crimson_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CRIMSON_PERGOLA = register("crimson_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CRIMSON_SUPPORT_SLAB = register("crimson_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CRIMSON_LATTICE = register("crimson_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CRIMSON_BEAM = register("crimson_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CRIMSON_SUPPORT_BEAM = register("crimson_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CRIMSON_WALL = register("crimson_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_PLANKS_EDGE = register("dark_oak_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_PLANKS_PLATE = register("dark_oak_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_PERGOLA = register("dark_oak_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_LATTICE = register("dark_oak_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_BEAM = register("dark_oak_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_WALL = register("dark_oak_wall", () -> new WallBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_SUPPORT_BEAM = register("dark_oak_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_SUPPORT_SLAB = register("dark_oak_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_PLANKS_EDGE = register("jungle_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_PLANKS_PLATE = register("jungle_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_PERGOLA = register("jungle_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_LATTICE = register("jungle_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_BEAM = register("jungle_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_WALL = register("jungle_wall", () -> new WallBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_SUPPORT_BEAM = register("jungle_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_SUPPORT_SLAB = register("jungle_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_PLANKS_EDGE = register("mangrove_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_PLANKS_PLATE = register("mangrove_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_PERGOLA = register("mangrove_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_LATTICE = register("mangrove_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_BEAM = register("mangrove_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_WALL = register("mangrove_wall", () -> new WallBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_SUPPORT_BEAM = register("mangrove_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_SUPPORT_SLAB = register("mangrove_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_PLANKS_PLATE = register("oak_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_PLANKS_EDGE = register("oak_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_PERGOLA = register("oak_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_LATTICE = register("oak_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_BEAM = register("oak_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_WALL = register("oak_wall", () -> new WallBlock(Block.Properties.copy(Blocks.OAK_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_SUPPORT_BEAM = register("oak_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_SUPPORT_SLAB = register("oak_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> RAMMED_DIRT = register("rammed_dirt", () -> new BlockAA(Block.Properties.copy(Blocks.TERRACOTTA)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> SPRUCE_PLANKS_EDGE = register("spruce_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_PLANKS_PLATE = register("spruce_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_PERGOLA = register("spruce_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_LATTICE = register("spruce_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_BEAM = register("spruce_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_WALL = register("spruce_wall", () -> new WallBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_SUPPORT_BEAM = register("spruce_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_SUPPORT_SLAB = register("spruce_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> THATCH_WHEAT = register("thatch_wheat", () -> new BlockAA(Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(80, 30), BlockTags.MINEABLE_WITH_HOE);
    public final Supplier<Block> THATCH_WHEAT_EDGE = register("thatch_wheat_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(80, 30), BlockTags.MINEABLE_WITH_HOE);
    public final Supplier<Block> THATCH_WHEAT_PLATE = register("thatch_wheat_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(80, 30), BlockTags.MINEABLE_WITH_HOE);
    public final Supplier<Block> THATCH_WHEAT_SLAB = register("thatch_wheat_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(80, 30), BlockTags.MINEABLE_WITH_HOE);
    public Supplier<Block> THATCH_WHEAT_STAIRS;
    public final Supplier<Block> THATCH_BAMBOO = register("thatch_bamboo", () -> new BlockAA(Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(40, 30), BlockTags.MINEABLE_WITH_HOE);
    public final Supplier<Block> THATCH_BAMBOO_EDGE = register("thatch_bamboo_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(40, 30), BlockTags.MINEABLE_WITH_HOE);
    public final Supplier<Block> THATCH_BAMBOO_PLATE = register("thatch_bamboo_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(40, 30), BlockTags.MINEABLE_WITH_HOE);
    public final Supplier<Block> THATCH_BAMBOO_SLAB = register("thatch_bamboo_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(40, 30), BlockTags.MINEABLE_WITH_HOE);
    public Supplier<Block> THATCH_BAMBOO_STAIRS;
    public final Supplier<Block> WARPED_PLANKS_EDGE = register("warped_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WARPED_PLANKS_PLATE = register("warped_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WARPED_SUPPORT_SLAB = register("warped_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WARPED_PERGOLA = register("warped_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WARPED_LATTICE = register("warped_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WARPED_BEAM = register("warped_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WARPED_SUPPORT_BEAM = register("warped_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WARPED_WALL = register("warped_wall", () -> new WallBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> GOLD_PLATED_SMOOTH_BLOCK = register("gold_plated_smooth_block", () -> new BlockAA(Block.Properties.copy(Blocks.GOLD_BLOCK)));
    public Supplier<Block> GOLD_PLATED_SMOOTH_STAIRS;
    public final Supplier<Block> GOLD_PLATED_SMOOTH_PLATE = register("gold_plated_smooth_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.GOLD_BLOCK)));
    public final Supplier<Block> GOLD_PLATED_SMOOTH_SLAB = register("gold_plated_smooth_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.GOLD_BLOCK)));
    public final Supplier<Block> GOLD_PLATED_SMOOTH_EDGE = register("gold_plated_smooth_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.GOLD_BLOCK)));
    public final Supplier<Block> GOLD_PLATED_SMOOTH_WALL = register("gold_plated_smooth_wall", () -> new WallBlock(Block.Properties.copy(Blocks.GOLD_BLOCK)));
    public final Supplier<Block> FIREPLACE = register("fireplace", () -> new FireplaceBlock(Block.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F).lightLevel(DoTBBlocksRegistry.litBlockEmission(15))));
    public final Supplier<Block> IRON_PORTCULLIS = register("iron_portcullis", () -> new PortcullisBlock(Block.Properties.copy(Blocks.IRON_DOOR)));
    public final Supplier<Block> IRON_FANCY_LANTERN = register("iron_fancy_lantern", () -> new LanternBlock(Block.Properties.copy(Blocks.IRON_BARS).noOcclusion().lightLevel(state -> 15), IRON_FANCY_LANTERN_SHAPES));
    public final Supplier<Block> IRON_COLUMN = register("iron_column", () -> new IronColumnBlock(Block.Properties.copy(Blocks.IRON_BARS)));
    public final Supplier<Block> WROUGHT_IRON_FENCE = register("wrought_iron_fence", () -> new IronFenceBlock(Block.Properties.copy(Blocks.IRON_BARS)));
    public final Supplier<Block> WATER_FLOWING_TRICKLE = registerWithItem("water_flowing_trickle", () -> new WaterFlowingTrickleBlock(Block.Properties.copy(Blocks.WATER).randomTicks()), null);
    public final Supplier<Block> WATER_SOURCE_TRICKLE = register("water_source_trickle", () -> new WaterSourceTrickleBlock(Block.Properties.copy(Blocks.SEAGRASS).randomTicks()));
    // French
    public final Supplier<Block> COBBLED_LIMESTONE = register("cobbled_limestone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> LIMESTONE_BRICKS = register("limestone_bricks", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> LIMESTONE_BRICKS_EDGE = register("limestone_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> LIMESTONE_BRICKS_PLATE = register("limestone_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> LIMESTONE_BRICKS_SLAB = register("limestone_bricks_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public Supplier<Block> LIMESTONE_BRICKS_STAIRS;
    public final Supplier<Block> LIMESTONE_BRICKS_WALL = register("limestone_bricks_wall", () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> LIMESTONE_BALUSTER = register("limestone_baluster", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion()));
    public final Supplier<Block> LIMESTONE_SIDED_COLUMN = register("limestone_sided_column", () -> new ConnectedVerticalSidedBlock(Block.Properties.copy(Blocks.STONE_BRICKS), LIMESTONE_SIDED_COLUMN_SHAPES));
    public final Supplier<Block> LIMESTONE_GARGOYLE = register("limestone_gargoyle", () -> new LimestoneGargoyleBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion().randomTicks()));
    public final Supplier<Block> LIMESTONE_CHIMNEY = register("limestone_chimney", () -> new AxisChimneyBlock(Block.Properties.copy(Blocks.STONE_BRICKS), LIMESTONE_CHIMNEY_SHAPES));
    public final Supplier<Block> LIMESTONE_FIREPLACE = register("limestone_fireplace", () -> new ConnectedVerticalSidedPlanFireplaceBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion().lightLevel(litBlockEmission(15))));
    public final Supplier<Block> ROOFING_SLATES = register("roofing_slates", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public Supplier<Block> ROOFING_SLATES_STAIRS;
    public final Supplier<Block> ROOFING_SLATES_PLATE = register("roofing_slates_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> ROOFING_SLATES_SLAB = register("roofing_slates_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> ROOFING_SLATES_EDGE = register("roofing_slates_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> ROOFING_SLATES_WALL = register("roofing_slates_wall", () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> BLACK_WROUGHT_IRON_BALUSTER = register("black_wrought_iron_baluster", () -> new PlateBlock(Block.Properties.copy(Blocks.IRON_BARS), THIN_PLATE_SHAPES));
    public final Supplier<Block> BLACK_WROUGHT_IRON_FENCE = register("black_wrought_iron_fence", () -> new IronFenceBlock(Block.Properties.copy(Blocks.IRON_BARS)));
    public final Supplier<Block> REINFORCED_BLACK_WROUGHT_IRON_FENCE = register("reinforced_black_wrought_iron_fence", () -> new ReinforcedIronFenceBlock(Block.Properties.copy(Blocks.IRON_BARS)));
    public final Supplier<Block> REINFORCED_GOLDEN_WROUGHT_IRON_FENCE = register("reinforced_golden_wrought_iron_fence", () -> new ReinforcedIronFenceBlock(Block.Properties.copy(Blocks.IRON_BARS)));
    public final Supplier<Block> BOXWOOD_BUSH = register("boxwood_bush", () -> new BushBlockDoT(Block.Properties.copy(Blocks.SPRUCE_LEAVES), BUSH_SHAPES), BlockTags.SWORD_EFFICIENT);
    public final Supplier<Block> BOXWOOD_TALL_HEDGE = register("boxwood_tall_hedge", () -> new PlateBlock(Block.Properties.copy(Blocks.SPRUCE_LEAVES)), BlockTags.SWORD_EFFICIENT);
    public final Supplier<Block> BOXWOOD_SMALL_HEDGE = register("boxwood_small_hedge", () -> new EdgeBlock(Block.Properties.copy(Blocks.SPRUCE_LEAVES)), BlockTags.SWORD_EFFICIENT);
    // German
    public final Supplier<Block> FLAT_ROOF_TILES = register("flat_roof_tiles", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public Supplier<Block> FLAT_ROOF_TILES_STAIRS;
    public final Supplier<Block> FLAT_ROOF_TILES_PLATE = register("flat_roof_tiles_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> FLAT_ROOF_TILES_SLAB = register("flat_roof_tiles_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> FLAT_ROOF_TILES_EDGE = register("flat_roof_tiles_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> FLAT_ROOF_TILES_WALL = register("flat_roof_tiles_wall", () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> LATTICE_GLASS = register("lattice_glass", () -> new GlassBlock(Block.Properties.copy(Blocks.GLASS)));
    public final Supplier<Block> LATTICE_GLASS_PANE = register("lattice_glass_pane", () -> new PaneBlockAA(Block.Properties.copy(Blocks.GLASS)));
    public final Supplier<Block> LATTICE_WAXED_OAK_WINDOW = register("lattice_waxed_oak_window", () -> new SidedWindowBlock(Block.Properties.copy(Blocks.GLASS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> LATTICE_STONE_BRICKS_WINDOW = register("lattice_stone_bricks_window", () -> new LatticeStoneBricksWindowBlock(Block.Properties.copy(Blocks.GLASS)));
    public final Supplier<Block> STONE_BRICKS_ARROWSLIT = register("stone_bricks_arrowslit", () -> new WaterloggedHorizontalBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion(), STONE_BRICKS_ARROWSLIT_SHAPES));
    public final Supplier<Block> STONE_BRICKS_CHIMNEY = register("stone_bricks_chimney", () -> new ChimneyBlockAA(Block.Properties.copy(Blocks.STONE_BRICKS), STONE_BRICKS_CHIMNEY_SHAPES));
    public final Supplier<Block> STONE_BRICKS_EDGE = register("stone_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> STONE_BRICKS_FIREPLACE = register("stone_bricks_fireplace", () -> new ConnectedVerticalSidedPlanFireplaceBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion().lightLevel(litBlockEmission(15))));
    public final Supplier<Block> STONE_BRICKS_MACHICOLATION = register("stone_bricks_machicolation", () -> new ConnectedHorizontalBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion(), STONE_BRICKS_MACHICOLATION_SHAPES));
    public final Supplier<Block> STONE_BRICKS_PLATE = register("stone_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> STONE_BRICKS_MASONRY = register("stone_bricks_masonry", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public Supplier<Block> STONE_BRICKS_MASONRY_STAIRS;
    public final Supplier<Block> STONE_BRICKS_MASONRY_PLATE = register("stone_bricks_masonry_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> STONE_BRICKS_MASONRY_SLAB = register("stone_bricks_masonry_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> STONE_BRICKS_MASONRY_EDGE = register("stone_bricks_masonry_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> STONE_BRICKS_MASONRY_WALL = register("stone_bricks_masonry_wall", () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> WAXED_OAK_FRAMED_RAMMED_DIRT = register("waxed_oak_framed_rammed_dirt", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BROWN).strength(2.0F, 3.0F)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_FRAMED_RAMMED_DIRT_PILLAR = register("waxed_oak_framed_rammed_dirt_pillar", () -> new RotatedPillarBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_PLANKS = register("waxed_oak_planks", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_DOOR = register("waxed_oak_door", () -> new DoorBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F).noOcclusion(), BlockSetType.ACACIA), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_TRAPDOOR = register("waxed_oak_trapdoor", () -> new CustomTrapDoorBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F).noOcclusion(), BlockSetType.ACACIA), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_SHUTTER = register("waxed_oak_shutters", () -> new ShutterBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_LOG_STRIPPED = register("waxed_oak_log_stripped", () -> new RotatedPillarBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_BALUSTER = register("waxed_oak_baluster", () -> new PlateBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F).noOcclusion(), WAXED_OAK_BALUSTER_SHAPES), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_BEAM = register("waxed_oak_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_SUPPORT_BEAM = register("waxed_oak_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_SUPPORT_SLAB = register("waxed_oak_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_SMALL_SHUTTER = register("waxed_oak_small_shutters", () -> new SmallShutterBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_TIMBER_FRAME = register("waxed_oak_timber_frame", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_TIMBER_FRAME_CORNER = register("waxed_oak_timber_frame_corner", () -> new InvertedBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_TIMBER_FRAME_CROSSED = register("waxed_oak_timber_frame_crossed", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_TIMBER_FRAME_PILLAR = register("waxed_oak_timber_frame_pillar", () -> new RotatedPillarBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_TIMBER_FRAME_SQUARED = register("waxed_oak_timber_frame_squared", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_FENCE = register("waxed_oak_fence", () -> new FenceBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_FENCE_GATE = register("waxed_oak_fence_gate", () -> new WaterloggedFenceGateBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F), WoodType.OAK), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_WALL = register("waxed_oak_wall", () -> new WallBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_PERGOLA = register("waxed_oak_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_LATTICE = register("waxed_oak_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_PLANKS_EDGE = register("waxed_oak_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_PLANKS_PLATE = register("waxed_oak_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_PLANKS_SLAB = register("waxed_oak_planks_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public Supplier<Block> WAXED_OAK_PLANKS_STAIRS;
    public final Supplier<Block> WAXED_OAK_CHANDELIER = register("waxed_oak_chandelier", () -> new WaxedOakChandelierBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F).noOcclusion().lightLevel(litBlockEmission(15))), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_CHAIR = register("waxed_oak_chair", () -> new DoubleChairBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F).noOcclusion(), 11.0F, WAXED_OAK_CHAIR_SHAPES), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WAXED_OAK_TABLE = register("waxed_oak_table", () -> new ConnectedHorizontalPlanDoubleTableBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F).noOcclusion(), WAXED_OAK_TABLE_SHAPES), BlockTags.MINEABLE_WITH_AXE);
    // public final Supplier<Block> WAXED_OAK_CANOPY_BED = register("waxed_oak_canopy_bed", () -> new WaxedOakCanopyBedBlock(DyeColor.RED, BlockBehaviour.Properties.copy(Blocks.WHITE_BED).noOcclusion()), BlockTags.MINEABLE_WITH_AXE);
    // public Supplier<Block> WAXED_OAK_CANOPY_BED_WOOD;
    public Supplier<Block> IVY;
    public Supplier<Block> GERANIUM_PINK;
    public final Supplier<Block> PLANTER_GERANIUM_PINK = register("planter_geranium_pink", () -> new PlanterBlock(Block.Properties.copy(Blocks.CLAY).strength(0.6F).noOcclusion()));
    public final Supplier<Block> STONE_BRICKS_POOL = register("stone_bricks_pool", () -> new PoolBlock(Block.Properties.copy(Blocks.STONE), 16, 14, POOL_SHAPES));
    public final Supplier<Block> STONE_BRICKS_SMALL_POOL = register("stone_bricks_small_pool", () -> new SmallPoolBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> STONE_BRICKS_FAUCET = register("stone_bricks_faucet", () -> new FaucetBlock(Block.Properties.copy(Blocks.STONE).noOcclusion().noCollission().randomTicks()));
    public final Supplier<Block> STONE_BRICKS_WATER_JET = register("stone_bricks_water_jet", () -> new WaterJetBlock(Block.Properties.copy(Blocks.STONE).noOcclusion().noCollission()));
    // Japanese
    public final Supplier<Block> CHARRED_SPRUCE_PLANKS = register("charred_spruce_planks", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_LOG_STRIPPED = register("charred_spruce_log_stripped", () -> new RotatedPillarBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_PLANKS_EDGE = register("charred_spruce_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_PLANKS_PLATE = register("charred_spruce_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_PLANKS_SLAB = register("charred_spruce_planks_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public Supplier<Block> CHARRED_SPRUCE_PLANKS_STAIRS;
    public final Supplier<Block> CHARRED_SPRUCE_BOARDS = register("charred_spruce_boards", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_DOOR = register("charred_spruce_door", () -> new DoorBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion(), BlockSetType.SPRUCE), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_TRAPDOOR = register("charred_spruce_trapdoor", () -> new CustomTrapDoorBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion(), BlockSetType.SPRUCE), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_SHUTTERS = register("charred_spruce_shutters", () -> new CharredSpruceShuttersBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion(), CHARRED_SPRUCE_SHUTTERS_SHAPES), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_TALL_SHUTTERS = register("charred_spruce_tall_shutters", () -> new CharredSpruceTallShuttersBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion()), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_FOUNDATION = register("charred_spruce_foundation", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_FOUNDATION_SLAB = register("charred_spruce_foundation_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_WALL = register("charred_spruce_wall", () -> new WallBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_FENCE = register("charred_spruce_fence", () -> new FenceBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_FENCE_GATE = register("charred_spruce_fence_gate", () -> new WaterloggedFenceGateBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F), WoodType.SPRUCE), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_RAILING = register("charred_spruce_railing", () -> new CharredSpruceRailingBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion()), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_FANCY_RAILING = register("charred_spruce_fancy_railing", () -> new CharredSpruceFancyRailingBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion()), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_PERGOLA = register("charred_spruce_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_LATTICE = register("charred_spruce_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion()).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_SUPPORT_SLAB = register("charred_spruce_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_SUPPORT_BEAM = register("charred_spruce_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_BEAM = register("charred_spruce_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_TIMBER_FRAME = register("charred_spruce_timber_frame", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHARRED_SPRUCE_TIMBER_FRAME_PILLAR = register("charred_spruce_timber_frame_pillar", () -> new RotatedPillarBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> RED_PAINTED_BEAM = register("red_painted_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> GRAY_ROOF_TILES = register("gray_roof_tiles", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public Supplier<Block> GRAY_ROOF_TILES_STAIRS;
    public final Supplier<Block> GRAY_ROOF_TILES_PLATE = register("gray_roof_tiles_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> GRAY_ROOF_TILES_SLAB = register("gray_roof_tiles_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> GRAY_ROOF_TILES_EDGE = register("gray_roof_tiles_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> GRAY_ROOF_TILES_WALL = register("gray_roof_tiles_wall", () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public Supplier<MixedRoofSupportBlock> CHARRED_SPRUCE_ROOF_SUPPORT;
    public final Supplier<Block> STEPPING_STONES = register("stepping_stones", () -> new BlockAA(Block.Properties.copy(Blocks.SAND).mapColor(MapColor.STONE).strength(1.2F).sound(SoundType.GRAVEL)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> STEPPING_STONES_SLAB = register("stepping_stones_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.SAND).mapColor(MapColor.STONE).strength(1.2F).sound(SoundType.GRAVEL)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> CURVED_RAKED_GRAVEL = register("curved_raked_gravel", () -> new HorizontalBlockAA(Block.Properties.copy(Blocks.SAND).mapColor(MapColor.STONE).strength(1.0F).sound(SoundType.GRAVEL)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> STRAIGHT_RAKED_GRAVEL = register("straight_raked_gravel", () -> new HorizontalAxisBlock(Block.Properties.copy(Blocks.SAND).mapColor(MapColor.STONE).strength(1.0F).sound(SoundType.GRAVEL)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> CAST_IRON_TEAPOT_GRAY = register("cast_iron_teapot_gray", () -> new SpecialDisplayBlock(Block.Properties.copy(Blocks.IRON_BLOCK).strength(1.0F).noOcclusion(), CAST_IRON_TEAPOT_SHAPES));
    public final Supplier<Block> CAST_IRON_TEAPOT_GREEN = register("cast_iron_teapot_green", () -> new SpecialDisplayBlock(Block.Properties.copy(Blocks.IRON_BLOCK).strength(1.0F).noOcclusion(), CAST_IRON_TEAPOT_SHAPES));
    public final Supplier<Block> CAST_IRON_TEAPOT_DECORATED = register("cast_iron_teapot_decorated", () -> new SpecialDisplayBlock(Block.Properties.copy(Blocks.IRON_BLOCK).strength(1.0F).noOcclusion(), CAST_IRON_TEAPOT_SHAPES));
    public final Supplier<Block> CAST_IRON_TEACUP_GRAY = register("cast_iron_teacup_gray", () -> new SpecialDisplayBlock(Block.Properties.copy(Blocks.IRON_BLOCK).strength(1.0F).noOcclusion(), CAST_IRON_TEACUP_SHAPES));
    public final Supplier<Block> CAST_IRON_TEACUP_GREEN = register("cast_iron_teacup_green", () -> new SpecialDisplayBlock(Block.Properties.copy(Blocks.IRON_BLOCK).strength(1.0F).noOcclusion(), CAST_IRON_TEACUP_SHAPES));
    public final Supplier<Block> CAST_IRON_TEACUP_DECORATED = register("cast_iron_teacup_decorated", () -> new SpecialDisplayBlock(Block.Properties.copy(Blocks.IRON_BLOCK).strength(1.0F).noOcclusion(), CAST_IRON_TEACUP_SHAPES));
    public final Supplier<Block> BAMBOO_DRYING_TRAY = register("bamboo_drying_tray", () -> new DryerBlock(Block.Properties.copy(Blocks.OAK_PLANKS).noOcclusion(), DRYER_SHAPES), BlockTags.MINEABLE_WITH_AXE);
    public Supplier<GrowingBushBlock> CAMELLIA;
    public Supplier<MulberryBlock> MULBERRY;
    public final Supplier<Block> IKEBANA_FLOWER_POT = register("ikebana_flower_pot", () -> new SidedFlowerPotBlock(null));
    public final Supplier<Block> SPRUCE_LOW_TABLE = register("spruce_low_table", () -> new SpruceLowTableBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion().lightLevel(litBlockEmission(14))), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_LEGLESS_CHAIR = register("spruce_legless_chair", () -> new ChairBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion(), 3.0F, SPRUCE_LEGLESS_CHAIR_SHAPES), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WHITE_LITTLE_FLAG = register("white_little_flag", () -> new LittleFlagBlock(Block.Properties.copy(Blocks.WHITE_WOOL)));
    public final Supplier<Block> PAPER_DOOR = register("paper_door", () -> new CenteredDoorBlock(Block.Properties.copy(Blocks.WHITE_WOOL).strength(1.5F, 1.5F), BlockSetType.BAMBOO), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> PAPER_WALL = register("paper_wall", () -> new BottomPaneBlock(Block.Properties.copy(Blocks.WHITE_WOOL).strength(1.5F, 1.5F)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> PAPER_WALL_FLAT = register("paper_wall_flat", () -> new PillarPaneBlock(Block.Properties.copy(Blocks.WHITE_WOOL).strength(1.5F, 1.5F)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> PAPER_WALL_WINDOWS = register("paper_wall_window", () -> new PillarPaneBlock(Block.Properties.copy(Blocks.WHITE_WOOL).strength(1.5F, 1.5F)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> PAPER_WALL_FLOWERY = register("paper_wall_flowery", () -> new PillarPaneBlock(Block.Properties.copy(Blocks.WHITE_WOOL).strength(1.5F, 1.5F)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> PAPER_FOLDING_SCREEN = register("paper_folding_screen", () -> new FoldingScreenBlock(Block.Properties.copy(Blocks.WHITE_WOOL).strength(1.5F, 1.5F).noOcclusion(), FULL_SHAPE), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> RED_PAPER_LANTERN = register("red_paper_lantern", () -> new PaperLanternBlock(Block.Properties.copy(Blocks.RED_WOOL).noOcclusion().noCollission().lightLevel(state -> 12)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> PAPER_LAMP = register("paper_lamp", () -> new PaperLampBlock(Block.Properties.copy(Blocks.WHITE_WOOL).noOcclusion().lightLevel(state -> 14)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> STONE_LANTERN = register("stone_lantern", () -> new LanternBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion().lightLevel(state -> 15), STONE_LANTERN_SHAPES));
    public final Supplier<WaterDoubleCropsBlock> RICE = registerWithItem("rice", () -> new WaterDoubleCropsBlock(2), (block) -> new SoilSeedsItem(block, null), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SMALL_TATAMI_MAT = register("small_tatami_mat", () -> new SmallTatamiMatBlock(Block.Properties.copy(Blocks.WHITE_CARPET)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SMALL_TATAMI_FLOOR = registerWithItem("small_tatami_floor", () -> new SmallTatamiFloorBlock(Block.Properties.copy(Blocks.WHITE_CARPET)), null, BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> TATAMI_MAT = register("tatami_mat", () -> new TatamiMatBlock(Block.Properties.copy(Blocks.WHITE_CARPET)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> TATAMI_FLOOR = registerWithItem("tatami_floor", () -> new TatamiFloorBlock(Block.Properties.copy(Blocks.WHITE_CARPET)), null, BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> LIGHT_GRAY_FUTON = register("light_gray_futon", () -> new FutonBlock(DyeColor.LIGHT_GRAY, Block.Properties.copy(Blocks.LIGHT_GRAY_BED)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> IRORI_FIREPLACE = register("irori_fireplace", () -> new IroriFireplaceBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion().lightLevel(litBlockEmission(15))));
    public final Supplier<Block> SAKE_BOTTLE = register("sake_bottle", () -> new SpecialDisplayBlock(Block.Properties.copy(Blocks.FLOWER_POT), SAKE_BOTTLE_SHAPES));
    public final Supplier<Block> SAKE_CUP = register("sake_cup", () -> new SpecialDisplayBlock(Block.Properties.copy(Blocks.FLOWER_POT), SAKE_CUP_SHAPES));
    public final Supplier<Block> STICK_BUNDLE = register("stick_bundle", () -> new StickBundleBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(2.0F, 3.0F).sound(SoundType.GRASS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MAPLE_RED_TRUNK = registerWithItem("maple_red_trunk", () -> new MapleTrunkBlock(Block.Properties.copy(Blocks.SPRUCE_LEAVES)), null, BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MAPLE_RED_LEAVES = registerWithItem("maple_red_leaves", () -> new MapleLeavesBlock(Block.Properties.copy(Blocks.SPRUCE_LEAVES)), null, BlockTags.MINEABLE_WITH_AXE);
    public Supplier<Block> MAPLE_RED_SAPLING;
    public final Supplier<Block> PAUSED_MAPLE_RED_SAPLING = registerWithItem("paused_maple_red_sapling", () -> new PausedMapleSaplingBlock(Block.Properties.copy(Blocks.SPRUCE_LEAVES)), null, BlockTags.MINEABLE_WITH_AXE);
    // Persian
    public final Supplier<Block> PERSIAN_CARPET_RED = register("persian_carpet_red", () -> new BlockAA(Block.Properties.copy(Blocks.RED_WOOL), CARPET_SHAPES), BlockTags.SWORD_EFFICIENT);
    public final Supplier<Block> PERSIAN_CARPET_DELICATE_RED = register("persian_carpet_delicate_red", () -> new BlockAA(Block.Properties.copy(Blocks.RED_WOOL), CARPET_SHAPES), BlockTags.SWORD_EFFICIENT);
    public Supplier<Block> MORAQ_MOSAIC_RECESS;
    public final Supplier<Block> MORAQ_MOSAIC_RELIEF = register("moraq_mosaic_relief", () -> new ConnectedVerticalSidedPlanBlock(Block.Properties.copy(Blocks.BRICKS), RELIEF_SHAPES));
    public final Supplier<Block> MORAQ_MOSAIC_TRADITIONAL = register("moraq_mosaic_traditional", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)));
    public final Supplier<Block> MORAQ_MOSAIC_DELICATE = register("moraq_mosaic_delicate", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)));
    public final Supplier<Block> MORAQ_MOSAIC_BORDER = register("moraq_mosaic_border", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)));
    public final Supplier<Block> MORAQ_MOSAIC_GEOMETRIC = register("moraq_mosaic_geometric", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)));
    public final Supplier<Block> MORAQ_MOSAIC_PATTERN = register("moraq_mosaic_pattern", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)));
    public final Supplier<Block> MORAQ_MOSAIC_COLUMN = register("moraq_mosaic_column", () -> new MoraqMosaicColumnBlock(Block.Properties.copy(Blocks.BRICKS)));
    public final Supplier<Block> SANDSTONE_BRICKS = register("sandstone_bricks", () -> new BlockAA(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public Supplier<Block> SANDSTONE_BRICKS_STAIRS;
    public final Supplier<Block> SANDSTONE_BRICKS_PLATE = register("sandstone_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public final Supplier<Block> SANDSTONE_BRICKS_SLAB = register("sandstone_bricks_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public final Supplier<Block> SANDSTONE_BRICKS_EDGE = register("sandstone_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public final Supplier<Block> SANDSTONE_BRICKS_WALL = register("sandstone_bricks_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public final Supplier<Block> SANDSTONE_BRICKS_TURQUOISE_PATTERN = register("sandstone_bricks_turquoise_pattern", () -> new BlockAA(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public Supplier<Block> SANDSTONE_BRICKS_TURQUOISE_PATTERN_STAIRS;
    public final Supplier<Block> SANDSTONE_BRICKS_TURQUOISE_PATTERN_PLATE = register("sandstone_bricks_turquoise_pattern_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public final Supplier<Block> SANDSTONE_BRICKS_TURQUOISE_PATTERN_SLAB = register("sandstone_bricks_turquoise_pattern_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public final Supplier<Block> SANDSTONE_BRICKS_TURQUOISE_PATTERN_EDGE = register("sandstone_bricks_turquoise_pattern_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public final Supplier<Block> SANDSTONE_BRICKS_TURQUOISE_PATTERN_WALL = register("sandstone_bricks_turquoise_pattern_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public final Supplier<Block> SANDSTONE_SCULPTED_RELIEF = register("sandstone_sculpted_relief", () -> new ConnectedVerticalSidedPlanBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE), RELIEF_SHAPES));
    public final Supplier<Block> SANDSTONE_CRENELATION = register("sandstone_crenelation", () -> new PlateBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE), SANDSTONE_CRENELATION_SHAPES));
    // Pre_columbian
    public Supplier<SoilCropsBlock> COMMELINA;
    public final Supplier<Block> PLASTERED_STONE = register("plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> PLASTERED_STONE_EDGE = register("plastered_stone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> PLASTERED_STONE_PLATE = register("plastered_stone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> PLASTERED_STONE_SLAB = register("plastered_stone_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public Supplier<Block> PLASTERED_STONE_STAIRS;
    public final Supplier<Block> PLASTERED_STONE_WINDOW = register("plastered_stone_window", () -> new WaterloggedHorizontalAxisBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion(), PLASTERED_STONE_WINDOW_SHAPES));
    public final Supplier<Block> CHISELED_PLASTERED_STONE = register("chiseled_plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> CHISELED_PLASTERED_STONE_FRIEZE = register("chiseled_plastered_stone_frieze", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> ORNAMENTED_CHISELED_PLASTERED_STONE = register("ornamented_chiseled_plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> RED_PLASTERED_STONE = register("red_plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> RED_CHISELED_PLASTERED_STONE = register("red_chiseled_plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> RED_ORNAMENTED_CHISELED_PLASTERED_STONE = register("red_ornamented_chiseled_plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> RED_PLASTERED_STONE_EDGE = register("red_plastered_stone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> RED_PLASTERED_STONE_FRIEZE = register("red_plastered_stone_frieze", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> RED_PLASTERED_STONE_PLATE = register("red_plastered_stone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> RED_PLASTERED_STONE_SLAB = register("red_plastered_stone_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public Supplier<Block> RED_PLASTERED_STONE_STAIRS;
    public final Supplier<Block> RED_SMALL_PLASTERED_STONE_FRIEZE = register("red_small_plastered_stone_frieze", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> RED_ORNAMENTED_PLASTERED_STONE_FRIEZE = register("red_ornamented_plastered_stone_frieze", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion()));
    public final Supplier<Block> RED_SCULPTED_PLASTERED_STONE_FRIEZE = register("red_sculpted_plastered_stone_frieze", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS), RED_SCULPTED_PLASTERED_STONE_FRIEZE_SHAPES));
    public final Supplier<Block> GREEN_CHISELED_PLASTERED_STONE = register("green_chiseled_plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> GREEN_ORNAMENTED_CHISELED_PLASTERED_STONE = register("green_ornamented_chiseled_plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> GREEN_ORNAMENTED_PLASTERED_STONE_FRIEZE = register("green_ornamented_plastered_stone_frieze", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion()));
    public final Supplier<Block> GREEN_PLASTERED_STONE_FRIEZE = register("green_plastered_stone_frieze", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion()));
    public final Supplier<Block> GREEN_SCULPTED_PLASTERED_STONE_FRIEZE = register("green_sculpted_plastered_stone_frieze", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS), GREEN_SCULPTED_PLASTERED_STONE_FRIEZE_SHAPES));
    public final Supplier<Block> GREEN_SMALL_PLASTERED_STONE_FRIEZE = register("green_small_plastered_stone_frieze", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> WILD_MAIZE = register("wild_maize", () -> new WildMaizeBlock(Block.Properties.copy(Blocks.DANDELION)), BlockTags.SWORD_EFFICIENT);
    public Supplier<DoubleCropsBlock> MAIZE;
    public final Supplier<Block> RED_ORNAMENTED_PLASTERED_STONE = register("red_ornamented_plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> PLASTERED_STONE_COLUMN = register("plastered_stone_column", () -> new ConnectedVerticalBlock(Block.Properties.copy(Blocks.STONE_BRICKS), PLASTERED_STONE_COLUMN_SHAPES));
    public final Supplier<Block> PLASTERED_STONE_CRESSET = register("plastered_stone_cresset", () -> new PlasteredStoneCressetBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion().lightLevel(litBlockEmission(15))));
    public final Supplier<Block> FEATHERED_SERPENT_SCULPTURE = register("feathered_serpent_sculpture", () -> new WaterloggedHorizontalBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion(), FEATHERED_SERPENT_SCULPTURE_SHAPES));
    public final Supplier<Block> SERPENT_SCULPTED_COLUMN = register("serpent_sculpted_column", () -> new ConnectedVerticalSidedBlock(Block.Properties.copy(Blocks.STONE_BRICKS), SERPENT_SCULPTED_COLUMN_SHAPES));
    // Roman
    public final Supplier<Block> SANDSTONE_PLATE = register("sandstone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.SANDSTONE)));
    public final Supplier<Block> SANDSTONE_EDGE = register("sandstone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.SANDSTONE)));
    public final Supplier<Block> CUT_SANDSTONE_STAIRS = register("cut_sandstone_stairs", () -> new CustomStairBlock(Blocks.CUT_SANDSTONE.defaultBlockState(), Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public final Supplier<Block> CUT_SANDSTONE_PLATE = register("cut_sandstone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public final Supplier<Block> CUT_SANDSTONE_EDGE = register("cut_sandstone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public final Supplier<Block> SMOOTH_SANDSTONE_PLATE = register("smooth_sandstone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.SMOOTH_SANDSTONE)));
    public final Supplier<Block> SMOOTH_SANDSTONE_EDGE = register("smooth_sandstone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.SMOOTH_SANDSTONE)));
    public final Supplier<Block> OCHRE_ROOF_TILES = register("ochre_roof_tiles", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)));
    public final Supplier<Block> OCHRE_ROOF_TILES_EDGE = register("ochre_roof_tiles_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.BRICKS)));
    public final Supplier<Block> OCHRE_ROOF_TILES_PLATE = register("ochre_roof_tiles_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.BRICKS)));
    public Supplier<Block> OCHRE_ROOF_TILES_STAIRS;
    public final Supplier<Block> OCHRE_ROOF_TILES_WALL = register("ochre_roof_tiles_wall", () -> new WallBlock(Block.Properties.copy(Blocks.BRICKS)));
    public final Supplier<Block> SANDSTONE_BOT_OCHRE_ROOF_TILES_TOP = registerWithItem("sandstone_bot_ochre_roof_tiles_top", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)), null);
    public final Supplier<Block> CUT_SANDSTONE_BOT_OCHRE_ROOF_TILES_TOP = registerWithItem("cut_sandstone_bot_ochre_roof_tiles_top", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)), null);
    public final Supplier<Block> SMOOTH_SANDSTONE_BOT_OCHRE_ROOF_TILES_TOP = registerWithItem("smooth_sandstone_bot_ochre_roof_tiles_top", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)), null);
    public Supplier<MixedSlabBlock> OCHRE_ROOF_TILES_SLAB;
    public final Supplier<Block> SANDSTONE_COLUMN = register("sandstone_column", () -> new SandstoneColumnBlock(Block.Properties.copy(Blocks.SANDSTONE)));
    public final Supplier<Block> SANDSTONE_SIDED_COLUMN = register("sandstone_sided_column", () -> new ConnectedVerticalSidedBlock(Block.Properties.copy(Blocks.SANDSTONE), SANDSTONE_SIDED_COLUMN_SHAPES));
    public final Supplier<Block> COVERED_SANDSTONE_WALL = register("covered_sandstone_wall", () -> new CappedWallBlock(Block.Properties.copy(Blocks.SANDSTONE)));
    public final Supplier<Block> TERRACOTTA_WALL = register("terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));
    public final Supplier<Block> ROMAN_FRESCO_BLACK = register("roman_fresco_black", () -> new BlockAA(Block.Properties.copy(Blocks.TERRACOTTA)));
    public final Supplier<Block> ROMAN_FRESCO_RED = register("roman_fresco_red", () -> new BlockAA(Block.Properties.copy(Blocks.TERRACOTTA)));
    public final Supplier<Block> MOSAIC_FLOOR = register("mosaic_floor", () -> new BlockAA(Block.Properties.copy(Blocks.SANDSTONE)));
    public final Supplier<Block> MOSAIC_FLOOR_DELICATE = register("mosaic_floor_delicate", () -> new BlockAA(Block.Properties.copy(Blocks.SANDSTONE)));
    public final Supplier<Block> MOSAIC_FLOOR_ROSETTE = register("mosaic_floor_rosette", () -> new BlockAA(Block.Properties.copy(Blocks.SANDSTONE)));
    public final Supplier<Block> BIRCH_FANCY_FENCE = register("birch_fancy_fence", () -> new PlateBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F).noOcclusion(), THIN_PLATE_SHAPES), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_FOOTSTOOL = register("birch_footstool", () -> new BirchFootstoolBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS), 9.0F), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_COUCH = register("birch_couch", () -> new BirchCouchBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS), 13.0F, ROMAN_COUCH_SHAPES), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MARBLE_STATUE_MARS = register("marble_statue_mars", () -> new MarbleStatueBlock(Block.Properties.copy(Blocks.BRICKS).noOcclusion()));
    public final Supplier<Block> WILD_GRAPE = register("wild_grape", () -> new WildPlantBlock(Block.Properties.copy(Blocks.DANDELION)), BlockTags.SWORD_EFFICIENT);
    public Supplier<Block> CYPRESS;
    public final Supplier<Block> BIG_FLOWER_POT = register("big_flower_pot", () -> new WaterloggedBlock(Block.Properties.copy(Blocks.CLAY), BIG_FLOWER_POT_SHAPES));
    public final Supplier<Block> MARBLE_BIG_FLOWER_POT = register("marble_big_flower_pot", () -> new WaterloggedBlock(Block.Properties.copy(Blocks.STONE), MARBLE_BIG_FLOWER_POT_SHAPES));
    public final Supplier<Block> MARBLE_FANCY_FENCE = register("marble_fancy_fence", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE).strength(3.0F, 5.0F).noOcclusion(), THIN_PLATE_SHAPES));
    public final Supplier<Block> MARBLE_COLUMN = register("marble_column", () -> new MarbleColumnBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> MARBLE_SIDED_COLUMN = register("marble_sided_column", () -> new ConnectedVerticalSidedBlock(Block.Properties.copy(Blocks.STONE), MARBLE_SIDED_COLUMN_SHAPES));
    public final Supplier<Block> MARBLE_COFFER = register("marble_coffer", () -> new BlockAA(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> MARBLE_COFFER_SLAB = register("marble_coffer_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.STONE)));

    /**
     * These have to be registered last due to dependencies on other blocks and the items registry too.
     */
    public void postRegister() {
        PLASTERED_STONE_STAIRS = register("plastered_stone_stairs", () -> new StairsBlockAA(this.PLASTERED_STONE, Block.Properties.copy(Blocks.BRICKS)));
        RED_PLASTERED_STONE_STAIRS = register("red_plastered_stone_stairs", () -> new StairsBlockAA(this.RED_PLASTERED_STONE, Block.Properties.copy(Blocks.BRICKS)));
        OCHRE_ROOF_TILES_STAIRS = register("ochre_roof_tiles_stairs", () -> new StairsBlockAA(this.OCHRE_ROOF_TILES, Block.Properties.copy(Blocks.BRICKS)));
        OCHRE_ROOF_TILES_SLAB = registerWithItem("ochre_roof_tiles_slab", () -> new MixedSlabBlock(Block.Properties.copy(Blocks.BRICKS))
                .addMixedBlockRecipe(Blocks.SANDSTONE_SLAB, this.SANDSTONE_BOT_OCHRE_ROOF_TILES_TOP, false)
                .addMixedBlockRecipe(Blocks.CUT_SANDSTONE_SLAB, this.CUT_SANDSTONE_BOT_OCHRE_ROOF_TILES_TOP, false)
                .addMixedBlockRecipe(Blocks.SMOOTH_SANDSTONE_SLAB, this.SMOOTH_SANDSTONE_BOT_OCHRE_ROOF_TILES_TOP, false), MixedSlabBlock::getBlockItem);
        THATCH_WHEAT_STAIRS = register("thatch_wheat_stairs", () -> new StairsBlockAA(this.THATCH_WHEAT, Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(80, 30), BlockTags.MINEABLE_WITH_HOE);
        THATCH_BAMBOO_STAIRS = register("thatch_bamboo_stairs", () -> new StairsBlockAA(this.THATCH_BAMBOO, Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(40, 30), BlockTags.MINEABLE_WITH_HOE);
        GOLD_PLATED_SMOOTH_STAIRS = register("gold_plated_smooth_stairs", () -> new StairsBlockAA(this.GOLD_PLATED_SMOOTH_BLOCK, Block.Properties.copy(Blocks.GOLD_BLOCK)));
        LIMESTONE_BRICKS_STAIRS = register("limestone_bricks_stairs", () -> new StairsBlockAA(this.LIMESTONE_BRICKS, Block.Properties.copy(Blocks.STONE_BRICKS)));
        ROOFING_SLATES_STAIRS = register("roofing_slates_stairs", () -> new StairsBlockAA(this.ROOFING_SLATES, Block.Properties.copy(Blocks.STONE_BRICKS)));
        FLAT_ROOF_TILES_STAIRS = register("flat_roof_tiles_stairs", () -> new StairsBlockAA(this.FLAT_ROOF_TILES, Block.Properties.copy(Blocks.STONE_BRICKS)));
        STONE_BRICKS_MASONRY_STAIRS = register("stone_bricks_masonry_stairs", () -> new StairsBlockAA(this.STONE_BRICKS_MASONRY, Block.Properties.copy(Blocks.STONE_BRICKS)));
        WAXED_OAK_PLANKS_STAIRS = register("waxed_oak_planks_stairs", () -> new StairsBlockAA(this.WAXED_OAK_PLANKS, Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
        CHARRED_SPRUCE_PLANKS_STAIRS = register("charred_spruce_planks_stairs", () -> new StairsBlockAA(this.CHARRED_SPRUCE_PLANKS, Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
        GRAY_ROOF_TILES_STAIRS = register("gray_roof_tiles_stairs", () -> new StairsBlockAA(this.GRAY_ROOF_TILES, Block.Properties.copy(Blocks.STONE_BRICKS)));
        CHARRED_SPRUCE_ROOF_SUPPORT = registerWithItem("charred_spruce_roof_support", () -> new MixedRoofSupportBlock(this.GRAY_ROOF_TILES_SLAB, Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion()), MixedRoofSupportBlock::getBlockItem, BlockTags.MINEABLE_WITH_AXE);
        MORAQ_MOSAIC_RECESS = register("moraq_mosaic_recess", () -> new StairsBlockAA(this.MORAQ_MOSAIC_DELICATE, Block.Properties.copy(Blocks.BRICKS)));
        SANDSTONE_BRICKS_STAIRS = register("sandstone_bricks_stairs", () -> new StairsBlockAA(this.SANDSTONE_BRICKS, Block.Properties.copy(Blocks.CUT_SANDSTONE)));
        SANDSTONE_BRICKS_TURQUOISE_PATTERN_STAIRS = register("sandstone_bricks_turquoise_pattern_stairs", () -> new StairsBlockAA(this.SANDSTONE_BRICKS_TURQUOISE_PATTERN, Block.Properties.copy(Blocks.CUT_SANDSTONE)));
        CYPRESS = registerWithFlowerPotItem("cypress", () -> new CypressBlock(Block.Properties.copy(Blocks.SPRUCE_LEAVES)).setBurnable(), (block) -> new PotAndBlockItem(block, new Item.Properties()));
        MAIZE = registerWithFlowerPotItem("maize", () -> new DoubleCropsBlock(SoilCropsBlock.PlantType.CROP, 4), (block) -> new SoilSeedsItem(block, Foods.MAIZE));
        COMMELINA = registerWithFlowerPotItem("commelina", () -> new SoilCropsBlock(SoilCropsBlock.PlantType.PLAINS), (block) -> new SoilSeedsItem(block, null));
        MAPLE_RED_SAPLING = registerWithFlowerPotItem("maple_red_sapling", () -> new MapleSaplingBlock(Block.Properties.copy(Blocks.SPRUCE_LEAVES)), (block) -> new PotAndBlockItem(block, new Item.Properties()));
        CAMELLIA = registerWithFlowerPotItem("camellia", () -> new GrowingBushBlock(SoilCropsBlock.PlantType.PLAINS, 3), "camellia_seeds", (block) -> new SoilSeedsItem(block, null));
        MULBERRY = registerWithFlowerPotItem("mulberry", () -> new MulberryBlock(SoilCropsBlock.PlantType.PLAINS, 3, 2), (block) -> new SoilSeedsItem(block, Foods.MULBERRY));
        IVY = registerWithFlowerPotItem("ivy", () -> new IvyBlock(Block.Properties.copy(Blocks.VINE).randomTicks().strength(0.2F).sound(SoundType.VINE)), (block) -> new PotAndBlockItem(block, new Item.Properties()));
        GERANIUM_PINK = registerWithFlowerPotItem("geranium_pink", () -> new GeraniumBlock(Block.Properties.copy(Blocks.SUNFLOWER).offsetType(BlockBehaviour.OffsetType.NONE).instabreak().sound(SoundType.GRASS)), (block) -> new PotAndBlockItem(block, new Item.Properties()));
        // WAXED_OAK_CANOPY_BED_WOOD = registerWithItem("waxed_oak_canopy_bed_wood", () -> new WaxedOakCanopyBedWoodBlock(BlockBehaviour.Properties.copy(WAXED_OAK_PLANKS.get()).noOcclusion()), null, BlockTags.MINEABLE_WITH_AXE);
    }

    public <T extends Block> Supplier<T> register(String id, Supplier<T> block) {
        return this.registerWithItem(id, block, (T blockObject) -> new BlockItem(blockObject, new Item.Properties()));
    }

    public <T extends Block> Supplier<T> register(String id, Supplier<T> block, TagKey<Block>... tagKeys) {
        return this.registerWithItem(id, block, (T blockObject) -> new BlockItem(blockObject, new Item.Properties()), tagKeys);
    }

    public abstract <T extends Block, Y extends Item> Supplier<T> registerWithItem(String id, Supplier<T> block, Function<T, Y> item, TagKey<Block>... tags);
    public abstract <T extends Block, Y extends Item & IHasFlowerPot> Supplier<T> registerWithFlowerPotItem(String blockID, Supplier<T> block, String itemID, Function<T, Y> item);

    public <T extends Block, Y extends Item & IHasFlowerPot> Supplier<T> registerWithFlowerPotItem(String id, Supplier<T> block, Function<T, Y> item) {
        return this.registerWithFlowerPotItem(id, block, id, item);
    }
    
//    @SafeVarargs
//    @SuppressWarnings("unchecked")
//    public static <T extends Block, U extends Item> Supplier<Block> regWithItem(String name, Supplier<T> block, String itemName, @Nullable Function<T, U> item, TagKey<Block>... tags) {
//        Supplier<T> toReturn = this.BLOCKS.register(name, block);
//        if(item != null) {
//            DoTBItemsRegistry.reg(itemName, () -> item.apply(toReturn.get()));
//        }
//        Supplier<Block> regBlock = (Supplier<Block>) toReturn;
//        if(tags.length == 0){
//            addBlockTag(regBlock, BlockTags.MINEABLE_WITH_PICKAXE);
//        }else{
//            for (TagKey<Block> tag : tags) {
//                addBlockTag(regBlock, tag);
//            }
//        }
//        return regBlock;
//    }

//    @SuppressWarnings("unchecked")
//    public static <T extends Block, U extends Item & IHasFlowerPot> Supplier<Block> regWithFlowerPotItem(String plantName, Supplier<T> block, String seedName, @Nullable Function<T, U> item) {
//        Supplier<T> toReturn = this.BLOCKS.register(plantName, block);
//        if(item != null) {
//            DoTBItemsRegistry.regWithFlowerPot(plantName, seedName, () -> item.apply(toReturn.get()));
//        }
//        Supplier<Block> regBlock = (Supplier<Block>) toReturn;
//        // Flower can be broken with sword, and in the ItemRegistry, pot can be broken with Pickaxe.
//        addBlockTag(regBlock, BlockTags.SWORD_EFFICIENT);
//        return regBlock;
//    }

    /**
     * Add a Supplier<Block> to the list associated to the given Tag. If the tag doesn't exist, create a new empty list, and put the block inside.
     * @param block Block that needs the tag.
     * @param tag BlockTags added.
     */
    public <T extends Block> void addBlockTag(Supplier<T> block, TagKey<Block> tag){
        blockTagsMap.computeIfAbsent(tag, k -> new HashSet<>()).add((Supplier<Block>) block);
    }

    //Old Function
    private static ToIntFunction<BlockState> litBlockEmission(final int lightValue) {
        return state -> state.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }
}
