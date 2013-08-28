package assets.wristwatch1_rainbowwater;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxyRainbowWater extends CommonProxyRainbowWater
 {
  @Override
     public void registerRenderThings()
     {
	//  MinecraftForgeClient.preloadTexture("/rainbowater.png"); 
    }
 }

//This doesn't currently have a use, but is still a required file