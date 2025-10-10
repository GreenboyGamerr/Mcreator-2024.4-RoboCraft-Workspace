package net.mcreator.mechafront.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.mechafront.init.MechafrontModEntities;

public class RobotGolemNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level0 && _level0.isVillage(BlockPos.containing(x, y, z))) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = MechafrontModEntities.ROBOT_GOLEM.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			return true;
		}
		return false;
	}
}
