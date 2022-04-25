package net.mcreator.minecraft_tira_edition.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minecraft_tira_edition.entity.EuleptopodEntity;
import net.mcreator.minecraft_tira_edition.client.model.Modeleuleptopodamodel;

public class EuleptopodRenderer extends MobRenderer<EuleptopodEntity, Modeleuleptopodamodel<EuleptopodEntity>> {
	public EuleptopodRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeleuleptopodamodel(context.bakeLayer(Modeleuleptopodamodel.LAYER_LOCATION)), 0.8125f);
	}

	@Override
	public ResourceLocation getTextureLocation(EuleptopodEntity entity) {
		return new ResourceLocation("minecraft_tira_edition:textures/euleptopodatxtpattern.png");
	}
}
