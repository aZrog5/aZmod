
package net.mcreator.azmode.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.azmode.entity.model.TanuzModel;
import net.mcreator.azmode.entity.TanuzEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TanuzRenderer extends GeoEntityRenderer<TanuzEntity> {
	public TanuzRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new TanuzModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(TanuzEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(TanuzEntity entityLivingBaseIn) {
		return 0.0F;
	}
}