package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.TitanRobotEntity;

public class TitanRobotModel extends GeoModel<TitanRobotEntity> {
	@Override
	public ResourceLocation getAnimationResource(TitanRobotEntity entity) {
		return ResourceLocation.parse("mechafront:animations/titanrobo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TitanRobotEntity entity) {
		return ResourceLocation.parse("mechafront:geo/titanrobo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TitanRobotEntity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
