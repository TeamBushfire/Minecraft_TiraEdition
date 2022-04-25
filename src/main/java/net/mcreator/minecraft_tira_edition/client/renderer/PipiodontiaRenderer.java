package net.mcreator.minecraft_tira_edition.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minecraft_tira_edition.entity.PipiodontiaEntity;
import net.mcreator.minecraft_tira_edition.client.model.Modelpipiodontiamodel;

public class PipiodontiaRenderer extends MobRenderer<PipiodontiaEntity, Modelpipiodontiamodel<PipiodontiaEntity>> {
	public PipiodontiaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpipiodontiamodel(context.bakeLayer(Modelpipiodontiamodel.LAYER_LOCATION)), 0.75f);
	}

	@Override
	public ResourceLocation getTextureLocation(PipiodontiaEntity entity) {
		return new ResourceLocation("minecraft_tira_edition:textures/pipiodontiamodeltxt.png");
	}
}
