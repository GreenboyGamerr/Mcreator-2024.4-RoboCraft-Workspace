
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.robocraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.robocraft.RobocraftMod;

public class RobocraftModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, RobocraftMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> ROBOTWALKING = REGISTRY.register("robotwalking", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("robocraft", "robotwalking")));
}
