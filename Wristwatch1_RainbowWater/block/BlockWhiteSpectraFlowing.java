package mods.Wristwatch1_RainbowWater.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mods.Wristwatch1_RainbowWater.rainbowwater;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.BlockFluid;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.liquids.ILiquid;

public class BlockWhiteSpectraFlowing extends BlockFlowing implements ILiquid
{

	public BlockWhiteSpectraFlowing(int id, Material par2Material)
	  {
	   super(id, par2Material);
	   this.setHardness(100F);		
	   this.setLightOpacity(3);
	  }

	 @Override
	  
	    @SideOnly(Side.CLIENT)
	  
	    public void registerIcons(IconRegister iconRegister){
	        this.theIcon = new Icon[] {iconRegister.registerIcon("Wristwatch1_RainbowWater:BlockWhiteSpectraStill"), iconRegister.registerIcon("Wristwatch1_RainbowWater:BlockWhiteSpectraFlowing")};
	    }

	@Override
	public int stillLiquidId() {
		// TODO Auto-generated method stub
		return mods.Wristwatch1_RainbowWater.rainbowwater.WhiteSpectraID;
	}

	@Override
	public boolean isMetaSensitive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int stillLiquidMeta() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override	
	public boolean isBlockReplaceable(World world, int i, int j, int k) {	
	
		return true;
	}
}



