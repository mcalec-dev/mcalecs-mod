
package net.mcalec.mcalecsmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class GroovyDominoes52BeeItem extends RecordItem {
	public GroovyDominoes52BeeItem() {
		super(7, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcalecsmod:groovydominoes52_bee")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1440);
	}
}
