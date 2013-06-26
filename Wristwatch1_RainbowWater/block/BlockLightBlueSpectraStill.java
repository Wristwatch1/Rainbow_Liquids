package mods.Wristwatch1_RainbowWater.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.Wristwatch1_RainbowWater.rainbowwater;
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
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.liquids.ILiquid;

public class BlockLightBlueSpectraStill extends BlockStationary
{
	public BlockLightBlueSpectraStill(int id, Material par2Material) 
	{
		super(id, par2Material);
		this.setHardness(100F);		
		this.setLightOpacity(3);
		this.disableStats();
		}
		
	  @Override
	  
	    @SideOnly(Side.CLIENT)
	  
	    public void registerIcons(IconRegister iconRegister){
	        this.theIcon = new Icon[] {iconRegister.registerIcon("Wristwatch1_RainbowWater:BlockLightBlueSpectraStill"), iconRegister.registerIcon("Wristwatch1_RainbowWater:BlockLightBlueSpectraFlowing")};
	    }
	

		public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
		{
			if (entity instanceof EntityLiving) 
			{         
				((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(),1200, 1));
				}  
			{
			
			}
		}
	} 
