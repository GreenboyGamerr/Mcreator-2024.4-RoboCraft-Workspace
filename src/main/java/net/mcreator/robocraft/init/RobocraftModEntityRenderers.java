
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.robocraft.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.robocraft.client.renderer.TitanRobotRenderer;
import net.mcreator.robocraft.client.renderer.RobotWithWheelsRenderer;
import net.mcreator.robocraft.client.renderer.RobotDogRenderer;
import net.mcreator.robocraft.client.renderer.MiniRobotRenderer;
import net.mcreator.robocraft.client.renderer.FlyingRobotRenderer;
import net.mcreator.robocraft.client.renderer.EnemyTitanPhase3Renderer;
import net.mcreator.robocraft.client.renderer.EnemyTitanBossRenderer;
import net.mcreator.robocraft.client.renderer.EnemyTitanBoss2Renderer;
import net.mcreator.robocraft.client.renderer.DefenderRobotSuitRenderer;
import net.mcreator.robocraft.client.renderer.CurruptedRoboRenderer;
import net.mcreator.robocraft.client.renderer.CombatRoboRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RobocraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RobocraftModEntities.MINI_ROBOT.get(), MiniRobotRenderer::new);
		event.registerEntityRenderer(RobocraftModEntities.COMBAT_ROBO.get(), CombatRoboRenderer::new);
		event.registerEntityRenderer(RobocraftModEntities.ROBOT_DOG.get(), RobotDogRenderer::new);
		event.registerEntityRenderer(RobocraftModEntities.TITAN_ROBOT.get(), TitanRobotRenderer::new);
		event.registerEntityRenderer(RobocraftModEntities.ENEMY_TITAN_BOSS.get(), EnemyTitanBossRenderer::new);
		event.registerEntityRenderer(RobocraftModEntities.CANNON_FIRE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RobocraftModEntities.CURRUPTED_ROBO.get(), CurruptedRoboRenderer::new);
		event.registerEntityRenderer(RobocraftModEntities.ROBOT_WITH_WHEELS.get(), RobotWithWheelsRenderer::new);
		event.registerEntityRenderer(RobocraftModEntities.FLYING_ROBOT.get(), FlyingRobotRenderer::new);
		event.registerEntityRenderer(RobocraftModEntities.ENEMY_TITAN_BOSS_2.get(), EnemyTitanBoss2Renderer::new);
		event.registerEntityRenderer(RobocraftModEntities.ENEMY_TITAN_PHASE_3.get(), EnemyTitanPhase3Renderer::new);
		event.registerEntityRenderer(RobocraftModEntities.DEFENDER_ROBOT_SUIT.get(), DefenderRobotSuitRenderer::new);
	}
}
