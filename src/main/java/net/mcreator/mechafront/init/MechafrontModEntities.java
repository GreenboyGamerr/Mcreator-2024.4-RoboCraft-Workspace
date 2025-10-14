
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mechafront.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.mechafront.entity.TitanRobotEntity;
import net.mcreator.mechafront.entity.TNTCannonEntity;
import net.mcreator.mechafront.entity.RoboticGhastEntity;
import net.mcreator.mechafront.entity.RobotWithWheelsEntity;
import net.mcreator.mechafront.entity.RobotGolemEntity;
import net.mcreator.mechafront.entity.RobotDogEntity;
import net.mcreator.mechafront.entity.RobotDefenderSuitEntity;
import net.mcreator.mechafront.entity.RobotCatEntity;
import net.mcreator.mechafront.entity.MiniRobotEntity;
import net.mcreator.mechafront.entity.MechaSuitMediumEntity;
import net.mcreator.mechafront.entity.MechaSuitBasicEntity;
import net.mcreator.mechafront.entity.FlyingRobotEntity;
import net.mcreator.mechafront.entity.EnemyTitanPhase3Entity;
import net.mcreator.mechafront.entity.EnemyTitanBossEntity;
import net.mcreator.mechafront.entity.EnemyTitanBoss2Entity;
import net.mcreator.mechafront.entity.EnemyRobotGolemEntity;
import net.mcreator.mechafront.entity.DestroyerRobotEntity;
import net.mcreator.mechafront.entity.CurruptedRoboEntity;
import net.mcreator.mechafront.entity.CombatRoboEntity;
import net.mcreator.mechafront.entity.CannonFireEntity;
import net.mcreator.mechafront.MechafrontMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class MechafrontModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, MechafrontMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<MiniRobotEntity>> MINI_ROBOT = register("mini_robot",
			EntityType.Builder.<MiniRobotEntity>of(MiniRobotEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CombatRoboEntity>> COMBAT_ROBO = register("combat_robo",
			EntityType.Builder.<CombatRoboEntity>of(CombatRoboEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 3.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<RobotDogEntity>> ROBOT_DOG = register("robot_dog",
			EntityType.Builder.<RobotDogEntity>of(RobotDogEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TitanRobotEntity>> TITAN_ROBOT = register("titan_robot",
			EntityType.Builder.<TitanRobotEntity>of(TitanRobotEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2.5f, 5f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnemyTitanBossEntity>> ENEMY_TITAN_BOSS = register("enemy_titan_boss",
			EntityType.Builder.<EnemyTitanBossEntity>of(EnemyTitanBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 5f));
	public static final DeferredHolder<EntityType<?>, EntityType<CannonFireEntity>> CANNON_FIRE = register("cannon_fire",
			EntityType.Builder.<CannonFireEntity>of(CannonFireEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<CurruptedRoboEntity>> CURRUPTED_ROBO = register("currupted_robo",
			EntityType.Builder.<CurruptedRoboEntity>of(CurruptedRoboEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 3.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<RobotWithWheelsEntity>> ROBOT_WITH_WHEELS = register("robot_with_wheels",
			EntityType.Builder.<RobotWithWheelsEntity>of(RobotWithWheelsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 3.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlyingRobotEntity>> FLYING_ROBOT = register("flying_robot",
			EntityType.Builder.<FlyingRobotEntity>of(FlyingRobotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 3.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnemyTitanBoss2Entity>> ENEMY_TITAN_BOSS_2 = register("enemy_titan_boss_2",
			EntityType.Builder.<EnemyTitanBoss2Entity>of(EnemyTitanBoss2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 5f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnemyTitanPhase3Entity>> ENEMY_TITAN_PHASE_3 = register("enemy_titan_phase_3",
			EntityType.Builder.<EnemyTitanPhase3Entity>of(EnemyTitanPhase3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RobotDefenderSuitEntity>> ROBOT_DEFENDER_SUIT = register("robot_defender_suit",
			EntityType.Builder.<RobotDefenderSuitEntity>of(RobotDefenderSuitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 2.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<RobotGolemEntity>> ROBOT_GOLEM = register("robot_golem",
			EntityType.Builder.<RobotGolemEntity>of(RobotGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnemyRobotGolemEntity>> ENEMY_ROBOT_GOLEM = register("enemy_robot_golem",
			EntityType.Builder.<EnemyRobotGolemEntity>of(EnemyRobotGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<RobotCatEntity>> ROBOT_CAT = register("robot_cat",
			EntityType.Builder.<RobotCatEntity>of(RobotCatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<DestroyerRobotEntity>> DESTROYER_ROBOT = register("destroyer_robot",
			EntityType.Builder.<DestroyerRobotEntity>of(DestroyerRobotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TNTCannonEntity>> TNT_CANNON = register("tnt_cannon",
			EntityType.Builder.<TNTCannonEntity>of(TNTCannonEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RoboticGhastEntity>> ROBOTIC_GHAST = register("robotic_ghast",
			EntityType.Builder.<RoboticGhastEntity>of(RoboticGhastEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<MechaSuitBasicEntity>> MECHA_SUIT_BASIC = register("mecha_suit_basic",
			EntityType.Builder.<MechaSuitBasicEntity>of(MechaSuitBasicEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.3f, 2.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MechaSuitMediumEntity>> MECHA_SUIT_MEDIUM = register("mecha_suit_medium",
			EntityType.Builder.<MechaSuitMediumEntity>of(MechaSuitMediumEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.4f, 2.6f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerEntity(Capabilities.ItemHandler.ENTITY, MINI_ROBOT.get(), (living, context) -> living.getInventory());
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		MiniRobotEntity.init(event);
		CombatRoboEntity.init(event);
		RobotDogEntity.init(event);
		TitanRobotEntity.init(event);
		EnemyTitanBossEntity.init(event);
		CurruptedRoboEntity.init(event);
		RobotWithWheelsEntity.init(event);
		FlyingRobotEntity.init(event);
		EnemyTitanBoss2Entity.init(event);
		EnemyTitanPhase3Entity.init(event);
		RobotDefenderSuitEntity.init(event);
		RobotGolemEntity.init(event);
		EnemyRobotGolemEntity.init(event);
		RobotCatEntity.init(event);
		DestroyerRobotEntity.init(event);
		RoboticGhastEntity.init(event);
		MechaSuitBasicEntity.init(event);
		MechaSuitMediumEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MINI_ROBOT.get(), MiniRobotEntity.createAttributes().build());
		event.put(COMBAT_ROBO.get(), CombatRoboEntity.createAttributes().build());
		event.put(ROBOT_DOG.get(), RobotDogEntity.createAttributes().build());
		event.put(TITAN_ROBOT.get(), TitanRobotEntity.createAttributes().build());
		event.put(ENEMY_TITAN_BOSS.get(), EnemyTitanBossEntity.createAttributes().build());
		event.put(CURRUPTED_ROBO.get(), CurruptedRoboEntity.createAttributes().build());
		event.put(ROBOT_WITH_WHEELS.get(), RobotWithWheelsEntity.createAttributes().build());
		event.put(FLYING_ROBOT.get(), FlyingRobotEntity.createAttributes().build());
		event.put(ENEMY_TITAN_BOSS_2.get(), EnemyTitanBoss2Entity.createAttributes().build());
		event.put(ENEMY_TITAN_PHASE_3.get(), EnemyTitanPhase3Entity.createAttributes().build());
		event.put(ROBOT_DEFENDER_SUIT.get(), RobotDefenderSuitEntity.createAttributes().build());
		event.put(ROBOT_GOLEM.get(), RobotGolemEntity.createAttributes().build());
		event.put(ENEMY_ROBOT_GOLEM.get(), EnemyRobotGolemEntity.createAttributes().build());
		event.put(ROBOT_CAT.get(), RobotCatEntity.createAttributes().build());
		event.put(DESTROYER_ROBOT.get(), DestroyerRobotEntity.createAttributes().build());
		event.put(ROBOTIC_GHAST.get(), RoboticGhastEntity.createAttributes().build());
		event.put(MECHA_SUIT_BASIC.get(), MechaSuitBasicEntity.createAttributes().build());
		event.put(MECHA_SUIT_MEDIUM.get(), MechaSuitMediumEntity.createAttributes().build());
	}
}
