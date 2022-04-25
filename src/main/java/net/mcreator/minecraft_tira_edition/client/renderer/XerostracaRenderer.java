package net.mcreator.minecraft_tira_edition.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minecraft_tira_edition.entity.XerostracaEntity;
import net.mcreator.minecraft_tira_edition.client.model.Modelxerostracamodel;

public class XerostracaRenderer extends MobRenderer<XerostracaEntity, Modelxerostracamodel<XerostracaEntity>> {
	public XerostracaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelxerostracamodel(context.bakeLayer(Modelxerostracamodel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(XerostracaEntity entity) {
		return new ResourceLocation("minecraft_tira_edition:textures/xerostracamodeltxt.png");
	}
}
