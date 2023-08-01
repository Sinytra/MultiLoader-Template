package com.example.examplemod.platform;

import com.example.examplemod.platform.services.IPlatformHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;

public class ForgePlatformHelper implements IPlatformHelper {
    @Override
    public String getPlatformName() {
        return "Forge";
    }
}