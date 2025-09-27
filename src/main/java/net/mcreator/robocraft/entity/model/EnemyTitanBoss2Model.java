package net.mcreator.robocraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.robocraft.entity.EnemyTitanBoss2Entity;

public class EnemyTitanBoss2Model extends GeoModel<EnemyTitanBoss2Entity> {
	@Override
	public ResourceLocation getAnimationResource(EnemyTitanBoss2Entity entity) {
		return ResourceLocation.parse("robocraft:animations/titanrobo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnemyTitanBoss2Entity entity) {
		return ResourceLocation.parse("robocraft:geo/titanrobo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnemyTitanBoss2Entity entity) {
		return ResourceLocation.parse("robocraft:textures/entities/" + entity.getTexture() + ".png");
	}

}
