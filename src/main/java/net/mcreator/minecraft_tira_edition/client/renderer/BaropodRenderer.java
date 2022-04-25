package net.mcreator.minecraft_tira_edition.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minecraft_tira_edition.entity.BaropodEntity;
import net.mcreator.minecraft_tira_edition.client.model.Modelbaropodmodel;

public class BaropodRenderer extends MobRenderer<BaropodEntity, Modelbaropodmodel<BaropodEntity>> {
	public BaropodRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbaropodmodel(context.bakeLayer(Modelbaropodmodel.LAYER_LOCATION)), 2.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BaropodEntity entity) {
		return new ResourceLocation("minecraft_tira_edition:textures/baropodmodeldetailed.png");
	}
}
