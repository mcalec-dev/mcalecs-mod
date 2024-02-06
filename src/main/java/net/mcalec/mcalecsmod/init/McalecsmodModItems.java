
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.mcalecsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcalec.mcalecsmod.item.TLTFiveNightsAtFreddysItem;
import net.mcalec.mcalecsmod.item.SurasshuEekItem;
import net.mcalec.mcalecsmod.item.RosalinaIntheObservatory3Item;
import net.mcalec.mcalecsmod.item.PainiteSwordItem;
import net.mcalec.mcalecsmod.item.PainiteShovelItem;
import net.mcalec.mcalecsmod.item.PainitePickaxeItem;
import net.mcalec.mcalecsmod.item.PainiteItem;
import net.mcalec.mcalecsmod.item.PainiteHoeItem;
import net.mcalec.mcalecsmod.item.PainiteAxeItem;
import net.mcalec.mcalecsmod.item.PainiteArmorItem;
import net.mcalec.mcalecsmod.item.MenuSmashUltimateItem;
import net.mcalec.mcalecsmod.item.McAlecArmourItem;
import net.mcalec.mcalecsmod.item.JumpupsuperstarItem;
import net.mcalec.mcalecsmod.item.JamiroquaiVirtualInsanityItem;
import net.mcalec.mcalecsmod.item.HowbadcanibeItem;
import net.mcalec.mcalecsmod.item.GustyGardenGalaxyItem;
import net.mcalec.mcalecsmod.item.GroovyDominoes52BeeItem;
import net.mcalec.mcalecsmod.item.FiveNightsAtFreddysItem;
import net.mcalec.mcalecsmod.item.DragonFishItem;
import net.mcalec.mcalecsmod.item.BreakMyStrideItem;
import net.mcalec.mcalecsmod.McalecsmodMod;

