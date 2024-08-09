package org.dawnoftimebuilder.block.roman;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.dawnoftimebuilder.block.IBlockPillar;
import org.dawnoftimebuilder.block.templates.ConnectedVerticalBlock;
import org.dawnoftimebuilder.util.BlockStatePropertiesAA;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

import static org.dawnoftimebuilder.util.VoxelShapes.SANDSTONE_COLUMN_SHAPES;

public class SandstoneColumnBlock extends ConnectedVerticalBlock implements IBlockPillar {
    public SandstoneColumnBlock(Properties properties) {
        super(properties, SANDSTONE_COLUMN_SHAPES);
    }

    @Override
    public int getShapeIndex(@NotNull BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return switch (state.getValue(VERTICAL_CONNECTION)) {
            default -> 0;
            case ABOVE -> 1;
            case UNDER -> 2;
        };
    }

    @Nonnull
    @Override
    public BlockStatePropertiesAA.PillarConnection getBlockPillarConnectionAbove(BlockState state) {
        return BlockStatePropertiesAA.PillarConnection.EIGHT_PX;
    }

    @Override
    public boolean isConnectible(BlockState stateIn, LevelAccessor worldIn, BlockPos pos, Direction faceToConnect) {
        BlockState testedState = worldIn.getBlockState(pos);
        if(faceToConnect == Direction.DOWN && IBlockPillar.getPillarConnectionUnder(worldIn, pos) == BlockStatePropertiesAA.PillarConnection.EIGHT_PX) {
            return true;
        }
        if(faceToConnect == Direction.UP && IBlockPillar.getPillarConnectionAbove(worldIn, pos) == BlockStatePropertiesAA.PillarConnection.EIGHT_PX) {
            return true;
        }
        return testedState.getBlock() == this;
    }
}
