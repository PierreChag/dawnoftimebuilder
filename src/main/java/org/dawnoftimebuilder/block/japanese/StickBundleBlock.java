package org.dawnoftimebuilder.block.japanese;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.Half;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.dawnoftimebuilder.block.IBlockChain;
import org.dawnoftimebuilder.block.templates.BlockDoTB;
import org.dawnoftimebuilder.util.DoTBBlockUtils;
import org.dawnoftimebuilder.DoTBConfig;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import static org.dawnoftimebuilder.registry.DoTBItemsRegistry.SILK_WORMS;

public class StickBundleBlock extends BlockDoTB implements IBlockChain {

    private static final VoxelShape VS_TOP = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);
    private static final VoxelShape VS_BOTTOM = Block.box(4.0D, 4.0D, 4.0D, 12.0D, 16.0D, 12.0D);
	public static final EnumProperty<Half> HALF = BlockStateProperties.HALF;
	private static final IntegerProperty AGE = BlockStateProperties.AGE_0_3;

    public StickBundleBlock(Material materialIn, float hardness, float resistance, SoundType soundType) {
		super(Properties.of(materialIn).strength(hardness, resistance).sound(soundType));
        this.registerDefaultState(this.stateContainer.getBaseState().setValue(AGE, 0).setValue(HALF, Half.TOP));
    }

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return state.get(HALF) == Half.BOTTOM ? VS_BOTTOM : VS_TOP;
	}

	@Override
	protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(HALF, AGE);
	}

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		World world = context.getLevel();
		BlockPos pos = context.getClickedPos();
		if(!world.getBlockState(pos.below()).isReplaceable(context) || !canSurvive(this.defaultBlockState(), world, pos))
			return null;
		return super.getStateForPlacement(context);
	}

	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
		worldIn.setBlock(pos.below(), state.setValue(HALF, Half.BOTTOM), 10);
	}

	@Override
	public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
		if(facing.getAxis().isHorizontal()) return stateIn;
		if(facing == Direction.UP && stateIn.get(HALF) == Half.BOTTOM) {
			if(facingState.getBlock() == this){
				if(facingState.get(HALF) == Half.TOP){
					return stateIn;
				}
			}
			return Blocks.AIR.defaultBlockState();
		}
		if(facing == Direction.DOWN && stateIn.get(HALF) == Half.TOP) {
			if(facingState.getBlock() == this){
				if(facingState.get(HALF) == Half.BOTTOM){
					return stateIn;
				}
			}
			return Blocks.AIR.defaultBlockState();
		}
    	return stateIn;
	}

	@Override
	public boolean canSurvive(BlockState state, IWorldReader worldIn, BlockPos pos) {
    	pos = pos.above();
    	BlockState stateUp = worldIn.getBlockState(pos);
		return state.get(HALF) == Half.BOTTOM || hasSolidSide(stateUp, worldIn, pos, Direction.DOWN) || IBlockChain.canBeChained(stateUp, true);
	}

	@Override
	public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		if(!worldIn.isClientSide()){
			//The StickBundle is empty, we try to put worms on it.
			if(state.get(AGE) == 0){
				ItemStack itemstack = player.getItemInHand(handIn);
				if(itemstack.getItem() == SILK_WORMS && !itemstack.isEmpty()){
					itemstack.shrink(1);
					worldIn.setBlock(pos, state.setValue(AGE, 1));
					if(state.get(HALF) == Half.TOP){
						worldIn.setBlock(pos.below(), this.defaultBlockState().setValue(HALF, Half.BOTTOM).setValue(AGE, 1));
					}else{
						worldIn.setBlock(pos.above(), this.defaultBlockState().setValue(HALF, Half.TOP).setValue(AGE, 1));
					}
					return true;
				}
			}

			//The StickBundle has fully grown worms, it's time to harvest !
			if(state.get(AGE) == 3){
				List<ItemStack> drops = DoTBBlockUtils.getLootList((ServerWorld)worldIn, state, player.getItemInHand(handIn), Objects.requireNonNull(this.getRegistryName()).getPath() + "_harvest");
				DoTBBlockUtils.dropLootFromList(worldIn, pos, drops, 1.0F);
				worldIn.setBlock(pos, state.setValue(AGE, 0));
				worldIn.playSound(null, pos, SoundEvents.BLOCK_GRASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if(state.get(HALF) == Half.TOP){
					worldIn.setBlock(pos.below(), this.defaultBlockState().setValue(HALF, Half.BOTTOM).setValue(AGE, 0));
				}else{
					worldIn.setBlock(pos.above(), this.defaultBlockState().setValue(HALF, Half.TOP).setValue(AGE, 0));
				}
				return true;
			}
		}
    	return false;
	}

	@Override
	public boolean ticksRandomly(BlockState state) {
		return state.get(AGE) > 0 && state.get(AGE) < 3 && state.get(HALF) == Half.TOP;
	}

	@Override
	public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
		int growth = state.get(AGE);
		if (growth > 0 && growth < 3) {
			if(random.nextInt(DoTBConfig.STICK_BUNDLE_GROWTH_CHANCE.get()) == 0) {
				worldIn.setBlock(pos, worldIn.getBlockState(pos).setValue(AGE,growth + 1));
				worldIn.setBlock(pos.below(), worldIn.getBlockState(pos.below()).setValue(AGE,growth + 1));
			}
		}

	}

	@Override
	public PushReaction getPistonPushReaction(BlockState state) {
		return PushReaction.DESTROY;
	}

	@Override
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public boolean isSolid(BlockState state) {
		return false;
	}

	@Override
	public boolean canConnectToChainUnder(BlockState state) {
		return false;
	}
}