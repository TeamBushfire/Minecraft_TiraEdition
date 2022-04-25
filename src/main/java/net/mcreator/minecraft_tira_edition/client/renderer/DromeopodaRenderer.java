package net.mcreator.minecraft_tira_edition.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minecraft_tira_edition.entity.DromeopodaEntity;
import net.mcreator.minecraft_tira_edition.client.model.Modeldromeopodamodel;

public class DromeopodaRenderer extends MobRenderer<DromeopodaEntity, Modeldromeopodamodel<DromeopodaEntity>> {
	public DromeopodaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldromeopodamodel(context.bakeLayer(Modeldromeopodamodel.LAYER_LOCATION)), 0.875f);
	}

	@Override
	public ResourceLocation getTextureLocation(DromeopodaEntity entity) {
		return new ResourceLocation("minecraft_tira_edition:textures/dromeopodamodeltxt2.png");
	}
}
