package com.wristwatch1_rainbowwater.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.wristwatch1_rainbowwater.rainbowwater;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;


public class BlockProtoSpectra extends BlockFluidClassic {

    @SideOnly(Side.CLIENT)
    protected IIcon stillIcon;
    @SideOnly(Side.CLIENT)
    protected IIcon flowingIcon;
  
    
    public BlockProtoSpectra(Fluid fluid, Material material) {
            super(fluid, material);
            setBlockName("ProtoSpectra");
            //setCreativeTab(rainbowwater.tabFluids);
    }
    /*
    @Override
    public IIcon getIcon(int side, int meta) {
            return (side == 0 || side == 1)? stillIcon : flowingIcon;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister iconregister) {
            this.stillIcon = iconregister.registerIcon("wristwatch1_rainbowwater:BlockWhiteSpectraStill");
            this.flowingIcon = iconregister.registerIcon("wristwatch1_rainbowwater:BlockWhiteSpectraFlowing");
    }*/
    @Override
	public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
		if (world.getBlock(x, y, z).getMaterial().isLiquid())
			return false;
		return super.canDisplace(world, x, y, z);
	}


	@Override
	public boolean displaceIfPossible(World world, int x, int y, int z) {
		if (world.getBlock(x, y, z).getMaterial().isLiquid())
			return false;
		return super.displaceIfPossible(world, x, y, z);
	}

//public class BlockProtoSpectra extends BlockFluidClassic 
//{
	//public BlockProtoSpectra() 
	//{
		//super(rainbowwater.ProtoSpectra, Material.water);
		//this.setCreativeTab(rainbowwater.tabFluids);
		// rainbowwater.ProtoSpectra.setBlockID(2382); // Set the fluids block ID to this block.
		
		//}
	// Use Register Icon as usual to get the block's icon.
	// If you want you can reuse the water texture and change the color of it by doing as I have below:
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) 
	{
		return Blocks.water.getIcon(side, meta);
		}
	@Override
	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z)
	{
		return 0x66FF00; // HEX color code as indicated by the 0x in front. This is a greenish color.
		} 

	@Override
	@SideOnly(Side.CLIENT)
	public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)//when an entity steps into the liquid
	{
		if (entity instanceof EntityPlayer) 
		{         
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(rainbowwater.CustomPotion.getId(),600, 0));//allows the potion affect to effect players
			}  
		if (entity instanceof EntityLiving) 
		{         
			((EntityLiving) entity).addPotionEffect(new PotionEffect(rainbowwater.CustomPotion.getId(),600, 0));//allows the potion affect to effect mobs
			}  
	}
	//@Override
	//public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
		//if (world.getBlockMaterial(x,  y,  z).isLiquid()) return false;
		//return super.canDisplace(world, x, y, z);
	//}
	
	//@Override
	//public boolean displaceIfPossible(World world, int x, int y, int z) {
		//if (world.getBlockMaterial(x,  y,  z).isLiquid()) return false;
		//return super.displaceIfPossible(world, x, y, z);
	//}
}





