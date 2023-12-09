
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.mcalecsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcalec.mcalecsmod.world.inventory.MusicUIMenu;
import net.mcalec.mcalecsmod.McalecsmodMod;

public class McalecsmodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, McalecsmodMod.MODID);
	public static final RegistryObject<MenuType<MusicUIMenu>> MUSIC_UI = REGISTRY.register("music_ui", () -> IForgeMenuType.create(MusicUIMenu::new));
}
