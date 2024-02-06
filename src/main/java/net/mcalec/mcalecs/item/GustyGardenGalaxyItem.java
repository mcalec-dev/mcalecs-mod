
package net.mcalec.mcalecs.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import java.util.List;

public class GustyGardenGalaxyItem extends RecordItem {
	public GustyGardenGalaxyItem() {
		super(2, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcalecs:nintendo_gusty-garden-galaxy")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5760);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}