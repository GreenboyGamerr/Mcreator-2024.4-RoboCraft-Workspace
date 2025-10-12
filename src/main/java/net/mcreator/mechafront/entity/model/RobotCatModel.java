package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.RobotCatEntity;

public class RobotCatModel extends GeoModel<RobotCatEntity> {
	@Override
	public ResourceLocation getAnimationResource(RobotCatEntity entity) {
		return ResourceLocation.parse("mechafront:animations/robocat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RobotCatEntity entity) {
		return ResourceLocation.parse("mechafront:geo/robocat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RobotCatEntity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
