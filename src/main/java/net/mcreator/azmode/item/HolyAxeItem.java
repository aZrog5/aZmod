
package net.mcreator.azmode.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.azmode.init.AzmodeModTabs;

public class HolyAxeItem extends AxeItem {
	public HolyAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 11100;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 11;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, 7f, new Item.Properties().tab(AzmodeModTabs.TAB_AZ_MODE));
	}
}
