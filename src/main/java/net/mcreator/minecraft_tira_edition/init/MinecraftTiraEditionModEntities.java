
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraft_tira_edition.init;

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

import net.mcreator.minecraft_tira_edition.entity.XerostracaEntity;
import net.mcreator.minecraft_tira_edition.entity.ThyreostracanEntity;
import net.mcreator.minecraft_tira_edition.entity.PolishiaEntity;
import net.mcreator.minecraft_tira_edition.entity.PlacostracaEntity;
import net.mcreator.minecraft_tira_edition.entity.PipiodontiaEntity;
import net.mcreator.minecraft_tira_edition.entity.OsteopodEntity;
import net.mcreator.minecraft_tira_edition.entity.NotoformEntity;
import net.mcreator.minecraft_tira_edition.entity.EuleptopodEntity;
import net.mcreator.minecraft_tira_edition.entity.EudemostracaEntity;
import net.mcreator.minecraft_tira_edition.entity.DromeopodaEntity;
import net.mcreator.minecraft_tira_edition.entity.BaropodEntity;
import net.mcreator.minecraft_tira_edition.entity.AllobrachidEntity;
import net.mcreator.minecraft_tira_edition.MinecraftTiraEditionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftTiraEditionModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, MinecraftTiraEditionMod.MODID);
	public static final RegistryObject<EntityType<OsteopodEntity>> OSTEOPOD = register("osteopod",
			EntityType.Builder.<OsteopodEntity>of(OsteopodEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OsteopodEntity::new)

					.sized(0.375f, 0.375f));
	public static final RegistryObject<EntityType<EuleptopodEntity>> EULEPTOPOD = register("euleptopod",
			EntityType.Builder.<EuleptopodEntity>of(EuleptopodEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EuleptopodEntity::new)

					.sized(0.8125f, 0.875f));
	public static final RegistryObject<EntityType<BaropodEntity>> BAROPOD = register("baropod",
			EntityType.Builder.<BaropodEntity>of(BaropodEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(62)
					.setUpdateInterval(3).setCustomClientFactory(BaropodEntity::new)

					.sized(2.5f, 3f));
	public static final RegistryObject<EntityType<PipiodontiaEntity>> PIPIODONTIA = register("pipiodontia",
			EntityType.Builder.<PipiodontiaEntity>of(PipiodontiaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PipiodontiaEntity::new)

					.sized(0.75f, 0.1875f));
	public static final RegistryObject<EntityType<NotoformEntity>> NOTOFORM = register("notoform",
			EntityType.Builder.<NotoformEntity>of(NotoformEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NotoformEntity::new)

					.sized(0.5f, 0.4375f));
	public static final RegistryObject<EntityType<PlacostracaEntity>> PLACOSTRACA = register("placostraca",
			EntityType.Builder.<PlacostracaEntity>of(PlacostracaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PlacostracaEntity::new)

					.sized(0.6875f, 0.5625f));
	public static final RegistryObject<EntityType<EudemostracaEntity>> EUDEMOSTRACA = register("eudemostraca",
			EntityType.Builder.<EudemostracaEntity>of(EudemostracaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EudemostracaEntity::new)

					.sized(0.625f, 0.5625f));
	public static final RegistryObject<EntityType<XerostracaEntity>> XEROSTRACA = register("xerostraca",
			EntityType.Builder.<XerostracaEntity>of(XerostracaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(XerostracaEntity::new)

					.sized(0.5f, 0.375f));
	public static final RegistryObject<EntityType<ThyreostracanEntity>> THYREOSTRACAN = register("thyreostracan",
			EntityType.Builder.<ThyreostracanEntity>of(ThyreostracanEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThyreostracanEntity::new)

					.sized(0.75f, 0.75f));
	public static final RegistryObject<EntityType<AllobrachidEntity>> ALLOBRACHID = register("allobrachid",
			EntityType.Builder.<AllobrachidEntity>of(AllobrachidEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AllobrachidEntity::new)

					.sized(0.9375f, 0.875f));
	public static final RegistryObject<EntityType<PolishiaEntity>> POLISHIA = register("polishia",
			EntityType.Builder.<PolishiaEntity>of(PolishiaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PolishiaEntity::new)

					.sized(0.625f, 0.4375f));
	public static final RegistryObject<EntityType<DromeopodaEntity>> DROMEOPODA = register("dromeopoda",
			EntityType.Builder.<DromeopodaEntity>of(DromeopodaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DromeopodaEntity::new)

					.sized(0.875f, 0.4375f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			OsteopodEntity.init();
			EuleptopodEntity.init();
			BaropodEntity.init();
			PipiodontiaEntity.init();
			NotoformEntity.init();
			PlacostracaEntity.init();
			EudemostracaEntity.init();
			XerostracaEntity.init();
			ThyreostracanEntity.init();
			AllobrachidEntity.init();
			PolishiaEntity.init();
			DromeopodaEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(OSTEOPOD.get(), OsteopodEntity.createAttributes().build());
		event.put(EULEPTOPOD.get(), EuleptopodEntity.createAttributes().build());
		event.put(BAROPOD.get(), BaropodEntity.createAttributes().build());
		event.put(PIPIODONTIA.get(), PipiodontiaEntity.createAttributes().build());
		event.put(NOTOFORM.get(), NotoformEntity.createAttributes().build());
		event.put(PLACOSTRACA.get(), PlacostracaEntity.createAttributes().build());
		event.put(EUDEMOSTRACA.get(), EudemostracaEntity.createAttributes().build());
		event.put(XEROSTRACA.get(), XerostracaEntity.createAttributes().build());
		event.put(THYREOSTRACAN.get(), ThyreostracanEntity.createAttributes().build());
		event.put(ALLOBRACHID.get(), AllobrachidEntity.createAttributes().build());
		event.put(POLISHIA.get(), PolishiaEntity.createAttributes().build());
		event.put(DROMEOPODA.get(), DromeopodaEntity.createAttributes().build());
	}
}
