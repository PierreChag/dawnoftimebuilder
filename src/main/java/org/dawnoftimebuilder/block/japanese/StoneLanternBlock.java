package org.dawnoftimebuilder.block.japanese;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import org.dawnoftimebuilder.block.IBlockChain;
import org.dawnoftimebuilder.block.templates.WaterloggedBlock;
import org.dawnoftimebuilder.utils.DoTBBlockUtils;

import javax.annotation.Nonnull;

public class StoneLanternBlock extends WaterloggedBlock implements IBlockChain {

    private static final VoxelShape VS_CENTER = makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);
    private static final VoxelShape[] VS_SIDE = DoTBBlockUtils.GenerateHorizontalShapes(new VoxelShape[]{makeCuboidShape(2.0D, 0.0D, 0.0D, 14.0D, 16.0D, 14.0D)});
    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    public StoneLanternBlock() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(4.0F, 9.0F).lightValue(15));
        this.setDefaultState(this.getStateContainer().getBaseState().with(WATERLOGGED,false).with(FACING, Direction.DOWN));
    }

    @Nonnull
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return super.getStateForPlacement(context).with(FACING, context.getFace());
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        super.fillStateContainer(builder);
        builder.add(FACING);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        Direction facing = state.get(FACING);
        if(facing.getAxis() == Direction.Axis.Y){
            return VS_CENTER;
        }else return VS_SIDE[facing.getHorizontalIndex()];
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return rotate(state, Rotation.CLOCKWISE_180);
    }

    @Override
    public boolean canConnectToChainUnder(BlockState state) {
        return false;
    }
}
