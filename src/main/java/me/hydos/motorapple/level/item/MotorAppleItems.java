package me.hydos.motorapple.level.item;

import me.hydos.motorapple.MotorApple;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class MotorAppleItems {

    public static void onInitialize() {}

    public static Item register(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, MotorApple.id(name), item);
    }
}
