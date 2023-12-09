
package net.mcalec.mcalecsmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MenuSmashUltimateItem extends RecordItem {
	public MenuSmashUltimateItem() {
		super(3, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcalecsmod:nintendo_menu-1-ssbu")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4000);
	}
}
