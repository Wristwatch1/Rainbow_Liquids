package assets.wristwatch1_rainbowwater.buckethandlers;

import assets.wristwatch1_rainbowwater.rainbowwater;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class RedSpectraBucketHandler 
{
	@ForgeSubscribe(priority = EventPriority.NORMAL)
	public void onBucketFill(FillBucketEvent event) //when a bucket is clicked on a liquid
	{
		ItemStack result = attemptFill(event.world, event.target);
		if (result != null) 
		{
			event.result = result;
			event.setResult(Result.ALLOW);
			}
		}
	public ItemStack attemptFill( World world, MovingObjectPosition p )
	{
		int id = world.getBlockId( p.blockX, p.blockY, p.blockZ );
		if ( id == rainbowwater.BlockRedSpectra.blockID ) //if the liquid is this liquid
		{
			if ( world.getBlockMetadata( p.blockX, p.blockY, p.blockZ ) == 0 ) // Check that it is a source block
				{
				world.setBlock( p.blockX, p.blockY, p.blockZ, 0 ); // Remove the fluid block
				return new ItemStack( rainbowwater.RedSpectraBucket ); // Return the filled bucked item here.
				}
		}
		return null;
		

	}
}

