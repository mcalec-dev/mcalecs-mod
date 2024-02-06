
package net.mcalec.mcalecsmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcalec.mcalecsmod.entity.McalecsVilagerEntity;
import net.mcalec.mcalecsmod.client.model.ModelVillager;

public class McalecsVilagerRenderer extends MobRenderer<McalecsVilagerEntity, ModelVillager<McalecsVilagerEntity>> {
	public McalecsVilagerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelVillager(context.bakeLayer(ModelVillager.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(McalecsVilagerEntity entity) {
		return new ResourceLocation("mcalecsmod:textures/entities/villager.png");
	}
}
