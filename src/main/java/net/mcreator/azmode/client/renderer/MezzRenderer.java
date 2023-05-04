
package net.mcreator.azmode.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.azmode.entity.model.MezzModel;
import net.mcreator.azmode.entity.MezzEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MezzRenderer extends GeoEntityRenderer<MezzEntity> {
	public MezzRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new MezzModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(MezzEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(MezzEntity entityLivingBaseIn) {
		return 0.0F;
	}
}