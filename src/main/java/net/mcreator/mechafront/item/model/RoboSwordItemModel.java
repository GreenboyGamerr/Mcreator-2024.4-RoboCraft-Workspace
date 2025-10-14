package net.mcreator.mechafront.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mechafront.item.RoboSwordItem;

public class RoboSwordItemModel extends GeoModel<RoboSwordItem> {
	@Override
	public ResourceLocation getAnimationResource(RoboSwordItem animatable) {
		return ResourceLocation.parse("mechafront:animations/legendsword.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RoboSwordItem animatable) {
		return ResourceLocation.parse("mechafront:geo/legendsword.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RoboSwordItem animatable) {
		return ResourceLocation.parse("mechafront:textures/item/sword.png");
	}
}
