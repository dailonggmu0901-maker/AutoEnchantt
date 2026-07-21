package me.hilo.autoenchant;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutoEnchant implements ClientModInitializer {

    public static final String MOD_ID = "autoenchant";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("==============================");
        LOGGER.info(" AutoEnchant Loaded!");
        LOGGER.info("==============================");
    }
}
