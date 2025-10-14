
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mechafront.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.mechafront.world.inventory.MiniRoboInvMenu;
import net.mcreator.mechafront.MechafrontMod;

public class MechafrontModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, MechafrontMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<MiniRoboInvMenu>> MINI_ROBO_INV = REGISTRY.register("mini_robo_inv", () -> IMenuTypeExtension.create(MiniRoboInvMenu::new));
}
