package org.dawnoftimebuilder.block.templates;

import net.minecraft.world.phys.shapes.VoxelShape;
import org.dawnoftimebuilder.block.IBlockSpecialDisplay;

public class SpecialDisplayBlock extends WaterloggedBlock implements IBlockSpecialDisplay {

    public SpecialDisplayBlock(Properties properties, VoxelShape[] shapes) {
        super(properties, shapes);
    }
}