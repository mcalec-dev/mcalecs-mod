
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.mcalecs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcalec.mcalecs.item.PainiteSwordItem;
import net.mcalec.mcalecs.item.PainiteShovelItem;
import net.mcalec.mcalecs.item.PainitePickaxeItem;
import net.mcalec.mcalecs.item.PainiteItem;
import net.mcalec.mcalecs.item.PainiteHoeItem;
import net.mcalec.mcalecs.item.PainiteAxeItem;
import net.mcalec.mcalecs.item.PainiteArmorItem;
import net.mcalec.mcalecs.item.McAlecArmourItem;
import net.mcalec.mcalecs.item.MatthewWilderBreakMyStrideItem;
import net.mcalec.mcalecs.item.JamiroquaiVirtualInsanityItem;
import net.mcalec.mcalecs.item.FrizkAllMyFellasItem;
import net.mcalec.mcalecs.item.EdHelmsHowBadCanIBeItem;
import net.mcalec.mcalecs.item.C418DragonFishItem;
import net.mcalec.mcalecs.McalecsMod;

public class McalecsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McalecsMod.MODID);
	public static final RegistryObject<Item> ADVANCED_JUKEBOX = block(McalecsModBlocks.ADVANCED_JUKEBOX);
	public static final RegistryObject<Item> MC_ALEC_ARMOUR_HELMET = REGISTRY.register("mc_alec_armour_helmet", () -> new McAlecArmourItem.Helmet());
	public static final RegistryObject<Item> MC_ALEC_ARMOUR_CHESTPLATE = REGISTRY.register("mc_alec_armour_chestplate", () -> new McAlecArmourItem.Chestplate());
	public static final RegistryObject<Item> MC_ALEC_ARMOUR_LEGGINGS = REGISTRY.register("mc_alec_armour_leggings", () -> new McAlecArmourItem.Leggings());
	public static final RegistryObject<Item> MC_ALEC_ARMOUR_BOOTS = REGISTRY.register("mc_alec_armour_boots", () -> new McAlecArmourItem.Boots());
	public static final RegistryObject<Item> MC_ALEC_PERSON_SPAWN_EGG = REGISTRY.register("mc_alec_person_spawn_egg", () -> new ForgeSpawnEggItem(McalecsModEntities.MC_ALEC_PERSON, -16737793, -16751002, new Item.Properties()));
	public static final RegistryObject<Item> BOYKISSER_MAID_SPAWN_EGG = REGISTRY.register("boykisser_maid_spawn_egg", () -> new ForgeSpawnEggItem(McalecsModEntities.BOYKISSER_MAID, -3355444, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> PAINITE = REGISTRY.register("painite", () -> new PainiteItem());
	public static final RegistryObject<Item> PAINITE_ORE = block(McalecsModBlocks.PAINITE_ORE);
	public static final RegistryObject<Item> PAINITE_BLOCK = block(McalecsModBlocks.PAINITE_BLOCK);
	public static final RegistryObject<Item> PAINITE_ARMOR_HELMET = REGISTRY.register("painite_armor_helmet", () -> new PainiteArmorItem.Helmet());
	public static final RegistryObject<Item> PAINITE_ARMOR_CHESTPLATE = REGISTRY.register("painite_armor_chestplate", () -> new PainiteArmorItem.Chestplate());
	public static final RegistryObject<Item> PAINITE_ARMOR_LEGGINGS = REGISTRY.register("painite_armor_leggings", () -> new PainiteArmorItem.Leggings());
	public static final RegistryObject<Item> PAINITE_ARMOR_BOOTS = REGISTRY.register("painite_armor_boots", () -> new PainiteArmorItem.Boots());
	public static final RegistryObject<Item> PAINITE_SWORD = REGISTRY.register("painite_sword", () -> new PainiteSwordItem());
	public static final RegistryObject<Item> PAINITE_AXE = REGISTRY.register("painite_axe", () -> new PainiteAxeItem());
	public static final RegistryObject<Item> PAINITE_PICKAXE = REGISTRY.register("painite_pickaxe", () -> new PainitePickaxeItem());
	public static final RegistryObject<Item> PAINITE_SHOVEL = REGISTRY.register("painite_shovel", () -> new PainiteShovelItem());
	public static final RegistryObject<Item> PAINITE_HOE = REGISTRY.register("painite_hoe", () -> new PainiteHoeItem());
	public static final RegistryObject<Item> MCALECS_VILAGER_SPAWN_EGG = REGISTRY.register("mcalecs_vilager_spawn_egg", () -> new ForgeSpawnEggItem(McalecsModEntities.MCALECS_VILAGER, -6710887, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> JAMIROQUAI_VIRTUAL_INSANITY = REGISTRY.register("jamiroquai_virtual_insanity", () -> new JamiroquaiVirtualInsanityItem());
	public static final RegistryObject<Item> BOYKISSER_SPAWN_EGG = REGISTRY.register("boykisser_spawn_egg", () -> new ForgeSpawnEggItem(McalecsModEntities.BOYKISSER, -3355444, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> MATTHEW_WILDER_BREAK_MY_STRIDE = REGISTRY.register("matthew_wilder_break_my_stride", () -> new MatthewWilderBreakMyStrideItem());
	public static final RegistryObject<Item> FRIZK_ALL_MY_FELLAS = REGISTRY.register("frizk_all_my_fellas", () -> new FrizkAllMyFellasItem());
	public static final RegistryObject<Item> ED_HELMS_HOW_BAD_CAN_I_BE = REGISTRY.register("ed_helms_how_bad_can_i_be", () -> new EdHelmsHowBadCanIBeItem());
	public static final RegistryObject<Item> C418_DRAGON_FISH = REGISTRY.register("c418_dragon_fish", () -> new C418DragonFishItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
