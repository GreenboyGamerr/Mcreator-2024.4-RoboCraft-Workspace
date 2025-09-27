package net.mcreator.robocraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.robocraft.entity.RobotWithWheelsEntity;

public class RobotWithWheelsModel extends GeoModel<RobotWithWheelsEntity> {
	@Override
	public ResourceLocation getAnimationResource(RobotWithWheelsEntity entity) {
		return ResourceLocation.parse("robocraft:animations/wheenbot.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RobotWithWheelsEntity entity) {
		return ResourceLocation.parse("robocraft:geo/wheenbot.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RobotWithWheelsEntity entity) {
		return ResourceLocation.parse("robocraft:textures/entities/" + entity.getTexture() + ".png");
	}

}
