package com.wristwatch1_rainbowwater;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxyRainbowWater implements IGuiHandler
{
	public void registerRenderThings()
    {
        
    }

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, //Gets the server GUI Element
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, //Gets the client GUI Element
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

}
