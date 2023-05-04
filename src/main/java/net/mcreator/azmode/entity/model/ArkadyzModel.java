package net.mcreator.azmode.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.azmode.entity.ArkadyzEntity;

public class ArkadyzModel extends AnimatedGeoModel<ArkadyzEntity> {
	@Override
	public ResourceLocation getAnimationResource(ArkadyzEntity entity) {
		return new ResourceLocation("azmode", "animations/arkadyz.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArkadyzEntity entity) {
		return new ResourceLocation("azmode", "geo/arkadyz.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArkadyzEntity entity) {
		return new ResourceLocation("azmode", "textures/entities/" + entity.getTexture() + ".png");
	}

}
