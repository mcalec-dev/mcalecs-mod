
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.mcalecs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcalec.mcalecs.entity.McalecsVilagerEntity;
import net.mcalec.mcalecs.entity.McAlecPersonEntity;
import net.mcalec.mcalecs.entity.BoykisserMaidEntity;
import net.mcalec.mcalecs.entity.BoykisserEntity;
import net.mcalec.mcalecs.McalecsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class McalecsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, McalecsMod.MODID);
	public static final RegistryObject<EntityType<McAlecPersonEntity>> MC_ALEC_PERSON = register("mc_alec_person",
			EntityType.Builder.<McAlecPersonEntity>of(McAlecPersonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(McAlecPersonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BoykisserMaidEntity>> BOYKISSER_MAID = register("boykisser_maid",
			EntityType.Builder.<BoykisserMaidEntity>of(BoykisserMaidEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BoykisserMaidEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<McalecsVilagerEntity>> MCALECS_VILAGER = register("mcalecs_vilager",
			EntityType.Builder.<McalecsVilagerEntity>of(McalecsVilagerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(McalecsVilagerEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<BoykisserEntity>> BOYKISSER = register("boykisser",
			EntityType.Builder.<BoykisserEntity>of(BoykisserEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(BoykisserEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			McAlecPersonEntity.init();
			BoykisserMaidEntity.init();
			McalecsVilagerEntity.init();
			BoykisserEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MC_ALEC_PERSON.get(), McAlecPersonEntity.createAttributes().build());
		event.put(BOYKISSER_MAID.get(), BoykisserMaidEntity.createAttributes().build());
		event.put(MCALECS_VILAGER.get(), McalecsVilagerEntity.createAttributes().build());
		event.put(BOYKISSER.get(), BoykisserEntity.createAttributes().build());
	}
}
