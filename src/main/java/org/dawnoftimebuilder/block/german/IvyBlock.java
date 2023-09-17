package org.dawnoftimebuilder.block.german;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.ForgeHooks;
import org.dawnoftimebuilder.DoTBConfig;
import org.dawnoftimebuilder.block.ICustomBlockItem;
import org.dawnoftimebuilder.block.templates.BlockDoTB;
import org.dawnoftimebuilder.item.templates.PotAndBlockItem;
import org.dawnoftimebuilder.util.DoTBUtils;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static net.minecraft.tags.BlockTags.DIRT;
import static net.minecraft.tags.BlockTags.SAND;
import static net.minecraftforge.common.Tags.Blocks.GRAVEL;
import static org.dawnoftimebuilder.util.DoTBUtils.TOOLTIP_CROP;

public class IvyBlock extends BlockDoTB implements ICustomBlockItem {

    public static final BooleanProperty NORTH = BlockStateProperties.NORTH;
    public static final BooleanProperty EAST = BlockStateProperties.EAST;
    public static final BooleanProperty SOUTH = BlockStateProperties.SOUTH;
    public static final BooleanProperty WEST = BlockStateProperties.WEST;
    private static final IntegerProperty AGE = BlockStateProperties.AGE_2;
    public static final BooleanProperty PERSISTENT = BlockStateProperties.PERSISTENT;
    private static final VoxelShape[] SHAPES = makeShapes();

    public IvyBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(AGE, 0).setValue(NORTH, false).setValue(EAST, false).setValue(SOUTH, false).setValue(WEST, false).setValue(PERSISTENT, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(NORTH, EAST, SOUTH, WEST, AGE, PERSISTENT);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter LevelIn, BlockPos pos, CollisionContext context) {
        int index = 0;
        if(state.getValue(SOUTH)) index += 1;
        if(state.getValue(WEST)) index += 2;
        if(state.getValue(NORTH)) index += 4;
        if(state.getValue(EAST)) index += 8;
        if(index > 14) index = 0;
        return SHAPES[index];
    }

    /**
     * @return Stores VoxelShape with index following binary system : <p/>
     * 8+4+2+1 with 1 = SOUTH, 2 = WEST, 4 = NORTH, 8 = EAST
     * 0 : SWNE <p/>
     * 1 : S <p/>
     * 2 : W <p/>
     * 3 : SW <p/>
     * 4 : N <p/>
     * 5 : SN <p/>
     * 6 : WN <p/>
     * 7 : SWN <p/>
     * 8 : E <p/>
     * 9 : SE <p/>
     * 10 : WE <p/>
     * 11 : SWE <p/>
     * 12 : NE <p/>
     * 13 : SNE <p/>
     * 14 : WNE <p/>
     */
    private static VoxelShape[] makeShapes() {
        VoxelShape vs_south = Block.box(0.0D, 0.0D, 12.0D, 16.0D, 16.0D, 16.0D);
        VoxelShape vs_west = Block.box(0.0D, 0.0D, 0.0D, 4.0D, 16.0D, 16.0D);
        VoxelShape vs_north = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 4.0D);
        VoxelShape vs_east = Block.box(12.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
        VoxelShape vs_sw = Shapes.or(vs_south, vs_west);
        VoxelShape vs_wn = Shapes.or(vs_west, vs_north);
        VoxelShape vs_ne = Shapes.or(vs_north, vs_east);
        VoxelShape vs_se = Shapes.or(vs_east, vs_south);
        return new VoxelShape[]{
                Shapes.or(vs_sw, vs_ne),
                vs_south,
                vs_west,
                vs_sw,
                vs_north,
                Shapes.or(vs_south, vs_north),
                vs_wn,
                Shapes.or(vs_sw, vs_north),
                vs_east,
                vs_se,
                Shapes.or(vs_west, vs_east),
                Shapes.or(vs_sw, vs_east),
                vs_ne,
                Shapes.or(vs_south, vs_ne),
                Shapes.or(vs_wn, vs_east),
        };
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = level.getBlockState(pos);
        Direction facing = context.getHorizontalDirection();
        pos = pos.relative(facing);
        if(!hasFullFace(level.getBlockState(pos), level, pos, facing)){
            return null;
        }
        if (state.getBlock() != this){
            state = this.defaultBlockState();
        }
        return state.setValue(getProperty(facing), true);
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext useContext) {
        ItemStack itemstack = useContext.getItemInHand();
        if(useContext.getPlayer() != null && useContext.getPlayer().isCrouching()) {
            return false;
        }
        if(itemstack.getItem() == this.asItem()) {
            Direction newDirection = useContext.getHorizontalDirection();
            switch(newDirection){
                default:
                case SOUTH:
                    return !state.getValue(SOUTH);
                case WEST:
                    return !state.getValue(WEST);
                case NORTH:
                    return !state.getValue(NORTH);
                case EAST:
                    return !state.getValue(EAST);
            }
        }
        return false;
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return !state.getValue(PERSISTENT);
    }

