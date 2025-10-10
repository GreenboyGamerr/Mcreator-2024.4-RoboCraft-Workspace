
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mechafront.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mechafront.MechafrontMod;

public class MechafrontModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MechafrontMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ROBOTS = REGISTRY.register("robots",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mechafront.robots")).icon(() -> new ItemStack(Blocks.CARVED_PUMPKIN)).displayItems((parameters, tabData) -> {
				tabData.accept(MechafrontModItems.MINI_ROBOT_SPAWN_EGG.get());
				tabData.accept(MechafrontModItems.COMBAT_ROBO_SPAWN_EGG.get());
				tabData.accept(MechafrontModItems.ROBOT_DOG_SPAWN_EGG.get());
				tabData.accept(MechafrontModItems.TITAN_ROBOT_SPAWN_EGG.get());
				tabData.accept(MechafrontModItems.ENEMY_TITAN_BOSS_SPAWN_EGG.get());
				tabData.accept(MechafrontModItems.CURRUPTED_ROBO_SPAWN_EGG.get());
				tabData.accept(MechafrontModItems.ROBOT_WITH_WHEELS_SPAWN_EGG.get());
				tabData.accept(MechafrontModItems.ROBOT_DEFENDER_SUIT_SPAWN_EGG.get());
				tabData.accept(MechafrontModItems.FLYING_ROBOT_SPAWN_EGG.get());
				tabData.accept(MechafrontModItems.ROBOT_GOLEM_SPAWN_EGG.get());
				tabData.accept(MechafrontModItems.ENEMY_ROBOT_GOLEM_SPAWN_EGG.get());
				tabData.accept(MechafrontModItems.ROBO_SWORD.get());
				tabData.accept(MechafrontModBlocks.BOSS_ACTIVATOR.get().asItem());
				tabData.accept(MechafrontModBlocks.TITAN_SUMMONER.get().asItem());
				tabData.accept(MechafrontModItems.ROBOT_CORE.get());
				tabData.accept(MechafrontModItems.ROBOT_HEAD.get());
				tabData.accept(MechafrontModItems.ROBOT_WIRES.get());
				tabData.accept(MechafrontModItems.HEROIC_ARMOR_HELMET.get());
				tabData.accept(MechafrontModItems.HEROIC_ARMOR_CHESTPLATE.get());
				tabData.accept(MechafrontModItems.HEROIC_ARMOR_LEGGINGS.get());
				tabData.accept(MechafrontModItems.HEROIC_ARMOR_BOOTS.get());
				tabData.accept(MechafrontModBlocks.ROBO_DIMENSION_BLOCK.get().asItem());
				tabData.accept(MechafrontModItems.ROBOTS_DIMENSION.get());
			}).build());
}
