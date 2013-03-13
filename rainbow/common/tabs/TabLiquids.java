package wristwatch1.rainbow.common.tabs;

import wristwatch1.rainbow.common.rainbowwater;
import wristwatch1.rainbow.common.block.BlockWhiteSpectraStill;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class TabLiquids extends CreativeTabs{
public TabLiquids (int position, String tabID){
super (position, tabID);
}
@SideOnly(Side.CLIENT)
public int getTabIconBlockIndex() 
{
return wristwatch1.rainbow.common.rainbowwater.WhiteSpectraStill.blockID;
}
public String getTranslatedTabLabel()
{
return "Liquids"; 
}
}