    @Override
    public void tick(BlockState state, ServerLevel LevelIn, BlockPos pos, RandomSource random) {
        if (!LevelIn.isClientSide()) {
            if (!LevelIn.isAreaLoaded(pos, 2)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light

            if (LevelIn.getRawBrightness(pos, 0) >= 8) {
                int age = state.getValue(AGE);
                if (age < 2) { //Probability "can grow"
                    if(ForgeHooks.onCropsGrowPre(LevelIn, pos, state, random.nextInt(DoTBConfig.CLIMBING_PLANT_GROWTH_CHANCE.get()) == 0)){
                        LevelIn.setBlock(pos, state.setValue(AGE, age + 1), 2);
                        ForgeHooks.onCropsGrowPost(LevelIn, pos, state);
                    }
                    return;
                }
                if(random.nextInt(DoTBConfig.CLIMBING_PLANT_SPREAD_CHANCE.get()) == 0) {
                    // The Ivy will spread
                    ArrayList<Direction> list = getCurrentDirections(state);
                    int faceIndex = list.size();
                    if(faceIndex == 0) return;
                    faceIndex = random.nextInt(faceIndex);
                    Direction face = list.get(faceIndex);
                    // Now we want to decide in which direction it will spread.
                    faceIndex = random.nextInt(4);
                    BlockPos studiedPos;
                    if(faceIndex < 2) {
                        // 0 : spread on the left
                        // 1 : spread on the right
                        Direction rotFace = faceIndex == 0 ? face.getCounterClockWise() : face.getClockWise();
                        if (hasFullFace(LevelIn, pos, rotFace)) {
                            if (!state.getValue(getProperty(rotFace)))
                                LevelIn.setBlock(pos, state.setValue(getProperty(rotFace), true), 2);
                        } else {
                            studiedPos = pos.relative(rotFace);
                            if (LevelIn.getBlockState(studiedPos).isAir()) {
                                if (hasFullFace(LevelIn, studiedPos, face)) {
                                    LevelIn.setBlock(studiedPos, this.defaultBlockState().setValue(getProperty(face), true), 2);
                                } else {
                                    studiedPos = studiedPos.relative(face);
                                    if (LevelIn.getBlockState(studiedPos).isAir()) {
                                        rotFace = faceIndex == 0 ? face.getClockWise() : face.getCounterClockWise();
                                        if (hasFullFace(LevelIn, studiedPos, rotFace)) {
                                            LevelIn.setBlock(studiedPos, this.defaultBlockState().setValue(getProperty(rotFace), true), 2);
                                        }
                                    }
                                }
                            }
                        }
                    }else{
                        // 2 : spread above
                        // 3 : spread below
                        studiedPos = faceIndex == 2 ? pos.above() : pos.below();
                        if(LevelIn.getBlockState(studiedPos).isAir()){
                            if(hasFullFace(LevelIn, studiedPos, face)){
                                LevelIn.setBlock(studiedPos, this.defaultBlockState().setValue(getProperty(face), true), 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor LevelIn, BlockPos currentPos, BlockPos facingPos) {
        if(facing.getAxis().isHorizontal()){
            if(facing == Direction.NORTH && stateIn.getValue(NORTH) && !hasFullFace(facingState, LevelIn, facingPos, facing)){
                stateIn = stateIn.setValue(NORTH, false);
            }
            if(facing == Direction.EAST && stateIn.getValue(EAST) && !hasFullFace(facingState, LevelIn, facingPos, facing)){
                stateIn = stateIn.setValue(EAST, false);
            }
            if(facing == Direction.SOUTH && stateIn.getValue(SOUTH) && !hasFullFace(facingState, LevelIn, facingPos, facing)){
                stateIn = stateIn.setValue(SOUTH, false);
            }
            if(facing == Direction.WEST && stateIn.getValue(WEST) && !hasFullFace(facingState, LevelIn, facingPos, facing)){
                stateIn = stateIn.setValue(WEST, false);
            }
        }
        if(getCurrentDirections(stateIn).isEmpty())
            return Blocks.AIR.defaultBlockState();
        return stateIn;
    }

    private static ArrayList<Direction> getCurrentDirections(BlockState state){
        ArrayList<Direction> list = new ArrayList<>();
        if(state.getValue(NORTH)) list.add(Direction.NORTH);
        if(state.getValue(EAST)) list.add(Direction.EAST);
        if(state.getValue(SOUTH)) list.add(Direction.SOUTH);
        if(state.getValue(WEST)) list.add(Direction.WEST);
        return list;
    }

    private static BooleanProperty getProperty(Direction direction){
        switch (direction){
            default:
            case NORTH:
                return NORTH;
            case SOUTH:
                return SOUTH;
            case WEST:
                return WEST;
            case EAST:
                return EAST;
        }
    }

    private static boolean hasFullFace(LevelReader Level, BlockPos currentPos, Direction face){
        currentPos = currentPos.relative(face);
        return hasFullFace(Level.getBlockState(currentPos), Level, currentPos, face);
    }

    private static boolean hasFullFace(BlockState state, LevelReader Level, BlockPos pos, Direction face){
        Block block = state.getBlock();
        if(block.defaultBlockState().is(DIRT) || block.defaultBlockState().is(SAND) || block.defaultBlockState().is(GRAVEL)) return false;
        return Block.isFaceFull(state.getCollisionShape(Level, pos), face.getOpposite());
    }

    @Override
    public InteractionResult use(BlockState state, Level LevelIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        if(state.getValue(PERSISTENT)){
            if(player.isCreative()){
                int age = state.getValue(AGE);
                if(player.isCrouching()){
                    if(age > 0){
                        LevelIn.setBlock(pos, state.setValue(AGE, age - 1), 10);
                        return InteractionResult.SUCCESS;
                    }
                }else{
                    if(age < 2) {
                        LevelIn.setBlock(pos, state.setValue(AGE, age + 1), 10);
                        return InteractionResult.SUCCESS;
                    }
                }
            }
        }else{
            if(DoTBUtils.useLighter(LevelIn, pos, player, handIn)){
                Random rand = new Random();
                for(int i = 0; i < 5; i++){
                    LevelIn.addAlwaysVisibleParticle(ParticleTypes.SMOKE, (double)pos.getX() + rand.nextDouble(), (double)pos.getY() + 0.5D + rand.nextDouble() / 2, (double)pos.getZ() + rand.nextDouble(), 0.0D, 0.07D, 0.0D);
                }
                LevelIn.setBlock(pos, state.setValue(PERSISTENT, true), 10);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }

    @Override
    public boolean isLadder(BlockState state, LevelReader Level, BlockPos pos, LivingEntity entity) {
        return true;
    }

    @Nullable
    @Override
    public Item getCustomBlockItem() {
        return new PotAndBlockItem(this, new Item.Properties());
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter LevelIn, List<Component> tooltip, TooltipFlag flagIn) {
        super.appendHoverText(stack, LevelIn, tooltip, flagIn);
        DoTBUtils.addTooltip(tooltip, TOOLTIP_CROP);
    }
}
