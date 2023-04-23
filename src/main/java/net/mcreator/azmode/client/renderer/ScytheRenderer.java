
package net.mcreator.azmode.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.azmode.entity.model.ScytheModel;
import net.mcreator.azmode.entity.layer.ScytheLayer;
import net.mcreator.azmode.entity.ScytheEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ScytheRenderer extends GeoEntityRenderer<ScytheEntity> {
	public ScytheRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ScytheModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new ScytheLayer(this));
	}

	@Override
	public RenderType getRenderType(ScytheEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(ScytheEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
