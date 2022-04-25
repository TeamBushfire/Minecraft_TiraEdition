package net.mcreator.minecraft_tira_edition.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minecraft_tira_edition.entity.EudemostracaEntity;
import net.mcreator.minecraft_tira_edition.client.model.Modeleudemostracamodel;

public class EudemostracaRenderer extends MobRenderer<EudemostracaEntity, Modeleudemostracamodel<EudemostracaEntity>> {
	public EudemostracaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeleudemostracamodel(context.bakeLayer(Modeleudemostracamodel.LAYER_LOCATION)), 0.625f);
	}

	@Override
	public ResourceLocation getTextureLocation(EudemostracaEntity entity) {
		return new ResourceLocation("minecraft_tira_edition:textures/eudemostracamodeltxt.png");
	}
}
