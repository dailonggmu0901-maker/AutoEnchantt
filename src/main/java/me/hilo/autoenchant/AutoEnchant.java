package me.hilo.autoenchant;

import meteordevelopment.meteorclient.MeteorClient;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutoEnchant implements ClientModInitializer {

    public static final String MOD_ID = "autoenchant";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {

        LOG.info("=================================");
        LOG.info(" AutoEnchant Loaded!");
        LOG.info(" Minecraft 1.21.4");
        LOG.info("=================================");

        // Đăng ký command
        // CommandManager.register();

        // Khởi tạo scanner
        // BlockScanner.init();

        // Khởi tạo Baritone
        // BaritoneManager.init();

        // Khởi tạo EnchantManager
        // EnchantManager.init();

    }
}
