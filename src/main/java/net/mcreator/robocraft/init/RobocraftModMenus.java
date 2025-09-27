
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.robocraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.robocraft.world.inventory.MiniRoboInvMenu;
import net.mcreator.robocraft.RobocraftMod;

public class RobocraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, RobocraftMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<MiniRoboInvMenu>> MINI_ROBO_INV = REGISTRY.register("mini_robo_inv", () -> IMenuTypeExtension.create(MiniRoboInvMenu::new));
}
