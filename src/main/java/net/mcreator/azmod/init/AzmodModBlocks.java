
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.azmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.azmode.block.SqueletaZHeadBBlock;
import net.mcreator.azmod.AzmodMod;

public class AzmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AzmodMod.MODID);
	public static final RegistryObject<Block> SQUELETA_Z_HEAD_B = REGISTRY.register("squeleta_z_head_b", () -> new SqueletaZHeadBBlock());
}
