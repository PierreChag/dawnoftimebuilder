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
import net.minecraftforge.common.PlantType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.dawnoftimebuilder.DawnOfTimeBuilder;
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

import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

import static org.dawnoftimebuilder.util.VoxelShapes.*;

public class DoTBBlocksRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DawnOfTimeBuilder.MOD_ID);
    public static Map<TagKey<Block>, Set<RegistryObject<Block>>> blockTagsMap = new HashMap<>();
    public static final HashMap<String, Block> POT_BLOCKS = new HashMap<>();
    public static final RegistryObject<Block> ACACIA_PLANKS_EDGE = DoTBBlocksRegistry.reg("acacia_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> ACACIA_PLANKS_PLATE = DoTBBlocksRegistry.reg("acacia_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> ACACIA_PERGOLA = DoTBBlocksRegistry.reg("acacia_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> ACACIA_LATTICE = DoTBBlocksRegistry.reg("acacia_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> ACACIA_BEAM = DoTBBlocksRegistry.reg("acacia_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> ACACIA_WALL = DoTBBlocksRegistry.reg("acacia_wall", () -> new WallBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> ACACIA_SUPPORT_BEAM = DoTBBlocksRegistry.reg("acacia_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> ACACIA_SUPPORT_SLAB = DoTBBlocksRegistry.reg("acacia_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BIRCH_PLANKS_EDGE = DoTBBlocksRegistry.reg("birch_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BIRCH_PLANKS_PLATE = DoTBBlocksRegistry.reg("birch_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BIRCH_PERGOLA = DoTBBlocksRegistry.reg("birch_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BIRCH_LATTICE = DoTBBlocksRegistry.reg("birch_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BIRCH_BEAM = DoTBBlocksRegistry.reg("birch_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BIRCH_WALL = DoTBBlocksRegistry.reg("birch_wall", () -> new WallBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BIRCH_SUPPORT_BEAM = DoTBBlocksRegistry.reg("birch_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BIRCH_SUPPORT_SLAB = DoTBBlocksRegistry.reg("birch_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CANDLESTICK = DoTBBlocksRegistry.reg("candlestick", () -> new CandlestickBlock(Block.Properties.copy(Blocks.CAULDRON).lightLevel(DoTBBlocksRegistry.litBlockEmission(10)), CANDLESTICK_SHAPES));
    public static final RegistryObject<Block> CRIMSON_PLANKS_EDGE = DoTBBlocksRegistry.reg("crimson_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CRIMSON_PLANKS_PLATE = DoTBBlocksRegistry.reg("crimson_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CRIMSON_PERGOLA = DoTBBlocksRegistry.reg("crimson_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CRIMSON_SUPPORT_SLAB = DoTBBlocksRegistry.reg("crimson_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CRIMSON_LATTICE = DoTBBlocksRegistry.reg("crimson_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CRIMSON_BEAM = DoTBBlocksRegistry.reg("crimson_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CRIMSON_SUPPORT_BEAM = DoTBBlocksRegistry.reg("crimson_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CRIMSON_WALL = DoTBBlocksRegistry.reg("crimson_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> DARK_OAK_PLANKS_EDGE = DoTBBlocksRegistry.reg("dark_oak_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> DARK_OAK_PLANKS_PLATE = DoTBBlocksRegistry.reg("dark_oak_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> DARK_OAK_PERGOLA = DoTBBlocksRegistry.reg("dark_oak_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> DARK_OAK_LATTICE = DoTBBlocksRegistry.reg("dark_oak_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> DARK_OAK_BEAM = DoTBBlocksRegistry.reg("dark_oak_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> DARK_OAK_WALL = DoTBBlocksRegistry.reg("dark_oak_wall", () -> new WallBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> DARK_OAK_SUPPORT_BEAM = DoTBBlocksRegistry.reg("dark_oak_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> DARK_OAK_SUPPORT_SLAB = DoTBBlocksRegistry.reg("dark_oak_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> JUNGLE_PLANKS_EDGE = DoTBBlocksRegistry.reg("jungle_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> JUNGLE_PLANKS_PLATE = DoTBBlocksRegistry.reg("jungle_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> JUNGLE_PERGOLA = DoTBBlocksRegistry.reg("jungle_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> JUNGLE_LATTICE = DoTBBlocksRegistry.reg("jungle_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> JUNGLE_BEAM = DoTBBlocksRegistry.reg("jungle_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> JUNGLE_WALL = DoTBBlocksRegistry.reg("jungle_wall", () -> new WallBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> JUNGLE_SUPPORT_BEAM = DoTBBlocksRegistry.reg("jungle_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> JUNGLE_SUPPORT_SLAB = DoTBBlocksRegistry.reg("jungle_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> OAK_PLANKS_PLATE = DoTBBlocksRegistry.reg("oak_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> OAK_PLANKS_EDGE = DoTBBlocksRegistry.reg("oak_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> OAK_PERGOLA = DoTBBlocksRegistry.reg("oak_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> OAK_LATTICE = DoTBBlocksRegistry.reg("oak_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> OAK_BEAM = DoTBBlocksRegistry.reg("oak_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> OAK_WALL = DoTBBlocksRegistry.reg("oak_wall", () -> new WallBlock(Block.Properties.copy(Blocks.OAK_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> OAK_SUPPORT_BEAM = DoTBBlocksRegistry.reg("oak_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> OAK_SUPPORT_SLAB = DoTBBlocksRegistry.reg("oak_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> RAMMED_DIRT = DoTBBlocksRegistry.reg("rammed_dirt", () -> new BlockAA(Block.Properties.copy(Blocks.TERRACOTTA)), BlockTags.MINEABLE_WITH_SHOVEL);
    public static final RegistryObject<Block> SPRUCE_PLANKS_EDGE = DoTBBlocksRegistry.reg("spruce_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> SPRUCE_PLANKS_PLATE = DoTBBlocksRegistry.reg("spruce_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> SPRUCE_PERGOLA = DoTBBlocksRegistry.reg("spruce_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> SPRUCE_LATTICE = DoTBBlocksRegistry.reg("spruce_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> SPRUCE_BEAM = DoTBBlocksRegistry.reg("spruce_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> SPRUCE_WALL = DoTBBlocksRegistry.reg("spruce_wall", () -> new WallBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> SPRUCE_SUPPORT_BEAM = DoTBBlocksRegistry.reg("spruce_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> SPRUCE_SUPPORT_SLAB = DoTBBlocksRegistry.reg("spruce_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> MANGROVE_PLANKS_EDGE = DoTBBlocksRegistry.reg("mangrove_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> MANGROVE_PLANKS_PLATE = DoTBBlocksRegistry.reg("mangrove_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> MANGROVE_PERGOLA = DoTBBlocksRegistry.reg("mangrove_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> MANGROVE_LATTICE = DoTBBlocksRegistry.reg("mangrove_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> MANGROVE_BEAM = DoTBBlocksRegistry.reg("mangrove_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> MANGROVE_WALL = DoTBBlocksRegistry.reg("mangrove_wall", () -> new WallBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> MANGROVE_SUPPORT_BEAM = DoTBBlocksRegistry.reg("mangrove_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> MANGROVE_SUPPORT_SLAB = DoTBBlocksRegistry.reg("mangrove_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHERRY_PLANKS_EDGE = DoTBBlocksRegistry.reg("cherry_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHERRY_PLANKS_PLATE = DoTBBlocksRegistry.reg("cherry_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHERRY_PERGOLA = DoTBBlocksRegistry.reg("cherry_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHERRY_LATTICE = DoTBBlocksRegistry.reg("cherry_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHERRY_BEAM = DoTBBlocksRegistry.reg("cherry_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHERRY_WALL = DoTBBlocksRegistry.reg("cherry_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHERRY_SUPPORT_BEAM = DoTBBlocksRegistry.reg("cherry_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHERRY_SUPPORT_SLAB = DoTBBlocksRegistry.reg("cherry_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BAMBOO_PLANKS_EDGE = DoTBBlocksRegistry.reg("bamboo_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BAMBOO_PLANKS_PLATE = DoTBBlocksRegistry.reg("bamboo_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BAMBOO_PERGOLA = DoTBBlocksRegistry.reg("bamboo_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BAMBOO_LATTICE = DoTBBlocksRegistry.reg("bamboo_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BAMBOO_BEAM = DoTBBlocksRegistry.reg("bamboo_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BAMBOO_WALL = DoTBBlocksRegistry.reg("bamboo_wall", () -> new WallBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BAMBOO_SUPPORT_BEAM = DoTBBlocksRegistry.reg("bamboo_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BAMBOO_SUPPORT_SLAB = DoTBBlocksRegistry.reg("bamboo_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> THATCH_WHEAT = DoTBBlocksRegistry.reg("thatch_wheat", () -> new BlockAA(Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(80, 30), BlockTags.MINEABLE_WITH_HOE);
    public static final RegistryObject<Block> THATCH_WHEAT_EDGE = DoTBBlocksRegistry.reg("thatch_wheat_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(80, 30), BlockTags.MINEABLE_WITH_HOE);
    public static final RegistryObject<Block> THATCH_WHEAT_PLATE = DoTBBlocksRegistry.reg("thatch_wheat_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(80, 30), BlockTags.MINEABLE_WITH_HOE);
    public static final RegistryObject<Block> THATCH_WHEAT_SLAB = DoTBBlocksRegistry.reg("thatch_wheat_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(80, 30), BlockTags.MINEABLE_WITH_HOE);
    public static final RegistryObject<Block> THATCH_WHEAT_STAIRS = DoTBBlocksRegistry.reg("thatch_wheat_stairs", () -> new StairsBlockAA(DoTBBlocksRegistry.THATCH_WHEAT, Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(80, 30), BlockTags.MINEABLE_WITH_HOE);
    public static final RegistryObject<Block> THATCH_BAMBOO = DoTBBlocksRegistry.reg("thatch_bamboo", () -> new BlockAA(Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(40, 30), BlockTags.MINEABLE_WITH_HOE);
    public static final RegistryObject<Block> THATCH_BAMBOO_EDGE = DoTBBlocksRegistry.reg("thatch_bamboo_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(40, 30), BlockTags.MINEABLE_WITH_HOE);
    public static final RegistryObject<Block> THATCH_BAMBOO_PLATE = DoTBBlocksRegistry.reg("thatch_bamboo_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(40, 30), BlockTags.MINEABLE_WITH_HOE);
    public static final RegistryObject<Block> THATCH_BAMBOO_SLAB = DoTBBlocksRegistry.reg("thatch_bamboo_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(40, 30), BlockTags.MINEABLE_WITH_HOE);
    public static final RegistryObject<Block> THATCH_BAMBOO_STAIRS = DoTBBlocksRegistry.reg("thatch_bamboo_stairs", () -> new StairsBlockAA(DoTBBlocksRegistry.THATCH_BAMBOO, Block.Properties.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW).strength(1.0F).sound(SoundType.GRASS)).setBurnable(40, 30), BlockTags.MINEABLE_WITH_HOE);
    public static final RegistryObject<Block> WARPED_PLANKS_EDGE = DoTBBlocksRegistry.reg("warped_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WARPED_PLANKS_PLATE = DoTBBlocksRegistry.reg("warped_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WARPED_SUPPORT_SLAB = DoTBBlocksRegistry.reg("warped_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WARPED_PERGOLA = DoTBBlocksRegistry.reg("warped_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WARPED_LATTICE = DoTBBlocksRegistry.reg("warped_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WARPED_BEAM = DoTBBlocksRegistry.reg("warped_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WARPED_SUPPORT_BEAM = DoTBBlocksRegistry.reg("warped_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WARPED_WALL = DoTBBlocksRegistry.reg("warped_wall", () -> new WallBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> GOLD_PLATED_SMOOTH_BLOCK = DoTBBlocksRegistry.reg("gold_plated_smooth_block", () -> new BlockAA(Block.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> GOLD_PLATED_SMOOTH_STAIRS = DoTBBlocksRegistry.reg("gold_plated_smooth_stairs", () -> new StairsBlockAA(DoTBBlocksRegistry.GOLD_PLATED_SMOOTH_BLOCK, Block.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> GOLD_PLATED_SMOOTH_PLATE = DoTBBlocksRegistry.reg("gold_plated_smooth_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> GOLD_PLATED_SMOOTH_SLAB = DoTBBlocksRegistry.reg("gold_plated_smooth_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> GOLD_PLATED_SMOOTH_EDGE = DoTBBlocksRegistry.reg("gold_plated_smooth_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> GOLD_PLATED_SMOOTH_WALL = DoTBBlocksRegistry.reg("gold_plated_smooth_wall", () -> new WallBlock(Block.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> FIREPLACE = DoTBBlocksRegistry.reg("fireplace", () -> new FireplaceBlock(Block.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F).lightLevel(DoTBBlocksRegistry.litBlockEmission(15))));
    public static final RegistryObject<Block> IRON_PORTCULLIS = DoTBBlocksRegistry.reg("iron_portcullis", () -> new PortcullisBlock(Block.Properties.copy(Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> IRON_FANCY_LANTERN = DoTBBlocksRegistry.reg("iron_fancy_lantern", () -> new LanternBlock(Block.Properties.copy(Blocks.IRON_BARS).noOcclusion().lightLevel(state -> 15), IRON_FANCY_LANTERN_SHAPES));
    public static final RegistryObject<Block> IRON_COLUMN = DoTBBlocksRegistry.reg("iron_column", () -> new IronColumnBlock(Block.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> WROUGHT_IRON_FENCE = DoTBBlocksRegistry.reg("wrought_iron_fence", () -> new IronFenceBlock(Block.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> WATER_FLOWING_TRICKLE = DoTBBlocksRegistry.regWithItem("water_flowing_trickle", () -> new WaterFlowingTrickleBlock(Block.Properties.copy(Blocks.WATER).randomTicks()), null);
    public static final RegistryObject<Block> WATER_SOURCE_TRICKLE = DoTBBlocksRegistry.reg("water_source_trickle", () -> new WaterSourceTrickleBlock(Block.Properties.copy(Blocks.SEAGRASS).randomTicks()));
    // French
    public static final RegistryObject<Block> COBBLED_LIMESTONE = DoTBBlocksRegistry.reg("cobbled_limestone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> LIMESTONE_BRICKS = DoTBBlocksRegistry.reg("limestone_bricks", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> LIMESTONE_BRICKS_EDGE = DoTBBlocksRegistry.reg("limestone_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> LIMESTONE_BRICKS_PLATE = DoTBBlocksRegistry.reg("limestone_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> LIMESTONE_BRICKS_SLAB = DoTBBlocksRegistry.reg("limestone_bricks_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> LIMESTONE_BRICKS_STAIRS = DoTBBlocksRegistry.reg("limestone_bricks_stairs", () -> new StairsBlockAA(DoTBBlocksRegistry.LIMESTONE_BRICKS, Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> LIMESTONE_BRICKS_WALL = DoTBBlocksRegistry.reg("limestone_bricks_wall", () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> LIMESTONE_BALUSTER = DoTBBlocksRegistry.reg("limestone_baluster", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion()));
    public static final RegistryObject<Block> LIMESTONE_SIDED_COLUMN = DoTBBlocksRegistry.reg("limestone_sided_column", () -> new ConnectedVerticalSidedBlock(Block.Properties.copy(Blocks.STONE_BRICKS), LIMESTONE_SIDED_COLUMN_SHAPES));
    public static final RegistryObject<Block> LIMESTONE_GARGOYLE = DoTBBlocksRegistry.reg("limestone_gargoyle", () -> new LimestoneGargoyleBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion().randomTicks()));
    public static final RegistryObject<Block> LIMESTONE_CHIMNEY = DoTBBlocksRegistry.reg("limestone_chimney", () -> new AxisChimneyBlock(Block.Properties.copy(Blocks.STONE_BRICKS), LIMESTONE_CHIMNEY_SHAPES));
    public static final RegistryObject<Block> LIMESTONE_FIREPLACE = DoTBBlocksRegistry.reg("limestone_fireplace", () -> new ConnectedVerticalSidedPlanFireplaceBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion().lightLevel(DoTBBlocksRegistry.litBlockEmission(15))));
    public static final RegistryObject<Block> ROOFING_SLATES = DoTBBlocksRegistry.reg("roofing_slates", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> ROOFING_SLATES_STAIRS = DoTBBlocksRegistry.reg("roofing_slates_stairs", () -> new StairsBlockAA(DoTBBlocksRegistry.ROOFING_SLATES, Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> ROOFING_SLATES_PLATE = DoTBBlocksRegistry.reg("roofing_slates_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> ROOFING_SLATES_SLAB = DoTBBlocksRegistry.reg("roofing_slates_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> ROOFING_SLATES_EDGE = DoTBBlocksRegistry.reg("roofing_slates_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> ROOFING_SLATES_WALL = DoTBBlocksRegistry.reg("roofing_slates_wall", () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> BLACK_WROUGHT_IRON_BALUSTER = DoTBBlocksRegistry.reg("black_wrought_iron_baluster", () -> new PlateBlock(Block.Properties.copy(Blocks.IRON_BARS), THIN_PLATE_SHAPES));
    public static final RegistryObject<Block> BLACK_WROUGHT_IRON_FENCE = DoTBBlocksRegistry.reg("black_wrought_iron_fence", () -> new IronFenceBlock(Block.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> REINFORCED_BLACK_WROUGHT_IRON_FENCE = DoTBBlocksRegistry.reg("reinforced_black_wrought_iron_fence", () -> new ReinforcedIronFenceBlock(Block.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> REINFORCED_GOLDEN_WROUGHT_IRON_FENCE = DoTBBlocksRegistry.reg("reinforced_golden_wrought_iron_fence", () -> new ReinforcedIronFenceBlock(Block.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> BOXWOOD_BUSH = DoTBBlocksRegistry.reg("boxwood_bush", () -> new BushBlockDoT(Block.Properties.copy(Blocks.SPRUCE_LEAVES), BUSH_SHAPES), BlockTags.SWORD_EFFICIENT);
    public static final RegistryObject<Block> BOXWOOD_TALL_HEDGE = DoTBBlocksRegistry.reg("boxwood_tall_hedge", () -> new PlateBlock(Block.Properties.copy(Blocks.SPRUCE_LEAVES)), BlockTags.SWORD_EFFICIENT);
    public static final RegistryObject<Block> BOXWOOD_SMALL_HEDGE = DoTBBlocksRegistry.reg("boxwood_small_hedge", () -> new EdgeBlock(Block.Properties.copy(Blocks.SPRUCE_LEAVES)), BlockTags.SWORD_EFFICIENT);
    // German
    public static final RegistryObject<Block> FLAT_ROOF_TILES = DoTBBlocksRegistry.reg("flat_roof_tiles", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> FLAT_ROOF_TILES_STAIRS = DoTBBlocksRegistry.reg("flat_roof_tiles_stairs", () -> new StairsBlockAA(DoTBBlocksRegistry.FLAT_ROOF_TILES, Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> FLAT_ROOF_TILES_PLATE = DoTBBlocksRegistry.reg("flat_roof_tiles_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> FLAT_ROOF_TILES_SLAB = DoTBBlocksRegistry.reg("flat_roof_tiles_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> FLAT_ROOF_TILES_EDGE = DoTBBlocksRegistry.reg("flat_roof_tiles_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> FLAT_ROOF_TILES_WALL = DoTBBlocksRegistry.reg("flat_roof_tiles_wall", () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> LATTICE_GLASS = DoTBBlocksRegistry.reg("lattice_glass", () -> new GlassBlock(Block.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> LATTICE_GLASS_PANE = DoTBBlocksRegistry.reg("lattice_glass_pane", () -> new PaneBlockAA(Block.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> LATTICE_WAXED_OAK_WINDOW = DoTBBlocksRegistry.reg("lattice_waxed_oak_window", () -> new SidedWindowBlock(Block.Properties.copy(Blocks.GLASS)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> LATTICE_STONE_BRICKS_WINDOW = DoTBBlocksRegistry.reg("lattice_stone_bricks_window", () -> new LatticeStoneBricksWindowBlock(Block.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> STONE_BRICKS_ARROWSLIT = DoTBBlocksRegistry.reg("stone_bricks_arrowslit", () -> new WaterloggedHorizontalBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion(), STONE_BRICKS_ARROWSLIT_SHAPES));
    public static final RegistryObject<Block> STONE_BRICKS_CHIMNEY = DoTBBlocksRegistry.reg("stone_bricks_chimney", () -> new ChimneyBlockAA(Block.Properties.copy(Blocks.STONE_BRICKS), STONE_BRICKS_CHIMNEY_SHAPES));
    public static final RegistryObject<Block> STONE_BRICKS_EDGE = DoTBBlocksRegistry.reg("stone_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> STONE_BRICKS_FIREPLACE = DoTBBlocksRegistry.reg("stone_bricks_fireplace", () -> new ConnectedVerticalSidedPlanFireplaceBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion().lightLevel(DoTBBlocksRegistry.litBlockEmission(15))));
    public static final RegistryObject<Block> STONE_BRICKS_MACHICOLATION = DoTBBlocksRegistry.reg("stone_bricks_machicolation", () -> new ConnectedHorizontalBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion(), STONE_BRICKS_MACHICOLATION_SHAPES));
    public static final RegistryObject<Block> STONE_BRICKS_PLATE = DoTBBlocksRegistry.reg("stone_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> STONE_BRICKS_MASONRY = DoTBBlocksRegistry.reg("stone_bricks_masonry", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> STONE_BRICKS_MASONRY_STAIRS = DoTBBlocksRegistry.reg("stone_bricks_masonry_stairs", () -> new StairsBlockAA(DoTBBlocksRegistry.STONE_BRICKS_MASONRY, Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> STONE_BRICKS_MASONRY_PLATE = DoTBBlocksRegistry.reg("stone_bricks_masonry_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> STONE_BRICKS_MASONRY_SLAB = DoTBBlocksRegistry.reg("stone_bricks_masonry_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> STONE_BRICKS_MASONRY_EDGE = DoTBBlocksRegistry.reg("stone_bricks_masonry_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> STONE_BRICKS_MASONRY_WALL = DoTBBlocksRegistry.reg("stone_bricks_masonry_wall", () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> WAXED_OAK_FRAMED_RAMMED_DIRT = DoTBBlocksRegistry.reg("waxed_oak_framed_rammed_dirt", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BROWN).strength(2.0F, 3.0F)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_FRAMED_RAMMED_DIRT_PILLAR = DoTBBlocksRegistry.reg("waxed_oak_framed_rammed_dirt_pillar", () -> new RotatedPillarBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_PLANKS = DoTBBlocksRegistry.reg("waxed_oak_planks", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_DOOR = DoTBBlocksRegistry.reg("waxed_oak_door", () -> new DoorBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F).noOcclusion(), BlockSetType.ACACIA), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_TRAPDOOR = DoTBBlocksRegistry.reg("waxed_oak_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F).noOcclusion(), BlockSetType.ACACIA), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_SHUTTER = DoTBBlocksRegistry.reg("waxed_oak_shutters", () -> new ShutterBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_LOG_STRIPPED = DoTBBlocksRegistry.reg("waxed_oak_log_stripped", () -> new RotatedPillarBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_BALUSTER = DoTBBlocksRegistry.reg("waxed_oak_baluster", () -> new PlateBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F).noOcclusion(), WAXED_OAK_BALUSTER_SHAPES), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_BEAM = DoTBBlocksRegistry.reg("waxed_oak_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_SUPPORT_BEAM = DoTBBlocksRegistry.reg("waxed_oak_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_SUPPORT_SLAB = DoTBBlocksRegistry.reg("waxed_oak_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_SMALL_SHUTTER = DoTBBlocksRegistry.reg("waxed_oak_small_shutters", () -> new SmallShutterBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_TIMBER_FRAME = DoTBBlocksRegistry.reg("waxed_oak_timber_frame", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_TIMBER_FRAME_CORNER = DoTBBlocksRegistry.reg("waxed_oak_timber_frame_corner", () -> new InvertedBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_TIMBER_FRAME_CROSSED = DoTBBlocksRegistry.reg("waxed_oak_timber_frame_crossed", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_TIMBER_FRAME_PILLAR = DoTBBlocksRegistry.reg("waxed_oak_timber_frame_pillar", () -> new RotatedPillarBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_TIMBER_FRAME_SQUARED = DoTBBlocksRegistry.reg("waxed_oak_timber_frame_squared", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_FENCE = DoTBBlocksRegistry.reg("waxed_oak_fence", () -> new FenceBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_FENCE_GATE = DoTBBlocksRegistry.reg("waxed_oak_fence_gate", () -> new WaterloggedFenceGateBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F), WoodType.OAK), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_WALL = DoTBBlocksRegistry.reg("waxed_oak_wall", () -> new WallBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_PERGOLA = DoTBBlocksRegistry.reg("waxed_oak_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_LATTICE = DoTBBlocksRegistry.reg("waxed_oak_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_PLANKS_EDGE = DoTBBlocksRegistry.reg("waxed_oak_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_PLANKS_PLATE = DoTBBlocksRegistry.reg("waxed_oak_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_PLANKS_SLAB = DoTBBlocksRegistry.reg("waxed_oak_planks_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_PLANKS_STAIRS = DoTBBlocksRegistry.reg("waxed_oak_planks_stairs", () -> new StairsBlockAA(DoTBBlocksRegistry.WAXED_OAK_PLANKS, Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_CHANDELIER = DoTBBlocksRegistry.reg("waxed_oak_chandelier", () -> new WaxedOakChandelierBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F).noOcclusion().lightLevel(DoTBBlocksRegistry.litBlockEmission(15))), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_CHAIR = DoTBBlocksRegistry.reg("waxed_oak_chair", () -> new DoubleChairBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F).noOcclusion(), 11.0F, WAXED_OAK_CHAIR_SHAPES), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WAXED_OAK_TABLE = DoTBBlocksRegistry.reg("waxed_oak_table", () -> new ConnectedHorizontalPlanDoubleTableBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F).noOcclusion(), WAXED_OAK_TABLE_SHAPES), BlockTags.MINEABLE_WITH_AXE);
    //public static final RegistryObject<Block> WAXED_OAK_CANOPY_BED = DoTBBlocksRegistry.reg("waxed_oak_canopy_bed", () -> new WaxedOakCanopyBedBlock(DyeColor.RED, BlockBehaviour.Properties.copy(Blocks.WHITE_BED).noOcclusion()), BlockTags.MINEABLE_WITH_AXE);
    //public static final RegistryObject<Block> WAXED_OAK_CANOPY_BED_WOOD = DoTBBlocksRegistry.regWithItem("waxed_oak_canopy_bed", () -> new WaxedOakCanopyBedWoodBlock(BlockBehaviour.Properties.copy(WAXED_OAK_PLANKS.get()).noOcclusion()), null, BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> IVY = DoTBBlocksRegistry.regWithFlowerPotItem("ivy", () -> new IvyBlock(Block.Properties.copy(Blocks.VINE).randomTicks().strength(0.2F).sound(SoundType.VINE)), (block) -> new PotAndBlockItem(block, new Item.Properties()));
    public static final RegistryObject<Block> GERANIUM_PINK = DoTBBlocksRegistry.regWithFlowerPotItem("geranium_pink", () -> new GeraniumBlock(Block.Properties.copy(Blocks.SUNFLOWER).offsetType(BlockBehaviour.OffsetType.NONE).instabreak().sound(SoundType.GRASS)), (block) -> new PotAndBlockItem(block, new Item.Properties()));
    public static final RegistryObject<Block> PLANTER_GERANIUM_PINK = DoTBBlocksRegistry.reg("planter_geranium_pink", () -> new PlanterBlock(Block.Properties.copy(Blocks.CLAY).strength(0.6F).noOcclusion()));
    public static final RegistryObject<Block> STONE_BRICKS_POOL = DoTBBlocksRegistry.reg("stone_bricks_pool", () -> new PoolBlock(Block.Properties.copy(Blocks.STONE), 16, 14, POOL_SHAPES));
    public static final RegistryObject<Block> STONE_BRICKS_SMALL_POOL = DoTBBlocksRegistry.reg("stone_bricks_small_pool", () -> new SmallPoolBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> STONE_BRICKS_FAUCET = DoTBBlocksRegistry.reg("stone_bricks_faucet", () -> new FaucetBlock(Block.Properties.copy(Blocks.STONE).noOcclusion().noCollission().randomTicks()));
    public static final RegistryObject<Block> STONE_BRICKS_WATER_JET = DoTBBlocksRegistry.reg("stone_bricks_water_jet", () -> new WaterJetBlock(Block.Properties.copy(Blocks.STONE).noOcclusion().noCollission()));
    // Japanese
    public static final RegistryObject<Block> CHARRED_SPRUCE_PLANKS = DoTBBlocksRegistry.reg("charred_spruce_planks", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_LOG_STRIPPED = DoTBBlocksRegistry.reg("charred_spruce_log_stripped", () -> new RotatedPillarBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_PLANKS_EDGE = DoTBBlocksRegistry.reg("charred_spruce_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_PLANKS_PLATE = DoTBBlocksRegistry.reg("charred_spruce_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_PLANKS_SLAB = DoTBBlocksRegistry.reg("charred_spruce_planks_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_PLANKS_STAIRS = DoTBBlocksRegistry.reg("charred_spruce_planks_stairs", () -> new StairsBlockAA(DoTBBlocksRegistry.CHARRED_SPRUCE_PLANKS, Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_BOARDS = DoTBBlocksRegistry.reg("charred_spruce_boards", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_DOOR = DoTBBlocksRegistry.reg("charred_spruce_door", () -> new DoorBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion(), BlockSetType.SPRUCE), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_TRAPDOOR = DoTBBlocksRegistry.reg("charred_spruce_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion(), BlockSetType.SPRUCE), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_SHUTTERS = DoTBBlocksRegistry.reg("charred_spruce_shutters", () -> new CharredSpruceShuttersBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion(), CHARRED_SPRUCE_SHUTTERS_SHAPES), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_TALL_SHUTTERS = DoTBBlocksRegistry.reg("charred_spruce_tall_shutters", () -> new CharredSpruceTallShuttersBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion()), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_FOUNDATION = DoTBBlocksRegistry.reg("charred_spruce_foundation", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_FOUNDATION_SLAB = DoTBBlocksRegistry.reg("charred_spruce_foundation_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_WALL = DoTBBlocksRegistry.reg("charred_spruce_wall", () -> new WallBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_FENCE = DoTBBlocksRegistry.reg("charred_spruce_fence", () -> new FenceBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_FENCE_GATE = DoTBBlocksRegistry.reg("charred_spruce_fence_gate", () -> new WaterloggedFenceGateBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F), WoodType.SPRUCE), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_RAILING = DoTBBlocksRegistry.reg("charred_spruce_railing", () -> new CharredSpruceRailingBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion()), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_FANCY_RAILING = DoTBBlocksRegistry.reg("charred_spruce_fancy_railing", () -> new CharredSpruceFancyRailingBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion()), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_PERGOLA = DoTBBlocksRegistry.reg("charred_spruce_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_LATTICE = DoTBBlocksRegistry.reg("charred_spruce_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion()).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_SUPPORT_SLAB = DoTBBlocksRegistry.reg("charred_spruce_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_SUPPORT_BEAM = DoTBBlocksRegistry.reg("charred_spruce_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_BEAM = DoTBBlocksRegistry.reg("charred_spruce_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_TIMBER_FRAME = DoTBBlocksRegistry.reg("charred_spruce_timber_frame", () -> new BlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CHARRED_SPRUCE_TIMBER_FRAME_PILLAR = DoTBBlocksRegistry.reg("charred_spruce_timber_frame_pillar", () -> new RotatedPillarBlockAA(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> RED_PAINTED_BEAM = DoTBBlocksRegistry.reg("red_painted_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F)).setBurnable(2, 3), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> GRAY_ROOF_TILES = DoTBBlocksRegistry.reg("gray_roof_tiles", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> GRAY_ROOF_TILES_STAIRS = DoTBBlocksRegistry.reg("gray_roof_tiles_stairs", () -> new StairsBlockAA(DoTBBlocksRegistry.GRAY_ROOF_TILES, Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> GRAY_ROOF_TILES_PLATE = DoTBBlocksRegistry.reg("gray_roof_tiles_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> GRAY_ROOF_TILES_SLAB = DoTBBlocksRegistry.reg("gray_roof_tiles_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> GRAY_ROOF_TILES_EDGE = DoTBBlocksRegistry.reg("gray_roof_tiles_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> GRAY_ROOF_TILES_WALL = DoTBBlocksRegistry.reg("gray_roof_tiles_wall", () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CHARRED_SPRUCE_ROOF_SUPPORT = DoTBBlocksRegistry.regWithItem("charred_spruce_roof_support", () -> new MixedRoofSupportBlock(DoTBBlocksRegistry.GRAY_ROOF_TILES_SLAB, Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion()), MixedRoofSupportBlock::getBlockItem, BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> STEPPING_STONES = DoTBBlocksRegistry.reg("stepping_stones", () -> new BlockAA(Block.Properties.copy(Blocks.SAND).mapColor(MapColor.STONE).strength(1.2F).sound(SoundType.GRAVEL)), BlockTags.MINEABLE_WITH_SHOVEL);
    public static final RegistryObject<Block> STEPPING_STONES_SLAB = DoTBBlocksRegistry.reg("stepping_stones_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.SAND).mapColor(MapColor.STONE).strength(1.2F).sound(SoundType.GRAVEL)), BlockTags.MINEABLE_WITH_SHOVEL);
    public static final RegistryObject<Block> CURVED_RAKED_GRAVEL = DoTBBlocksRegistry.reg("curved_raked_gravel", () -> new HorizontalBlockAA(Block.Properties.copy(Blocks.SAND).mapColor(MapColor.STONE).strength(1.0F).sound(SoundType.GRAVEL)), BlockTags.MINEABLE_WITH_SHOVEL);
    public static final RegistryObject<Block> STRAIGHT_RAKED_GRAVEL = DoTBBlocksRegistry.reg("straight_raked_gravel", () -> new HorizontalAxisBlock(Block.Properties.copy(Blocks.SAND).mapColor(MapColor.STONE).strength(1.0F).sound(SoundType.GRAVEL)), BlockTags.MINEABLE_WITH_SHOVEL);
    public static final RegistryObject<Block> CAST_IRON_TEAPOT_GRAY = DoTBBlocksRegistry.reg("cast_iron_teapot_gray", () -> new SpecialDisplayBlock(Block.Properties.copy(Blocks.IRON_BLOCK).strength(1.0F).noOcclusion(), CAST_IRON_TEAPOT_SHAPES));
    public static final RegistryObject<Block> CAST_IRON_TEAPOT_GREEN = DoTBBlocksRegistry.reg("cast_iron_teapot_green", () -> new SpecialDisplayBlock(Block.Properties.copy(Blocks.IRON_BLOCK).strength(1.0F).noOcclusion(), CAST_IRON_TEAPOT_SHAPES));
    public static final RegistryObject<Block> CAST_IRON_TEAPOT_DECORATED = DoTBBlocksRegistry.reg("cast_iron_teapot_decorated", () -> new SpecialDisplayBlock(Block.Properties.copy(Blocks.IRON_BLOCK).strength(1.0F).noOcclusion(), CAST_IRON_TEAPOT_SHAPES));
    public static final RegistryObject<Block> CAST_IRON_TEACUP_GRAY = DoTBBlocksRegistry.reg("cast_iron_teacup_gray", () -> new SpecialDisplayBlock(Block.Properties.copy(Blocks.IRON_BLOCK).strength(1.0F).noOcclusion(), CAST_IRON_TEACUP_SHAPES));
    public static final RegistryObject<Block> CAST_IRON_TEACUP_GREEN = DoTBBlocksRegistry.reg("cast_iron_teacup_green", () -> new SpecialDisplayBlock(Block.Properties.copy(Blocks.IRON_BLOCK).strength(1.0F).noOcclusion(), CAST_IRON_TEACUP_SHAPES));
    public static final RegistryObject<Block> CAST_IRON_TEACUP_DECORATED = DoTBBlocksRegistry.reg("cast_iron_teacup_decorated", () -> new SpecialDisplayBlock(Block.Properties.copy(Blocks.IRON_BLOCK).strength(1.0F).noOcclusion(), CAST_IRON_TEACUP_SHAPES));
    public static final RegistryObject<Block> BAMBOO_DRYING_TRAY = DoTBBlocksRegistry.reg("bamboo_drying_tray", () -> new DryerBlock(Block.Properties.copy(Blocks.OAK_PLANKS).noOcclusion(), DRYER_SHAPES), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> CAMELLIA = DoTBBlocksRegistry.regWithFlowerPotItem("camellia", () -> new GrowingBushBlock(PlantType.PLAINS, 3), "camellia_seeds", (block) -> new SoilSeedsItem(block, null));
    public static final RegistryObject<Block> MULBERRY = DoTBBlocksRegistry.regWithFlowerPotItem("mulberry", () -> new MulberryBlock(PlantType.PLAINS, 3, 2), (block) -> new SoilSeedsItem(block, Foods.MULBERRY));
    public static final RegistryObject<Block> IKEBANA_FLOWER_POT = DoTBBlocksRegistry.reg("ikebana_flower_pot", () -> new SidedFlowerPotBlock(null));
    public static final RegistryObject<Block> SPRUCE_LOW_TABLE = DoTBBlocksRegistry.reg("spruce_low_table", () -> new SpruceLowTableBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion().lightLevel(DoTBBlocksRegistry.litBlockEmission(14))), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> SPRUCE_LEGLESS_CHAIR = DoTBBlocksRegistry.reg("spruce_legless_chair", () -> new ChairBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).noOcclusion(), 3.0F, SPRUCE_LEGLESS_CHAIR_SHAPES), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> WHITE_LITTLE_FLAG = DoTBBlocksRegistry.reg("white_little_flag", () -> new LittleFlagBlock(Block.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> PAPER_DOOR = DoTBBlocksRegistry.reg("paper_door", () -> new CenteredDoorBlock(Block.Properties.copy(Blocks.WHITE_WOOL).strength(1.5F, 1.5F), BlockSetType.BAMBOO), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> PAPER_WALL = DoTBBlocksRegistry.reg("paper_wall", () -> new BottomPaneBlock(Block.Properties.copy(Blocks.WHITE_WOOL).strength(1.5F, 1.5F)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> PAPER_WALL_FLAT = DoTBBlocksRegistry.reg("paper_wall_flat", () -> new PillarPaneBlock(Block.Properties.copy(Blocks.WHITE_WOOL).strength(1.5F, 1.5F)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> PAPER_WALL_WINDOWS = DoTBBlocksRegistry.reg("paper_wall_window", () -> new PillarPaneBlock(Block.Properties.copy(Blocks.WHITE_WOOL).strength(1.5F, 1.5F)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> PAPER_WALL_FLOWERY = DoTBBlocksRegistry.reg("paper_wall_flowery", () -> new PillarPaneBlock(Block.Properties.copy(Blocks.WHITE_WOOL).strength(1.5F, 1.5F)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> PAPER_FOLDING_SCREEN = DoTBBlocksRegistry.reg("paper_folding_screen", () -> new FoldingScreenBlock(Block.Properties.copy(Blocks.WHITE_WOOL).strength(1.5F, 1.5F).noOcclusion(), FULL_SHAPE), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> RED_PAPER_LANTERN = DoTBBlocksRegistry.reg("red_paper_lantern", () -> new PaperLanternBlock(Block.Properties.copy(Blocks.RED_WOOL).noOcclusion().noCollission().lightLevel(state -> 12)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> PAPER_LAMP = DoTBBlocksRegistry.reg("paper_lamp", () -> new PaperLampBlock(Block.Properties.copy(Blocks.WHITE_WOOL).noOcclusion().lightLevel(state -> 14)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> STONE_LANTERN = DoTBBlocksRegistry.reg("stone_lantern", () -> new LanternBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion().lightLevel(state -> 15), STONE_LANTERN_SHAPES));
    public static final RegistryObject<Block> RICE = DoTBBlocksRegistry.regWithItem("rice", () -> new WaterDoubleCropsBlock(2), (block) -> new SoilSeedsItem(block, null), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> SMALL_TATAMI_MAT = DoTBBlocksRegistry.reg("small_tatami_mat", () -> new SmallTatamiMatBlock(Block.Properties.copy(Blocks.WHITE_CARPET)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> SMALL_TATAMI_FLOOR = DoTBBlocksRegistry.regWithItem("small_tatami_floor", () -> new SmallTatamiFloorBlock(Block.Properties.copy(Blocks.WHITE_CARPET)), null, BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> TATAMI_MAT = DoTBBlocksRegistry.reg("tatami_mat", () -> new TatamiMatBlock(Block.Properties.copy(Blocks.WHITE_CARPET)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> TATAMI_FLOOR = DoTBBlocksRegistry.regWithItem("tatami_floor", () -> new TatamiFloorBlock(Block.Properties.copy(Blocks.WHITE_CARPET)), null, BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> LIGHT_GRAY_FUTON = DoTBBlocksRegistry.reg("light_gray_futon", () -> new FutonBlock(DyeColor.LIGHT_GRAY, Block.Properties.copy(Blocks.LIGHT_GRAY_BED)), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> IRORI_FIREPLACE = DoTBBlocksRegistry.reg("irori_fireplace", () -> new IroriFireplaceBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion().lightLevel(DoTBBlocksRegistry.litBlockEmission(15))));
    public static final RegistryObject<Block> SAKE_BOTTLE = DoTBBlocksRegistry.reg("sake_bottle", () -> new SpecialDisplayBlock(Block.Properties.copy(Blocks.FLOWER_POT), SAKE_BOTTLE_SHAPES));
    public static final RegistryObject<Block> SAKE_CUP = DoTBBlocksRegistry.reg("sake_cup", () -> new SpecialDisplayBlock(Block.Properties.copy(Blocks.FLOWER_POT), SAKE_CUP_SHAPES));
    public static final RegistryObject<Block> STICK_BUNDLE = DoTBBlocksRegistry.reg("stick_bundle", () -> new StickBundleBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(2.0F, 3.0F).sound(SoundType.GRASS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> MAPLE_RED_TRUNK = DoTBBlocksRegistry.regWithItem("maple_red_trunk", () -> new MapleTrunkBlock(Block.Properties.copy(Blocks.SPRUCE_LEAVES)), null, BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> MAPLE_RED_LEAVES = DoTBBlocksRegistry.regWithItem("maple_red_leaves", () -> new MapleLeavesBlock(Block.Properties.copy(Blocks.SPRUCE_LEAVES)), null, BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> MAPLE_RED_SAPLING = DoTBBlocksRegistry.regWithFlowerPotItem("maple_red_sapling", () -> new MapleSaplingBlock(Block.Properties.copy(Blocks.SPRUCE_LEAVES)), (block) -> new PotAndBlockItem(block, new Item.Properties()));
    public static final RegistryObject<Block> PAUSED_MAPLE_RED_SAPLING = DoTBBlocksRegistry.regWithItem("paused_maple_red_sapling", () -> new PausedMapleSaplingBlock(Block.Properties.copy(Blocks.SPRUCE_LEAVES)), null, BlockTags.MINEABLE_WITH_AXE);
    // Persian
    public static final RegistryObject<Block> PERSIAN_CARPET_RED = DoTBBlocksRegistry.reg("persian_carpet_red", () -> new BlockAA(Block.Properties.copy(Blocks.RED_WOOL), CARPET_SHAPES), BlockTags.SWORD_EFFICIENT);
    public static final RegistryObject<Block> PERSIAN_CARPET_DELICATE_RED = DoTBBlocksRegistry.reg("persian_carpet_delicate_red", () -> new BlockAA(Block.Properties.copy(Blocks.RED_WOOL), CARPET_SHAPES), BlockTags.SWORD_EFFICIENT);
    public static final RegistryObject<Block> MORAQ_MOSAIC_RECESS = DoTBBlocksRegistry.reg("moraq_mosaic_recess", () -> new StairsBlockAA(DoTBBlocksRegistry.MORAQ_MOSAIC_DELICATE, Block.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MORAQ_MOSAIC_RELIEF = DoTBBlocksRegistry.reg("moraq_mosaic_relief", () -> new ConnectedVerticalSidedPlanBlock(Block.Properties.copy(Blocks.BRICKS), RELIEF_SHAPES));
    public static final RegistryObject<Block> MORAQ_MOSAIC_TRADITIONAL = DoTBBlocksRegistry.reg("moraq_mosaic_traditional", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MORAQ_MOSAIC_DELICATE = DoTBBlocksRegistry.reg("moraq_mosaic_delicate", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MORAQ_MOSAIC_BORDER = DoTBBlocksRegistry.reg("moraq_mosaic_border", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MORAQ_MOSAIC_GEOMETRIC = DoTBBlocksRegistry.reg("moraq_mosaic_geometric", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MORAQ_MOSAIC_PATTERN = DoTBBlocksRegistry.reg("moraq_mosaic_pattern", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MORAQ_MOSAIC_COLUMN = DoTBBlocksRegistry.reg("moraq_mosaic_column", () -> new MoraqMosaicColumnBlock(Block.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> SANDSTONE_BRICKS = DoTBBlocksRegistry.reg("sandstone_bricks", () -> new BlockAA(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<Block> SANDSTONE_BRICKS_STAIRS = DoTBBlocksRegistry.reg("sandstone_bricks_stairs", () -> new StairsBlockAA(DoTBBlocksRegistry.SANDSTONE_BRICKS, Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<Block> SANDSTONE_BRICKS_PLATE = DoTBBlocksRegistry.reg("sandstone_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<Block> SANDSTONE_BRICKS_SLAB = DoTBBlocksRegistry.reg("sandstone_bricks_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<Block> SANDSTONE_BRICKS_EDGE = DoTBBlocksRegistry.reg("sandstone_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<Block> SANDSTONE_BRICKS_WALL = DoTBBlocksRegistry.reg("sandstone_bricks_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<Block> SANDSTONE_BRICKS_TURQUOISE_PATTERN = DoTBBlocksRegistry.reg("sandstone_bricks_turquoise_pattern", () -> new BlockAA(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<Block> SANDSTONE_BRICKS_TURQUOISE_PATTERN_STAIRS = DoTBBlocksRegistry.reg("sandstone_bricks_turquoise_pattern_stairs", () -> new StairsBlockAA(DoTBBlocksRegistry.SANDSTONE_BRICKS_TURQUOISE_PATTERN, Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<Block> SANDSTONE_BRICKS_TURQUOISE_PATTERN_PLATE = DoTBBlocksRegistry.reg("sandstone_bricks_turquoise_pattern_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<Block> SANDSTONE_BRICKS_TURQUOISE_PATTERN_SLAB = DoTBBlocksRegistry.reg("sandstone_bricks_turquoise_pattern_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<Block> SANDSTONE_BRICKS_TURQUOISE_PATTERN_EDGE = DoTBBlocksRegistry.reg("sandstone_bricks_turquoise_pattern_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<Block> SANDSTONE_BRICKS_TURQUOISE_PATTERN_WALL = DoTBBlocksRegistry.reg("sandstone_bricks_turquoise_pattern_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<Block> SANDSTONE_SCULPTED_RELIEF = DoTBBlocksRegistry.reg("sandstone_sculpted_relief", () -> new ConnectedVerticalSidedPlanBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE), RELIEF_SHAPES));
    public static final RegistryObject<Block> SANDSTONE_CRENELATION = DoTBBlocksRegistry.reg("sandstone_crenelation", () -> new PlateBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE), SANDSTONE_CRENELATION_SHAPES));
    // Pre_columbian
    public static final RegistryObject<Block> COMMELINA = DoTBBlocksRegistry.regWithFlowerPotItem("commelina", () -> new SoilCropsBlock(PlantType.PLAINS), (block) -> new SoilSeedsItem(block, null));
    public static final RegistryObject<Block> PLASTERED_STONE = DoTBBlocksRegistry.reg("plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> PLASTERED_STONE_EDGE = DoTBBlocksRegistry.reg("plastered_stone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> PLASTERED_STONE_PLATE = DoTBBlocksRegistry.reg("plastered_stone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> PLASTERED_STONE_SLAB = DoTBBlocksRegistry.reg("plastered_stone_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> PLASTERED_STONE_STAIRS = DoTBBlocksRegistry.reg("plastered_stone_stairs", () -> new StairsBlockAA(DoTBBlocksRegistry.PLASTERED_STONE, Block.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PLASTERED_STONE_WINDOW = DoTBBlocksRegistry.reg("plastered_stone_window", () -> new WaterloggedHorizontalAxisBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion(), PLASTERED_STONE_WINDOW_SHAPES));
    public static final RegistryObject<Block> CHISELED_PLASTERED_STONE = DoTBBlocksRegistry.reg("chiseled_plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_PLASTERED_STONE_FRIEZE = DoTBBlocksRegistry.reg("chiseled_plastered_stone_frieze", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> ORNAMENTED_CHISELED_PLASTERED_STONE = DoTBBlocksRegistry.reg("ornamented_chiseled_plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> RED_PLASTERED_STONE = DoTBBlocksRegistry.reg("red_plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> RED_CHISELED_PLASTERED_STONE = DoTBBlocksRegistry.reg("red_chiseled_plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> RED_ORNAMENTED_CHISELED_PLASTERED_STONE = DoTBBlocksRegistry.reg("red_ornamented_chiseled_plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> RED_PLASTERED_STONE_EDGE = DoTBBlocksRegistry.reg("red_plastered_stone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> RED_PLASTERED_STONE_FRIEZE = DoTBBlocksRegistry.reg("red_plastered_stone_frieze", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> RED_PLASTERED_STONE_PLATE = DoTBBlocksRegistry.reg("red_plastered_stone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> RED_PLASTERED_STONE_SLAB = DoTBBlocksRegistry.reg("red_plastered_stone_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> RED_PLASTERED_STONE_STAIRS = DoTBBlocksRegistry.reg("red_plastered_stone_stairs", () -> new StairsBlockAA(DoTBBlocksRegistry.RED_PLASTERED_STONE, Block.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> RED_SMALL_PLASTERED_STONE_FRIEZE = DoTBBlocksRegistry.reg("red_small_plastered_stone_frieze", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> RED_ORNAMENTED_PLASTERED_STONE_FRIEZE = DoTBBlocksRegistry.reg("red_ornamented_plastered_stone_frieze", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion()));
    public static final RegistryObject<Block> RED_SCULPTED_PLASTERED_STONE_FRIEZE = DoTBBlocksRegistry.reg("red_sculpted_plastered_stone_frieze", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS), RED_SCULPTED_PLASTERED_STONE_FRIEZE_SHAPES));
    public static final RegistryObject<Block> GREEN_CHISELED_PLASTERED_STONE = DoTBBlocksRegistry.reg("green_chiseled_plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> GREEN_ORNAMENTED_CHISELED_PLASTERED_STONE = DoTBBlocksRegistry.reg("green_ornamented_chiseled_plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> GREEN_ORNAMENTED_PLASTERED_STONE_FRIEZE = DoTBBlocksRegistry.reg("green_ornamented_plastered_stone_frieze", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion()));
    public static final RegistryObject<Block> GREEN_PLASTERED_STONE_FRIEZE = DoTBBlocksRegistry.reg("green_plastered_stone_frieze", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion()));
    public static final RegistryObject<Block> GREEN_SCULPTED_PLASTERED_STONE_FRIEZE = DoTBBlocksRegistry.reg("green_sculpted_plastered_stone_frieze", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS), GREEN_SCULPTED_PLASTERED_STONE_FRIEZE_SHAPES));
    public static final RegistryObject<Block> GREEN_SMALL_PLASTERED_STONE_FRIEZE = DoTBBlocksRegistry.reg("green_small_plastered_stone_frieze", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> WILD_MAIZE = DoTBBlocksRegistry.reg("wild_maize", () -> new WildMaizeBlock(Block.Properties.copy(Blocks.DANDELION)), BlockTags.SWORD_EFFICIENT);
    public static final RegistryObject<Block> MAIZE = DoTBBlocksRegistry.regWithFlowerPotItem("maize", () -> new DoubleCropsBlock(PlantType.CROP, 4), (block) -> new SoilSeedsItem(block, Foods.MAIZE));
    public static final RegistryObject<Block> RED_ORNAMENTED_PLASTERED_STONE = DoTBBlocksRegistry.reg("red_ornamented_plastered_stone", () -> new BlockAA(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> PLASTERED_STONE_COLUMN = DoTBBlocksRegistry.reg("plastered_stone_column", () -> new ConnectedVerticalBlock(Block.Properties.copy(Blocks.STONE_BRICKS), PLASTERED_STONE_COLUMN_SHAPES));
    public static final RegistryObject<Block> PLASTERED_STONE_CRESSET = DoTBBlocksRegistry.reg("plastered_stone_cresset", () -> new PlasteredStoneCressetBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion().lightLevel(DoTBBlocksRegistry.litBlockEmission(15))));
    public static final RegistryObject<Block> FEATHERED_SERPENT_SCULPTURE = DoTBBlocksRegistry.reg("feathered_serpent_sculpture", () -> new WaterloggedHorizontalBlock(Block.Properties.copy(Blocks.STONE_BRICKS).noOcclusion(), FEATHERED_SERPENT_SCULPTURE_SHAPES));
    public static final RegistryObject<Block> SERPENT_SCULPTED_COLUMN = DoTBBlocksRegistry.reg("serpent_sculpted_column", () -> new ConnectedVerticalSidedBlock(Block.Properties.copy(Blocks.STONE_BRICKS), SERPENT_SCULPTED_COLUMN_SHAPES));
    // Roman
    public static final RegistryObject<Block> SANDSTONE_PLATE = DoTBBlocksRegistry.reg("sandstone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> SANDSTONE_EDGE = DoTBBlocksRegistry.reg("sandstone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> CUT_SANDSTONE_STAIRS = DoTBBlocksRegistry.reg("cut_sandstone_stairs", () -> new StairBlock(Blocks.CUT_SANDSTONE::defaultBlockState, Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<Block> CUT_SANDSTONE_PLATE = DoTBBlocksRegistry.reg("cut_sandstone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<Block> CUT_SANDSTONE_EDGE = DoTBBlocksRegistry.reg("cut_sandstone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_PLATE = DoTBBlocksRegistry.reg("smooth_sandstone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_EDGE = DoTBBlocksRegistry.reg("smooth_sandstone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final RegistryObject<Block> OCHRE_ROOF_TILES = DoTBBlocksRegistry.reg("ochre_roof_tiles", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> OCHRE_ROOF_TILES_EDGE = DoTBBlocksRegistry.reg("ochre_roof_tiles_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> OCHRE_ROOF_TILES_PLATE = DoTBBlocksRegistry.reg("ochre_roof_tiles_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> OCHRE_ROOF_TILES_STAIRS = DoTBBlocksRegistry.reg("ochre_roof_tiles_stairs", () -> new StairsBlockAA(DoTBBlocksRegistry.OCHRE_ROOF_TILES, Block.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> OCHRE_ROOF_TILES_WALL = DoTBBlocksRegistry.reg("ochre_roof_tiles_wall", () -> new WallBlock(Block.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> SANDSTONE_BOT_OCHRE_ROOF_TILES_TOP = DoTBBlocksRegistry.regWithItem("sandstone_bot_ochre_roof_tiles_top", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)), null);
    public static final RegistryObject<Block> CUT_SANDSTONE_BOT_OCHRE_ROOF_TILES_TOP = DoTBBlocksRegistry.regWithItem("cut_sandstone_bot_ochre_roof_tiles_top", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)), null);
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_BOT_OCHRE_ROOF_TILES_TOP = DoTBBlocksRegistry.regWithItem("smooth_sandstone_bot_ochre_roof_tiles_top", () -> new BlockAA(Block.Properties.copy(Blocks.BRICKS)), null);
    public static final RegistryObject<Block> OCHRE_ROOF_TILES_SLAB = DoTBBlocksRegistry.regWithItem("ochre_roof_tiles_slab", () -> new MixedSlabBlock(Block.Properties.copy(Blocks.BRICKS))
             .addMixedBlockRecipe(Blocks.SANDSTONE_SLAB, DoTBBlocksRegistry.SANDSTONE_BOT_OCHRE_ROOF_TILES_TOP, false)
             .addMixedBlockRecipe(Blocks.CUT_SANDSTONE_SLAB, DoTBBlocksRegistry.CUT_SANDSTONE_BOT_OCHRE_ROOF_TILES_TOP, false)
             .addMixedBlockRecipe(Blocks.SMOOTH_SANDSTONE_SLAB, DoTBBlocksRegistry.SMOOTH_SANDSTONE_BOT_OCHRE_ROOF_TILES_TOP, false), MixedSlabBlock::getBlockItem);
    public static final RegistryObject<Block> SANDSTONE_COLUMN = DoTBBlocksRegistry.reg("sandstone_column", () -> new SandstoneColumnBlock(Block.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> SANDSTONE_SIDED_COLUMN = DoTBBlocksRegistry.reg("sandstone_sided_column", () -> new ConnectedVerticalSidedBlock(Block.Properties.copy(Blocks.SANDSTONE), SANDSTONE_SIDED_COLUMN_SHAPES));
    public static final RegistryObject<Block> COVERED_SANDSTONE_WALL = DoTBBlocksRegistry.reg("covered_sandstone_wall", () -> new CappedWallBlock(Block.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> TERRACOTTA_WALL = DoTBBlocksRegistry.reg("terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> ROMAN_FRESCO_BLACK = DoTBBlocksRegistry.reg("roman_fresco_black", () -> new BlockAA(Block.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> ROMAN_FRESCO_RED = DoTBBlocksRegistry.reg("roman_fresco_red", () -> new BlockAA(Block.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> MOSAIC_FLOOR = DoTBBlocksRegistry.reg("mosaic_floor", () -> new BlockAA(Block.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> MOSAIC_FLOOR_DELICATE = DoTBBlocksRegistry.reg("mosaic_floor_delicate", () -> new BlockAA(Block.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> MOSAIC_FLOOR_ROSETTE = DoTBBlocksRegistry.reg("mosaic_floor_rosette", () -> new BlockAA(Block.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> BIRCH_FANCY_FENCE = DoTBBlocksRegistry.reg("birch_fancy_fence", () -> new PlateBlock(Block.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 5.0F).noOcclusion(), THIN_PLATE_SHAPES), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BIRCH_FOOTSTOOL = DoTBBlocksRegistry.reg("birch_footstool", () -> new BirchFootstoolBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS), 9.0F), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> BIRCH_COUCH = DoTBBlocksRegistry.reg("birch_couch", () -> new BirchCouchBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS), 13.0F, ROMAN_COUCH_SHAPES), BlockTags.MINEABLE_WITH_AXE);
    public static final RegistryObject<Block> MARBLE_STATUE_MARS = DoTBBlocksRegistry.reg("marble_statue_mars", () -> new MarbleStatueBlock(Block.Properties.copy(Blocks.BRICKS).noOcclusion()));
    public static final RegistryObject<Block> WILD_GRAPE = DoTBBlocksRegistry.reg("wild_grape", () -> new WildPlantBlock(Block.Properties.copy(Blocks.DANDELION)), BlockTags.SWORD_EFFICIENT);
    public static final RegistryObject<Block> CYPRESS = DoTBBlocksRegistry.regWithFlowerPotItem("cypress", () -> new CypressBlock(Block.Properties.copy(Blocks.SPRUCE_LEAVES)).setBurnable(), (block) -> new PotAndBlockItem(block, new Item.Properties()));
    public static final RegistryObject<Block> BIG_FLOWER_POT = DoTBBlocksRegistry.reg("big_flower_pot", () -> new WaterloggedBlock(Block.Properties.copy(Blocks.CLAY), BIG_FLOWER_POT_SHAPES));
    public static final RegistryObject<Block> MARBLE_BIG_FLOWER_POT = DoTBBlocksRegistry.reg("marble_big_flower_pot", () -> new WaterloggedBlock(Block.Properties.copy(Blocks.STONE), MARBLE_BIG_FLOWER_POT_SHAPES));
    public static final RegistryObject<Block> MARBLE_FANCY_FENCE = DoTBBlocksRegistry.reg("marble_fancy_fence", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE).strength(3.0F, 5.0F).noOcclusion(), THIN_PLATE_SHAPES));
    public static final RegistryObject<Block> MARBLE_COLUMN = DoTBBlocksRegistry.reg("marble_column", () -> new MarbleColumnBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MARBLE_SIDED_COLUMN = DoTBBlocksRegistry.reg("marble_sided_column", () -> new ConnectedVerticalSidedBlock(Block.Properties.copy(Blocks.STONE), MARBLE_SIDED_COLUMN_SHAPES));
    public static final RegistryObject<Block> MARBLE_COFFER = DoTBBlocksRegistry.reg("marble_coffer", () -> new BlockAA(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MARBLE_COFFER_SLAB = DoTBBlocksRegistry.reg("marble_coffer_slab", () -> new SlabBlockAA(Block.Properties.copy(Blocks.STONE)));

    @SafeVarargs
    public static <T extends Block> RegistryObject<Block> reg(String name, Supplier<T> block, TagKey<Block>... tags) {
        return regWithItem(name, block, (blockObject) -> new BlockItem(blockObject, new Item.Properties()), tags);
    }

    @SafeVarargs
    public static <T extends Block, U extends Item> RegistryObject<Block> regWithItem(String name, Supplier<T> block, @Nullable Function<T, U> item, TagKey<Block>... tags) {
        return regWithItem(name, block, name, item, tags);
    }

    /**
     * Function used to register a Block in Forge Registry.
     * @param name ID of the Block.
     * @param block Supplier of a block instance.
     * @param itemName ID of the BlockItem.
     * @param item Supplier function that uses the Block instance to return the BlockItem instance.
     * @param tags BlockTags of the Block registered. If no tag is provided, the BlockTags.MINEABLE_WITH_PICKAXE will be associated by default.
     * @return The created RegistryObject that contains the instance of the Block.
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public static <T extends Block, U extends Item> RegistryObject<Block> regWithItem(String name, Supplier<T> block, String itemName, @Nullable Function<T, U> item, TagKey<Block>... tags) {
        RegistryObject<T> toReturn = DoTBBlocksRegistry.BLOCKS.register(name, block);
        if(item != null) {
            DoTBItemsRegistry.reg(itemName, () -> item.apply(toReturn.get()));
        }
        RegistryObject<Block> regBlock = (RegistryObject<Block>) toReturn;
        if(tags.length == 0){
            addBlockTag(regBlock, BlockTags.MINEABLE_WITH_PICKAXE);
        }else{
            for (TagKey<Block> tag : tags) {
                addBlockTag(regBlock, tag);
            }
        }
        return regBlock;
    }

    /**
     * Add a RegistryObject<Block> to the list associated to the given Tag. If the tag doesn't exist, create a new empty list, and put the block inside.
     * @param block Block that needs the tag.
     * @param tag BlockTags added.
     */
    private static void addBlockTag(RegistryObject<Block> block, TagKey<Block> tag){
        blockTagsMap.computeIfAbsent(tag, k -> new HashSet<>()).add(block);
    }

    public static <T extends Block, U extends Item & IHasFlowerPot> RegistryObject<Block> regWithFlowerPotItem(String name, Supplier<T> block, @Nullable Function<T, U> item) {
        return regWithFlowerPotItem(name, block, name, item);
    }

    @SuppressWarnings("unchecked")
    public static <T extends Block, U extends Item & IHasFlowerPot> RegistryObject<Block> regWithFlowerPotItem(String plantName, Supplier<T> block, String seedName, @Nullable Function<T, U> item) {
        RegistryObject<T> toReturn = DoTBBlocksRegistry.BLOCKS.register(plantName, block);
        if(item != null) {
            DoTBItemsRegistry.regWithFlowerPot(plantName, seedName, () -> item.apply(toReturn.get()));
        }
        RegistryObject<Block> regBlock = (RegistryObject<Block>) toReturn;
        // Flower can be broken with sword, and in the ItemRegistry, pot can be broken with Pickaxe.
        addBlockTag(regBlock, BlockTags.SWORD_EFFICIENT);
        return regBlock;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    //Old Function
    private static ToIntFunction<BlockState> litBlockEmission(final int lightValue) {
        return state -> state.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }
}