public class McalecsmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McalecsmodMod.MODID);
	public static final RegistryObject<Item> DRAGON_FISH = REGISTRY.register("dragon_fish", () -> new DragonFishItem());
	public static final RegistryObject<Item> GUSTY_GARDEN_GALAXY = REGISTRY.register("gusty_garden_galaxy", () -> new GustyGardenGalaxyItem());
	public static final RegistryObject<Item> MENU_SMASH_ULTIMATE = REGISTRY.register("menu_smash_ultimate", () -> new MenuSmashUltimateItem());
	public static final RegistryObject<Item> ROSALINA_INTHE_OBSERVATORY_3 = REGISTRY.register("rosalina_inthe_observatory_3", () -> new RosalinaIntheObservatory3Item());
	public static final RegistryObject<Item> HOWBADCANIBE = REGISTRY.register("howbadcanibe", () -> new HowbadcanibeItem());
	public static final RegistryObject<Item> JUMP_UP_SUPER_STAR = REGISTRY.register("jump_up_super_star", () -> new JumpupsuperstarItem());
	public static final RegistryObject<Item> GROOVY_DOMINOES_52_BEE = REGISTRY.register("groovy_dominoes_52_bee", () -> new GroovyDominoes52BeeItem());
	public static final RegistryObject<Item> ADVANCED_JUKEBOX = block(McalecsmodModBlocks.ADVANCED_JUKEBOX);
	public static final RegistryObject<Item> MC_ALEC_ARMOUR_HELMET = REGISTRY.register("mc_alec_armour_helmet", () -> new McAlecArmourItem.Helmet());
	public static final RegistryObject<Item> MC_ALEC_ARMOUR_CHESTPLATE = REGISTRY.register("mc_alec_armour_chestplate", () -> new McAlecArmourItem.Chestplate());
	public static final RegistryObject<Item> MC_ALEC_ARMOUR_LEGGINGS = REGISTRY.register("mc_alec_armour_leggings", () -> new McAlecArmourItem.Leggings());
	public static final RegistryObject<Item> MC_ALEC_ARMOUR_BOOTS = REGISTRY.register("mc_alec_armour_boots", () -> new McAlecArmourItem.Boots());
	public static final RegistryObject<Item> MC_ALEC_PERSON_SPAWN_EGG = REGISTRY.register("mc_alec_person_spawn_egg", () -> new ForgeSpawnEggItem(McalecsmodModEntities.MC_ALEC_PERSON, -16737793, -16751002, new Item.Properties()));
	public static final RegistryObject<Item> BOYKISSER_MAID_SPAWN_EGG = REGISTRY.register("boykisser_maid_spawn_egg", () -> new ForgeSpawnEggItem(McalecsmodModEntities.BOYKISSER_MAID, -1, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> PAINITE = REGISTRY.register("painite", () -> new PainiteItem());
	public static final RegistryObject<Item> PAINITE_ORE = block(McalecsmodModBlocks.PAINITE_ORE);
	public static final RegistryObject<Item> PAINITE_BLOCK = block(McalecsmodModBlocks.PAINITE_BLOCK);
	public static final RegistryObject<Item> PAINITE_ARMOR_HELMET = REGISTRY.register("painite_armor_helmet", () -> new PainiteArmorItem.Helmet());
	public static final RegistryObject<Item> PAINITE_ARMOR_CHESTPLATE = REGISTRY.register("painite_armor_chestplate", () -> new PainiteArmorItem.Chestplate());
	public static final RegistryObject<Item> PAINITE_ARMOR_LEGGINGS = REGISTRY.register("painite_armor_leggings", () -> new PainiteArmorItem.Leggings());
	public static final RegistryObject<Item> PAINITE_ARMOR_BOOTS = REGISTRY.register("painite_armor_boots", () -> new PainiteArmorItem.Boots());
	public static final RegistryObject<Item> PAINITE_SWORD = REGISTRY.register("painite_sword", () -> new PainiteSwordItem());
	public static final RegistryObject<Item> PAINITE_AXE = REGISTRY.register("painite_axe", () -> new PainiteAxeItem());
	public static final RegistryObject<Item> PAINITE_PICKAXE = REGISTRY.register("painite_pickaxe", () -> new PainitePickaxeItem());
	public static final RegistryObject<Item> PAINITE_SHOVEL = REGISTRY.register("painite_shovel", () -> new PainiteShovelItem());
	public static final RegistryObject<Item> PAINITE_HOE = REGISTRY.register("painite_hoe", () -> new PainiteHoeItem());
	public static final RegistryObject<Item> FIVE_NIGHTS_AT_FREDDYS = REGISTRY.register("five_nights_at_freddys", () -> new FiveNightsAtFreddysItem());
	public static final RegistryObject<Item> TLT_FIVE_NIGHTS_AT_FREDDYS = REGISTRY.register("tlt_five_nights_at_freddys", () -> new TLTFiveNightsAtFreddysItem());
	public static final RegistryObject<Item> SURASSHU_EEK = REGISTRY.register("surasshu_eek", () -> new SurasshuEekItem());
	public static final RegistryObject<Item> BREAK_MY_STRIDE = REGISTRY.register("break_my_stride", () -> new BreakMyStrideItem());
	public static final RegistryObject<Item> MCALECS_VILAGER_SPAWN_EGG = REGISTRY.register("mcalecs_vilager_spawn_egg", () -> new ForgeSpawnEggItem(McalecsmodModEntities.MCALECS_VILAGER, -6710887, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> JAMIROQUAI_VIRTUAL_INSANITY = REGISTRY.register("jamiroquai_virtual_insanity", () -> new JamiroquaiVirtualInsanityItem());
	public static final RegistryObject<Item> BOYKISSER_SPAWN_EGG = REGISTRY.register("boykisser_spawn_egg", () -> new ForgeSpawnEggItem(McalecsmodModEntities.BOYKISSER, -13382401, -16724788, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
