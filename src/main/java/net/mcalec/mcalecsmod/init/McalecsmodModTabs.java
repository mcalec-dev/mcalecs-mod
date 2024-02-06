
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.mcalecsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcalec.mcalecsmod.McalecsmodMod;

public class McalecsmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, McalecsmodMod.MODID);
	public static final RegistryObject<CreativeModeTab> MC_ALEC = REGISTRY.register("mc_alec",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mcalecsmod.mc_alec")).icon(() -> new ItemStack(Blocks.ANVIL)).displayItems((parameters, tabData) -> {
				tabData.accept(McalecsmodModBlocks.ADVANCED_JUKEBOX.get().asItem());
				tabData.accept(McalecsmodModItems.MC_ALEC_ARMOUR_HELMET.get());
				tabData.accept(McalecsmodModItems.MC_ALEC_ARMOUR_CHESTPLATE.get());
				tabData.accept(McalecsmodModItems.MC_ALEC_ARMOUR_LEGGINGS.get());
				tabData.accept(McalecsmodModItems.MC_ALEC_ARMOUR_BOOTS.get());
				tabData.accept(McalecsmodModItems.MC_ALEC_PERSON_SPAWN_EGG.get());
				tabData.accept(McalecsmodModItems.BOYKISSER_MAID_SPAWN_EGG.get());
				tabData.accept(McalecsmodModItems.MCALECS_VILAGER_SPAWN_EGG.get());
				tabData.accept(McalecsmodModItems.BOYKISSER_SPAWN_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> PAINITE_TAB = REGISTRY.register("painite_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mcalecsmod.painite_tab")).icon(() -> new ItemStack(McalecsmodModBlocks.PAINITE_ORE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(McalecsmodModItems.PAINITE.get());
				tabData.accept(McalecsmodModBlocks.PAINITE_ORE.get().asItem());
				tabData.accept(McalecsmodModBlocks.PAINITE_BLOCK.get().asItem());
				tabData.accept(McalecsmodModItems.PAINITE_ARMOR_HELMET.get());
				tabData.accept(McalecsmodModItems.PAINITE_ARMOR_CHESTPLATE.get());
				tabData.accept(McalecsmodModItems.PAINITE_ARMOR_LEGGINGS.get());
				tabData.accept(McalecsmodModItems.PAINITE_ARMOR_BOOTS.get());
				tabData.accept(McalecsmodModItems.PAINITE_SWORD.get());
				tabData.accept(McalecsmodModItems.PAINITE_AXE.get());
				tabData.accept(McalecsmodModItems.PAINITE_PICKAXE.get());
				tabData.accept(McalecsmodModItems.PAINITE_SHOVEL.get());
				tabData.accept(McalecsmodModItems.PAINITE_HOE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> MUSIC_DISCS_TAB = REGISTRY.register("music_discs_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mcalecsmod.music_discs_tab")).icon(() -> new ItemStack(Items.MUSIC_DISC_WAIT)).displayItems((parameters, tabData) -> {
				tabData.accept(McalecsmodModItems.DRAGON_FISH.get());
				tabData.accept(McalecsmodModItems.GUSTY_GARDEN_GALAXY.get());
				tabData.accept(McalecsmodModItems.MENU_SMASH_ULTIMATE.get());
				tabData.accept(McalecsmodModItems.ROSALINA_INTHE_OBSERVATORY_3.get());
				tabData.accept(McalecsmodModItems.HOWBADCANIBE.get());
				tabData.accept(McalecsmodModItems.JUMP_UP_SUPER_STAR.get());
				tabData.accept(McalecsmodModItems.GROOVY_DOMINOES_52_BEE.get());
				tabData.accept(McalecsmodModItems.FIVE_NIGHTS_AT_FREDDYS.get());
				tabData.accept(McalecsmodModItems.TLT_FIVE_NIGHTS_AT_FREDDYS.get());
				tabData.accept(McalecsmodModItems.SURASSHU_EEK.get());
				tabData.accept(McalecsmodModItems.BREAK_MY_STRIDE.get());
				tabData.accept(McalecsmodModItems.JAMIROQUAI_VIRTUAL_INSANITY.get());
			})

					.build());
}
