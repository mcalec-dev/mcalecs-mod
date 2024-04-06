
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.mcalecs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcalec.mcalecs.block.PainiteOreBlock;
import net.mcalec.mcalecs.block.PainiteBlockBlock;
import net.mcalec.mcalecs.block.AdvancedJukeboxBlock;
import net.mcalec.mcalecs.McAlecs;

public class McalecsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McAlecs.MODID);
	public static final RegistryObject<Block> ADVANCED_JUKEBOX = REGISTRY.register("advanced_jukebox", () -> new AdvancedJukeboxBlock());
	public static final RegistryObject<Block> PAINITE_ORE = REGISTRY.register("painite_ore", () -> new PainiteOreBlock());
	public static final RegistryObject<Block> PAINITE_BLOCK = REGISTRY.register("painite_block", () -> new PainiteBlockBlock());
}
