
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mechafront.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.mechafront.block.TitanSummonerBlock;
import net.mcreator.mechafront.block.RobotsDimensionPortalBlock;
import net.mcreator.mechafront.block.RoboDimensionBlockBlock;
import net.mcreator.mechafront.block.BossActivatorBlock;
import net.mcreator.mechafront.MechafrontMod;

public class MechafrontModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MechafrontMod.MODID);
	public static final DeferredBlock<Block> BOSS_ACTIVATOR = REGISTRY.register("boss_activator", BossActivatorBlock::new);
	public static final DeferredBlock<Block> TITAN_SUMMONER = REGISTRY.register("titan_summoner", TitanSummonerBlock::new);
	public static final DeferredBlock<Block> ROBO_DIMENSION_BLOCK = REGISTRY.register("robo_dimension_block", RoboDimensionBlockBlock::new);
	public static final DeferredBlock<Block> ROBOTS_DIMENSION_PORTAL = REGISTRY.register("robots_dimension_portal", RobotsDimensionPortalBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
