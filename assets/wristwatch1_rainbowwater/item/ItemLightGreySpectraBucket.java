package assets.wristwatch1_rainbowwater.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import assets.wristwatch1_rainbowwater.rainbowwater;

public class ItemLightGreySpectraBucket extends ItemBucket
	{
	 public ItemLightGreySpectraBucket(int id, int liquidID) 
	 {
	  super(id, liquidID);
	  this.setCreativeTab(rainbowwater.tabFluids); //Sets creative tab
	  this.setContainerItem(Item.bucketEmpty); //Sets container item
	 }
	 public void registerIcons(IconRegister par1IconRegister)
	 
	 {

	     this.itemIcon = par1IconRegister.registerIcon("wristwatch1_rainbowwater:ItemLightGreySpectraBucket");//registers the texture.

	 }
	 
	 public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	 {
		 par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Item.glassBottle,3));//makes 3 glass bottle appear in inventory when crafted
	 }

	}

