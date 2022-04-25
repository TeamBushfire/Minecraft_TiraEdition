package net.mcreator.minecraft_tira_edition.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minecraft_tira_edition.entity.PolishiaEntity;
import net.mcreator.minecraft_tira_edition.client.model.Modelpolishiamodel;

public class PolishiaRenderer extends MobRenderer<PolishiaEntity, Modelpolishiamodel<PolishiaEntity>> {
	public PolishiaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpolishiamodel(context.bakeLayer(Modelpolishiamodel.LAYER_LOCATION)), 0.625f);
	}

	@Override
	public ResourceLocation getTextureLocation(PolishiaEntity entity) {
		return new ResourceLocation("minecraft_tira_edition:textures/polishiamodeltxt.png");
	}
}
