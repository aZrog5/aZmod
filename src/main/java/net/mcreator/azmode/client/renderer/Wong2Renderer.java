
package net.mcreator.azmode.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.azmode.entity.Wong2Entity;
import net.mcreator.azmode.client.model.Modelwong2;

public class Wong2Renderer extends MobRenderer<Wong2Entity, Modelwong2<Wong2Entity>> {
	public Wong2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelwong2(context.bakeLayer(Modelwong2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Wong2Entity entity) {
		return new ResourceLocation("azmode:textures/entities/wongt.png");
	}
}
