// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmezz2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mezz2"), "main");
	private final ModelPart mezz;

	public Modelmezz2(ModelPart root) {
		this.mezz = root.getChild("mezz");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition mezz = partdefinition.addOrReplaceChild("mezz", CubeListBuilder.create(),
				PartPose.offset(0.0F, 9.0F, 0.0F));

		PartDefinition body = mezz.addOrReplaceChild("body", CubeListBuilder.create().texOffs(32, 26).addBox(-4.0F,
				-24.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 26).addBox(-4.0F,
				-32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition aureole = head.addOrReplaceChild("aureole",
				CubeListBuilder.create().texOffs(44, 49)
						.addBox(-3.5F, -0.5F, 2.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 42)
						.addBox(2.5F, -0.5F, -2.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 23)
						.addBox(-2.5F, -0.5F, -3.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 16)
						.addBox(-3.5F, -0.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -34.5F, 0.0F));

		PartDefinition Rarm = body.addOrReplaceChild("Rarm", CubeListBuilder.create().texOffs(42, 0).addBox(0.0F, 0.0F,
				-2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -24.0F, 0.0F));

		PartDefinition Larm = body.addOrReplaceChild("Larm", CubeListBuilder.create().texOffs(0, 42).addBox(-4.5F, 0.0F,
				-2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, -24.0F, 0.0F));

		PartDefinition Lleg = body.addOrReplaceChild("Lleg", CubeListBuilder.create().texOffs(30, 42).addBox(-1.5F,
				-0.5F, -2.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.6F, -11.5F, 0.0F));

		PartDefinition Rleg = body.addOrReplaceChild("Rleg", CubeListBuilder.create().texOffs(16, 42).addBox(-1.5F,
				-0.5F, -2.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.4F, -11.5F, 0.0F));

		PartDefinition Lwing = body.addOrReplaceChild("Lwing", CubeListBuilder.create(),
				PartPose.offset(0.1962F, -24.3397F, 2.5F));

		PartDefinition leftwing_r1 = Lwing.addOrReplaceChild("leftwing_r1",
				CubeListBuilder.create().texOffs(0, 13).addBox(-20.0F, 0.0F, 0.0F, 20.0F, 12.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1962F, 0.3397F, -0.5F, 0.0F, 0.0F, -2.0944F));

		PartDefinition Rwing = body.addOrReplaceChild("Rwing", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightwing_r1 = Rwing.addOrReplaceChild("rightwing_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -0.5F, 20.0F, 12.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.0F, 2.5F, 0.0F, 0.0F, 2.0944F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		mezz.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}