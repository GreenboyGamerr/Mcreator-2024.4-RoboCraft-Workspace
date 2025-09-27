
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.robocraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.robocraft.item.RobotWiresItem;
import net.mcreator.robocraft.item.RobotHeadItem;
import net.mcreator.robocraft.item.RobotCoreItem;
import net.mcreator.robocraft.item.RoboSwordItem;
import net.mcreator.robocraft.item.HeroicArmorItem;
import net.mcreator.robocraft.RobocraftMod;

public class RobocraftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RobocraftMod.MODID);
	public static final DeferredItem<Item> MINI_ROBOT_SPAWN_EGG = REGISTRY.register("mini_robot_spawn_egg", () -> new DeferredSpawnEggItem(RobocraftModEntities.MINI_ROBOT, -3394816, -1, new Item.Properties()));
	public static final DeferredItem<Item> COMBAT_ROBO_SPAWN_EGG = REGISTRY.register("combat_robo_spawn_egg", () -> new DeferredSpawnEggItem(RobocraftModEntities.COMBAT_ROBO, -10092544, -1, new Item.Properties()));
	public static final DeferredItem<Item> ROBOT_DOG_SPAWN_EGG = REGISTRY.register("robot_dog_spawn_egg", () -> new DeferredSpawnEggItem(RobocraftModEntities.ROBOT_DOG, -13421773, -1, new Item.Properties()));
	public static final DeferredItem<Item> TITAN_ROBOT_SPAWN_EGG = REGISTRY.register("titan_robot_spawn_egg", () -> new DeferredSpawnEggItem(RobocraftModEntities.TITAN_ROBOT, -13421773, -16724788, new Item.Properties()));
	public static final DeferredItem<Item> ROBOT_HEAD = REGISTRY.register("robot_head", RobotHeadItem::new);
	public static final DeferredItem<Item> ROBOT_WIRES = REGISTRY.register("robot_wires", RobotWiresItem::new);
	public static final DeferredItem<Item> ROBOT_CORE = REGISTRY.register("robot_core", RobotCoreItem::new);
	public static final DeferredItem<Item> ENEMY_TITAN_BOSS_SPAWN_EGG = REGISTRY.register("enemy_titan_boss_spawn_egg", () -> new DeferredSpawnEggItem(RobocraftModEntities.ENEMY_TITAN_BOSS, -13421773, -10092544, new Item.Properties()));
	public static final DeferredItem<Item> BOSS_ACTIVATOR = block(RobocraftModBlocks.BOSS_ACTIVATOR);
	public static final DeferredItem<Item> HEROIC_ARMOR_HELMET = REGISTRY.register("heroic_armor_helmet", HeroicArmorItem.Helmet::new);
	public static final DeferredItem<Item> HEROIC_ARMOR_CHESTPLATE = REGISTRY.register("heroic_armor_chestplate", HeroicArmorItem.Chestplate::new);
	public static final DeferredItem<Item> HEROIC_ARMOR_LEGGINGS = REGISTRY.register("heroic_armor_leggings", HeroicArmorItem.Leggings::new);
	public static final DeferredItem<Item> HEROIC_ARMOR_BOOTS = REGISTRY.register("heroic_armor_boots", HeroicArmorItem.Boots::new);
	public static final DeferredItem<Item> CURRUPTED_ROBO_SPAWN_EGG = REGISTRY.register("currupted_robo_spawn_egg", () -> new DeferredSpawnEggItem(RobocraftModEntities.CURRUPTED_ROBO, -6750208, -1, new Item.Properties()));
	public static final DeferredItem<Item> TITAN_SUMMONER = block(RobocraftModBlocks.TITAN_SUMMONER);
	public static final DeferredItem<Item> ROBOT_WITH_WHEELS_SPAWN_EGG = REGISTRY.register("robot_with_wheels_spawn_egg", () -> new DeferredSpawnEggItem(RobocraftModEntities.ROBOT_WITH_WHEELS, -13421773, -1, new Item.Properties()));
	public static final DeferredItem<Item> FLYING_ROBOT_SPAWN_EGG = REGISTRY.register("flying_robot_spawn_egg", () -> new DeferredSpawnEggItem(RobocraftModEntities.FLYING_ROBOT, -13421773, -1, new Item.Properties()));
	public static final DeferredItem<Item> DEFENDER_ROBOT_SUIT_SPAWN_EGG = REGISTRY.register("defender_robot_suit_spawn_egg", () -> new DeferredSpawnEggItem(RobocraftModEntities.DEFENDER_ROBOT_SUIT, -13421773, -16711936, new Item.Properties()));
	public static final DeferredItem<Item> ROBO_SWORD = REGISTRY.register("robo_sword", RoboSwordItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
