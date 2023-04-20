
package net.mcreator.azmode.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class SqueletaZHeadIItem extends Item {
	public SqueletaZHeadIItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(64).rarity(Rarity.EPIC));
	}
}
