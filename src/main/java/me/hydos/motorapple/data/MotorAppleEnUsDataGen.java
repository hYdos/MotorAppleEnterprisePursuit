package me.hydos.motorapple.data;

import me.hydos.motorapple.MotorApple;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class MotorAppleEnUsDataGen extends FabricLanguageProvider {

    protected MotorAppleEnUsDataGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        builder.add(MotorApple.id("item_group.motor_apple_enterprise_pursuit"), "Motor Apple Enterprise Pursuit");
    }
}
