package me.hydos.motorapple;

import me.hydos.motorapple.level.block.MotorAppleBlocks;
import me.hydos.motorapple.level.item.MotorAppleCreativeTabs;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

public class MotorApple implements ModInitializer {
    public static final String MOD_ID = "motor_apple";

    @Override
    public void onInitialize() {
        MotorAppleBlocks.onInitialize();
        MotorAppleCreativeTabs.onInitialize();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
