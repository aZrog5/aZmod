package net.mcreator.azmode.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.azmode.entity.ScytheEntity;

public class ScytheModel extends AnimatedGeoModel<ScytheEntity> {
	@Override
	public ResourceLocation getAnimationResource(ScytheEntity entity) {
		return new ResourceLocation("azmode", "animations/squeletrazprimescythe.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScytheEntity entity) {
		return new ResourceLocation("azmode", "geo/squeletrazprimescythe.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScytheEntity entity) {
		return new ResourceLocation("azmode", "textures/entities/" + entity.getTexture() + ".png");
	}

}
