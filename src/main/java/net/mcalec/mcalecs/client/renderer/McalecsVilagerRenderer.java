
package net.mcalec.mcalecs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcalec.mcalecs.entity.McalecsVilagerEntity;
import net.mcalec.mcalecs.client.model.ModelVillager;

import com.mojang.blaze3d.vertex.PoseStack;

public class McalecsVilagerRenderer extends MobRenderer<McalecsVilagerEntity, ModelVillager<McalecsVilagerEntity>> {
	public McalecsVilagerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelVillager(context.bakeLayer(ModelVillager.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(McalecsVilagerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.94f, 0.94f, 0.94f);
	}

	@Override
	public ResourceLocation getTextureLocation(McalecsVilagerEntity entity) {
		return new ResourceLocation("mcalecs:textures/entities/villager.png");
	}
}
