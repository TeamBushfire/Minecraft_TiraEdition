package net.mcreator.minecraft_tira_edition.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minecraft_tira_edition.entity.ThyreostracanEntity;
import net.mcreator.minecraft_tira_edition.client.model.ModelThyreostracamodel;

public class ThyreostracanRenderer extends MobRenderer<ThyreostracanEntity, ModelThyreostracamodel<ThyreostracanEntity>> {
	public ThyreostracanRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelThyreostracamodel(context.bakeLayer(ModelThyreostracamodel.LAYER_LOCATION)), 0.75f);
	}

	@Override
	public ResourceLocation getTextureLocation(ThyreostracanEntity entity) {
		return new ResourceLocation("minecraft_tira_edition:textures/thyreostracamodeltxt.png");
	}
}
