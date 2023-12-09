
package net.mcalec.mcalecsmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcalec.mcalecsmod.init.McalecsmodModItems;

public class PainiteSwordItem extends SwordItem {
	public PainiteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 900;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 13f;
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
		}, 3, -3f, new Item.Properties());
	}
}
