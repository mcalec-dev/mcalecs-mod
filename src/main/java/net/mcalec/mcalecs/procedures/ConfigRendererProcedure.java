package net.mcalec.mcalecs.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcalec.mcalecs.init.McalecsModEntities;
import net.mcalec.mcalecs.entity.McAlecPersonEntity;

public class ConfigRendererProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new McAlecPersonEntity(McalecsModEntities.MCALEC.get(), _level) : null;
	}
}
