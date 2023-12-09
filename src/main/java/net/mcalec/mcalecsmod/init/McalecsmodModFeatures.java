
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.mcalecsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcalec.mcalecsmod.world.features.ores.PainiteOreFeature;
import net.mcalec.mcalecsmod.McalecsmodMod;

@Mod.EventBusSubscriber
public class McalecsmodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, McalecsmodMod.MODID);
	public static final RegistryObject<Feature<?>> PAINITE_ORE = REGISTRY.register("painite_ore", PainiteOreFeature::new);
}
