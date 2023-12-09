
package net.mcalec.mcalecsmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcalec.mcalecsmod.entity.McAlecPersonEntity;

public class McAlecPersonRenderer extends HumanoidMobRenderer<McAlecPersonEntity, HumanoidModel<McAlecPersonEntity>> {
	public McAlecPersonRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(McAlecPersonEntity entity) {
		return new ResourceLocation("mcalecsmod:textures/entities/teal_and_brown.png");
	}
}
