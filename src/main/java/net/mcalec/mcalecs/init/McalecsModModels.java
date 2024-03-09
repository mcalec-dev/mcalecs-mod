
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.mcalecs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcalec.mcalecs.client.model.ModelVillager;
import net.mcalec.mcalecs.client.model.ModelSlim;
import net.mcalec.mcalecs.client.model.ModelBoykisser;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class McalecsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBoykisser.LAYER_LOCATION, ModelBoykisser::createBodyLayer);
		event.registerLayerDefinition(ModelSlim.LAYER_LOCATION, ModelSlim::createBodyLayer);
		event.registerLayerDefinition(ModelVillager.LAYER_LOCATION, ModelVillager::createBodyLayer);
	}
}
