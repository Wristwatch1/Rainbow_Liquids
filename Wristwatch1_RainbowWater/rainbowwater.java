package mods.Wristwatch1_RainbowWater;

import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import mods.Wristwatch1_RainbowWater.block.BlockGreySpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockGreySpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockLightBlueSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockLightBlueSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockLimeGreenSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockLimeGreenSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockMagentaSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockMagentaSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockOrangeSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockOrangeSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockPinkSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockPinkSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockWhiteSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockWhiteSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockYellowSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockYellowSpectraStill;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mods.Wristwatch1_RainbowWater.block.BlockWhiteSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockWhiteSpectraFlowing;
import mods.Wristwatch1_RainbowWater.item.ItemWhiteSpectraBucket;
import mods.Wristwatch1_RainbowWater.tabs.TabLiquids;

@Mod( modid = rainbowwater.modid, name = "Rainbow Water", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class rainbowwater

{
	public static final String modid = "Wristwatch1_RainbowWater";
	
	@Instance ("Wristwatch1_RainbowWater")
	public static rainbowwater instance;
	
	@SidedProxy (clientSide = "mods.Wristwatch1_RainbowWater.ClientProxyRainbowWater", serverSide = "mod.Wristwatch1_RainbowWater.CommonProxyRainbowWater")
	public static CommonProxyRainbowWater proxy;

	//Blocks
	
	//Liquids
	
	public static Block WhiteSpectraStill;
	
	public static Block WhiteSpectraFlowing;
	
	public static Block OrangeSpectraStill;
	
	public static Block OrangeSpectraFlowing;
	
	public static Block MagentaSpectraStill;
	
	public static Block MagentaSpectraFlowing;
	
	public static Block LightBlueSpectraStill;
	
	public static Block LightBlueSpectraFlowing;
	
	public static Block YellowSpectraStill;
	
	public static Block YellowSpectraFlowing;
	
	public static Block LimeGreenSpectraStill;
	
	public static Block LimeGreenSpectraFlowing;
	
	public static Block PinkSpectraStill;
	
	public static Block PinkSpectraFlowing;
	
	public static Block GreySpectraStill;
	
	public static Block GreySpectraFlowing;
	
	//Liquid id's
	
	public static int WhiteSpectraID;
	
	public static int OrangeSpectraID;
	
	public static int MagentaSpectraID;
	
	public static int LightBlueSpectraID;
	
	public static int YellowSpectraID;
	
	public static int LimeGreenSpectraID;
	
	public static int PinkSpectraID;
	
	public static int GreySpectraID;
	
	//BlockIDs
	
	//Items
	
	//public static Item WhiteSpectraBucket;
	
	//Armour
	
	//ItemIDs
	
	//CreativeTabs
	
	public static CreativeTabs tabLiquids = new TabLiquids(CreativeTabs.getNextID(),"Wristwatch1TabLiquids"); 
	 
	@PreInit public void preInit(FMLPreInitializationEvent evt) {
		
		proxy.registerRenderThings();
		
		Configuration cfg = new Configuration(evt.getSuggestedConfigurationFile());
	
	try {
		
		WhiteSpectraID = cfg.getBlock("White Spectra", 703).getInt();
		
		OrangeSpectraID = cfg.getBlock("Orange Spectra", 705).getInt();
		
		MagentaSpectraID = cfg.getBlock("Magenta Spectra", 707).getInt();
		
		LightBlueSpectraID = cfg.getBlock("Light Blue Spectra", 709).getInt();
		
		YellowSpectraID = cfg.getBlock("Yellow Spectra", 711).getInt();
		
		LimeGreenSpectraID = cfg.getBlock("Lime Green Spectra", 713).getInt();
		
		PinkSpectraID = cfg.getBlock("Pink Spectra", 715).getInt();
		
		GreySpectraID = cfg.getBlock("Grey Spectra", 717).getInt();
		
	} catch (Exception e) {
		
		FMLLog.log(Level.SEVERE, e, "Rainbow Water has problems loading configs");
		
		} finally {
			
			cfg.save();
			}
	}
	
	@Init
	  public void load(FMLInitializationEvent event) 
	  {
		//Blocks
		
		WhiteSpectraStill = new BlockWhiteSpectraStill(WhiteSpectraID, Material.water).setUnlocalizedName("BlockWhiteSpectraStill");
		
		WhiteSpectraFlowing = new BlockWhiteSpectraFlowing(WhiteSpectraID - 1, Material.water).setUnlocalizedName("BlockWhiteSpectraFlowing");
		
		OrangeSpectraStill = new BlockOrangeSpectraStill(OrangeSpectraID, Material.water).setUnlocalizedName("BlockOrangeSpectraStill");
		
		OrangeSpectraFlowing = new BlockOrangeSpectraFlowing(OrangeSpectraID - 1, Material.water).setUnlocalizedName("BlockOrangeSpectraFlowing");

		MagentaSpectraStill = new BlockMagentaSpectraStill(MagentaSpectraID, Material.water).setUnlocalizedName("BlockMagentaSpectraStill");
		
		MagentaSpectraFlowing = new BlockMagentaSpectraFlowing(MagentaSpectraID - 1, Material.water).setUnlocalizedName("BlockMagentaSpectraFlowing");

		LightBlueSpectraStill = new BlockLightBlueSpectraStill(LightBlueSpectraID, Material.water).setUnlocalizedName("BlockLightBlueSpectraStill");
		
		LightBlueSpectraFlowing = new BlockLightBlueSpectraFlowing(LightBlueSpectraID - 1, Material.water).setUnlocalizedName("BlockLightBlueSpectraFlowing");

		YellowSpectraStill = new BlockYellowSpectraStill(YellowSpectraID, Material.water).setUnlocalizedName("BlockYellowSpectraStill");
		
		YellowSpectraFlowing = new BlockYellowSpectraFlowing(YellowSpectraID - 1, Material.water).setUnlocalizedName("BlockYellowSpectraFlowing");

		LimeGreenSpectraStill = new BlockLimeGreenSpectraStill(LimeGreenSpectraID, Material.water).setUnlocalizedName("BlockLimeGreenSpectraStill");
		
		LimeGreenSpectraFlowing = new BlockLimeGreenSpectraFlowing(LimeGreenSpectraID - 1, Material.water).setUnlocalizedName("BlockLimeGreenSpectraFlowing");

		PinkSpectraStill = new BlockPinkSpectraStill(PinkSpectraID, Material.water).setUnlocalizedName("BlockPinkSpectraStill");
		
		PinkSpectraFlowing = new BlockPinkSpectraFlowing(PinkSpectraID - 1, Material.water).setUnlocalizedName("BlockPinkSpectraFlowing");

		GreySpectraStill = new BlockGreySpectraStill(GreySpectraID, Material.water).setUnlocalizedName("BlockGreySpectraStill");
		
		GreySpectraFlowing = new BlockGreySpectraFlowing(GreySpectraID - 1, Material.water).setUnlocalizedName("BlockGreySpectraFlowing");
		
		//Items
		
		//WhiteSpectraBucket = new ItemWhiteSpectraBucket(5000).setUnlocalizedName("Bucket of White Spectra");

		//Game Registry
		
		 GameRegistry.registerBlock(WhiteSpectraStill, modid + WhiteSpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(WhiteSpectraFlowing, modid + WhiteSpectraFlowing.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(OrangeSpectraStill, modid + OrangeSpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(OrangeSpectraFlowing, modid + OrangeSpectraFlowing.getUnlocalizedName2());
		
		 GameRegistry.registerBlock(MagentaSpectraStill, modid + MagentaSpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(MagentaSpectraFlowing, modid + MagentaSpectraFlowing.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(LightBlueSpectraStill, modid + LightBlueSpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(LightBlueSpectraFlowing, modid + LightBlueSpectraFlowing.getUnlocalizedName2());

		 GameRegistry.registerBlock(YellowSpectraStill, modid + YellowSpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(YellowSpectraFlowing, modid + YellowSpectraFlowing.getUnlocalizedName2());

		 GameRegistry.registerBlock(LimeGreenSpectraStill, modid + LimeGreenSpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(LimeGreenSpectraFlowing, modid + LimeGreenSpectraFlowing.getUnlocalizedName2());

		 GameRegistry.registerBlock(PinkSpectraStill, modid + PinkSpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(PinkSpectraFlowing, modid + PinkSpectraFlowing.getUnlocalizedName2());

		 GameRegistry.registerBlock(GreySpectraStill, modid + GreySpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(GreySpectraFlowing, modid + GreySpectraFlowing.getUnlocalizedName2());
		 
		 //Language Registry
		 
		 //Blocks
		 
		 //Liquid
		 
		 LanguageRegistry.addName(WhiteSpectraStill, "White Spectra (Still)");
		 
		 LanguageRegistry.addName(OrangeSpectraStill, "Orange Spectra (Still)");
		 
		 LanguageRegistry.addName(MagentaSpectraStill, "Magenta Spectra (Still)");
		 
		 LanguageRegistry.addName(LightBlueSpectraStill, "Light Blue Spectra (Still)");
		 
		 LanguageRegistry.addName(YellowSpectraStill, "Yellow Spectra (Still)");
		 
		 LanguageRegistry.addName(LimeGreenSpectraStill, "Lime Green Spectra (Still)");
		 
		 LanguageRegistry.addName(PinkSpectraStill, "Pink Spectra (Still)");
		 
		 LanguageRegistry.addName(GreySpectraStill, "Grey Spectra (Still)");
		 
		 //Items
		 
		 //LanguageRegistry.addName(WhiteSpectraBucket, "Bucket of White Spectra");
		 
		 //Armour
		 
		 //ItemStacks
		 
		 //Recipes
			 
		 }
	@PostInit public void postInit(FMLPostInitializationEvent evt) {

		}
	 }
	 

