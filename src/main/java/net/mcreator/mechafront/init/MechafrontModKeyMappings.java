
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mechafront.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.mechafront.network.ShootCannonMessage;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MechafrontModKeyMappings {
	public static final KeyMapping SHOOT_CANNON = new KeyMapping("key.mechafront.shoot_cannon", GLFW.GLFW_KEY_C, "key.categories.mechaverse") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new ShootCannonMessage(0, 0));
				ShootCannonMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				SHOOT_CANNON_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - SHOOT_CANNON_LASTPRESS);
				PacketDistributor.sendToServer(new ShootCannonMessage(1, dt));
				ShootCannonMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long SHOOT_CANNON_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SHOOT_CANNON);
	}

	@EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				SHOOT_CANNON.consumeClick();
			}
		}
	}
}
