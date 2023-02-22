package com.starfish_studios.another_furniture.fabric;

import com.starfish_studios.another_furniture.AnotherFurniture;
import com.starfish_studios.another_furniture.registry.AFBlocks;
import net.fabricmc.api.ModInitializer;

public class AnotherFurnitureFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AnotherFurniture.init();
        AFBlocks.registerFlammables();
    }

}