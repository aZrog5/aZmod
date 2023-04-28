
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.azmode.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.azmode.entity.TanuzEntity;
import net.mcreator.azmode.entity.SqueletaZEntity;
import net.mcreator.azmode.entity.RaZEntity;
import net.mcreator.azmode.entity.MezzEntity;
import net.mcreator.azmode.AzmodeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AzmodeModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AzmodeMod.MODID);
	public static final RegistryObject<EntityType<SqueletaZEntity>> SQUELETA_Z = register("squeleta_z",
			EntityType.Builder.<SqueletaZEntity>of(SqueletaZEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SqueletaZEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<RaZEntity>> RA_Z = register("ra_z",
			EntityType.Builder.<RaZEntity>of(RaZEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RaZEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<TanuzEntity>> TANUZ = register("tanuz",
			EntityType.Builder.<TanuzEntity>of(TanuzEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TanuzEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MezzEntity>> MEZZ = register("mezz",
			EntityType.Builder.<MezzEntity>of(MezzEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MezzEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SqueletaZEntity.init();
			RaZEntity.init();
			TanuzEntity.init();
			MezzEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SQUELETA_Z.get(), SqueletaZEntity.createAttributes().build());
		event.put(RA_Z.get(), RaZEntity.createAttributes().build());
		event.put(TANUZ.get(), TanuzEntity.createAttributes().build());
		event.put(MEZZ.get(), MezzEntity.createAttributes().build());
	}
}
