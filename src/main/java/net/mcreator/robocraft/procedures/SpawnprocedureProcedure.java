package net.mcreator.robocraft.procedures;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.robocraft.init.RobocraftModEntities;
import net.mcreator.robocraft.init.RobocraftModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SpawnprocedureProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 0))).getBlock() == RobocraftModBlocks.BOSS_ACTIVATOR.get() && (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == Blocks.REDSTONE_BLOCK
				&& (world.getBlockState(BlockPos.containing(x + 0, y - 2, z + 0))).getBlock() == Blocks.REDSTONE_BLOCK && (world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 0))).getBlock() == Blocks.REDSTONE_BLOCK
				&& (world.getBlockState(BlockPos.containing(x - 1, y - 1, z + 0))).getBlock() == Blocks.REDSTONE_BLOCK) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("robocraft:final_fight"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = RobocraftModEntities.ENEMY_TITAN_BOSS.get().spawn(_level, BlockPos.containing(x, y - 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 2, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 0))).getBlock() == RobocraftModBlocks.BOSS_ACTIVATOR.get() && (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == Blocks.REDSTONE_BLOCK
				&& (world.getBlockState(BlockPos.containing(x + 0, y - 2, z + 0))).getBlock() == Blocks.REDSTONE_BLOCK && (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 1))).getBlock() == Blocks.REDSTONE_BLOCK
				&& (world.getBlockState(BlockPos.containing(x - 0, y - 1, z - 1))).getBlock() == Blocks.REDSTONE_BLOCK) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("robocraft:final_fight"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = RobocraftModEntities.ENEMY_TITAN_BOSS.get().spawn(_level, BlockPos.containing(x, y - 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 2, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 0))).getBlock() == RobocraftModBlocks.TITAN_SUMMONER.get() && (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == Blocks.DIAMOND_BLOCK
				&& (world.getBlockState(BlockPos.containing(x + 0, y - 2, z + 0))).getBlock() == Blocks.DIAMOND_BLOCK && (world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 0))).getBlock() == Blocks.DIAMOND_BLOCK
				&& (world.getBlockState(BlockPos.containing(x - 1, y - 1, z + 0))).getBlock() == Blocks.DIAMOND_BLOCK) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = RobocraftModEntities.TITAN_ROBOT.get().spawn(_level, BlockPos.containing(x, y - 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 2, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 0))).getBlock() == RobocraftModBlocks.TITAN_SUMMONER.get() && (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == Blocks.DIAMOND_BLOCK
				&& (world.getBlockState(BlockPos.containing(x + 0, y - 2, z + 0))).getBlock() == Blocks.DIAMOND_BLOCK && (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 1))).getBlock() == Blocks.DIAMOND_BLOCK
				&& (world.getBlockState(BlockPos.containing(x - 0, y - 1, z - 1))).getBlock() == Blocks.DIAMOND_BLOCK) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = RobocraftModEntities.TITAN_ROBOT.get().spawn(_level, BlockPos.containing(x, y - 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 2, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
