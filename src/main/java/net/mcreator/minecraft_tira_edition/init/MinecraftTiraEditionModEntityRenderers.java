
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraft_tira_edition.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.minecraft_tira_edition.client.renderer.XerostracaRenderer;
import net.mcreator.minecraft_tira_edition.client.renderer.ThyreostracanRenderer;
import net.mcreator.minecraft_tira_edition.client.renderer.PolishiaRenderer;
import net.mcreator.minecraft_tira_edition.client.renderer.PlacostracaRenderer;
import net.mcreator.minecraft_tira_edition.client.renderer.PipiodontiaRenderer;
import net.mcreator.minecraft_tira_edition.client.renderer.OsteopodRenderer;
import net.mcreator.minecraft_tira_edition.client.renderer.NotoformRenderer;
import net.mcreator.minecraft_tira_edition.client.renderer.EuleptopodRenderer;
import net.mcreator.minecraft_tira_edition.client.renderer.EudemostracaRenderer;
import net.mcreator.minecraft_tira_edition.client.renderer.DromeopodaRenderer;
import net.mcreator.minecraft_tira_edition.client.renderer.BaropodRenderer;
import net.mcreator.minecraft_tira_edition.client.renderer.AllobrachidRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinecraftTiraEditionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MinecraftTiraEditionModEntities.OSTEOPOD.get(), OsteopodRenderer::new);
		event.registerEntityRenderer(MinecraftTiraEditionModEntities.EULEPTOPOD.get(), EuleptopodRenderer::new);
		event.registerEntityRenderer(MinecraftTiraEditionModEntities.BAROPOD.get(), BaropodRenderer::new);
		event.registerEntityRenderer(MinecraftTiraEditionModEntities.PIPIODONTIA.get(), PipiodontiaRenderer::new);
		event.registerEntityRenderer(MinecraftTiraEditionModEntities.NOTOFORM.get(), NotoformRenderer::new);
		event.registerEntityRenderer(MinecraftTiraEditionModEntities.PLACOSTRACA.get(), PlacostracaRenderer::new);
		event.registerEntityRenderer(MinecraftTiraEditionModEntities.EUDEMOSTRACA.get(), EudemostracaRenderer::new);
		event.registerEntityRenderer(MinecraftTiraEditionModEntities.XEROSTRACA.get(), XerostracaRenderer::new);
		event.registerEntityRenderer(MinecraftTiraEditionModEntities.THYREOSTRACAN.get(), ThyreostracanRenderer::new);
		event.registerEntityRenderer(MinecraftTiraEditionModEntities.ALLOBRACHID.get(), AllobrachidRenderer::new);
		event.registerEntityRenderer(MinecraftTiraEditionModEntities.POLISHIA.get(), PolishiaRenderer::new);
		event.registerEntityRenderer(MinecraftTiraEditionModEntities.DROMEOPODA.get(), DromeopodaRenderer::new);
	}
}
