package org.dawnoftimebuilder.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ambient.AmbientCreature;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.dawnoftimebuilder.DoTBConfig;
import org.dawnoftimebuilder.block.templates.DoubleGrowingBushBlock;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

//import static org.dawnoftimebuilder.registry.DoTBBlocksRegistry.MULBERRY;
import static org.dawnoftimebuilder.registry.DoTBEntitiesRegistry.SILKMOTH_ENTITY;

public class SilkmothEntity extends AmbientCreature {

	private static final EntityDataAccessor<BlockPos> ROTATION_POS = SynchedEntityData.defineId(SilkmothEntity.class, EntityDataSerializers.BLOCK_POS);
	private static final EntityDataAccessor<Boolean> CLOCKWISE = SynchedEntityData.defineId(SilkmothEntity.class, EntityDataSerializers.BOOLEAN);
	private static final EntityDataAccessor<Float> DISTANCE = SynchedEntityData.defineId(SilkmothEntity.class, EntityDataSerializers.FLOAT);

	public SilkmothEntity(Level worldIn) {
		super(SILKMOTH_ENTITY.get(), worldIn);
	}

	private float getNewRotationDistance(){
		return 0.5F + DoTBConfig.SILKMOTH_ROTATION_MAX_RANGE.get() * this.random.nextFloat();
	}

	@Override
	public void tick() {
		super.tick();
		this.setDeltaMovement(this.getDeltaMovement().multiply(1.0D, 0.6D, 1.0D));
	}

	@Nullable
	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficultyInstance, MobSpawnType spawnReason, @Nullable SpawnGroupData data, @Nullable CompoundTag nbt) {
		this.getEntityData().set(ROTATION_POS, this.blockPosition());
		return super.finalizeSpawn(world, difficultyInstance, spawnReason, data, nbt);
	}

	@Override
	protected void customServerAiStep() {
		super.customServerAiStep();

		if(this.tickCount >= 24000){
			//The silkmoth dies from oldness.
			if(!this.hasCustomName() && DoTBConfig.SILKMOTH_MUST_DIE.get()) this.hurt(damageSources().starve(), 20.0F);
		}

		if(this.random.nextInt(DoTBConfig.SILKMOTH_ROTATION_CHANGE.get()) == 0){
			//Randomly changes the rotation pos.
			this.changeRotationPos();
		}

		BlockPos pos = this.getEntityData().get(ROTATION_POS);
		double distance = this.getEntityData().get(DISTANCE);
		double x = this.getX() - (pos.getX() + 0.5D);
		double z = this.getZ() - (pos.getZ() + 0.5D);

		double alpha;
		if(z == 0) alpha = (x > 0) ? 0 : Math.PI;
		else{
			alpha = Math.atan(z / x);
			if(x > 0) alpha += Math.PI;
		}
		double d = Math.sqrt(x * x + z * z);
		d = - distance * 2 / (d + distance) + 1;
		alpha += (this.getEntityData().get(CLOCKWISE) ? d - 1 : 1 - d) * Math.PI / 2;

		Vec3 motionVector = this.getDeltaMovement();
		this.setDeltaMovement(motionVector.x * 0.5D + Math.cos(alpha) * 0.15D, Math.sin(this.tickCount / 20.0D) * 0.05D, motionVector.z * 0.5D + Math.sin(alpha) * 0.15D);
		this.yRotO = (float) Mth.wrapDegrees(180.0D * alpha / Math.PI - 90.0D);
	}

	private void changeRotationPos(){
		int horizontalRange = 5;
		int verticalRange = 2;

		int x = (int) this.level.getDayTime() % 23999;
		boolean isNight = x > 12000 && x < 23000;
		x = (int) Math.floor(this.getX()) - horizontalRange;
		int y = (int) Math.floor(this.getY()) - verticalRange;
		int z = (int) Math.floor(this.getZ()) - horizontalRange;

		List<BlockPos> listMulberry = new ArrayList<>();
		List<BlockPos> listLight = new ArrayList<>();
		BlockState state;

		for(int searchX = 0; searchX < 2 * horizontalRange + 1; searchX++){
			for(int searchZ = 0; searchZ < 2 * horizontalRange + 1; searchZ++){
				for(int searchY = 0; searchY < 2 * verticalRange + 1; searchY++){

					BlockPos pos = new BlockPos(x + searchX, y + searchY, z + searchZ);
					state = this.level.getBlockState(pos);

					/*if(state.getBlock() == MULBERRY.get()){
						if(!((DoubleGrowingBushBlock) state.getBlock()).isBottomCrop(state)) listMulberry.add(pos);
					}else if(isNight){
						if(state.getLightEmission(this.level, pos) >= 14) listLight.add(pos);
					}*/

				}
			}
		}

		if(!listLight.isEmpty()){
			this.getEntityData().set(ROTATION_POS, listLight.get(random.nextInt(listLight.size())));
		}else if(!listMulberry.isEmpty()){
			this.getEntityData().set(ROTATION_POS, listMulberry.get(random.nextInt(listMulberry.size())));
		}else this.getEntityData().set(ROTATION_POS, new BlockPos(x + this.random.nextInt(2 * horizontalRange + 1), y + this.random.nextInt(2 * verticalRange + 1), z + this.random.nextInt(2 * horizontalRange + 1)));

		this.getEntityData().set(DISTANCE, 0.5F + 2 * this.random.nextFloat());
	}

	@Override
	protected float getStandingEyeHeight(Pose poseIn, EntityDimensions sizeIn) {
		return sizeIn.height / 2.0F;
	}

	@Override
	public boolean causeFallDamage(float p_225503_1_, float p_225503_2_, DamageSource damageSource) {
		return false;
	}

	@Override
	protected void checkFallDamage(double p_184231_1_, boolean p_184231_3_, BlockState state, BlockPos pos) {
	}

	@Override
	public boolean isIgnoringBlockTriggers() {
		return true;
	}

	@Override
	public boolean isPushable() {
		return false;
	}

	@Override
	protected void doPush(Entity entity) {
	}

	@Override
	protected void pushEntities() {
	}

	@Override
	protected float getSoundVolume() {
		return 0.2F;
	}

	@Override
	public float getVoicePitch() {
		return super.getVoicePitch() * 0.9F;
	}

	@Nullable
	@Override
	public SoundEvent getAmbientSound() {
		return !DoTBConfig.SILKMOTH_MUTE.get() && this.random.nextInt(4) == 0 ? SoundEvents.BAT_AMBIENT : null;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.BAT_HURT;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundEvents.BAT_DEATH;
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.getEntityData().define(ROTATION_POS, new BlockPos(this.blockPosition()));
		this.getEntityData().define(CLOCKWISE, this.random.nextBoolean());
		this.getEntityData().define(DISTANCE, this.getNewRotationDistance());
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		this.getEntityData().set(ROTATION_POS, new BlockPos(compound.getInt("RotationX"), compound.getInt("RotationY"), compound.getInt("RotationZ")));
		this.getEntityData().set(CLOCKWISE, compound.getBoolean("RotationClockwise"));
		this.getEntityData().set(DISTANCE, compound.getFloat("RotationDistance"));
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("RotationX", this.getEntityData().get(ROTATION_POS).getX());
		compound.putInt("RotationY", this.getEntityData().get(ROTATION_POS).getY());
		compound.putInt("RotationZ", this.getEntityData().get(ROTATION_POS).getZ());
		compound.putBoolean("RotationClockwise", this.getEntityData().get(CLOCKWISE));
		compound.putFloat("RotationDistance", this.getEntityData().get(DISTANCE));
	}
}