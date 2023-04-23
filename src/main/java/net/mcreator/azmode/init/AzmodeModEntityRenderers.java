
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.azmode.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.azmode.client.renderer.SqueletrazprimeRenderer;
import net.mcreator.azmode.client.renderer.SqueletaZRenderer;
import net.mcreator.azmode.client.renderer.ScytheRenderer;
import net.mcreator.azmode.client.renderer.RaZRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AzmodeModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AzmodeModEntities.SQUELETA_Z.get(), SqueletaZRenderer::new);
		event.registerEntityRenderer(AzmodeModEntities.RA_Z.get(), RaZRenderer::new);
		event.registerEntityRenderer(AzmodeModEntities.SCYTHE.get(), ScytheRenderer::new);
		event.registerEntityRenderer(AzmodeModEntities.SQUELETRAZPRIME.get(), SqueletrazprimeRenderer::new);
	}
}
