
package net.mcreator.robocraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RobotHeadItem extends Item {
	public RobotHeadItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
