package com.wristwatch1_rainbowwater.fluid;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;


public class WhiteSpectra extends Fluid 
{
	public WhiteSpectra() 
	{
		super("WhiteSpectra");
		setDensity(10); // How tick the fluid is, affects movement inside the liquid.
		setViscosity(1000); // How fast the fluid flows.
		setUnlocalizedName("WhiteSpectra");
		FluidRegistry.registerFluid(this); // Registering inside it self, keeps things neat :)
		}
	
}