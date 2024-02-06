
package net.mcalec.mcalecs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcalec.mcalecs.entity.BoykisserMaidEntity;
import net.mcalec.mcalecs.client.model.Modelcustom_model;

public class BoykisserMaidRenderer extends MobRenderer<BoykisserMaidEntity, Modelcustom_model<BoykisserMaidEntity>> {
	public BoykisserMaidRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BoykisserMaidEntity entity) {
		return new ResourceLocation("mcalecs:textures/entities/boykisser.png");
	}
}
