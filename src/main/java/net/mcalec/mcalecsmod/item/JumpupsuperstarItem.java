
package net.mcalec.mcalecsmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class JumpupsuperstarItem extends RecordItem {
	public JumpupsuperstarItem() {
		super(6, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcalecsmod:nintendo_jump-up-super-star")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5200);
	}
}
