package io.github.systemloading.cheesed;

import io.github.systemloading.cheesed.entity.mouse.MouseEntityModel;
import io.github.systemloading.cheesed.entity.mouse.MouseEntityRenderer;
import io.github.systemloading.cheesed.registry.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class CheesedClient implements ClientModInitializer {
    // Entity Model Layers
    public static final EntityModelLayer MOUSE_LAYER = new EntityModelLayer(new Identifier(Cheesed.MOD_ID, "mouse"), "main");

    @Override
    public void onInitializeClient() {
        // Register Entity Renderers
        EntityRendererRegistry.register(ModEntities.MOUSE, (MouseEntityRenderer::new));

        // Register Entity Model Layers
        EntityModelLayerRegistry.registerModelLayer(MOUSE_LAYER, MouseEntityModel::getTexturedModelData);
    }
}
