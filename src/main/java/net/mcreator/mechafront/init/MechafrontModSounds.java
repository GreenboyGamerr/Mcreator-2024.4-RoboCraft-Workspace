
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mechafront.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.mechafront.MechafrontMod;

public class MechafrontModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, MechafrontMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> ROBOTWALKING = REGISTRY.register("robotwalking", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mechafront", "robotwalking")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENEMY_TITANFIGHTINGTITAN = REGISTRY.register("enemy_titanfightingtitan",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mechafront", "enemy_titanfightingtitan")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENEMYTITAN_USELESS = REGISTRY.register("enemytitan_useless", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mechafront", "enemytitan_useless")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENEMYTOSEMI = REGISTRY.register("enemytosemi", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mechafront", "enemytosemi")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENEMYDIED = REGISTRY.register("enemydied", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mechafront", "enemydied")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TITAN_TO_ENEMY = REGISTRY.register("titan_to_enemy", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mechafront", "titan_to_enemy")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TITAN_LITTLETOYS = REGISTRY.register("titan_littletoys", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mechafront", "titan_littletoys")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TITAN_TO_ENEMYSEMI = REGISTRY.register("titan_to_enemysemi", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mechafront", "titan_to_enemysemi")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ROBOTS = REGISTRY.register("robots", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mechafront", "robots")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TITANS = REGISTRY.register("titans", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mechafront", "titans")));
}
