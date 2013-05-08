package mods.Wristwatch1_RainbowWater.tabs;

import mods.Wristwatch1_RainbowWater.rainbowwater;
import mods.Wristwatch1_RainbowWater.block.BlockWhiteSpectraStill;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class TabLiquids extends CreativeTabs{
public TabLiquids (int position, String tabID){
super (position, tabID);
}
@SideOnly(Side.CLIENT)
public ItemStack getIconItemStack() {
    return new ItemStack(Item.bucketMilk, 1, 0);
}
public String getTranslatedTabLabel()
{
return "Liquids"; 
}
}
