
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.mcalecs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcalec.mcalecs.McalecsMod;

public class McalecsModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, McalecsMod.MODID);
	public static final RegistryObject<PaintingVariant> MC_ALEC_LOGO = REGISTRY.register("mc_alec_logo", () -> new PaintingVariant(16, 16));
}
