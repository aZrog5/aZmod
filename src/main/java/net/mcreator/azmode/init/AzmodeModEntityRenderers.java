
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.azmode.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.azmode.client.renderer.WongRenderer;
import net.mcreator.azmode.client.renderer.TanuzRenderer;
import net.mcreator.azmode.client.renderer.SqueletaZRenderer;
import net.mcreator.azmode.client.renderer.RaZRenderer;
import net.mcreator.azmode.client.renderer.MezzRenderer;
import net.mcreator.azmode.client.renderer.ArkadyzRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AzmodeModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AzmodeModEntities.SQUELETA_Z.get(), SqueletaZRenderer::new);
		event.registerEntityRenderer(AzmodeModEntities.RA_Z.get(), RaZRenderer::new);
		event.registerEntityRenderer(AzmodeModEntities.TANUZ.get(), TanuzRenderer::new);
		event.registerEntityRenderer(AzmodeModEntities.MEZZ.get(), MezzRenderer::new);
		event.registerEntityRenderer(AzmodeModEntities.ARKADYZ.get(), ArkadyzRenderer::new);
		event.registerEntityRenderer(AzmodeModEntities.WONG.get(), WongRenderer::new);
	}
}
