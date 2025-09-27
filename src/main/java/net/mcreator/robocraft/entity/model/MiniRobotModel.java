package net.mcreator.robocraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.robocraft.entity.MiniRobotEntity;

public class MiniRobotModel extends GeoModel<MiniRobotEntity> {
	@Override
	public ResourceLocation getAnimationResource(MiniRobotEntity entity) {
		return ResourceLocation.parse("robocraft:animations/robo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MiniRobotEntity entity) {
		return ResourceLocation.parse("robocraft:geo/robo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MiniRobotEntity entity) {
		return ResourceLocation.parse("robocraft:textures/entities/" + entity.getTexture() + ".png");
	}

}
