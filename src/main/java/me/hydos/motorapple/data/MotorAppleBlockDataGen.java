package me.hydos.motorapple.data;

import me.hydos.motorapple.level.block.MotorAppleBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;

public class MotorAppleBlockDataGen extends FabricModelProvider {

    public MotorAppleBlockDataGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generators) {
        generators.createTrivialCube(MotorAppleBlocks.BLACK_SLATE);
        generators.createTrivialCube(MotorAppleBlocks.BLACK_COBBLED_SLATE);
        generators.createTrivialCube(MotorAppleBlocks.BLACK_DEEP_SLATE);
    }

    @Override
    public void generateItemModels(ItemModelGenerators generators) {

    }
}
