package net.mcreator.robocraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.robocraft.entity.CombatRoboEntity;

public class CombatRoboModel extends GeoModel<CombatRoboEntity> {
	@Override
	public ResourceLocation getAnimationResource(CombatRoboEntity entity) {
		return ResourceLocation.parse("robocraft:animations/combatrobo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CombatRoboEntity entity) {
		return ResourceLocation.parse("robocraft:geo/combatrobo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CombatRoboEntity entity) {
		return ResourceLocation.parse("robocraft:textures/entities/" + entity.getTexture() + ".png");
	}

}
