
package net.mcreator.azmode.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.azmode.init.AzmodeModTabs;

public class HolypickaxeItem extends PickaxeItem {
	public HolypickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 11100;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.NETHER_STAR));
			}
		}, 1, 7f, new Item.Properties().tab(AzmodeModTabs.TAB_AZ_MODE));
	}
}
