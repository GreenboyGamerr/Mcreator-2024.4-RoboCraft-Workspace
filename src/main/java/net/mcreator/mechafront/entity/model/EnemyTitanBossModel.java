package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.EnemyTitanBossEntity;

public class EnemyTitanBossModel extends GeoModel<EnemyTitanBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(EnemyTitanBossEntity entity) {
		return ResourceLocation.parse("mechafront:animations/titanroboenemy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnemyTitanBossEntity entity) {
		return ResourceLocation.parse("mechafront:geo/titanroboenemy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnemyTitanBossEntity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
