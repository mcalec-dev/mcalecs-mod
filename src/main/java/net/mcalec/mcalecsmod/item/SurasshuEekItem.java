
package net.mcalec.mcalecsmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class SurasshuEekItem extends RecordItem {
	public SurasshuEekItem() {
		super(10, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcalecsmod:surasshu-eek")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1920);
	}
}
