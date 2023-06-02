package me.hydos.motorapple.level.item;

import me.hydos.motorapple.MotorApple;
import me.hydos.motorapple.level.block.MotorAppleBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class MotorAppleCreativeTabs {

    public static void onInitialize() {
        register("motor_apple_enterprise_pursuit", () -> new ItemStack(MotorAppleBlocks.BLACK_COBBLED_SLATE), entries -> {
            entries.accept(new ItemStack(MotorAppleBlocks.BLACK_SLATE));
            entries.accept(new ItemStack(MotorAppleBlocks.BLACK_DEEP_SLATE));
            entries.accept(new ItemStack(MotorAppleBlocks.BLACK_COBBLED_SLATE));
            entries.accept(new ItemStack(MotorAppleBlocks.BLACK_COBBLE_SLATE));
            entries.accept(new ItemStack(MotorAppleBlocks.BLUE_SLATE));
            entries.accept(new ItemStack(MotorAppleBlocks.BLUE_DEEP_SLATE));
            entries.accept(new ItemStack(MotorAppleBlocks.BLUE_COBBLED_SLATE));
            entries.accept(new ItemStack(MotorAppleBlocks.BLUE_COBBLE_SLATE));
        });
    }

    public static void register(String name, Supplier<ItemStack> icon, ItemGroupEvents.ModifyEntries listener) {
        var id = MotorApple.id(name);
        var key = ResourceKey.create(Registries.CREATIVE_MODE_TAB, id);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, key.location(), FabricItemGroup.builder()
                .title(Component.translatable(id.getNamespace() + ".item_group." + id.getPath()))
                .icon(icon)
                .build());
        ItemGroupEvents.modifyEntriesEvent(key).register(listener);
    }
}
