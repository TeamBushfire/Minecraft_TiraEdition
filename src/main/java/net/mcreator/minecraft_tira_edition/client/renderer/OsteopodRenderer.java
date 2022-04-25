package net.mcreator.minecraft_tira_edition.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minecraft_tira_edition.entity.OsteopodEntity;
import net.mcreator.minecraft_tira_edition.client.model.Modelosteopodmodel;

public class OsteopodRenderer extends MobRenderer<OsteopodEntity, Modelosteopodmodel<OsteopodEntity>> {
	public OsteopodRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelosteopodmodel(context.bakeLayer(Modelosteopodmodel.LAYER_LOCATION)), 0.375f);
	}

	@Override
	public ResourceLocation getTextureLocation(OsteopodEntity entity) {
		return new ResourceLocation("minecraft_tira_edition:textures/osteopodtxt.png");
	}
}
