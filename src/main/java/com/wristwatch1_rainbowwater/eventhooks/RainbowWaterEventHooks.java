package com.wristwatch1_rainbowwater.eventhooks;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import com.wristwatch1_rainbowwater.rainbowwater;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

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