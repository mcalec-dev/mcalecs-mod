
package net.mcalec.mcalecsmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcalec.mcalecsmod.init.McalecsmodModItems;

public class PainitePickaxeItem extends PickaxeItem {
	public PainitePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 900;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 35;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(McalecsmodModItems.PAINITE.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
