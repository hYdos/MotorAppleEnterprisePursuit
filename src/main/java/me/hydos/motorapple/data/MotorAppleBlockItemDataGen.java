package me.hydos.motorapple.data;

import me.hydos.motorapple.MotorApple;
import me.hydos.motorapple.level.block.MotorAppleBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.core.registries.BuiltInRegistries;
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
    public static final ModelTemplate FLOOR_BLOCK_MODEL1 = new ModelTemplate(Optional.of(MotorApple.id("block/floor_rock")), Optional.empty(), TextureSlot.TEXTURE);
    public static final ModelTemplate FLOOR_BLOCK_MODEL2 = new ModelTemplate(Optional.of(MotorApple.id("block/floor_rock2")), Optional.of("2"), TextureSlot.TEXTURE);
    public static final ModelTemplate FLOOR_BLOCK_MODEL3 = new ModelTemplate(Optional.of(MotorApple.id("block/floor_rock3")), Optional.of("3"), TextureSlot.TEXTURE);

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
        FLOOR_BLOCK_MODEL1.create(block, TextureMapping.defaultTexture(stoneBlock), generators.modelOutput);
        FLOOR_BLOCK_MODEL2.create(block, TextureMapping.defaultTexture(stoneBlock), generators.modelOutput);
        FLOOR_BLOCK_MODEL3.create(block, TextureMapping.defaultTexture(stoneBlock), generators.modelOutput);
        var blockName = BuiltInRegistries.BLOCK.getKey(block).getPath();
        generators.blockStateOutput.accept(MultiVariantGenerator.multiVariant(block,
                Variant.variant().with(VariantProperties.MODEL, MotorApple.id("block/" + blockName)),
                Variant.variant().with(VariantProperties.MODEL, MotorApple.id("block/" + blockName + "2")),
                Variant.variant().with(VariantProperties.MODEL, MotorApple.id("block/" + blockName + "3"))));
    }

    @Override
    public void generateItemModels(ItemModelGenerators generators) {
    }
}
