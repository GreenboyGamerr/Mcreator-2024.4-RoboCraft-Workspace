package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.DestroyerRobotEntity;

public class DestroyerRobotModel extends GeoModel<DestroyerRobotEntity> {
	@Override
	public ResourceLocation getAnimationResource(DestroyerRobotEntity entity) {
		return ResourceLocation.parse("mechafront:animations/robotdestroyed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DestroyerRobotEntity entity) {
		return ResourceLocation.parse("mechafront:geo/robotdestroyed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DestroyerRobotEntity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
