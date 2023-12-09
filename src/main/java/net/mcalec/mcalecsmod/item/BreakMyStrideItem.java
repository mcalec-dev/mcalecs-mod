
package net.mcalec.mcalecsmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class BreakMyStrideItem extends RecordItem {
	public BreakMyStrideItem() {
		super(11, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcalecsmod:matthew-wilder_break-my-stride")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3840);
	}
}
