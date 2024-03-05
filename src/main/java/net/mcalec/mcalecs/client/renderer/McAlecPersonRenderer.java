
package net.mcalec.mcalecs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcalec.mcalecs.entity.McAlecPersonEntity;
import net.mcalec.mcalecs.client.model.ModelSlim;

import com.mojang.blaze3d.vertex.PoseStack;

public class McAlecPersonRenderer extends MobRenderer<McAlecPersonEntity, ModelSlim<McAlecPersonEntity>> {
	public McAlecPersonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSlim(context.bakeLayer(ModelSlim.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(McAlecPersonEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.94f, 0.94f, 0.94f);
	}

	@Override
	public ResourceLocation getTextureLocation(McAlecPersonEntity entity) {
		return new ResourceLocation("mcalecs:textures/entities/teal_and_brown.png");
	}
}
