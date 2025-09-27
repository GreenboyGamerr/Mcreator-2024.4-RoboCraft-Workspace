package net.mcreator.robocraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.robocraft.entity.EnemyTitanBossEntity;

public class EnemyTitanBossModel extends GeoModel<EnemyTitanBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(EnemyTitanBossEntity entity) {
		return ResourceLocation.parse("robocraft:animations/titanrobo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnemyTitanBossEntity entity) {
		return ResourceLocation.parse("robocraft:geo/titanrobo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnemyTitanBossEntity entity) {
		return ResourceLocation.parse("robocraft:textures/entities/" + entity.getTexture() + ".png");
	}

}
