package net.mcalec.mcalecs.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcalec.mcalecs.world.inventory.MusicUIMenu;
import net.mcalec.mcalecs.network.MusicUIButtonMessage;
import net.mcalec.mcalecs.McAlecs;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MusicUIScreen extends AbstractContainerScreen<MusicUIMenu> {
	private final static HashMap<String, Object> guistate = MusicUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_stop_all_sounds;

	public MusicUIScreen(MusicUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 333;
		this.imageHeight = 218;
	}

	private static final ResourceLocation texture = new ResourceLocation("mcalecs:textures/screens/music_ui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 198 && mouseX < leftPos + 222 && mouseY > topPos + 190 && mouseY < topPos + 214)
			guiGraphics.renderTooltip(font, Component.translatable("gui.mcalecs.music_ui.tooltip_stops_all_record_sounds_by_the_p"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.mcalecs.music_ui.label_music_ui"), 6, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.mcalecs.music_ui.label_empty"), 206, 195, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_stop_all_sounds = Button.builder(Component.translatable("gui.mcalecs.music_ui.button_stop_all_sounds"), e -> {
			if (true) {
				McAlecs.PACKET_HANDLER.sendToServer(new MusicUIButtonMessage(0, x, y, z));
				MusicUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 222, this.topPos + 190, 103, 20).build();
		guistate.put("button:button_stop_all_sounds", button_stop_all_sounds);
		this.addRenderableWidget(button_stop_all_sounds);
	}
}
