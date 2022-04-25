package net.mcreator.minecraft_tira_edition.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EuleptopodOnEntityTickUpdateProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinWorldEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getDeltaMovement().x() > 0 || entity.getDeltaMovement().z() > 0) {
		}
	}
}
