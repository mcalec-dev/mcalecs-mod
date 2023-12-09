
package net.mcalec.mcalecsmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class GustyGardenGalaxyItem extends RecordItem {
	public GustyGardenGalaxyItem() {
		super(2, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcalecsmod:nintendo_gusty-garden-galaxy")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5760);
	}
}
