
package net.mcreator.azmode.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.azmode.entity.Mezz2Entity;
import net.mcreator.azmode.client.model.Modelmezz2;

public class Mezz2Renderer extends MobRenderer<Mezz2Entity, Modelmezz2<Mezz2Entity>> {
	public Mezz2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelmezz2(context.bakeLayer(Modelmezz2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Mezz2Entity entity) {
		return new ResourceLocation("azmode:textures/entities/mezz.png");
	}
}
