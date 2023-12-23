package io.github.systemloading.cheesed.registry;

import io.github.systemloading.cheesed.Cheesed;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {
    // Items
    public static final Item CHEESE_WHEEL =
            registerItem("cheese_wheel", new Item(new Item.Settings()
                    .maxCount(1)));

    public static final Item CHEESE =
            registerItem("cheese", new Item(new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4F).build())
                    .maxCount(16)));

    public static final Item MOUSE_SPAWN_EGG =
            registerItem("mouse_spawn_egg", new SpawnEggItem(ModEntities.MOUSE, 7630440, 13858162, new Item.Settings()));


    // Item Group
    private static final ItemGroup CHEESED_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(CHEESE_WHEEL))
            .displayName(Text.translatable("itemGroup.cheesed"))
            .entries((displayContext, entries) -> {
                entries.add(CHEESE_WHEEL);
                entries.add(CHEESE);
                entries.add(MOUSE_SPAWN_EGG);
            })
            .build();


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Cheesed.MOD_ID, name), item);
    }

    public static void registerItems() {
        // Register the Item Group
        Registry.register(Registries.ITEM_GROUP, new Identifier(Cheesed.MOD_ID, "cheesed_group"), CHEESED_GROUP);

        Cheesed.LOGGER.info("Initializing Items for: " + Cheesed.MOD_ID);
    }
}
