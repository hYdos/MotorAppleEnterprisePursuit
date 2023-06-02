package me.hydos.motorapple.data;

import me.hydos.motorapple.MotorApple;
import me.hydos.motorapple.level.block.MotorAppleBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import java.util.Optional;

public class MotorAppleBlockItemDataGen extends FabricModelProvider {
    public static final ModelTemplate FLOOR_BLOCK_MODEL = new ModelTemplate(Optional.empty(), Optional.empty(), TextureSlot.TEXTURE);

    public MotorAppleBlockItemDataGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generators) {
        generators.createTrivialCube(MotorAppleBlocks.BLACK_SLATE);
        generators.createTrivialCube(MotorAppleBlocks.BLACK_DEEP_SLATE);
        generators.createTrivialCube(MotorAppleBlocks.BLACK_COBBLED_SLATE);
        generateFloorRock(generators, MotorAppleBlocks.BLACK_COBBLE_SLATE, MotorAppleBlocks.BLACK_SLATE);
        generators.createTrivialCube(MotorAppleBlocks.BLUE_SLATE);
        generators.createTrivialCube(MotorAppleBlocks.BLUE_DEEP_SLATE);
        generators.createTrivialCube(MotorAppleBlocks.BLUE_COBBLED_SLATE);
        generateFloorRock(generators, MotorAppleBlocks.BLUE_COBBLE_SLATE, MotorAppleBlocks.BLUE_SLATE);
    }

    private void generateFloorRock(BlockModelGenerators generators, Block block, Block stoneBlock) {
        FLOOR_BLOCK_MODEL.create(block, TextureMapping.defaultTexture(stoneBlock), generators.modelOutput);
        generators.blockStateOutput.accept(MultiVariantGenerator.multiVariant(block,
                Variant.variant().with(VariantProperties.MODEL, MotorApple.id("block/floor_rock")),
                Variant.variant().with(VariantProperties.MODEL, MotorApple.id("block/floor_rock2")),
                Variant.variant().with(VariantProperties.MODEL, MotorApple.id("block/floor_rock3"))));
    }

    @Override
    public void generateItemModels(ItemModelGenerators generators) {
    }
}
