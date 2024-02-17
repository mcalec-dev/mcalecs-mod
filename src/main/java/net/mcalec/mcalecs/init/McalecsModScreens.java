
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.mcalecs.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcalec.mcalecs.client.gui.MusicUIScreen;
import net.mcalec.mcalecs.client.gui.ConfigGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class McalecsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(McalecsModMenus.MUSIC_UI.get(), MusicUIScreen::new);
			MenuScreens.register(McalecsModMenus.CONFIG_GUI.get(), ConfigGUIScreen::new);
		});
	}
}
