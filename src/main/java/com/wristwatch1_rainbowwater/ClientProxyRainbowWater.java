package com.wristwatch1_rainbowwater;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class ClientProxyRainbowWater extends CommonProxyRainbowWater
 {
  @Override
     public void registerRenderThings()
     {
	  LanguageRegistry.instance().addStringLocalization("potion.customPotion", "Embezzlement?");
	//  MinecraftForgeClient.preloadTexture("/rainbowater.png"); 
    }
 }

//This doesn't currently have a use, but is still a required file