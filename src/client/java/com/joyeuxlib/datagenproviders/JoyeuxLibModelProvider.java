package com.joyeuxlib.datagenproviders;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class JoyeuxLibModelProvider extends FabricModelProvider {
    public JoyeuxLibModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
