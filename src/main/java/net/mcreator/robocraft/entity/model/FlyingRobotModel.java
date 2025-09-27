package net.mcreator.robocraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.robocraft.entity.FlyingRobotEntity;

public class FlyingRobotModel extends GeoModel<FlyingRobotEntity> {
	@Override
	public ResourceLocation getAnimationResource(FlyingRobotEntity entity) {
		return ResourceLocation.parse("robocraft:animations/flyingbot.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlyingRobotEntity entity) {
		return ResourceLocation.parse("robocraft:geo/flyingbot.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlyingRobotEntity entity) {
		return ResourceLocation.parse("robocraft:textures/entities/" + entity.getTexture() + ".png");
	}

}
