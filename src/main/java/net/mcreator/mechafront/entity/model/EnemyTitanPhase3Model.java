package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.EnemyTitanPhase3Entity;

public class EnemyTitanPhase3Model extends GeoModel<EnemyTitanPhase3Entity> {
	@Override
	public ResourceLocation getAnimationResource(EnemyTitanPhase3Entity entity) {
		return ResourceLocation.parse("mechafront:animations/titanroboenemy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnemyTitanPhase3Entity entity) {
		return ResourceLocation.parse("mechafront:geo/titanroboenemy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnemyTitanPhase3Entity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
