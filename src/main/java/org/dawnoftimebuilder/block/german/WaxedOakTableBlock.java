package org.dawnoftimebuilder.block.german;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.dawnoftimebuilder.block.templates.MultiblockTableBlock;
import org.dawnoftimebuilder.util.DoTBUtils;

public class WaxedOakTableBlock extends MultiblockTableBlock {
    private static final VoxelShape[] BOT_SHAPES = makeShapes();
    private static final VoxelShape TOP_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D);

    public WaxedOakTableBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShapeByIndex(int index, boolean top) {
        return top ? TOP_SHAPE : BOT_SHAPES[index];
    }

    private static VoxelShape[] makeShapes() {
        // South - West - North - East:
        VoxelShape[] vsSide = DoTBUtils.GenerateHorizontalShapes(new VoxelShape[] { Shapes.or(Block.box(1.0D, 1.0D, 13.5D, 15.0D, 3.0D, 14.5D), Block.box(1.0D, 12.0D, 13.5D, 15.0D, 16.0D, 14.5D)) });
        // SW - NW - NE - SE:
        VoxelShape[] vsPillar = DoTBUtils.GenerateHorizontalShapes(new VoxelShape[] { Block.box(0.5D, 0.0D, 12.5D, 3.5D, 16.0D, 15.5D) });
        // W - N - E - S
        VoxelShape[] vsPillarLeft = DoTBUtils.GenerateHorizontalShapes(new VoxelShape[] { Block.box(0.0D, 0.0D, 13.0D, 1.0D, 16.0D, 15.0D) });
        // S - W - N - E
        VoxelShape[] vsPillarRight = DoTBUtils.GenerateHorizontalShapes(new VoxelShape[] { Block.box(1.0D, 0.0D, 15.0D, 3.0D, 16.0D, 16.0D) });
        return new VoxelShape[] {
                Shapes.empty(),
                Shapes.or(vsSide[0], vsPillarLeft[0], vsPillarRight[3]),
                Shapes.or(vsSide[1], vsPillarLeft[1], vsPillarRight[0]),
                Shapes.or(vsSide[0], vsSide[1], vsPillar[0], vsPillarLeft[1], vsPillarRight[3]),
                Shapes.or(vsSide[2], vsPillarLeft[2], vsPillarRight[1]),
                Shapes.or(vsSide[0], vsSide[2], vsPillarLeft[0], vsPillarRight[3], vsPillarLeft[2], vsPillarRight[1]),
                Shapes.or(vsSide[1], vsSide[2], vsPillar[1], vsPillarLeft[2], vsPillarRight[0]),
                Shapes.or(vsSide[0], vsSide[1], vsSide[2], vsPillar[0], vsPillar[1], vsPillarLeft[2], vsPillarRight[3]),
                Shapes.or(vsSide[3], vsPillarLeft[3], vsPillarRight[2]),
                Shapes.or(vsSide[0], vsSide[3], vsPillar[3], vsPillarLeft[0], vsPillarRight[2]),
                Shapes.or(vsSide[1], vsSide[3], vsPillarLeft[1], vsPillarRight[0], vsPillarLeft[3], vsPillarRight[2]),
                Shapes.or(vsSide[0], vsSide[1], vsSide[3], vsPillar[0], vsPillar[3], vsPillarLeft[1], vsPillarRight[2]),
                Shapes.or(vsSide[2], vsSide[3], vsPillar[2], vsPillarRight[1], vsPillarLeft[3]),
                Shapes.or(vsSide[0], vsSide[2], vsSide[3], vsPillar[2], vsPillar[3], vsPillarLeft[0], vsPillarRight[1]),
                Shapes.or(vsSide[1], vsSide[2], vsSide[3], vsPillar[1], vsPillar[2], vsPillarLeft[3], vsPillarRight[0]),
                Shapes.or(vsSide[0], vsSide[1], vsSide[2], vsSide[3], vsPillar[0], vsPillar[1], vsPillar[2], vsPillar[3]),
        };
    }

    @Override
    public double getDisplayerX(BlockState state) {
        return 0.1875D;
    }

    @Override
    public double getDisplayerY(BlockState state) {
        return 0.125D;
    }

    @Override
    public double getDisplayerZ(BlockState state) {
        return 0.1875D;
    }
}