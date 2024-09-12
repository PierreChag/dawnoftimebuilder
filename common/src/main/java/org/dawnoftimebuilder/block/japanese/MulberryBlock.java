package org.dawnoftimebuilder.block.japanese;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import org.dawnoftimebuilder.DoTBConfig;
import org.dawnoftimebuilder.block.templates.DoubleGrowingBushBlock;
import org.dawnoftimebuilder.platform.Services;
import org.dawnoftimebuilder.registry.DoTBEntitiesRegistry;

public class MulberryBlock extends DoubleGrowingBushBlock {
    public MulberryBlock(PlantType plantType, int cutAge, int growingAge) {
        super(plantType, cutAge, growingAge);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel worldIn, BlockPos pos, RandomSource random) {
        super.randomTick(state, worldIn, pos, random);
        if(state.getValue(HALF) == Half.TOP) {
            if(random.nextInt(Services.PLATFORM.getConfig().silkmothSpawnChance) == 0) {
                DoTBEntitiesRegistry.INSTANCE.SILKMOTH_ENTITY.get().spawn(worldIn, (ItemStack) null, null, pos, MobSpawnType.SPAWNER, false, true);
            }
        }
    }

    @Override
    public boolean isRandomlyTicking(BlockState blockState) {
        return true;
    }
}
