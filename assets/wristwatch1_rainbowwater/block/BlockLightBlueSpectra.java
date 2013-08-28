package assets.wristwatch1_rainbowwater.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import assets.wristwatch1_rainbowwater.rainbowwater;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.FluidRegistry;

public class BlockLightBlueSpectra extends BlockFluidClassic 
{
	
	public BlockLightBlueSpectra(int Id) 
	{
		super(Id, rainbowwater.LightBlueSpectra, Material.water);
		rainbowwater.LightBlueSpectra.setBlockID(2362); // Sets the fluids block ID to this block.

		}
	@SideOnly(Side.CLIENT)
	protected Icon[] theIcon;
	
	@Override
	public Icon getIcon(int side, int meta) {
		return side != 0 && side != 1 ? this.theIcon[1] : this.theIcon[0];
	}



	// Use Register Icon as usual to get the block's icon.
	// If you want you can reuse the water texture and change the color of it by doing as I have below:
	@Override
	@SideOnly(Side.CLIENT)
	//public Icon getIcon(int side, int meta) 
	//{
		//return Block.waterMoving.getIcon(side, meta);
		//}
	//@Override
	//public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z)
	//{
		//return 0xFFFFFF; // HEX color code as indicated by the 0x in front. This is a greenish color.
		//}
	
	  
	    public void registerIcons(IconRegister iconRegister){
	        this.theIcon = new Icon[] {iconRegister.registerIcon("wristwatch1_rainbowwater:BlockLightBlueSpectraStill"), iconRegister.registerIcon("wristwatch1_rainbowwater:BlockLightBlueSpectraFlowing")
	        		};
	        }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)//when an entity steps into the liquid
	{
		if (entity instanceof EntityPlayer) 
		{         
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(),1200, 1));//allows the potion affect to effect players
			}  
		if (entity instanceof EntityLiving) 
		{         
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(),1200, 1));//allows the potion affect to effect mobs
			}  
	}
}
