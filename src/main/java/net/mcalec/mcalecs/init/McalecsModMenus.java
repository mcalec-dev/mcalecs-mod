
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.mcalecs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcalec.mcalecs.world.inventory.MusicUIMenu;
import net.mcalec.mcalecs.McalecsMod;

public class McalecsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, McalecsMod.MODID);
	public static final RegistryObject<MenuType<MusicUIMenu>> MUSIC_UI = REGISTRY.register("music_ui", () -> IForgeMenuType.create(MusicUIMenu::new));
}
