package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.MiniRobotEntity;

public class MiniRobotModel extends GeoModel<MiniRobotEntity> {
	@Override
	public ResourceLocation getAnimationResource(MiniRobotEntity entity) {
		return ResourceLocation.parse("mechafront:animations/robo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MiniRobotEntity entity) {
		return ResourceLocation.parse("mechafront:geo/robo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MiniRobotEntity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
