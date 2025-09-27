package net.mcreator.robocraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.robocraft.entity.CurruptedRoboEntity;

public class CurruptedRoboModel extends GeoModel<CurruptedRoboEntity> {
	@Override
	public ResourceLocation getAnimationResource(CurruptedRoboEntity entity) {
		return ResourceLocation.parse("robocraft:animations/curruptrobo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CurruptedRoboEntity entity) {
		return ResourceLocation.parse("robocraft:geo/curruptrobo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CurruptedRoboEntity entity) {
		return ResourceLocation.parse("robocraft:textures/entities/" + entity.getTexture() + ".png");
	}

}
