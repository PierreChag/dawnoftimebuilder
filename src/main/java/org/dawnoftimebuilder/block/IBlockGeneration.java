package org.dawnoftimebuilder.block;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public interface IBlockGeneration {

    /**
     * This function is called by the placer during the world generation.
     * It must check whenever this position is suitable for the block.
     * @param world where the block must spawn.
     * @param pos position where to spawn the block.
     * @param state of the block (default state).
     * @param random instance.
     */
    void generateOnPos(LevelAccessor world, BlockPos pos, BlockState state, RandomSource random);
}
