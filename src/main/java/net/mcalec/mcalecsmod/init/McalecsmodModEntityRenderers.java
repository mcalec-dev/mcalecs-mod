
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.mcalecsmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcalec.mcalecsmod.client.renderer.McAlecPersonRenderer;
import net.mcalec.mcalecsmod.client.renderer.BoykisserMaidRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class McalecsmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(McalecsmodModEntities.MC_ALEC_PERSON.get(), McAlecPersonRenderer::new);
		event.registerEntityRenderer(McalecsmodModEntities.BOYKISSER_MAID.get(), BoykisserMaidRenderer::new);
	}
}
