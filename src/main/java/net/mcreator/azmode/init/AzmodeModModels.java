
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.azmode.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.azmode.client.model.Modelwong2;
import net.mcreator.azmode.client.model.Modelmezz2;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AzmodeModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmezz2.LAYER_LOCATION, Modelmezz2::createBodyLayer);
		event.registerLayerDefinition(Modelwong2.LAYER_LOCATION, Modelwong2::createBodyLayer);
	}
}
