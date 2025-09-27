package net.mcreator.robocraft.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.robocraft.item.RoboSwordItem;

public class RoboSwordItemModel extends GeoModel<RoboSwordItem> {
	@Override
	public ResourceLocation getAnimationResource(RoboSwordItem animatable) {
		return ResourceLocation.parse("robocraft:animations/legendsword.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RoboSwordItem animatable) {
		return ResourceLocation.parse("robocraft:geo/legendsword.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RoboSwordItem animatable) {
		return ResourceLocation.parse("robocraft:textures/item/sword.png");
	}
}
