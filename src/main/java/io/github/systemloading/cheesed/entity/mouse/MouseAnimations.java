package io.github.systemloading.cheesed.entity.mouse;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

@Environment(EnvType.CLIENT)
public class MouseAnimations {
    public static final Animation WALKING;

    static {
        // WALKING
        {
            WALKING = Animation.Builder.create(0.5f).looping()
                    .addBoneAnimation("body",
                            new Transformation(Transformation.Targets.TRANSLATE,
                                    new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0.25f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.16766666f, AnimationHelper.createTranslationalVector(0f, 1f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.2916767f, AnimationHelper.createTranslationalVector(0f, 0.4f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.5f, AnimationHelper.createTranslationalVector(0f, 0.25f, 0f),
                                            Transformation.Interpolations.CUBIC)))
                    .addBoneAnimation("body",
                            new Transformation(Transformation.Targets.ROTATE,
                                    new Keyframe(0f, AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.16766666f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.2916767f, AnimationHelper.createRotationalVector(5f, 0f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.5f, AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                                            Transformation.Interpolations.CUBIC)))
                    .addBoneAnimation("head",
                            new Transformation(Transformation.Targets.ROTATE,
                                    new Keyframe(0f, AnimationHelper.createRotationalVector(5f, 0f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.125f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.25f, AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.5f, AnimationHelper.createRotationalVector(5f, 0f, 0f),
                                            Transformation.Interpolations.CUBIC)))
                    .addBoneAnimation("front_right_leg",
                            new Transformation(Transformation.Targets.TRANSLATE,
                                    new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0.5f, 0.5f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.125f, AnimationHelper.createTranslationalVector(0f, 1f, -0.25f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.25f, AnimationHelper.createTranslationalVector(0f, 0.1f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.375f, AnimationHelper.createTranslationalVector(0f, 0.24f, 0.5f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.5f, AnimationHelper.createTranslationalVector(0f, 0.5f, 0.5f),
                                            Transformation.Interpolations.CUBIC)))
                    .addBoneAnimation("front_right_leg",
                            new Transformation(Transformation.Targets.ROTATE,
                                    new Keyframe(0f, AnimationHelper.createRotationalVector(23.21f, -1.17f, 5.85f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.125f, AnimationHelper.createRotationalVector(20.45f, -1.18f, 5.08f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.25f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.5f, AnimationHelper.createRotationalVector(23.21f, -1.17f, 5.85f),
                                            Transformation.Interpolations.CUBIC)))
                    .addBoneAnimation("front_left_leg",
                            new Transformation(Transformation.Targets.TRANSLATE,
                                    new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0.5f, 0.5f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.125f, AnimationHelper.createTranslationalVector(0f, 1f, -0.25f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.25f, AnimationHelper.createTranslationalVector(0f, 0.1f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.375f, AnimationHelper.createTranslationalVector(0f, 0.24f, 0.5f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.5f, AnimationHelper.createTranslationalVector(0f, 0.5f, 0.5f),
                                            Transformation.Interpolations.CUBIC)))
                    .addBoneAnimation("front_left_leg",
                            new Transformation(Transformation.Targets.ROTATE,
                                    new Keyframe(0f, AnimationHelper.createRotationalVector(23.21f, 1.17f, -5.85f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.125f, AnimationHelper.createRotationalVector(20.45f, 1.18f, -5.08f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.25f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.5f, AnimationHelper.createRotationalVector(23.21f, 1.17f, -5.85f),
                                            Transformation.Interpolations.CUBIC)))
                    .addBoneAnimation("back_right_leg",
                            new Transformation(Transformation.Targets.TRANSLATE,
                                    new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0.1f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.125f, AnimationHelper.createTranslationalVector(0f, 0.5f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.25f, AnimationHelper.createTranslationalVector(0f, 0.83f, 0.5f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.375f, AnimationHelper.createTranslationalVector(0f, 1f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.5f, AnimationHelper.createTranslationalVector(0f, 0.1f, 0f),
                                            Transformation.Interpolations.CUBIC)))
                    .addBoneAnimation("back_right_leg",
                            new Transformation(Transformation.Targets.ROTATE,
                                    new Keyframe(0f, AnimationHelper.createRotationalVector(7.05f, -0.22f, 4.98f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.125f, AnimationHelper.createRotationalVector(30.36f, -4.21f, 20.94f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.25f, AnimationHelper.createRotationalVector(44.65f, -9.18f, 29.97f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.375f, AnimationHelper.createRotationalVector(30.36f, -4.21f, 20.94f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.5f, AnimationHelper.createRotationalVector(7.05f, -0.22f, 4.98f),
                                            Transformation.Interpolations.CUBIC)))
                    .addBoneAnimation("back_left_leg",
                            new Transformation(Transformation.Targets.TRANSLATE,
                                    new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0.1f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.125f, AnimationHelper.createTranslationalVector(0f, 0.5f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.25f, AnimationHelper.createTranslationalVector(0f, 0.83f, 0.5f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.375f, AnimationHelper.createTranslationalVector(0f, 1f, 0f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.5f, AnimationHelper.createTranslationalVector(0f, 0.1f, 0f),
                                            Transformation.Interpolations.CUBIC)))
                    .addBoneAnimation("back_left_leg",
                            new Transformation(Transformation.Targets.ROTATE,
                                    new Keyframe(0f, AnimationHelper.createRotationalVector(7.05f, 0.22f, -4.98f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.125f, AnimationHelper.createRotationalVector(30.36f, 4.21f, -20.94f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.25f, AnimationHelper.createRotationalVector(44.65f, 9.18f, -29.97f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.375f, AnimationHelper.createRotationalVector(30.36f, 4.21f, -20.94f),
                                            Transformation.Interpolations.CUBIC),
                                    new Keyframe(0.5f, AnimationHelper.createRotationalVector(7.05f, 0.22f, -4.98f),
                                            Transformation.Interpolations.CUBIC))).build();
        }

    }
}
