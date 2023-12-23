package io.github.systemloading.cheesed.entity.mouse;

import io.github.systemloading.cheesed.Cheesed;
import io.github.systemloading.cheesed.CheesedClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class MouseEntityRenderer extends MobEntityRenderer<MouseEntity, MouseEntityModel> {
    public static final Identifier TEXTURE = new Identifier(Cheesed.MOD_ID, "textures/entity/mouse/mouse.png");

    public MouseEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new MouseEntityModel(context.getPart(CheesedClient.MOUSE_LAYER)), 0.3F);
    }

    @Override
    public Identifier getTexture(MouseEntity entity) {
        return TEXTURE;
    }
}
