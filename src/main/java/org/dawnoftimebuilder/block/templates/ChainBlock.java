package org.dawnoftimebuilder.block.templates;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import org.dawnoftimebuilder.block.IBlockChain;
import org.dawnoftimebuilder.block.IBlockPillar;
import org.dawnoftimebuilder.utils.DoTBBlockStateProperties;

public class ChainBlock extends BlockDoTB implements IBlockChain {

	private static final VoxelShape VS = Block.makeCuboidShape(6.0D, 0.0D, 6.0D, 10.0D, 16.0D, 10.0D);

	public ChainBlock(Material materialIn, float hardness, float resistance) {
		this(Block.Properties.create(materialIn).hardnessAndResistance(hardness, resistance));
	}

	public ChainBlock(Properties properties) {
		super(properties);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return VS;
	}

    @Override
	public BlockRenderLayer getRenderLayer() {
		return BlockRenderLayer.CUTOUT_MIPPED;
	}
}
