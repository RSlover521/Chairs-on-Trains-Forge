package com.rslover521.chairsontrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("chairsmod")
public class ChairsOnTrains {
	public static final String MODID = "chairsontrains";
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	
    public ChairsOnTrains() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(FMLCommonSetupEvent event) {
        SeatBehaviorHandler.registerSeatBehaviors();
    }
}