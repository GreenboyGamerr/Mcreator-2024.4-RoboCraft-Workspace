package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.RoboticGhastEntity;

public class RoboticGhastModel extends GeoModel<RoboticGhastEntity> {
	@Override
	public ResourceLocation getAnimationResource(RoboticGhastEntity entity) {
		return ResourceLocation.parse("mechafront:animations/roboghast.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RoboticGhastEntity entity) {
		return ResourceLocation.parse("mechafront:geo/roboghast.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RoboticGhastEntity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
