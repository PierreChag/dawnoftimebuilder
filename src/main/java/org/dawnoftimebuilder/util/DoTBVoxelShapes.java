package org.dawnoftimebuilder.util;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DoTBVoxelShapes {
    // Simple shapes.
    public static final VoxelShape[] FULL_SHAPE = new VoxelShape[]{Shapes.block()};
    public static final VoxelShape[] BUSH_SHAPE = new VoxelShape[]{Block.box(3.0D, 0.0D, 3.0D, 11.0D, 13.0D, 11.0D)};
    public static final VoxelShape[] SAPLING_SHAPE = new VoxelShape[]{Block.box(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D)};

}
