package net.mcreator.mechafront.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.mechafront.network.MechafrontModVariables;
import net.mcreator.mechafront.MechafrontMod;

public class ShootCannonOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (MechafrontModVariables.wait == 1) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(""), true);
		} else if (MechafrontModVariables.wait == 0) {
			MechafrontModVariables.flight = 10;
			MechafrontMod.queueServerWork(3, () -> {
				MechafrontModVariables.flight = 0;
			});
		}
	}
}
