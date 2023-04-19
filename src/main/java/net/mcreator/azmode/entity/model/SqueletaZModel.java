package net.mcreator.azmode.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.azmode.entity.SqueletaZEntity;

public class SqueletaZModel extends AnimatedGeoModel<SqueletaZEntity> {
	@Override
	public ResourceLocation getAnimationResource(SqueletaZEntity entity) {
		return new ResourceLocation("azmode", "animations/azsqueletonanime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SqueletaZEntity entity) {
		return new ResourceLocation("azmode", "geo/azsqueletonanime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SqueletaZEntity entity) {
		return new ResourceLocation("azmode", "textures/entities/" + entity.getTexture() + ".png");
	}

}
