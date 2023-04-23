package net.mcreator.azmode.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.azmode.entity.SqueletrazprimeEntity;

public class SqueletrazprimeModel extends AnimatedGeoModel<SqueletrazprimeEntity> {
	@Override
	public ResourceLocation getAnimationResource(SqueletrazprimeEntity entity) {
		return new ResourceLocation("azmode", "animations/squeletrazprime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SqueletrazprimeEntity entity) {
		return new ResourceLocation("azmode", "geo/squeletrazprime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SqueletrazprimeEntity entity) {
		return new ResourceLocation("azmode", "textures/entities/" + entity.getTexture() + ".png");
	}

}
