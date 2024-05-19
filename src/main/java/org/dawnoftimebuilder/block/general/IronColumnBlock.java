package org.dawnoftimebuilder.block.general;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.dawnoftimebuilder.block.templates.ConnectedVerticalBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.dawnoftimebuilder.util.BlockStatePropertiesAA.SMALL_TOP;
import static org.dawnoftimebuilder.util.Utils.isShapeIncludedInShape;
import static org.dawnoftimebuilder.util.VoxelShapes.*;

public class IronColumnBlock extends ConnectedVerticalBlock {
    public IronColumnBlock(Properties properties) {
        super(properties, IRON_COLUMN_SHAPES);
        this.registerDefaultState(this.defaultBlockState().setValue(SMALL_TOP, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(SMALL_TOP);
    }

    @Override
    public int getShapeIndex(@NotNull BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return switch (state.getValue(ConnectedVerticalBlock.VERTICAL_CONNECTION)){
            case NONE -> state.getValue(SMALL_TOP) ? 0 : 1;
            case UNDER -> state.getValue(SMALL_TOP) ? 2 : 3;
            case ABOVE -> 4;
            case BOTH -> 5;
        };
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos abovePos = context.getClickedPos().above();
        BlockState aboveState = level.getBlockState(abovePos);
        if(!aboveState.is(this)){
            VoxelShape aboveShape = aboveState.getShape(level, abovePos, CollisionContext.empty());
            return super.getStateForPlacement(context).setValue(SMALL_TOP, isShapeIncludedInShape(aboveShape, SHAPE_DOWN_16x16, SHAPE_DOWN_4x4));
        }
        return super.getStateForPlacement(context);
    }

    @Override
    public @NotNull BlockState updateShape(BlockState stateIn, @NotNull Direction facing, @NotNull BlockState facingState, @NotNull LevelAccessor worldIn, @NotNull BlockPos currentPos, @NotNull BlockPos facingPos) {
        stateIn = super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        if (!worldIn.isClientSide()) {
            if (facing == Direction.UP) {
                if(!facingState.is(this)){
                    VoxelShape aboveShape = facingState.getShape(worldIn, facingPos, CollisionContext.empty());
                    stateIn = stateIn.setValue(SMALL_TOP, isShapeIncludedInShape(aboveShape, SHAPE_DOWN_16x16, SHAPE_DOWN_4x4));
                }
            }
        }
        return stateIn;
    }
}
