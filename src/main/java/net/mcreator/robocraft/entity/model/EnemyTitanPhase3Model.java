package net.mcreator.robocraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.robocraft.entity.EnemyTitanPhase3Entity;

public class EnemyTitanPhase3Model extends GeoModel<EnemyTitanPhase3Entity> {
	@Override
	public ResourceLocation getAnimationResource(EnemyTitanPhase3Entity entity) {
		return ResourceLocation.parse("robocraft:animations/titanrobo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnemyTitanPhase3Entity entity) {
		return ResourceLocation.parse("robocraft:geo/titanrobo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnemyTitanPhase3Entity entity) {
		return ResourceLocation.parse("robocraft:textures/entities/" + entity.getTexture() + ".png");
	}

}
