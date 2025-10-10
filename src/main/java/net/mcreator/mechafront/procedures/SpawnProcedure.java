package net.mcreator.mechafront.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mechafront.entity.EnemyTitanBossEntity;

public class SpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof EnemyTitanBossEntity) {
			((EnemyTitanBossEntity) entity).setAnimation("spawn");
		}
		if (entity instanceof EnemyTitanBossEntity) {
			((EnemyTitanBossEntity) entity).setAnimation("spawn");
		}
	}
}
