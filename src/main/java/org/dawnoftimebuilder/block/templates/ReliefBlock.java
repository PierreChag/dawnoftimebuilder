package org.dawnoftimebuilder.block.templates;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.dawnoftimebuilder.util.DoTBUtils;

public class ReliefBlock extends SidedPlaneConnectibleBlock{
    private static final VoxelShape[] SHAPES = DoTBUtils.GenerateHorizontalShapes(makeShapes());
    public ReliefBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        int index = 16 * state.getValue(FACING).get2DDataValue();
        index += 4 * state.getValue(VERTICAL_CONNECTION).getIndex();
        index += state.getValue(HORIZONTAL_CONNECTION).getIndex();
        return SHAPES[index];
    }

    /**
     * @return Stores VoxelShape for South face with index : <p/>
     * 0 : NONE & NONE <p/>
     * 1 : NONE & RIGHT -> horizontal <p/>
     * 2 : NONE & LEFT -> horizontal <p/>
     * 3 : NONE & BOTH -> horizontal <p/>
     * 4 : UNDER & NONE -> vertical <p/>
     * 5 : UNDER & RIGHT <p/>
     * 6 : UNDER & LEFT <p/>
     * 7 : UNDER & BOTH <p/>
     * 8 : ABOVE & NONE -> vertical <p/>
     * 9 : ABOVE & RIGHT <p/>
     * 10 : ABOVE & LEFT <p/>
     * 11 : ABOVE & BOTH <p/>
     * 12 : BOTH & NONE -> vertical <p/>
     * 13 : BOTH & RIGHT <p/>
     * 14 : BOTH & LEFT <p/>
     * 15 : BOTH & BOTH <p/>
     */
    private static VoxelShape[] makeShapes() {
        VoxelShape vsCenter = Block.box(4.0D, 4.0D, 0.0D, 12.0D, 12.0D, 4.0D);
        VoxelShape vsUnder = Block.box(4.0D, 0.0D, 0.0D, 12.0D, 4.0D, 4.0D);
        VoxelShape vsAbove = Block.box(4.0D, 12.0D, 0.0D, 12.0D, 16.0D, 4.0D);
        VoxelShape vsLeft = Block.box(0.0D, 4.0D, 0.0D, 4.0D, 12.0D, 4.0D);
        VoxelShape vsRight = Block.box(12.0D, 4.0D, 0.0D, 16.0D, 12.0D, 4.0D);
        VoxelShape vsVertical = Shapes.or(vsCenter, vsUnder, vsAbove);
        VoxelShape vsHorizontal = Shapes.or(vsCenter, vsLeft, vsRight);
        return new VoxelShape[] {
                vsCenter,
                vsHorizontal,
                vsHorizontal,
                vsHorizontal,
                vsVertical,
                Shapes.or(vsCenter, vsUnder, vsRight),
                Shapes.or(vsCenter, vsUnder, vsLeft),
                Shapes.or(vsHorizontal, vsUnder),
                vsVertical,
                Shapes.or(vsCenter, vsAbove, vsRight),
                Shapes.or(vsCenter, vsAbove, vsLeft),
                Shapes.or(vsHorizontal, vsAbove),
                vsVertical,
                Shapes.or(vsVertical, vsRight),
                Shapes.or(vsVertical, vsLeft),
                Shapes.or(vsVertical, vsHorizontal)
        };
    }
}
