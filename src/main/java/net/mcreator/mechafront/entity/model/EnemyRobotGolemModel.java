package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.EnemyRobotGolemEntity;

public class EnemyRobotGolemModel extends GeoModel<EnemyRobotGolemEntity> {
	@Override
	public ResourceLocation getAnimationResource(EnemyRobotGolemEntity entity) {
		return ResourceLocation.parse("mechafront:animations/redrobo_golem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnemyRobotGolemEntity entity) {
		return ResourceLocation.parse("mechafront:geo/redrobo_golem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnemyRobotGolemEntity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
