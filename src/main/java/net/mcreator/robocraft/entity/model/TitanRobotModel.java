package net.mcreator.robocraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.robocraft.entity.TitanRobotEntity;

public class TitanRobotModel extends GeoModel<TitanRobotEntity> {
	@Override
	public ResourceLocation getAnimationResource(TitanRobotEntity entity) {
		return ResourceLocation.parse("robocraft:animations/titanrobo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TitanRobotEntity entity) {
		return ResourceLocation.parse("robocraft:geo/titanrobo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TitanRobotEntity entity) {
		return ResourceLocation.parse("robocraft:textures/entities/" + entity.getTexture() + ".png");
	}

}
