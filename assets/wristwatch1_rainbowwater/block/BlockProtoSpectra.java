package assets.wristwatch1_rainbowwater.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import assets.wristwatch1_rainbowwater.rainbowwater;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

public class BlockProtoSpectra extends BlockFluidClassic 
{
	public BlockProtoSpectra(int Id) 
	{
		super(Id, rainbowwater.ProtoSpectra, Material.water);
		rainbowwater.ProtoSpectra.setBlockID(2382); // Set the fluids block ID to this block.
		
		}
	// Use Register Icon as usual to get the block's icon.
	// If you want you can reuse the water texture and change the color of it by doing as I have below:
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) 
	{
		return Block.waterMoving.getIcon(side, meta);
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
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.weakness.getId(),1200, 1));//allows the potion affect to effect players
			}  
		if (entity instanceof EntityLiving) 
		{         
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.weakness.getId(),1200, 1));//allows the potion affect to effect mobs
			}  
	}
}


