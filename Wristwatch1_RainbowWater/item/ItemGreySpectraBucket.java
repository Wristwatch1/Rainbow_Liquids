package mods.Wristwatch1_RainbowWater.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.Wristwatch1_RainbowWater.rainbowwater;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGreySpectraBucket extends ItemBucket
{
 public ItemGreySpectraBucket(int id, int liquidID) 
 {
  super(id, liquidID);
  this.setCreativeTab(rainbowwater.tabLiquids);
  this.setContainerItem(Item.bucketEmpty);
 }
 public void registerIcons(IconRegister par1IconRegister)
 
 {

     this.itemIcon = par1IconRegister.registerIcon("Wristwatch1_RainbowWater:ItemGreySpectraBucket");

 }
 
 public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
 {
	 par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Item.glassBottle,3));
 }

}

 

