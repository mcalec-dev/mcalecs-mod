
package net.mcalec.mcalecsmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class HowbadcanibeItem extends RecordItem {
	public HowbadcanibeItem() {
		super(5, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcalecsmod:ed-helms_how-bad-can-i-be")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4480);
	}
}
