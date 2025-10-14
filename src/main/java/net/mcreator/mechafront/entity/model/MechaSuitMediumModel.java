package net.mcreator.mechafront.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.entity.MechaSuitMediumEntity;

public class MechaSuitMediumModel extends GeoModel<MechaSuitMediumEntity> {
	@Override
	public ResourceLocation getAnimationResource(MechaSuitMediumEntity entity) {
		return ResourceLocation.parse("mechafront:animations/mecharrobo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MechaSuitMediumEntity entity) {
		return ResourceLocation.parse("mechafront:geo/mecharrobo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MechaSuitMediumEntity entity) {
		return ResourceLocation.parse("mechafront:textures/entities/" + entity.getTexture() + ".png");
	}

}
