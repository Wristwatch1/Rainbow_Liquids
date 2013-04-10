package wristwatch1.rainbow.common.block;

import java.util.Random;

import wristwatch1.rainbow.common.rainbowwater;

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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.liquids.ILiquid;

public class BlockWhiteSpectraFlowing extends BlockFlowing
{

	public BlockWhiteSpectraFlowing(int id, Material par2Material)
	  {
	   super(id, par2Material);
	   this.setHardness(100F);		
	   this.setLightOpacity(3);
	  }

public void registerIcons(IconRegister par1IconRegister)

{

    this.blockIcon = par1IconRegister.registerIcon( rainbowwater.modid + ":"
    + this.getUnlocalizedName2());

}

}

