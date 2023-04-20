package net.mcreator.azmode.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.azmode.init.AzmodeModItems;
import net.mcreator.azmode.init.AzmodeModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ItemToBLocProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AzmodeModItems.SQUELETA_Z_HEAD_I.get()) {
			if (AzmodeModBlocks.SQUELETA_Z_HEAD_B.get().defaultBlockState().canSurvive(world, new BlockPos(x, y + 1, z))) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AzmodeModItems.SQUELETA_Z_HEAD_I.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				world.setBlock(new BlockPos(x, y + 1, z), AzmodeModBlocks.SQUELETA_Z_HEAD_B.get().defaultBlockState(), 3);
			}
		}
	}
}
