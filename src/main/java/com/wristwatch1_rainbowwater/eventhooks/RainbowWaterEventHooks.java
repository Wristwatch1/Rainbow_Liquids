package com.wristwatch1_rainbowwater.eventhooks;

import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

import com.wristwatch1_rainbowwater.rainbowwater;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class RainbowWaterEventHooks 
{
	@SubscribeEvent
	public void onEntityUpdate(LivingUpdateEvent event) 
	{
		if (event.entityLiving.isPotionActive(rainbowwater.CustomPotion)) 
		{
			if (event.entityLiving.worldObj.rand.nextInt(20) == 0) 
			{
				//event.entityLiving.attackEntityFrom(DamageSource.generic, 2);
				}
			}
		
	/*if (event.entityLiving.getActivePotionEffect(rainbowwater.CustomPotion).getDuration()==0)
	{
		event.entityLiving.removePotionEffect(rainbowwater.CustomPotion.id);
		return;
		}*/
}
}