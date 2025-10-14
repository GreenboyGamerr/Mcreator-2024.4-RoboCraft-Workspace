package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.FlyingRobotEntity;

public class FlyingRobotModel extends GeoModel<FlyingRobotEntity> {
	@Override
	public ResourceLocation getAnimationResource(FlyingRobotEntity entity) {
		return ResourceLocation.parse("mechafront:animations/flyingbot.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlyingRobotEntity entity) {
		return ResourceLocation.parse("mechafront:geo/flyingbot.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlyingRobotEntity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
