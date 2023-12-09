
package net.mcalec.mcalecsmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class DragonFishItem extends RecordItem {
	public DragonFishItem() {
		super(1, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcalecsmod:c418_dragon-fish")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 7680);
	}
}
