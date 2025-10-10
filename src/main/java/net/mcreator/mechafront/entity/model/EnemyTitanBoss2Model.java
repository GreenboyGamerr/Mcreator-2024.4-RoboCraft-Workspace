package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.EnemyTitanBoss2Entity;

public class EnemyTitanBoss2Model extends GeoModel<EnemyTitanBoss2Entity> {
	@Override
	public ResourceLocation getAnimationResource(EnemyTitanBoss2Entity entity) {
		return ResourceLocation.parse("mechafront:animations/titanroboenemy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnemyTitanBoss2Entity entity) {
		return ResourceLocation.parse("mechafront:geo/titanroboenemy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnemyTitanBoss2Entity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
