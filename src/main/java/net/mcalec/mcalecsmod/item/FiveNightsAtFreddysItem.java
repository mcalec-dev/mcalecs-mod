
package net.mcalec.mcalecsmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class FiveNightsAtFreddysItem extends RecordItem {
	public FiveNightsAtFreddysItem() {
		super(8, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcalecsmod:the-newton-brothers_five-nights-at-freddys_fnaf-movie")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3040);
	}
}
