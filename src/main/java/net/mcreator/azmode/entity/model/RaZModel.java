package net.mcreator.azmode.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.azmode.entity.RaZEntity;

public class RaZModel extends AnimatedGeoModel<RaZEntity> {
	@Override
	public ResourceLocation getAnimationResource(RaZEntity entity) {
		return new ResourceLocation("azmode", "animations/raz.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RaZEntity entity) {
		return new ResourceLocation("azmode", "geo/raz.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RaZEntity entity) {
		return new ResourceLocation("azmode", "textures/entities/" + entity.getTexture() + ".png");
	}

}
