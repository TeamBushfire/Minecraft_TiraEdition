package net.mcreator.minecraft_tira_edition.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbaropodmodel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("minecraft_tira_edition", "modelbaropodmodel"), "main");
	public final ModelPart head;
	public final ModelPart leftfrontleg;
	public final ModelPart leftmiddlefrontleg;
	public final ModelPart leftmiddlebackleg;
	public final ModelPart leftbackleg;
	public final ModelPart body;
	public final ModelPart rightfrontleg;
	public final ModelPart rightmiddlefrontleg;
	public final ModelPart rightmiddlebackleg;
	public final ModelPart rightbackleg;

	public Modelbaropodmodel(ModelPart root) {
		this.head = root.getChild("head");
		this.leftfrontleg = root.getChild("leftfrontleg");
		this.leftmiddlefrontleg = root.getChild("leftmiddlefrontleg");
		this.leftmiddlebackleg = root.getChild("leftmiddlebackleg");
		this.leftbackleg = root.getChild("leftbackleg");
		this.body = root.getChild("body");
		this.rightfrontleg = root.getChild("rightfrontleg");
		this.rightmiddlefrontleg = root.getChild("rightmiddlefrontleg");
		this.rightmiddlebackleg = root.getChild("rightmiddlebackleg");
		this.rightbackleg = root.getChild("rightbackleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 72).addBox(-12.0F, -14.0F, -32.0F, 24.0F, 28.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, -18.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(128, 12).addBox(-6.0F, 1.5F, -18.75F, 12.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -30.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition leftarm = head.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(12.0F, 9.0F, -29.0F));
		PartDefinition cube_r2 = leftarm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(88, 0).addBox(-5.5F, -9.0F, -18.0F, 8.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 4.0F, 3.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r3 = leftarm.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 8).addBox(-19.0F, -3.1181F, -21.996F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-12.0F, -4.6181F, -21.996F, 16.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(130, 42)
						.addBox(0.0F, -4.6181F, -17.996F, 4.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 8.0F, -15.0F, 0.0F, -0.6545F, 0.0F));
		PartDefinition rightarm = head.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(-12.0F, 9.0F, -29.0F));
		PartDefinition cube_r4 = rightarm
				.addOrReplaceChild(
						"cube_r4", CubeListBuilder.create().texOffs(88, 0).mirror()
								.addBox(-2.5F, -9.0F, -18.0F, 8.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.5F, 4.0F, 3.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r5 = rightarm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 8).mirror().addBox(7.0F, -3.1181F, -21.996F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 0).mirror().addBox(-4.0F, -4.6181F, -21.996F, 16.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(130, 42).mirror().addBox(-4.0F, -4.6181F, -17.996F, 4.0F, 4.0F, 18.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(3.0F, 8.0F, -15.0F, 0.0F, 0.6545F, 0.0F));
		PartDefinition leftfrontleg = partdefinition.addOrReplaceChild("leftfrontleg",
				CubeListBuilder.create().texOffs(100, 120).addBox(-9.0F, -5.0F, -6.0F, 12.0F, 32.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(12.0F, -3.0F, -26.0F));
		PartDefinition leftmiddlefrontleg = partdefinition.addOrReplaceChild("leftmiddlefrontleg",
				CubeListBuilder.create().texOffs(112, 72).addBox(-7.0F, -4.5F, -12.0F, 12.0F, 36.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(12.0F, -7.5F, -2.0F));
		PartDefinition leftmiddlebackleg = partdefinition.addOrReplaceChild("leftmiddlebackleg",
				CubeListBuilder.create().texOffs(112, 72).addBox(-7.0F, -4.0F, -6.0F, 12.0F, 36.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(12.0F, -8.0F, 6.0F));
		PartDefinition leftbackleg = partdefinition.addOrReplaceChild("leftbackleg",
				CubeListBuilder.create().texOffs(112, 72).addBox(-7.0F, -4.0F, 0.0F, 12.0F, 36.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(12.0F, -8.0F, 14.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -16.0F, -20.0F, 24.0F, 32.0F, 40.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.0F, 2.0F));
		PartDefinition rightfrontleg = partdefinition.addOrReplaceChild(
				"rightfrontleg", CubeListBuilder.create().texOffs(100, 120).mirror()
						.addBox(-3.0F, -5.0F, -6.0F, 12.0F, 32.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-12.0F, -3.0F, -26.0F));
		PartDefinition rightmiddlefrontleg = partdefinition.addOrReplaceChild(
				"rightmiddlefrontleg", CubeListBuilder.create().texOffs(112, 72).mirror()
						.addBox(-5.0F, -4.5F, -12.0F, 12.0F, 36.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-12.0F, -7.5F, -2.0F));
		PartDefinition rightmiddlebackleg = partdefinition.addOrReplaceChild(
				"rightmiddlebackleg", CubeListBuilder.create().texOffs(112, 72).mirror()
						.addBox(-5.0F, -4.0F, -6.0F, 12.0F, 36.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-12.0F, -8.0F, 6.0F));
		PartDefinition rightbackleg = partdefinition.addOrReplaceChild(
				"rightbackleg", CubeListBuilder.create().texOffs(112, 72).mirror()
						.addBox(-5.0F, -4.0F, 0.0F, 12.0F, 36.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-12.0F, -8.0F, 14.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		leftfrontleg.render(poseStack, buffer, packedLight, packedOverlay);
		leftmiddlefrontleg.render(poseStack, buffer, packedLight, packedOverlay);
		leftmiddlebackleg.render(poseStack, buffer, packedLight, packedOverlay);
		leftbackleg.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
		rightfrontleg.render(poseStack, buffer, packedLight, packedOverlay);
		rightmiddlefrontleg.render(poseStack, buffer, packedLight, packedOverlay);
		rightmiddlebackleg.render(poseStack, buffer, packedLight, packedOverlay);
		rightbackleg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leftfrontleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightbackleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightmiddlebackleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftmiddlefrontleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftmiddlebackleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightmiddlefrontleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftbackleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightfrontleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
