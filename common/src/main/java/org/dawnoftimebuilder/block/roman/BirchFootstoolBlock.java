package org.dawnoftimebuilder.block.roman;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import org.dawnoftimebuilder.block.templates.ChairBlock;
import org.jetbrains.annotations.NotNull;
import javax.annotation.Nonnull;
import static org.dawnoftimebuilder.util.VoxelShapes.BIRCH_FOOTSTOOL_SHAPES;

public class BirchFootstoolBlock extends ChairBlock {

    public BirchFootstoolBlock(Properties properties, float pixelsYOffset) {
        super(properties, pixelsYOffset, BIRCH_FOOTSTOOL_SHAPES);
    }

    @Override
    public int getShapeIndex(@NotNull BlockState state, @Nonnull BlockGetter worldIn, @Nonnull BlockPos pos, @Nonnull CollisionContext context) {
        return (state.getValue(FACING).getAxis() == Direction.Axis.X) ? 0 : 1;
    }
}
