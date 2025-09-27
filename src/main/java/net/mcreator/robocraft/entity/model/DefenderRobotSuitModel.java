package net.mcreator.robocraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.robocraft.entity.DefenderRobotSuitEntity;

public class DefenderRobotSuitModel extends GeoModel<DefenderRobotSuitEntity> {
	@Override
	public ResourceLocation getAnimationResource(DefenderRobotSuitEntity entity) {
		return ResourceLocation.parse("robocraft:animations/defenderrobo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DefenderRobotSuitEntity entity) {
		return ResourceLocation.parse("robocraft:geo/defenderrobo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DefenderRobotSuitEntity entity) {
		return ResourceLocation.parse("robocraft:textures/entities/" + entity.getTexture() + ".png");
	}

}
