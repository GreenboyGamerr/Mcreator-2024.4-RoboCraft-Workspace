
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mechafront.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mechafront.item.RobotsDimensionItem;
import net.mcreator.mechafront.item.RobotWiresItem;
import net.mcreator.mechafront.item.RobotHeadItem;
import net.mcreator.mechafront.item.RobotCoreItem;
import net.mcreator.mechafront.item.RoboSwordItem;
import net.mcreator.mechafront.item.HeroicArmorItem;
import net.mcreator.mechafront.MechafrontMod;

public class MechafrontModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MechafrontMod.MODID);
	public static final DeferredItem<Item> MINI_ROBOT_SPAWN_EGG = REGISTRY.register("mini_robot_spawn_egg", () -> new DeferredSpawnEggItem(MechafrontModEntities.MINI_ROBOT, -3394816, -1, new Item.Properties()));
	public static final DeferredItem<Item> COMBAT_ROBO_SPAWN_EGG = REGISTRY.register("combat_robo_spawn_egg", () -> new DeferredSpawnEggItem(MechafrontModEntities.COMBAT_ROBO, -10092544, -1, new Item.Properties()));
	public static final DeferredItem<Item> ROBOT_DOG_SPAWN_EGG = REGISTRY.register("robot_dog_spawn_egg", () -> new DeferredSpawnEggItem(MechafrontModEntities.ROBOT_DOG, -13421773, -1, new Item.Properties()));
	public static final DeferredItem<Item> TITAN_ROBOT_SPAWN_EGG = REGISTRY.register("titan_robot_spawn_egg", () -> new DeferredSpawnEggItem(MechafrontModEntities.TITAN_ROBOT, -13421773, -16724788, new Item.Properties()));
	public static final DeferredItem<Item> ROBOT_HEAD = REGISTRY.register("robot_head", RobotHeadItem::new);
	public static final DeferredItem<Item> ROBOT_WIRES = REGISTRY.register("robot_wires", RobotWiresItem::new);
	public static final DeferredItem<Item> ROBOT_CORE = REGISTRY.register("robot_core", RobotCoreItem::new);
	public static final DeferredItem<Item> ENEMY_TITAN_BOSS_SPAWN_EGG = REGISTRY.register("enemy_titan_boss_spawn_egg", () -> new DeferredSpawnEggItem(MechafrontModEntities.ENEMY_TITAN_BOSS, -13421773, -10092544, new Item.Properties()));
	public static final DeferredItem<Item> BOSS_ACTIVATOR = block(MechafrontModBlocks.BOSS_ACTIVATOR);
	public static final DeferredItem<Item> HEROIC_ARMOR_HELMET = REGISTRY.register("heroic_armor_helmet", HeroicArmorItem.Helmet::new);
	public static final DeferredItem<Item> HEROIC_ARMOR_CHESTPLATE = REGISTRY.register("heroic_armor_chestplate", HeroicArmorItem.Chestplate::new);
	public static final DeferredItem<Item> HEROIC_ARMOR_LEGGINGS = REGISTRY.register("heroic_armor_leggings", HeroicArmorItem.Leggings::new);
	public static final DeferredItem<Item> HEROIC_ARMOR_BOOTS = REGISTRY.register("heroic_armor_boots", HeroicArmorItem.Boots::new);
	public static final DeferredItem<Item> CURRUPTED_ROBO_SPAWN_EGG = REGISTRY.register("currupted_robo_spawn_egg", () -> new DeferredSpawnEggItem(MechafrontModEntities.CURRUPTED_ROBO, -6750208, -1, new Item.Properties()));
	public static final DeferredItem<Item> TITAN_SUMMONER = block(MechafrontModBlocks.TITAN_SUMMONER);
	public static final DeferredItem<Item> ROBOT_WITH_WHEELS_SPAWN_EGG = REGISTRY.register("robot_with_wheels_spawn_egg", () -> new DeferredSpawnEggItem(MechafrontModEntities.ROBOT_WITH_WHEELS, -13421773, -1, new Item.Properties()));
	public static final DeferredItem<Item> FLYING_ROBOT_SPAWN_EGG = REGISTRY.register("flying_robot_spawn_egg", () -> new DeferredSpawnEggItem(MechafrontModEntities.FLYING_ROBOT, -13421773, -1, new Item.Properties()));
	public static final DeferredItem<Item> ROBO_SWORD = REGISTRY.register("robo_sword", RoboSwordItem::new);
	public static final DeferredItem<Item> ROBOT_DEFENDER_SUIT_SPAWN_EGG = REGISTRY.register("robot_defender_suit_spawn_egg", () -> new DeferredSpawnEggItem(MechafrontModEntities.ROBOT_DEFENDER_SUIT, -13421773, -13395712, new Item.Properties()));
	public static final DeferredItem<Item> ROBOT_GOLEM_SPAWN_EGG = REGISTRY.register("robot_golem_spawn_egg", () -> new DeferredSpawnEggItem(MechafrontModEntities.ROBOT_GOLEM, -6710887, -13395712, new Item.Properties()));
	public static final DeferredItem<Item> ENEMY_ROBOT_GOLEM_SPAWN_EGG = REGISTRY.register("enemy_robot_golem_spawn_egg", () -> new DeferredSpawnEggItem(MechafrontModEntities.ENEMY_ROBOT_GOLEM, -6710887, -3407872, new Item.Properties()));
	public static final DeferredItem<Item> ROBO_DIMENSION_BLOCK = block(MechafrontModBlocks.ROBO_DIMENSION_BLOCK);
	public static final DeferredItem<Item> ROBOTS_DIMENSION = REGISTRY.register("robots_dimension", RobotsDimensionItem::new);
	public static final DeferredItem<Item> ROBOT_CAT_SPAWN_EGG = REGISTRY.register("robot_cat_spawn_egg", () -> new DeferredSpawnEggItem(MechafrontModEntities.ROBOT_CAT, -10066330, -16724788, new Item.Properties()));
	public static final DeferredItem<Item> DESTROYER_ROBOT_SPAWN_EGG = REGISTRY.register("destroyer_robot_spawn_egg", () -> new DeferredSpawnEggItem(MechafrontModEntities.DESTROYER_ROBOT, -6710887, -10092544, new Item.Properties()));
	public static final DeferredItem<Item> ROBOTIC_GHAST_SPAWN_EGG = REGISTRY.register("robotic_ghast_spawn_egg", () -> new DeferredSpawnEggItem(MechafrontModEntities.ROBOTIC_GHAST, -3355444, -1, new Item.Properties()));
	public static final DeferredItem<Item> MECHA_SUIT_BASIC_SPAWN_EGG = REGISTRY.register("mecha_suit_basic_spawn_egg", () -> new DeferredSpawnEggItem(MechafrontModEntities.MECHA_SUIT_BASIC, -13421773, -3355648, new Item.Properties()));
	public static final DeferredItem<Item> MECHA_SUIT_MEDIUM_SPAWN_EGG = REGISTRY.register("mecha_suit_medium_spawn_egg", () -> new DeferredSpawnEggItem(MechafrontModEntities.MECHA_SUIT_MEDIUM, -13421773, -16737895, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
