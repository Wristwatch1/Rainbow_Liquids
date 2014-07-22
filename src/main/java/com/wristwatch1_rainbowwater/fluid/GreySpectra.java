package com.wristwatch1_rainbowwater.fluid;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;


public class GreySpectra extends Fluid 
{
	public GreySpectra() 
	{
		super("GreySpectra");
		setDensity(10); // How tick the fluid is, affects movement inside the liquid.
		setViscosity(1000); // How fast the fluid flows.
		setUnlocalizedName("GreySpectra");
		FluidRegistry.registerFluid(this); // Registering inside it self, keeps things neat :)
		}
	
}