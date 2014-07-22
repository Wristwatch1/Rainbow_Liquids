package com.wristwatch1_rainbowwater.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;
import com.wristwatch1_rainbowwater.rainbowwater;

public class ItemProtoSpectraBucket extends ItemBucket
	{
	 public ItemProtoSpectraBucket(Block block) 
	 {
	  super(block);
	  //this.setCreativeTab(rainbowwater.tabFluids);
	  this.setContainerItem(Items.bucket);
	 }
	  
	 @Override
	 @SideOnly(Side.CLIENT)
	 public EnumRarity getRarity(ItemStack par1ItemStack){
	 	return EnumRarity.epic;
	 }

	 
		 @Override
		 public boolean hasEffect(ItemStack par1ItemStack){
		 	return true;
		 
	 }

@Override
public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
par3List.add("WHAT IS THIS?");
}

 
		 
	public void registerIcons(IIconRegister par1IconRegister)
	 
	 {

	     this.itemIcon = par1IconRegister.registerIcon("wristwatch1_rainbowwater:ItemGreenSpectraBucket");

	 }
	 
	/* public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	 {
		 par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Items.glass_bottle,3));
	 }
*/
	}

