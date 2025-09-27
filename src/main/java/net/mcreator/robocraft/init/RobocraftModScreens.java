
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.robocraft.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.robocraft.client.gui.MiniRoboInvScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RobocraftModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(RobocraftModMenus.MINI_ROBO_INV.get(), MiniRoboInvScreen::new);
	}
}
