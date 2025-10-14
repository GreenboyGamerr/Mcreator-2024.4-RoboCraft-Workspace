package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.CombatRoboEntity;

public class CombatRoboModel extends GeoModel<CombatRoboEntity> {
	@Override
	public ResourceLocation getAnimationResource(CombatRoboEntity entity) {
		return ResourceLocation.parse("mechafront:animations/combatrobo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CombatRoboEntity entity) {
		return ResourceLocation.parse("mechafront:geo/combatrobo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CombatRoboEntity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
