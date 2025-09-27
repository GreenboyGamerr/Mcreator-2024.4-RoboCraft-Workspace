package net.mcreator.robocraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.robocraft.entity.RobotDogEntity;

public class RobotDogModel extends GeoModel<RobotDogEntity> {
	@Override
	public ResourceLocation getAnimationResource(RobotDogEntity entity) {
		return ResourceLocation.parse("robocraft:animations/doggyrobo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RobotDogEntity entity) {
		return ResourceLocation.parse("robocraft:geo/doggyrobo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RobotDogEntity entity) {
		return ResourceLocation.parse("robocraft:textures/entities/" + entity.getTexture() + ".png");
	}

}
