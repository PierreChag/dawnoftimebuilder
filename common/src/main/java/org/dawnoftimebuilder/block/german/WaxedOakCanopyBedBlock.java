//package org.dawnoftimebuilder.block.german;
//
//import net.minecraft.core.BlockPos;
//import net.minecraft.core.Direction;
//import net.minecraft.world.entity.LivingEntity;
//import net.minecraft.world.item.DyeColor;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.context.BlockPlaceContext;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.BedBlock;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.level.block.state.properties.BedPart;
//import org.dawnoftimebuilder.registry.DoTBBlocksRegistry;
//import org.jetbrains.annotations.NotNull;
//
//import javax.annotation.Nullable;
//
//import static org.dawnoftimebuilder.block.german.WaxedOakCanopyBedWoodBlock.getMultiblockState;
//
//public class WaxedOakCanopyBedBlock extends BedBlock {
//    public WaxedOakCanopyBedBlock(DyeColor pColor, Properties pProperties) {
//        super(pColor, pProperties);
//    }
//
//    @Nullable
//    @Override
//    public BlockState getStateForPlacement(BlockPlaceContext context) {
//        BlockPos pos = context.getClickedPos();
//        Level level = context.getLevel();
//        Direction dir = context.getHorizontalDirection();
//        Direction dirCW = dir.getClockWise();
//        for(int y = 0; y <= 2; y++) {
//            for (int a = -1; a <= 1; a++) {
//                for (int b = -1; b <= 1; b++){
//                    if(!level.getBlockState(pos.relative(dir, a).relative(dirCW, b).above(y)).canBeReplaced(context)){
//                        return null;
//                    }
//                }
//            }
//        }
//        return super.getStateForPlacement(context);
//    }
//
//    @Override
//    public void setPlacedBy(final @NotNull Level level, final @NotNull BlockPos pos, final @NotNull BlockState state, final LivingEntity placer, final @NotNull ItemStack stack) {
//        if (!level.isClientSide()) {
//            BlockPos otherBedPos = pos.relative(state.getValue(FACING));
//            level.setBlock(otherBedPos, state.setValue(PART, BedPart.HEAD), 10);
//            Direction dir = state.getValue(FACING);
//            Direction dirCW = dir.getClockWise();
//            BlockState woodState = DoTBBlocksRegistry.INSTANCE.WAXED_OAK_CANOPY_BED_WOOD.get().defaultBlockState().setValue(FACING, dir);
//            for(int y = 0; y <= 2; y++) {
//                for (int a = -1; a <= 1; a++) {
//                    for (int b = -1; b <= 1; b++){
//                        if((y < 2 && a == 0 && b == 0) || (y == 0 && a == -1 && b == 0)){
//                            // We don't want to replace the bed, and there is a hole in the exact center.
//                            continue;
//                        }
//                        level.setBlock(pos.relative(dir, a).relative(dirCW, b).above(y), getMultiblockState(woodState, a + 1, y ,b + 1), 10);
//                    }
//                }
//            }
//        }
//    }
//}
