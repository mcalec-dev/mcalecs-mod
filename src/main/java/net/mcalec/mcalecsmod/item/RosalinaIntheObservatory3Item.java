
package net.mcalec.mcalecsmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class RosalinaIntheObservatory3Item extends RecordItem {
	public RosalinaIntheObservatory3Item() {
		super(4, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcalecsmod:nintendo_rosalina-in-the-observatory-3_smg")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4520);
	}
}
