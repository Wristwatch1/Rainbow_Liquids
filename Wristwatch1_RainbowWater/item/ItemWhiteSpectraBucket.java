package mods.Wristwatch1_RainbowWater.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.Wristwatch1_RainbowWater.rainbowwater;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;

public class ItemWhiteSpectraBucket extends ItemBucket
{
 public ItemWhiteSpectraBucket(int id) 
 {
  super(id, id);
  this.setCreativeTab(rainbowwater.tabLiquids);
  this.setContainerItem(Item.bucketEmpty);
 }
 public void registerIcons(IconRegister par1IconRegister)
 
 {

     this.itemIcon = par1IconRegister.registerIcon("Wristwatch1_RainbowWater:ItemWhiteSpectraBucket");

 }
 
}

 

