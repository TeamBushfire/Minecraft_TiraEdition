// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpolishiamodel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "polishiamodel"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart leftfrontleg;
	private final ModelPart leftmiddlefrontleg;
	private final ModelPart leftmiddlebackleg;
	private final ModelPart leftbackleg;
	private final ModelPart rightfrontleg;
	private final ModelPart rightmiddlefrontleg;
	private final ModelPart rightmiddlebackleg;
	private final ModelPart rightbackleg;

	public Modelpolishiamodel(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.leftfrontleg = root.getChild("leftfrontleg");
		this.leftmiddlefrontleg = root.getChild("leftmiddlefrontleg");
		this.leftmiddlebackleg = root.getChild("leftmiddlebackleg");
		this.leftbackleg = root.getChild("leftbackleg");
		this.rightfrontleg = root.getChild("rightfrontleg");
		this.rightmiddlefrontleg = root.getChild("rightmiddlefrontleg");
		this.rightmiddlebackleg = root.getChild("rightmiddlebackleg");
		this.rightbackleg = root.getChild("rightbackleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -7.0F, -4.5F, 5.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, -7.0F, 5.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 24.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(4, 14)
						.addBox(-1.0F, -7.0F, -10.5F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
						.addBox(-0.5F, -6.0F, -14.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 24.0F, 0.0F));

		PartDefinition leftarm = head.addOrReplaceChild("leftarm", CubeListBuilder.create(),
				PartPose.offset(4.0F, -4.0F, -9.5F));

		PartDefinition cube_r1 = leftarm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(12, 24)
						.addBox(-1.5F, -1.0F, -7.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 17)
						.addBox(-2.0F, -1.0F, -6.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.3753F, -0.3678F, 0.1407F));

		PartDefinition rightarm = head.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offset(-1.0F, -4.0F, -9.5F));

		PartDefinition cube_r2 = rightarm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 24).mirror()
				.addBox(0.5F, -1.0F, -7.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(19, 17)
				.mirror().addBox(0.0F, -1.0F, -6.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.3753F, 0.3678F, -0.1407F));

		PartDefinition leftfrontleg = partdefinition.addOrReplaceChild("leftfrontleg", CubeListBuilder.create(),
				PartPose.offset(3.5F, 19.0F, -5.5F));

		PartDefinition cube_r3 = leftfrontleg
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(4, 24).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftmiddlefrontleg = partdefinition.addOrReplaceChild("leftmiddlefrontleg",
				CubeListBuilder.create(), PartPose.offset(3.5F, 19.0F, -2.5F));

		PartDefinition cube_r4 = leftmiddlefrontleg.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(4, 24).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, -1.1781F, 0.0F));

		PartDefinition leftmiddlebackleg = partdefinition.addOrReplaceChild("leftmiddlebackleg",
				CubeListBuilder.create(), PartPose.offset(3.5F, 19.0F, 1.5F));

		PartDefinition cube_r5 = leftmiddlebackleg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(4, 24).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3655F, -0.7119F, -0.5299F));

		PartDefinition leftbackleg = partdefinition.addOrReplaceChild("leftbackleg", CubeListBuilder.create(),
				PartPose.offset(3.5F, 19.0F, 4.5F));

		PartDefinition cube_r6 = leftbackleg
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(4, 24).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition rightfrontleg = partdefinition.addOrReplaceChild("rightfrontleg", CubeListBuilder.create(),
				PartPose.offset(-3.5F, 19.0F, -5.5F));

		PartDefinition cube_r7 = rightfrontleg.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(4, 24).mirror()
						.addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightmiddlefrontleg = partdefinition.addOrReplaceChild("rightmiddlefrontleg",
				CubeListBuilder.create(), PartPose.offset(-3.5F, 19.0F, -2.5F));

		PartDefinition cube_r8 = rightmiddlefrontleg.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(4, 24).mirror()
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 1.1781F, 0.0F));

		PartDefinition rightmiddlebackleg = partdefinition.addOrReplaceChild("rightmiddlebackleg",
				CubeListBuilder.create(), PartPose.offset(-3.5F, 19.0F, 1.5F));

		PartDefinition cube_r9 = rightmiddlebackleg.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(4, 24).mirror()
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3655F, 0.7119F, 0.5299F));

		PartDefinition rightbackleg = partdefinition.addOrReplaceChild("rightbackleg", CubeListBuilder.create(),
				PartPose.offset(-3.5F, 19.0F, 4.5F));

		PartDefinition cube_r10 = rightbackleg.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(4, 24).mirror()
						.addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, buffer, packedLight, packedOverlay);
		head.render(poseStack, buffer, packedLight, packedOverlay);
		leftfrontleg.render(poseStack, buffer, packedLight, packedOverlay);
		leftmiddlefrontleg.render(poseStack, buffer, packedLight, packedOverlay);
		leftmiddlebackleg.render(poseStack, buffer, packedLight, packedOverlay);
		leftbackleg.render(poseStack, buffer, packedLight, packedOverlay);
		rightfrontleg.render(poseStack, buffer, packedLight, packedOverlay);
		rightmiddlefrontleg.render(poseStack, buffer, packedLight, packedOverlay);
		rightmiddlebackleg.render(poseStack, buffer, packedLight, packedOverlay);
		rightbackleg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leftfrontleg.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightbackleg.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightmiddlebackleg.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftmiddlefrontleg.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftmiddlebackleg.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightmiddlefrontleg.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftbackleg.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightfrontleg.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}