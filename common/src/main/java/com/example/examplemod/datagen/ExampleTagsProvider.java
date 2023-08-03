package com.example.examplemod.datagen;

import com.example.examplemod.Constants;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ExampleTagsProvider extends FabricTagProvider.ItemTagProvider {
    private static final TagKey<Item> FRUIT = TagKey.create(Registries.ITEM, new ResourceLocation(Constants.MOD_ID, "fruit"));

    public ExampleTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(FRUIT).add(Items.APPLE, Items.SWEET_BERRIES);
    }
}
