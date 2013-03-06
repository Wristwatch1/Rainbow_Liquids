package wristwatch1.rainbow.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.BlockFluid;
import net.minecraft.block.material.Material;
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

	protected BlockWhiteSpectraFlowing(int id)
	  {
	   super(id, Material.water);
	   this.setHardness(100F);		
	   this.setLightOpacity(3);
	  }
	public String getTextureFile()
  {
          return "/rainbowwater.png";
  }
}
		