package me.hydos.motorapple.level.block;

import me.hydos.motorapple.MotorApple;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MotorAppleBlocks {
    public static final BlockBehaviour.Properties ROCK_SETTINGS = FabricBlockSettings.create().hardness(2);
    public static final BlockBehaviour.Properties COBBLE_SETTINGS = FabricBlockSettings.create().hardness(2);

    public static final Block BLACK_SLATE = register("black_slate", new Block(ROCK_SETTINGS));
    public static final Block BLACK_DEEP_SLATE = register("black_deep_slate", new Block(ROCK_SETTINGS));
    public static final Block BLACK_COBBLED_SLATE = register("black_cobbled_slate", new Block(ROCK_SETTINGS));
    public static final FloorRockBlock BLACK_COBBLE_SLATE = register("black_cobble_slate", new FloorRockBlock(ROCK_SETTINGS));
    public static final Block BLUE_SLATE = register("blue_slate", new Block(ROCK_SETTINGS));
    public static final Block BLUE_DEEP_SLATE = register("blue_deep_slate", new Block(ROCK_SETTINGS));
    public static final Block BLUE_COBBLED_SLATE = register("blue_cobbled_slate", new Block(ROCK_SETTINGS));
    public static final FloorRockBlock BLUE_COBBLE_SLATE = register("blue_cobble_slate", new FloorRockBlock(ROCK_SETTINGS));

    public static void onInitialize() {}

    public static <T extends Block> T register(String name, T block) {
        var registeredBlock = Registry.register(BuiltInRegistries.BLOCK, MotorApple.id(name), block);
        Registry.register(BuiltInRegistries.ITEM, MotorApple.id(name), new BlockItem(registeredBlock, new Item.Properties()));
        return registeredBlock;
    }
}
