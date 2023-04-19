
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.azmode.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.azmode.block.SqueletaZHeadBBlock;
import net.mcreator.azmode.AzmodeMod;

public class AzmodeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AzmodeMod.MODID);
	public static final RegistryObject<Block> SQUELETA_Z_HEAD_B = REGISTRY.register("squeleta_z_head_b", () -> new SqueletaZHeadBBlock());
}
