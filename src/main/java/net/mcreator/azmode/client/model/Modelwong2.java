package net.mcreator.azmode.client.model;

import net.minecraft.world.entity.Entity;
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

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelwong2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("azmode", "modelwong_2"), "main");
	public final ModelPart wong;

	public Modelwong2(ModelPart root) {
		this.wong = root.getChild("wong");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition wong = partdefinition.addOrReplaceChild("wong", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body = wong.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, -3.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.5F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.5F, -1.0F));
		PartDefinition mouthnose = head.addOrReplaceChild("mouthnose", CubeListBuilder.create().texOffs(16, 11).addBox(-2.0F, -11.0F, -4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.5F, 1.0F));
		PartDefinition Larm = body.addOrReplaceChild("Larm", CubeListBuilder.create().texOffs(28, 20).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -11.0F, 1.5F));
		PartDefinition Larm2 = Larm.addOrReplaceChild("Larm2", CubeListBuilder.create().texOffs(12, 24).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.5F, 0.0F));
		PartDefinition Rarm = body.addOrReplaceChild("Rarm", CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, -11.0F, 1.5F));
		PartDefinition Rarm2 = Rarm.addOrReplaceChild("Rarm2", CubeListBuilder.create().texOffs(16, 14).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.5F, 0.0F));
		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0607F, 1.6464F));
		PartDefinition cube_r1 = torso.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -4.0F, -2.0F, 12.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0607F, 0.3536F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hip = torso.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0607F, -1.6464F));
		PartDefinition cube_r2 = hip.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 11).addBox(-3.5F, -1.5F, -2.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.5F, 5.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Lleg = body.addOrReplaceChild("Lleg", CubeListBuilder.create().texOffs(28, 30).addBox(2.0F, -3.0F, 5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Rleg = body.addOrReplaceChild("Rleg", CubeListBuilder.create().texOffs(28, 11).addBox(-4.0F, -3.0F, 5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		wong.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.wong.yRot = netHeadYaw / (180F / (float) Math.PI);
	}
}
