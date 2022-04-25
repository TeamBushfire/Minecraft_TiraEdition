package net.mcreator.minecraft_tira_edition.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minecraft_tira_edition.entity.AllobrachidEntity;
import net.mcreator.minecraft_tira_edition.client.model.Modelallobrachidmodel;

public class AllobrachidRenderer extends MobRenderer<AllobrachidEntity, Modelallobrachidmodel<AllobrachidEntity>> {
	public AllobrachidRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelallobrachidmodel(context.bakeLayer(Modelallobrachidmodel.LAYER_LOCATION)), 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(AllobrachidEntity entity) {
		return new ResourceLocation("minecraft_tira_edition:textures/allobrachidmodeltxt3.png");
	}
}
