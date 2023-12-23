package io.github.systemloading.cheesed.entity.mouse;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModelWithChildTransform;
import net.minecraft.client.util.math.MatrixStack;

public class MouseEntityModel extends SinglePartEntityModelWithChildTransform<MouseEntity> {
	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart head;

	public MouseEntityModel(ModelPart root) {
        super(0.5f, 24.0f);
        this.root = root;
		this.body = root.getChild("body");
		this.head = body.getChild("head");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -5.02F, -3.0F, 6.0F, 5.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 12).cuboid(-2.0F, -1.52F, -3.0F, 4.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.5F, -3.0F));

		ModelPartData left_ear = head.addChild("left_ear", ModelPartBuilder.create().uv(0, 0).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(2.5F, -2.02F, -1.0F));

		ModelPartData right_ear = head.addChild("right_ear", ModelPartBuilder.create().uv(0, 0).mirrored().cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-2.5F, -2.02F, -1.0F));

		ModelPartData tail = body.addChild("tail", ModelPartBuilder.create().uv(9, 13).cuboid(0.0F, -0.52F, 0.0F, 0.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.5F, 4.0F));

		ModelPartData front_right_leg = body.addChild("front_right_leg", ModelPartBuilder.create().uv(17, 12).mirrored().cuboid(-0.5F, 0.0F, -1.5F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-2.5F, -0.01F, -3.0F, 0.0F, 0.2618F, 0.0F));

		ModelPartData front_left_leg = body.addChild("front_left_leg", ModelPartBuilder.create().uv(17, 12).cuboid(-0.5F, 0.0F, -1.5F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -0.01F, -3.0F, 0.0F, -0.2618F, 0.0F));

		ModelPartData back_right_leg = body.addChild("back_right_leg", ModelPartBuilder.create().uv(17, 12).mirrored().cuboid(-0.5F, 0.0F, -1.5F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-2.5F, -0.01F, 3.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData back_left_leg = body.addChild("back_left_leg", ModelPartBuilder.create().uv(17, 12).cuboid(-0.5F, 0.0F, -1.5F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -0.01F, 3.0F, 0.0F, -0.7854F, 0.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}

	@Override
	public void setAngles(MouseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		head.pitch = headPitch * 0.017453292F;
		head.yaw = netHeadYaw * 0.017453292F;

		// ANIMATIONS
		// Walking Animation
		this.animateMovement(MouseAnimations.WALKING, limbSwing, limbSwingAmount, 3.5F, 1.0F);
	}

	@Override
	public ModelPart getPart() {
		return this.root;
	}
}