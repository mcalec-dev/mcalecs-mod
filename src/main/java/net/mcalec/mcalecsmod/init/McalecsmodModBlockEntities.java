
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.mcalecsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcalec.mcalecsmod.block.entity.AdvancedJukeboxBlockEntity;
import net.mcalec.mcalecsmod.McalecsmodMod;

public class McalecsmodModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, McalecsmodMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ADVANCED_JUKEBOX = register("advanced_jukebox", McalecsmodModBlocks.ADVANCED_JUKEBOX, AdvancedJukeboxBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
