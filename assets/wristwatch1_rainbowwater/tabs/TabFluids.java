package assets.wristwatch1_rainbowwater.tabs;

import assets.wristwatch1_rainbowwater.rainbowwater;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class TabFluids extends CreativeTabs{
public TabFluids (int position, String tabID){
super (position, tabID);
}
@SideOnly(Side.CLIENT)
public ItemStack getIconItemStack() {
    return new ItemStack(Item.bucketMilk, 1, 0); //sets the block/item used to define the tab in the creative menu
}
public String getTranslatedTabLabel()
{
return "Liquids"; //sets the name of the tab
}
}