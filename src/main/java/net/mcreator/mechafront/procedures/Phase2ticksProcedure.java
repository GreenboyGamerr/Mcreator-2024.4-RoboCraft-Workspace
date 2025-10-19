package net.mcreator.mechafront.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.mechafront.network.MechafrontModVariables;
import net.mcreator.mechafront.init.MechafrontModEntities;
import net.mcreator.mechafront.entity.EnemyTitanBoss2Entity;
import net.mcreator.mechafront.entity.CannonFireEntity;
import net.mcreator.mechafront.MechafrontMod;

public class Phase2ticksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			MechafrontModVariables.fight = MechafrontModVariables.fight + 1;
			if (MechafrontModVariables.fight == 125) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = MechafrontModEntities.DESTROYER_ROBOT.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = MechafrontModEntities.DESTROYER_ROBOT.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = MechafrontModEntities.DESTROYER_ROBOT.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 5, Level.ExplosionInteraction.TNT);
			}
			if (MechafrontModVariables.fight == 230) {
				if (entity instanceof EnemyTitanBoss2Entity) {
					((EnemyTitanBoss2Entity) entity).setAnimation("cannor");
				}
				MechafrontMod.queueServerWork(10, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")), SoundSource.NEUTRAL, 2, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")), SoundSource.NEUTRAL, 2, 1, false);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new CannonFireEntity(MechafrontModEntities.CANNON_FIRE.get(), level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setSilent(true);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 4, 4, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")), SoundSource.NEUTRAL, 2, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")), SoundSource.NEUTRAL, 2, 1, false);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new CannonFireEntity(MechafrontModEntities.CANNON_FIRE.get(), level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setSilent(true);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 4, 4, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 1);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")), SoundSource.NEUTRAL, 2, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")), SoundSource.NEUTRAL, 2, 1, false);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new CannonFireEntity(MechafrontModEntities.CANNON_FIRE.get(), level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setSilent(true);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 4, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 2);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")), SoundSource.NEUTRAL, 2, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")), SoundSource.NEUTRAL, 2, 1, false);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new CannonFireEntity(MechafrontModEntities.CANNON_FIRE.get(), level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setSilent(true);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 4, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 3);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")), SoundSource.NEUTRAL, 2, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")), SoundSource.NEUTRAL, 2, 1, false);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new CannonFireEntity(MechafrontModEntities.CANNON_FIRE.get(), level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setSilent(true);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 4, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 5);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")), SoundSource.NEUTRAL, 2, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")), SoundSource.NEUTRAL, 2, 1, false);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new CannonFireEntity(MechafrontModEntities.CANNON_FIRE.get(), level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setSilent(true);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 4, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, -4);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new CannonFireEntity(MechafrontModEntities.CANNON_FIRE.get(), level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setSilent(true);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 4, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, -2);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new CannonFireEntity(MechafrontModEntities.CANNON_FIRE.get(), level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setSilent(true);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 4, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, -1);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new CannonFireEntity(MechafrontModEntities.CANNON_FIRE.get(), level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setSilent(true);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 4, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, -3);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new CannonFireEntity(MechafrontModEntities.CANNON_FIRE.get(), level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setSilent(true);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 4, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, -5);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
				});
			}
			if (MechafrontModVariables.fight == 300) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 100, 255, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 10, false, false));
				MechafrontModVariables.fight = 0;
			}
		}
	}
}
