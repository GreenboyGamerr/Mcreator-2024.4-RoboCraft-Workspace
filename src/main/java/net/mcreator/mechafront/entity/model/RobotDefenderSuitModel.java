package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.RobotDefenderSuitEntity;

public class RobotDefenderSuitModel extends GeoModel<RobotDefenderSuitEntity> {
	@Override
	public ResourceLocation getAnimationResource(RobotDefenderSuitEntity entity) {
		return ResourceLocation.parse("mechafront:animations/defenderrobo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RobotDefenderSuitEntity entity) {
		return ResourceLocation.parse("mechafront:geo/defenderrobo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RobotDefenderSuitEntity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
