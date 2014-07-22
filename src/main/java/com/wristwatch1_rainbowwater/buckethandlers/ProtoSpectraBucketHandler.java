package com.wristwatch1_rainbowwater.buckethandlers;

import java.util.HashMap;
import java.util.Map;

import com.wristwatch1_rainbowwater.rainbowwater;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ProtoSpectraBucketHandler {

    public static ProtoSpectraBucketHandler INSTANCE = new ProtoSpectraBucketHandler();
    public Map<Block, Item> buckets = new HashMap<Block, Item>();

    public ProtoSpectraBucketHandler() {
    }

    @SubscribeEvent
    public void onBucketFill(FillBucketEvent event) {

            ItemStack result = fillCustomBucket(event.world, event.target);

            if (result == null)
                    return;

            event.result = result;
            event.setResult(Result.ALLOW);
    }

    private ItemStack fillCustomBucket(World world, MovingObjectPosition pos) {

            Block block = world.getBlock(pos.blockX, pos.blockY, pos.blockZ);

            Item bucket = buckets.get(block);
            if (bucket != null && world.getBlockMetadata(pos.blockX, pos.blockY, pos.blockZ) == 0) {
                    world.setBlockToAir(pos.blockX, pos.blockY, pos.blockZ);
                    
                    return new ItemStack(rainbowwater.ProtoSpectraBucket);
            } else
                    return null;

    }
}

//public class ProtoSpectraBucketHandler
//{
	//public static ProtoSpectraBucketHandler INSTANCE = new ProtoSpectraBucketHandler();
 //@SubscribeEvent(priority=EventPriority.NORMAL)
  //public void onBucketFill(FillBucketEvent event)
  //{
    //ItemStack result = attemptFill(event.world, event.target);
    //if (result != null)
    //{
     // event.result = result;
      //event.setResult(Result.ALLOW);
    //}
 // }


//public ItemStack attemptFill(World world, MovingObjectPosition p) 
 //{
   // Block id = world.getBlock(p.blockX, p.blockY, p.blockZ);
   //if (id == rainbowwater.BlockProtoSpectra)
   // {
     // if (world.getBlockMetadata(p.blockX, p.blockY, p.blockZ) == 0)
      //{
       // world.setBlockToAir(p.blockX, p.blockY, p.blockZ);
       // return new ItemStack(rainbowwater.ProtoSpectraBucket);
      //}
    //}
   // return null;
  //}
//}
