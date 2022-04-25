// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelosteopodmodel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "osteopodmodel"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart leftfrontleg;
	private final ModelPart rightfrontleg;
	private final ModelPart leftmiddlefrontleg;
	private final ModelPart rightmiddlefrontleg;
	private final ModelPart leftmiddlebackleg;
	private final ModelPart rightmiddlebackleg;
	private final ModelPart leftbackleg;
	private final ModelPart rightbackleg;

	public Modelosteopodmodel(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.leftfrontleg = root.getChild("leftfrontleg");
		this.rightfrontleg = root.getChild("rightfrontleg");
		this.leftmiddlefrontleg = root.getChild("leftmiddlefrontleg");
		this.rightmiddlefrontleg = root.getChild("rightmiddlefrontleg");
		this.leftmiddlebackleg = root.getChild("leftmiddlebackleg");
		this.rightmiddlebackleg = root.getChild("rightmiddlebackleg");
		this.leftbackleg = root.getChild("leftbackleg");
		this.rightbackleg = root.getChild("rightbackleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 10).addBox(
				-2.5F, -5.0F, 0.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.25F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.5F, 0.0F, -6.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-1.5F, 1.0F, -8.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.25F, 0.0F));

		PartDefinition leftarm = head.addOrReplaceChild("leftarm",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(0.5F, -1.0F, -5.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 3.0F, -3.0F));

		PartDefinition rightarm = head.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(-0.5F, -1.0F, -5.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 10)
				.mirror().addBox(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.5F, 3.0F, -3.0F));

		PartDefinition leftfrontleg = partdefinition.addOrReplaceChild("leftfrontleg", CubeListBuilder.create(),
				PartPose.offset(2.5F, 21.25F, -1.0F));

		PartDefinition cube_r1 = leftfrontleg.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6155F, 0.5236F, 0.9553F));

		PartDefinition rightfrontleg = partdefinition.addOrReplaceChild("rightfrontleg", CubeListBuilder.create(),
				PartPose.offset(-2.5F, 21.25F, -1.0F));

		PartDefinition cube_r2 = rightfrontleg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(16, 0).mirror()
						.addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6155F, -0.5236F, -0.9553F));

		PartDefinition leftmiddlefrontleg = partdefinition.addOrReplaceChild("leftmiddlefrontleg",
				CubeListBuilder.create(), PartPose.offset(2.5F, 21.25F, 1.0F));

		PartDefinition cube_r3 = leftmiddlefrontleg.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2849F, 0.274F, 0.8249F));

		PartDefinition rightmiddlefrontleg = partdefinition.addOrReplaceChild("rightmiddlefrontleg",
				CubeListBuilder.create(), PartPose.offset(-2.5F, 21.25F, 1.0F));

		PartDefinition cube_r4 = rightmiddlefrontleg.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(16, 0).mirror()
						.addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2849F, -0.274F, -0.8249F));

		PartDefinition leftmiddlebackleg = partdefinition.addOrReplaceChild("leftmiddlebackleg",
				CubeListBuilder.create(), PartPose.offset(2.5F, 21.25F, 3.0F));

		PartDefinition cube_r5 = leftmiddlebackleg
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition rightmiddlebackleg = partdefinition.addOrReplaceChild("rightmiddlebackleg",
				CubeListBuilder.create(), PartPose.offset(-2.5F, 21.25F, 3.0F));

		PartDefinition cube_r6 = rightmiddlebackleg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(16, 0).mirror()
						.addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition leftbackleg = partdefinition.addOrReplaceChild("leftbackleg", CubeListBuilder.create(),
				PartPose.offset(2.5F, 21.25F, 5.0F));

		PartDefinition cube_r7 = leftbackleg.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1872F, -0.1841F, 0.8027F));

		PartDefinition rightbackleg = partdefinition.addOrReplaceChild("rightbackleg", CubeListBuilder.create(),
				PartPose.offset(-2.5F, 21.25F, 5.0F));

		PartDefinition cube_r8 = rightbackleg.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(16, 0).mirror()
						.addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1872F, 0.1841F, -0.8027F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, buffer, packedLight, packedOverlay);
		head.render(poseStack, buffer, packedLight, packedOverlay);
		leftfrontleg.render(poseStack, buffer, packedLight, packedOverlay);
		rightfrontleg.render(poseStack, buffer, packedLight, packedOverlay);
		leftmiddlefrontleg.render(poseStack, buffer, packedLight, packedOverlay);
		rightmiddlefrontleg.render(poseStack, buffer, packedLight, packedOverlay);
		leftmiddlebackleg.render(poseStack, buffer, packedLight, packedOverlay);
		rightmiddlebackleg.render(poseStack, buffer, packedLight, packedOverlay);
		leftbackleg.render(poseStack, buffer, packedLight, packedOverlay);
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
		this.rightfrontleg.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftbackleg.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}