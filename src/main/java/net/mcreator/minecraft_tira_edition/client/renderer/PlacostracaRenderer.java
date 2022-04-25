package net.mcreator.minecraft_tira_edition.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minecraft_tira_edition.entity.PlacostracaEntity;
import net.mcreator.minecraft_tira_edition.client.model.Modelplacostracamodel;

public class PlacostracaRenderer extends MobRenderer<PlacostracaEntity, Modelplacostracamodel<PlacostracaEntity>> {
	public PlacostracaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelplacostracamodel(context.bakeLayer(Modelplacostracamodel.LAYER_LOCATION)), 0.6875f);
	}

	@Override
	public ResourceLocation getTextureLocation(PlacostracaEntity entity) {
		return new ResourceLocation("minecraft_tira_edition:textures/placostracamodeltxt.png");
	}
}
