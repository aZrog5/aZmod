package net.mcreator.azmode.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.azmode.entity.MezzEntity;

public class MezzModel extends AnimatedGeoModel<MezzEntity> {
	@Override
	public ResourceLocation getAnimationResource(MezzEntity entity) {
		return new ResourceLocation("azmode", "animations/mezz.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MezzEntity entity) {
		return new ResourceLocation("azmode", "geo/mezz.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MezzEntity entity) {
		return new ResourceLocation("azmode", "textures/entities/" + entity.getTexture() + ".png");
	}

}
