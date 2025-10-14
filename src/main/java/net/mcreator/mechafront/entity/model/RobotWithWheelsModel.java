package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.RobotWithWheelsEntity;

public class RobotWithWheelsModel extends GeoModel<RobotWithWheelsEntity> {
	@Override
	public ResourceLocation getAnimationResource(RobotWithWheelsEntity entity) {
		return ResourceLocation.parse("mechafront:animations/wheenbot.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RobotWithWheelsEntity entity) {
		return ResourceLocation.parse("mechafront:geo/wheenbot.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RobotWithWheelsEntity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
