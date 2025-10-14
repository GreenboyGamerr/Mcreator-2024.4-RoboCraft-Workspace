package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.RobotDogEntity;

public class RobotDogModel extends GeoModel<RobotDogEntity> {
	@Override
	public ResourceLocation getAnimationResource(RobotDogEntity entity) {
		return ResourceLocation.parse("mechafront:animations/doggyrobo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RobotDogEntity entity) {
		return ResourceLocation.parse("mechafront:geo/doggyrobo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RobotDogEntity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
