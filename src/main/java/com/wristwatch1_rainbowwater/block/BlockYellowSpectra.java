package com.wristwatch1_rainbowwater.block;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.wristwatch1_rainbowwater.rainbowwater;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class BlockYellowSpectra extends BlockFluidClassic 
{
	
	 @SideOnly(Side.CLIENT)
	    protected IIcon stillIcon;
	    @SideOnly(Side.CLIENT)
	    protected IIcon flowingIcon;
	  
	    
	    public BlockYellowSpectra(Fluid fluid, Material material) {
	            super(fluid, material);
	            setBlockName("YellowSpectra");
	            setLightLevel(1.0f);
	            try {
	              coloredlightscore.src.api.CLApi.setBlockColorRGB(this, 15, 15, 0);
	            } catch (Throwable e) {
	              FMLLog.info("The ColoredLightCore is not installed, or it didn't load properly");
	            }
	            //setCreativeTab(rainbowwater.tabFluids);
	    }
	    
	    @Override
	    public IIcon getIcon(int side, int meta) {
	            return (side == 0 || side == 1)? stillIcon : flowingIcon;
	    }
	    
	    @SideOnly(Side.CLIENT)
	    @Override
	    public void registerBlockIcons(IIconRegister iconregister) {
	            this.stillIcon = iconregister.registerIcon("wristwatch1_rainbowwater:BlockYellowSpectraStill");
	            this.flowingIcon = iconregister.registerIcon("wristwatch1_rainbowwater:BlockYellowSpectraFlowing");
	    }
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

		// Use Register Icon as usual to get the block's icon.
		// If you want you can reuse the water texture and change the color of it by doing as I have below:
		/*@Override
		@SideOnly(Side.CLIENT)
		public IIcon getIcon(int side, int meta) 
		{
			return Blocks.water.getIcon(side, meta);
			}
		@Override
		public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z)
		{
			return 0x66FF00; // HEX color code as indicated by the 0x in front. This is a greenish color.
			} */

	@Override
	@SideOnly(Side.CLIENT)
	public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)//when an entity steps into the liquid
	{
		if (entity instanceof EntityPlayer) 
		{         
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.invisibility.getId(),1200, 1));//allows the potion affect to effect players
			}  
		if (entity instanceof EntityLiving) 
		{         
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.invisibility.getId(),1200, 1));//allows the potion affect to effect mobs
			}  
	}
	
}
