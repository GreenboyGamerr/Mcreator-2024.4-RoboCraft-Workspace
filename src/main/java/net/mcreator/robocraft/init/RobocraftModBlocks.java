
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.robocraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.robocraft.block.TitanSummonerBlock;
import net.mcreator.robocraft.block.BossActivatorBlock;
import net.mcreator.robocraft.RobocraftMod;

public class RobocraftModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(RobocraftMod.MODID);
	public static final DeferredBlock<Block> BOSS_ACTIVATOR = REGISTRY.register("boss_activator", BossActivatorBlock::new);
	public static final DeferredBlock<Block> TITAN_SUMMONER = REGISTRY.register("titan_summoner", TitanSummonerBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
