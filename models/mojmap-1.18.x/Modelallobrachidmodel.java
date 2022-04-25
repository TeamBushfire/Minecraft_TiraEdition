// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelallobrachidmodel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "allobrachidmodel"), "main");
	private final ModelPart head;
	private final ModelPart leftlegarm;
	private final ModelPart leftfrontleg;
	private final ModelPart leftmiddleleg;
	private final ModelPart leftbackleg;
	private final ModelPart body;
	private final ModelPart rightlegarm;
	private final ModelPart rightfrontleg;
	private final ModelPart rightmiddleleg;
	private final ModelPart rightbackleg;

	public Modelallobrachidmodel(ModelPart root) {
		this.head = root.getChild("head");
		this.leftlegarm = root.getChild("leftlegarm");
		this.leftfrontleg = root.getChild("leftfrontleg");
		this.leftmiddleleg = root.getChild("leftmiddleleg");
		this.leftbackleg = root.getChild("leftbackleg");
		this.body = root.getChild("body");
		this.rightlegarm = root.getChild("rightlegarm");
		this.rightfrontleg = root.getChild("rightfrontleg");
		this.rightmiddleleg = root.getChild("rightmiddleleg");
		this.rightbackleg = root.getChild("rightbackleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 12.0F, -6.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(29, 8)
						.addBox(-1.5F, -1.0F, -9.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition leftarm = head.addOrReplaceChild("leftarm", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.0F, 1.237F, -3.8189F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r2 = leftarm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(29, 0)
						.addBox(1.5F, -2.0F, -11.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(18, 34)
						.addBox(2.0F, -2.5F, -13.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(3.0F, -3.5F, -16.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 35)
						.addBox(2.0F, -4.5F, -16.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 21)
						.addBox(2.0F, -4.5F, -15.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -3.0068F, 6.8142F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightarm = head.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.0F, 1.237F, -3.8189F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r3 = rightarm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(29, 0).mirror()
				.addBox(-4.5F, -2.0F, -11.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 34)
				.mirror().addBox(-4.0F, -2.5F, -13.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 19).mirror().addBox(-3.0F, -3.5F, -16.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(11, 35).mirror()
				.addBox(-4.0F, -4.5F, -16.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(19, 21)
				.mirror().addBox(-4.0F, -4.5F, -15.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, -3.0068F, 6.8142F, 0.48F, 0.0F, 0.0F));

		PartDefinition leftlegarm = partdefinition.addOrReplaceChild("leftlegarm",
				CubeListBuilder.create().texOffs(26, 30)
						.addBox(-2.5F, 0.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-2.5F, 3.0F, -3.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 13.0F, -7.0F));

		PartDefinition leftfrontleg = partdefinition.addOrReplaceChild("leftfrontleg", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-2.5F, 0.0F, -2.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 13.0F, -2.75F));

		PartDefinition leftmiddleleg = partdefinition.addOrReplaceChild("leftmiddleleg", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-2.5F, 0.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 13.0F, 1.25F));

		PartDefinition leftbackleg = partdefinition.addOrReplaceChild("leftbackleg", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-2.5F, 0.0F, -1.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 13.0F, 5.25F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.5F, -5.25F, -7.75F, 7.0F, 6.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(26, 21)
						.addBox(-2.5F, 0.75F, 1.25F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.25F, 0.75F));

		PartDefinition rightlegarm = partdefinition.addOrReplaceChild("rightlegarm",
				CubeListBuilder.create().texOffs(26, 30).mirror()
						.addBox(-0.5F, 0.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 34).mirror().addBox(-0.5F, 3.0F, -3.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(-3.5F, 13.0F, -7.0F));

		PartDefinition rightfrontleg = partdefinition.addOrReplaceChild("rightfrontleg",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-0.5F, 0.0F, -2.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-3.5F, 13.0F, -2.75F));

		PartDefinition rightmiddleleg = partdefinition.addOrReplaceChild("rightmiddleleg",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-0.5F, 0.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-3.5F, 13.0F, 1.25F));

		PartDefinition rightbackleg = partdefinition.addOrReplaceChild("rightbackleg",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-0.5F, 0.0F, -1.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-3.5F, 13.0F, 5.25F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		leftlegarm.render(poseStack, buffer, packedLight, packedOverlay);
		leftfrontleg.render(poseStack, buffer, packedLight, packedOverlay);
		leftmiddleleg.render(poseStack, buffer, packedLight, packedOverlay);
		leftbackleg.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
		rightlegarm.render(poseStack, buffer, packedLight, packedOverlay);
		rightfrontleg.render(poseStack, buffer, packedLight, packedOverlay);
		rightmiddleleg.render(poseStack, buffer, packedLight, packedOverlay);
		rightbackleg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leftfrontleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightbackleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightmiddleleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftmiddleleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftbackleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightfrontleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}