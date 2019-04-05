package com.headfishindustries.claybutithaseveryoredictinthegame;

import net.minecraft.init.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid="claybutithaseveryoredictinthegame", name="claybutithaseveryoredictinthegame", version="1.0.0")
public class claybutithaseveryoredictinthegame {

	@SubscribeEvent
	public static void postInit(FMLPostInitializationEvent e) {
		for (String s : OreDictionary.getOreNames()) {
			OreDictionary.registerOre(s, Items.CLAY_BALL);
		}
	}

}
