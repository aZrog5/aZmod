package net.mcreator.azmode.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.azmode.entity.WongEntity;

public class WongModel extends AnimatedGeoModel<WongEntity> {
	@Override
	public ResourceLocation getAnimationResource(WongEntity entity) {
		return new ResourceLocation("azmode", "animations/wong.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WongEntity entity) {
		return new ResourceLocation("azmode", "geo/wong.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WongEntity entity) {
		return new ResourceLocation("azmode", "textures/entities/" + entity.getTexture() + ".png");
	}

}
