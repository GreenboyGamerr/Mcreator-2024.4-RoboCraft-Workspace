
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.robocraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.robocraft.RobocraftMod;

public class RobocraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RobocraftMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ROBOTS = REGISTRY.register("robots",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.robocraft.robots")).icon(() -> new ItemStack(Blocks.CARVED_PUMPKIN)).displayItems((parameters, tabData) -> {
				tabData.accept(RobocraftModItems.MINI_ROBOT_SPAWN_EGG.get());
				tabData.accept(RobocraftModItems.COMBAT_ROBO_SPAWN_EGG.get());
				tabData.accept(RobocraftModItems.ROBOT_DOG_SPAWN_EGG.get());
				tabData.accept(RobocraftModItems.TITAN_ROBOT_SPAWN_EGG.get());
				tabData.accept(RobocraftModItems.ENEMY_TITAN_BOSS_SPAWN_EGG.get());
				tabData.accept(RobocraftModItems.CURRUPTED_ROBO_SPAWN_EGG.get());
				tabData.accept(RobocraftModItems.ROBOT_WITH_WHEELS_SPAWN_EGG.get());
				tabData.accept(RobocraftModItems.FLYING_ROBOT_SPAWN_EGG.get());
				tabData.accept(RobocraftModItems.DEFENDER_ROBOT_SUIT_SPAWN_EGG.get());
				tabData.accept(RobocraftModItems.ROBO_SWORD.get());
				tabData.accept(RobocraftModBlocks.BOSS_ACTIVATOR.get().asItem());
				tabData.accept(RobocraftModBlocks.TITAN_SUMMONER.get().asItem());
				tabData.accept(RobocraftModItems.ROBOT_CORE.get());
				tabData.accept(RobocraftModItems.ROBOT_HEAD.get());
				tabData.accept(RobocraftModItems.ROBOT_WIRES.get());
				tabData.accept(RobocraftModItems.HEROIC_ARMOR_HELMET.get());
				tabData.accept(RobocraftModItems.HEROIC_ARMOR_CHESTPLATE.get());
				tabData.accept(RobocraftModItems.HEROIC_ARMOR_LEGGINGS.get());
				tabData.accept(RobocraftModItems.HEROIC_ARMOR_BOOTS.get());
			}).build());
}
