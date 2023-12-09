
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.mcalecsmod.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcalec.mcalecsmod.network.MusicUIkeybindMessage;
import net.mcalec.mcalecsmod.McalecsmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class McalecsmodModKeyMappings {
	public static final KeyMapping MUSIC_U_IKEYBIND = new KeyMapping("key.mcalecsmod.music_u_ikeybind", GLFW.GLFW_KEY_M, "key.categories.ui") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				McalecsmodMod.PACKET_HANDLER.sendToServer(new MusicUIkeybindMessage(0, 0));
				MusicUIkeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				MUSIC_U_IKEYBIND_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - MUSIC_U_IKEYBIND_LASTPRESS);
				McalecsmodMod.PACKET_HANDLER.sendToServer(new MusicUIkeybindMessage(1, dt));
				MusicUIkeybindMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long MUSIC_U_IKEYBIND_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(MUSIC_U_IKEYBIND);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				MUSIC_U_IKEYBIND.consumeClick();
			}
		}
	}
}
