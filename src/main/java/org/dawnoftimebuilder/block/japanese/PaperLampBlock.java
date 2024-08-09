package org.dawnoftimebuilder.block.japanese;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.dawnoftimebuilder.block.IBlockSpecialDisplay;
import org.dawnoftimebuilder.block.templates.ConnectedVerticalBlock;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

import static org.dawnoftimebuilder.util.BlockStatePropertiesAA.VerticalConnection;
import static org.dawnoftimebuilder.util.VoxelShapes.PAPER_LAMP_SHAPES;

public class PaperLampBlock extends ConnectedVerticalBlock implements IBlockSpecialDisplay {

    public PaperLampBlock(Properties properties) {
        super(properties, PAPER_LAMP_SHAPES);
    }

    @Override
    public int getShapeIndex(@NotNull BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        VerticalConnection connection = state.getValue(VERTICAL_CONNECTION);
        return connection == VerticalConnection.ABOVE || connection == VerticalConnection.BOTH ? 0 : 1;
    }

    @Override
    public boolean emitsLight() {
        return true;
    }

    @Override
    public float getDisplayScale() {
        return 0.6F;
    }
}
