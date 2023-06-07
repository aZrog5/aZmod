
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.azmode.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AzmodeModTabs {
	public static CreativeModeTab TAB_AZ_MODE;

	public static void load() {
		TAB_AZ_MODE = new CreativeModeTab("tabaz_mode") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.END_CRYSTAL);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
