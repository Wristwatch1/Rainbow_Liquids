package wristwatch1.rainbow.common.block;

import wristwatch1.rainbow.common.rainbowwater;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.liquids.ILiquid;

public class BlockWhiteSpectraStill extends BlockStationary
{
	public BlockWhiteSpectraStill(int id, Material par2Material) 
	{
		super(id, par2Material);
		this.setCreativeTab(rainbowwater.tabLiquids);
		this.setHardness(100F);
		this.setLightOpacity(3);
		this.disableStats();
		}
		
	public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
	{
		if (entity instanceof EntityLiving) 
		{         
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.heal.getId(),2 * 20, 0));
			}  
		{
		
		}
	}
	   public void registerIcons(IconRegister par1IconRegister)
	   
	    {
	 
	        this.blockIcon = par1IconRegister.registerIcon( rainbowwater.modid + ":"
	        + this.getUnlocalizedName2());
	 
	    }
	 
	} 
