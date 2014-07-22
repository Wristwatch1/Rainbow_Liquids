package com.wristwatch1_rainbowwater.potion;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionYourmod extends Potion 
{
	public PotionYourmod(int par1, boolean par2, int par3) 
	{
		super(par1, par2, par3);
		}
	public Potion setIconIndex(int par1, int par2)
	{
		super.setIconIndex(par1, par2);
		return this;
		}
	  private static final ResourceLocation field_110839_f = new ResourceLocation("wristwatch1_rainbowwater","/textures/icons/questionmark.png");
		
		@Override
		@SideOnly(Side.CLIENT)
		public boolean hasStatusIcon() 
		{
		    Minecraft.getMinecraft().renderEngine.bindTexture(field_110839_f);
		    return true;
		}
	}