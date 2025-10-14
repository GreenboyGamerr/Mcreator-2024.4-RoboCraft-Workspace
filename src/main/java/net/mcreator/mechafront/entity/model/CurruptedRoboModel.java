package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.CurruptedRoboEntity;

public class CurruptedRoboModel extends GeoModel<CurruptedRoboEntity> {
	@Override
	public ResourceLocation getAnimationResource(CurruptedRoboEntity entity) {
		return ResourceLocation.parse("mechafront:animations/curruptrobo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CurruptedRoboEntity entity) {
		return ResourceLocation.parse("mechafront:geo/curruptrobo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CurruptedRoboEntity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
