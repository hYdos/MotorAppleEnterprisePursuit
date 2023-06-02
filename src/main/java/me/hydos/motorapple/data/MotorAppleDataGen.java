package me.hydos.motorapple.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MotorAppleDataGen implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        var builtin = generator.createPack();
        builtin.addProvider(MotorAppleBlockItemDataGen::new);
        builtin.addProvider(MotorAppleEnUsDataGen::new);
    }
}
