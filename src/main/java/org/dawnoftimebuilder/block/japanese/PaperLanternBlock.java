package org.dawnoftimebuilder.block.japanese;

import org.dawnoftimebuilder.block.templates.SpecialDisplayBlock;

import static org.dawnoftimebuilder.util.VoxelShapes.PAPER_LANTERN_SHAPES;

public class PaperLanternBlock extends SpecialDisplayBlock {

    public PaperLanternBlock(Properties properties) {
        super(properties, PAPER_LANTERN_SHAPES);
    }

    @Override
    public boolean emitsLight() {
        return true;
    }
}
