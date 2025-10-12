
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mechafront.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.mechafront.client.renderer.TitanRobotRenderer;
import net.mcreator.mechafront.client.renderer.RoboticGhastRenderer;
import net.mcreator.mechafront.client.renderer.RobotWithWheelsRenderer;
import net.mcreator.mechafront.client.renderer.RobotGolemRenderer;
import net.mcreator.mechafront.client.renderer.RobotDogRenderer;
import net.mcreator.mechafront.client.renderer.RobotDefenderSuitRenderer;
import net.mcreator.mechafront.client.renderer.RobotCatRenderer;
import net.mcreator.mechafront.client.renderer.MiniRobotRenderer;
import net.mcreator.mechafront.client.renderer.MechaSuitMediumRenderer;
import net.mcreator.mechafront.client.renderer.MechaSuitBasicRenderer;
import net.mcreator.mechafront.client.renderer.FlyingRobotRenderer;
import net.mcreator.mechafront.client.renderer.EnemyTitanPhase3Renderer;
import net.mcreator.mechafront.client.renderer.EnemyTitanBossRenderer;
import net.mcreator.mechafront.client.renderer.EnemyTitanBoss2Renderer;
import net.mcreator.mechafront.client.renderer.EnemyRobotGolemRenderer;
import net.mcreator.mechafront.client.renderer.DestroyerRobotRenderer;
import net.mcreator.mechafront.client.renderer.CurruptedRoboRenderer;
import net.mcreator.mechafront.client.renderer.CombatRoboRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MechafrontModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MechafrontModEntities.MINI_ROBOT.get(), MiniRobotRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.COMBAT_ROBO.get(), CombatRoboRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.ROBOT_DOG.get(), RobotDogRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.TITAN_ROBOT.get(), TitanRobotRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.ENEMY_TITAN_BOSS.get(), EnemyTitanBossRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.CANNON_FIRE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.CURRUPTED_ROBO.get(), CurruptedRoboRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.ROBOT_WITH_WHEELS.get(), RobotWithWheelsRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.FLYING_ROBOT.get(), FlyingRobotRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.ENEMY_TITAN_BOSS_2.get(), EnemyTitanBoss2Renderer::new);
		event.registerEntityRenderer(MechafrontModEntities.ENEMY_TITAN_PHASE_3.get(), EnemyTitanPhase3Renderer::new);
		event.registerEntityRenderer(MechafrontModEntities.ROBOT_DEFENDER_SUIT.get(), RobotDefenderSuitRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.ROBOT_GOLEM.get(), RobotGolemRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.ENEMY_ROBOT_GOLEM.get(), EnemyRobotGolemRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.ROBOT_CAT.get(), RobotCatRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.DESTROYER_ROBOT.get(), DestroyerRobotRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.TNT_CANNON.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.ROBOTIC_GHAST.get(), RoboticGhastRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.MECHA_SUIT_BASIC.get(), MechaSuitBasicRenderer::new);
		event.registerEntityRenderer(MechafrontModEntities.MECHA_SUIT_MEDIUM.get(), MechaSuitMediumRenderer::new);
	}
}
