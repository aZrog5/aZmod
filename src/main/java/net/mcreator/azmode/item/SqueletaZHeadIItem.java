
package net.mcreator.azmode.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.azmode.init.AzmodeModTabs;

public class SqueletaZHeadIItem extends Item {
	public SqueletaZHeadIItem() {
		super(new Item.Properties().tab(AzmodeModTabs.TAB_AZ_MODE).stacksTo(64).rarity(Rarity.EPIC));
	}
}
