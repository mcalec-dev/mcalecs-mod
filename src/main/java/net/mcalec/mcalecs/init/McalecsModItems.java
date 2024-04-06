
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

import net.mcalec.mcalecs.item.TheNewtonBrothersFiveNightsAtFreddysItem;
import net.mcalec.mcalecs.item.TheLivingTombstoneFiveNightsAtFreddysItem;
import net.mcalec.mcalecs.item.SurasshuEekItem;
import net.mcalec.mcalecs.item.SupermarioodysseyjumpupsuperstarItem;
import net.mcalec.mcalecs.item.SuperSmashBrosUltimateMenuItem;
import net.mcalec.mcalecs.item.SuperMarioGalaxyRosalinaInTheObservatoryItem;
import net.mcalec.mcalecs.item.SuperMarioGalaxyGustyGardenGalaxyItem;
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
import net.mcalec.mcalecs.item.Groovydominoes52BeeItem;
import net.mcalec.mcalecs.item.FrizkAllMyFellasItem;
import net.mcalec.mcalecs.item.EdHelmsHowBadCanIBeItem;
import net.mcalec.mcalecs.item.C418DragonFishItem;
import net.mcalec.mcalecs.McAlecs;

public class McalecsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McAlecs.MODID);
	public static final RegistryObject<Item> ADVANCED_JUKEBOX = block(McalecsModBlocks.ADVANCED_JUKEBOX);
	public static final RegistryObject<Item> JAMIROQUAI_VIRTUAL_INSANITY = REGISTRY.register("jamiroquai_virtual_insanity", () -> new JamiroquaiVirtualInsanityItem());
	public static final RegistryObject<Item> MATTHEW_WILDER_BREAK_MY_STRIDE = REGISTRY.register("matthew_wilder_break_my_stride", () -> new MatthewWilderBreakMyStrideItem());
	public static final RegistryObject<Item> FRIZK_ALL_MY_FELLAS = REGISTRY.register("frizk_all_my_fellas", () -> new FrizkAllMyFellasItem());
	public static final RegistryObject<Item> ED_HELMS_HOW_BAD_CAN_I_BE = REGISTRY.register("ed_helms_how_bad_can_i_be", () -> new EdHelmsHowBadCanIBeItem());
	public static final RegistryObject<Item> C418_DRAGON_FISH = REGISTRY.register("c418_dragon_fish", () -> new C418DragonFishItem());
	public static final RegistryObject<Item> GROOVYDOMINOES52_BEE = REGISTRY.register("groovydominoes52_bee", () -> new Groovydominoes52BeeItem());
	public static final RegistryObject<Item> SURASSHU_EEK = REGISTRY.register("surasshu_eek", () -> new SurasshuEekItem());
	public static final RegistryObject<Item> SUPER_MARIO_ODYSSEY_JUMP_UP_SUPER_STAR = REGISTRY.register("super_mario_odyssey_jump_up_super_star", () -> new SupermarioodysseyjumpupsuperstarItem());
	public static final RegistryObject<Item> MC_ALEC_ARMOUR_HELMET = REGISTRY.register("mc_alec_armour_helmet", () -> new McAlecArmourItem.Helmet());
	public static final RegistryObject<Item> MC_ALEC_ARMOUR_CHESTPLATE = REGISTRY.register("mc_alec_armour_chestplate", () -> new McAlecArmourItem.Chestplate());
	public static final RegistryObject<Item> MC_ALEC_ARMOUR_LEGGINGS = REGISTRY.register("mc_alec_armour_leggings", () -> new McAlecArmourItem.Leggings());
	public static final RegistryObject<Item> MC_ALEC_ARMOUR_BOOTS = REGISTRY.register("mc_alec_armour_boots", () -> new McAlecArmourItem.Boots());
	public static final RegistryObject<Item> VILLAGER_SPAWN_EGG = REGISTRY.register("villager_spawn_egg", () -> new ForgeSpawnEggItem(McalecsModEntities.VILLAGER, -6710887, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> MCALEC_SPAWN_EGG = REGISTRY.register("mcalec_spawn_egg", () -> new ForgeSpawnEggItem(McalecsModEntities.MCALEC, -16737793, -16751002, new Item.Properties()));
	public static final RegistryObject<Item> BOYKISSER_SPAWN_EGG = REGISTRY.register("boykisser_spawn_egg", () -> new ForgeSpawnEggItem(McalecsModEntities.BOYKISSER, -3355444, -13421773, new Item.Properties()));
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
	public static final RegistryObject<Item> THE_LIVING_TOMBSTONE_FIVE_NIGHTS_AT_FREDDYS = REGISTRY.register("the_living_tombstone_five_nights_at_freddys", () -> new TheLivingTombstoneFiveNightsAtFreddysItem());
	public static final RegistryObject<Item> THE_NEWTON_BROTHERS_FIVE_NIGHTS_AT_FREDDYS = REGISTRY.register("the_newton_brothers_five_nights_at_freddys", () -> new TheNewtonBrothersFiveNightsAtFreddysItem());
	public static final RegistryObject<Item> SUPER_MARIO_GALAXY_ROSALINA_IN_THE_OBSERVATORY = REGISTRY.register("super_mario_galaxy_rosalina_in_the_observatory", () -> new SuperMarioGalaxyRosalinaInTheObservatoryItem());
	public static final RegistryObject<Item> SUPER_SMASH_BROS_ULTIMATE_MENU = REGISTRY.register("super_smash_bros_ultimate_menu", () -> new SuperSmashBrosUltimateMenuItem());
	public static final RegistryObject<Item> SUPER_MARIO_GALAXY_GUSTY_GARDEN_GALAXY = REGISTRY.register("super_mario_galaxy_gusty_garden_galaxy", () -> new SuperMarioGalaxyGustyGardenGalaxyItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
