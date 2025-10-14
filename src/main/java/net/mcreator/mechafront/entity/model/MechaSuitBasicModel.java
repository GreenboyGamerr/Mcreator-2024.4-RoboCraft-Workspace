package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.MechaSuitBasicEntity;

public class MechaSuitBasicModel extends GeoModel<MechaSuitBasicEntity> {
	@Override
	public ResourceLocation getAnimationResource(MechaSuitBasicEntity entity) {
		return ResourceLocation.parse("mechafront:animations/mecharrobo2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MechaSuitBasicEntity entity) {
		return ResourceLocation.parse("mechafront:geo/mecharrobo2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MechaSuitBasicEntity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
