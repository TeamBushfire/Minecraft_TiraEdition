// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpipiodontiamodel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pipiodontiamodel"), "main");
	private final ModelPart head;
	private final ModelPart leftfrontwing;
	private final ModelPart leftbackwing;
	private final ModelPart rightfrontwing;
	private final ModelPart rightbackwing;
	private final ModelPart body;

	public Modelpipiodontiamodel(ModelPart root) {
		this.head = root.getChild("head");
		this.leftfrontwing = root.getChild("leftfrontwing");
		this.leftbackwing = root.getChild("leftbackwing");
		this.rightfrontwing = root.getChild("rightfrontwing");
		this.rightbackwing = root.getChild("rightbackwing");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(20, 5)
						.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.5F, 1.0F, -6.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, -6.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 23).mirror()
				.addBox(0.25F, 1.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 23)
				.mirror().addBox(0.25F, 0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, -0.4215F, 0.3614F, -0.1572F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 23)
						.addBox(-2.25F, 0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 23)
						.addBox(-1.25F, 1.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, -0.4215F, -0.3614F, 0.1572F));

		PartDefinition leftfrontwing = partdefinition.addOrReplaceChild("leftfrontwing",
				CubeListBuilder.create().texOffs(20, 0)
						.addBox(0.0F, -1.0F, 0.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 23)
						.addBox(1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 24.0F, -6.0F));

		PartDefinition leftbackwing = partdefinition.addOrReplaceChild("leftbackwing",
				CubeListBuilder.create().texOffs(0, 15)
						.addBox(0.0F, -1.0F, 0.0F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(0.0F, -1.0F, 7.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 24.0F, -1.0F));

		PartDefinition rightfrontwing = partdefinition.addOrReplaceChild("rightfrontwing",
				CubeListBuilder.create().texOffs(20, 0).mirror()
						.addBox(-6.0F, -1.0F, 0.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(10, 23).mirror()
						.addBox(-3.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 24.0F, -6.0F));

		PartDefinition rightbackwing = partdefinition.addOrReplaceChild("rightbackwing",
				CubeListBuilder.create().texOffs(0, 15).mirror()
						.addBox(-10.0F, -1.0F, 0.0F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 5).mirror().addBox(-2.0F, -1.0F, 7.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(-2.0F, 24.0F, -1.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-2.0F, -3.0F, -6.0F, 4.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		leftfrontwing.render(poseStack, buffer, packedLight, packedOverlay);
		leftbackwing.render(poseStack, buffer, packedLight, packedOverlay);
		rightfrontwing.render(poseStack, buffer, packedLight, packedOverlay);
		rightbackwing.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightbackwing.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftbackwing.zRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}