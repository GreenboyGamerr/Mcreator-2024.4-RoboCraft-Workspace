package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.RobotGolemEntity;

public class RobotGolemModel extends GeoModel<RobotGolemEntity> {
	@Override
	public ResourceLocation getAnimationResource(RobotGolemEntity entity) {
		return ResourceLocation.parse("mechafront:animations/robo_golem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RobotGolemEntity entity) {
		return ResourceLocation.parse("mechafront:geo/robo_golem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RobotGolemEntity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
