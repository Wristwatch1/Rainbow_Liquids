package wristwatch1.rainbow.common;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxyRainbowWater extends CommonProxyRainbowWater
 {
  @Override
     public void registerRenderThings()
     {
	  MinecraftForgeClient.preloadTexture("/rainbowater.png"); 
    }
 }