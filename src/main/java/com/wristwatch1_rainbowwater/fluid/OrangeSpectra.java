package com.wristwatch1_rainbowwater.fluid;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;


public class OrangeSpectra extends Fluid 
{
	public OrangeSpectra() 
	{
		super("OrangeSpectra");
		setDensity(10); // How tick the fluid is, affects movement inside the liquid.
		setViscosity(1000); // How fast the fluid flows.
		setUnlocalizedName("OrangeSpectra");
		FluidRegistry.registerFluid(this); // Registering inside it self, keeps things neat :)
		}
	
}