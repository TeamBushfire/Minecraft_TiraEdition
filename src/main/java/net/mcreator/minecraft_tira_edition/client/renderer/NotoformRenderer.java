package net.mcreator.minecraft_tira_edition.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minecraft_tira_edition.entity.NotoformEntity;
import net.mcreator.minecraft_tira_edition.client.model.Modelnotoformmodel;

public class NotoformRenderer extends MobRenderer<NotoformEntity, Modelnotoformmodel<NotoformEntity>> {
	public NotoformRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnotoformmodel(context.bakeLayer(Modelnotoformmodel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NotoformEntity entity) {
		return new ResourceLocation("minecraft_tira_edition:textures/notoformmodel2.png");
	}
}
