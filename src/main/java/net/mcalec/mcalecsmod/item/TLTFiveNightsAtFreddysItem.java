
package net.mcalec.mcalecsmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class TLTFiveNightsAtFreddysItem extends RecordItem {
	public TLTFiveNightsAtFreddysItem() {
		super(9, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcalecsmod:tlt_five-nights-at-freddys")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4280);
	}
}
