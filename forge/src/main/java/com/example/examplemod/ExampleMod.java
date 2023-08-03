package com.example.examplemod;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLLoader;

@Mod(Constants.MOD_ID)
public class ExampleMod {

    public ExampleMod() {
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.

        // Use Forge to bootstrap the Common mod.
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();
        if (FMLLoader.getDist().isClient()) {
            CommonClientClass.init();
        }
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(ExampleMod::onGatherData);
    }

    private static void onGatherData(GatherDataEvent event) {
        FabricDataGenerator fabricDataGenerator = FabricDataGenerator.create(Constants.MOD_ID, event);
        CommonClass.runDatagen(fabricDataGenerator);
    }
}