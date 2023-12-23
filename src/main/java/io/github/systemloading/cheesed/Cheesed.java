package io.github.systemloading.cheesed;

import io.github.systemloading.cheesed.registry.ModEntities;
import io.github.systemloading.cheesed.registry.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cheesed implements ModInitializer {
	public static final String MOD_ID = "cheesed";
    public static final Logger LOGGER = LoggerFactory.getLogger(Cheesed.MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Mod: " + Cheesed.MOD_ID);

		//Registries
		ModItems.registerItems();
		ModEntities.registerEntities();
	}
}