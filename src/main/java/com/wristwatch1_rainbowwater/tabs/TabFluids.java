package com.wristwatch1_rainbowwater.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class TabFluids extends CreativeTabs
{
	public TabFluids (int position, String tabID)
	{
		super (position, tabID);
	}
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() 
	{
	    return new ItemStack(Items.milk_bucket, 1, 0); //sets the block/item used to define the tab in the creative menu
	}
	public String getTranslatedTabLabel()
	{
		return "Liquids"; //sets the name of the tab
	}
	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return null;
	}
}
