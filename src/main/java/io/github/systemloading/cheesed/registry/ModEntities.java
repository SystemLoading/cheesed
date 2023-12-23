package io.github.systemloading.cheesed.registry;

import io.github.systemloading.cheesed.Cheesed;
import io.github.systemloading.cheesed.entity.mouse.MouseEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<MouseEntity> MOUSE =
            Registry.register(Registries.ENTITY_TYPE, new Identifier(Cheesed.MOD_ID, "mouse"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MouseEntity::new).dimensions(EntityDimensions.fixed(0.5F, 0.35F)).build());

    public static void registerEntities() {
        // Register Entity Attributes
        FabricDefaultAttributeRegistry.register(MOUSE, MouseEntity.createMouseAttributes());

        Cheesed.LOGGER.info("Initializing Entities for: " + Cheesed.MOD_ID);
    }
}
