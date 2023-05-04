package net.mcreator.azmode.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.azmode.entity.TanuzEntity;

public class TanuzModel extends AnimatedGeoModel<TanuzEntity> {
	@Override
	public ResourceLocation getAnimationResource(TanuzEntity entity) {
		return new ResourceLocation("azmode", "animations/tanuz.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TanuzEntity entity) {
		return new ResourceLocation("azmode", "geo/tanuz.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TanuzEntity entity) {
		return new ResourceLocation("azmode", "textures/entities/" + entity.getTexture() + ".png");
	}

}
