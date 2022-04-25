// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelplacostracamodel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "placostracamodel"), "main");
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

	public Modelplacostracamodel(ModelPart root) {
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

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.5F, -9.0F, -3.0F, 7.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(22, 17)
						.addBox(-4.0F, 1.0F, -8.0F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-4.0F, 0.0F, -4.0F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 15.0F, -3.0F));

		PartDefinition lefteye = head.addOrReplaceChild("lefteye", CubeListBuilder.create(),
				PartPose.offset(2.7077F, 0.6314F, -3.3615F));

		PartDefinition cube_r1 = lefteye.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.05F, 0.15F, -2.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-1.05F, 1.15F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2923F, -0.6314F, 0.3615F, -0.3216F, -0.339F, 0.0788F));

		PartDefinition righteye = head.addOrReplaceChild("righteye", CubeListBuilder.create(),
				PartPose.offset(-3.7077F, 0.6314F, -3.3615F));

		PartDefinition cube_r2 = righteye.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(0.05F, 0.15F, -2.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 4)
				.mirror().addBox(0.05F, 1.15F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.2923F, -0.6314F, 0.3615F, -0.3216F, 0.339F, -0.0788F));

		PartDefinition leftfrontleg = partdefinition.addOrReplaceChild("leftfrontleg", CubeListBuilder.create()
				.texOffs(0, 27).addBox(-2.25F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 19.0F, -4.25F));

		PartDefinition leftmiddlefrontleg = partdefinition.addOrReplaceChild("leftmiddlefrontleg", CubeListBuilder
				.create().texOffs(0, 27).addBox(-2.25F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 19.0F, -0.75F));

		PartDefinition leftmiddlebackleg = partdefinition.addOrReplaceChild("leftmiddlebackleg", CubeListBuilder
				.create().texOffs(0, 27).addBox(-2.25F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 19.0F, 2.75F));

		PartDefinition leftbackleg = partdefinition.addOrReplaceChild("leftbackleg", CubeListBuilder.create()
				.texOffs(0, 27).addBox(-2.25F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 19.0F, 6.25F));

		PartDefinition rightfrontleg = partdefinition.addOrReplaceChild("rightfrontleg",
				CubeListBuilder.create().texOffs(0, 27).mirror()
						.addBox(-0.75F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-3.5F, 19.0F, -4.25F));

		PartDefinition rightmiddlefrontleg = partdefinition.addOrReplaceChild("rightmiddlefrontleg",
				CubeListBuilder.create().texOffs(0, 27).mirror()
						.addBox(-0.75F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-3.5F, 19.0F, -0.75F));

		PartDefinition rightmiddlebackleg = partdefinition.addOrReplaceChild("rightmiddlebackleg",
				CubeListBuilder.create().texOffs(0, 27).mirror()
						.addBox(-0.75F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-3.5F, 19.0F, 2.75F));

		PartDefinition rightbackleg = partdefinition.addOrReplaceChild("rightbackleg",
				CubeListBuilder.create().texOffs(0, 27).mirror()
						.addBox(-0.75F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-3.5F, 19.0F, 6.25F));

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