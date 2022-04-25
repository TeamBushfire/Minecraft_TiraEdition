
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraft_tira_edition.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.minecraft_tira_edition.client.model.Modelxerostracamodel;
import net.mcreator.minecraft_tira_edition.client.model.Modelpolishiamodel;
import net.mcreator.minecraft_tira_edition.client.model.Modelplacostracamodel;
import net.mcreator.minecraft_tira_edition.client.model.Modelpipiodontiamodel;
import net.mcreator.minecraft_tira_edition.client.model.Modelosteopodmodel;
import net.mcreator.minecraft_tira_edition.client.model.Modelnotoformmodel;
import net.mcreator.minecraft_tira_edition.client.model.Modeleuleptopodamodel;
import net.mcreator.minecraft_tira_edition.client.model.Modeleudemostracamodel;
import net.mcreator.minecraft_tira_edition.client.model.Modeldromeopodamodel;
import net.mcreator.minecraft_tira_edition.client.model.Modelbaropodmodel;
import net.mcreator.minecraft_tira_edition.client.model.Modelallobrachidmodel;
import net.mcreator.minecraft_tira_edition.client.model.ModelThyreostracamodel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MinecraftTiraEditionModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelallobrachidmodel.LAYER_LOCATION, Modelallobrachidmodel::createBodyLayer);
		event.registerLayerDefinition(Modeleuleptopodamodel.LAYER_LOCATION, Modeleuleptopodamodel::createBodyLayer);
		event.registerLayerDefinition(Modeleudemostracamodel.LAYER_LOCATION, Modeleudemostracamodel::createBodyLayer);
		event.registerLayerDefinition(ModelThyreostracamodel.LAYER_LOCATION, ModelThyreostracamodel::createBodyLayer);
		event.registerLayerDefinition(Modelxerostracamodel.LAYER_LOCATION, Modelxerostracamodel::createBodyLayer);
		event.registerLayerDefinition(Modeldromeopodamodel.LAYER_LOCATION, Modeldromeopodamodel::createBodyLayer);
		event.registerLayerDefinition(Modelosteopodmodel.LAYER_LOCATION, Modelosteopodmodel::createBodyLayer);
		event.registerLayerDefinition(Modelplacostracamodel.LAYER_LOCATION, Modelplacostracamodel::createBodyLayer);
		event.registerLayerDefinition(Modelpolishiamodel.LAYER_LOCATION, Modelpolishiamodel::createBodyLayer);
		event.registerLayerDefinition(Modelpipiodontiamodel.LAYER_LOCATION, Modelpipiodontiamodel::createBodyLayer);
		event.registerLayerDefinition(Modelnotoformmodel.LAYER_LOCATION, Modelnotoformmodel::createBodyLayer);
		event.registerLayerDefinition(Modelbaropodmodel.LAYER_LOCATION, Modelbaropodmodel::createBodyLayer);
	}
}
