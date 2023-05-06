
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.azmode.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.azmode.item.SqueletaZHeadIItem;
import net.mcreator.azmode.item.HolyswordItem;
import net.mcreator.azmode.item.HolyshowelItem;
import net.mcreator.azmode.item.HolypickaxeItem;
import net.mcreator.azmode.AzmodeMod;

public class AzmodeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AzmodeMod.MODID);
	public static final RegistryObject<Item> SQUELETA_Z_SPAWN_EGG = REGISTRY.register("squeleta_z_spawn_egg", () -> new ForgeSpawnEggItem(AzmodeModEntities.SQUELETA_Z, -10092544, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SQUELETA_Z_HEAD_B = block(AzmodeModBlocks.SQUELETA_Z_HEAD_B, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SQUELETA_Z_HEAD_I = REGISTRY.register("squeleta_z_head_i", () -> new SqueletaZHeadIItem());
	public static final RegistryObject<Item> RA_Z_SPAWN_EGG = REGISTRY.register("ra_z_spawn_egg", () -> new ForgeSpawnEggItem(AzmodeModEntities.RA_Z, -13434829, -39169, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HOLYSWORD = REGISTRY.register("holysword", () -> new HolyswordItem());
	public static final RegistryObject<Item> HOLYPICKAXE = REGISTRY.register("holypickaxe", () -> new HolypickaxeItem());
	public static final RegistryObject<Item> TANUZ_SPAWN_EGG = REGISTRY.register("tanuz_spawn_egg", () -> new ForgeSpawnEggItem(AzmodeModEntities.TANUZ, -39424, -256, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MEZZ_SPAWN_EGG = REGISTRY.register("mezz_spawn_egg", () -> new ForgeSpawnEggItem(AzmodeModEntities.MEZZ, -103, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HOLYSHOWEL = REGISTRY.register("holyshowel", () -> new HolyshowelItem());
	public static final RegistryObject<Item> ARKADYZ_SPAWN_EGG = REGISTRY.register("arkadyz_spawn_egg", () -> new ForgeSpawnEggItem(AzmodeModEntities.ARKADYZ, -16711732, -256, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> WONG_SPAWN_EGG = REGISTRY.register("wong_spawn_egg", () -> new ForgeSpawnEggItem(AzmodeModEntities.WONG, -1, -13434880, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
