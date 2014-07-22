package com.wristwatch1_rainbowwater.item;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.wristwatch1_rainbowwater.rainbowwater;

public class ItemBrownSpectraBucket extends ItemBucket
	{
	 public ItemBrownSpectraBucket(Block block) 
	 {
	  super(block);
	  this.setCreativeTab(rainbowwater.tabFluids); //Sets creative tab
	  this.setContainerItem(Items.bucket); //Sets container item
	 }
	 public void registerIcons(IIconRegister par1IconRegister)
	 
	 {

	     this.itemIcon = par1IconRegister.registerIcon("wristwatch1_rainbowwater:ItemBrownSpectraBucket");//registers the texture.

	 }
	 
	 public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	 {
		 par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Items.glass_bottle,3));//makes 3 glass bottle appear in inventory when crafted
	 }

	}

