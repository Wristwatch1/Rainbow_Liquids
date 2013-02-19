package wristwatch1.rainbow.common;

import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.liquids.ILiquid;

public class BlockWhiteSpectraStill extends BlockStationary
{
	protected BlockWhiteSpectraStill(int id) {
		super(id, Material.water);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setHardness(100F);
		this.setLightOpacity(3);
		this.disableStats();
		this.setRequiresSelfNotify();
	}
       public String getTextureFile()
	  {
	          return "/rainbowwater.png";
	  }
}