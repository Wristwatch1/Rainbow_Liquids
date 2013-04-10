package wristwatch1.rainbow.common;

import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import wristwatch1.rainbow.common.block.BlockWhiteSpectraFlowing;
import wristwatch1.rainbow.common.block.BlockWhiteSpectraStill;
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
import wristwatch1.rainbow.common.block.BlockWhiteSpectraStill;
import wristwatch1.rainbow.common.block.BlockWhiteSpectraFlowing;
import wristwatch1.rainbow.common.item.ItemWhiteSpectraBucket;
import wristwatch1.rainbow.common.tabs.TabLiquids;

@Mod( modid = rainbowwater.modid, name = "Rainbow Water", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class rainbowwater

{
	public static final String modid = "Wristwatch1_RainbowWater";
	
	@Instance ("Wristwatch1_RainbowWater")
	public static rainbowwater instance;
	
	
	@SidedProxy (clientSide = "wristwatch1.rainbow.common.ClientProxyRainbowWater", serverSide = "wristwatch1.rainbow.common.CommonProxyRainbowWater")
	public static CommonProxyRainbowWater proxy;

	//Blocks
	
	//Liquids
	
	public static Block WhiteSpectraStill;
	
	public static Block WhiteSpectraFlowing;
	
	//Liquid id's
	
	public static int WhiteSpectraID;
	
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
		
		WhiteSpectraID = cfg.getBlock("White Spectra", 250).getInt();
		
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
		
		WhiteSpectraStill = new BlockWhiteSpectraStill(WhiteSpectraID, Material.water).setUnlocalizedName("blockWhiteSpectraStill");
		
		WhiteSpectraFlowing = new BlockWhiteSpectraFlowing(WhiteSpectraID - 1, Material.water).setUnlocalizedName("blockWhiteSpectraFlowing");
		
		//Items
		
		//WhiteSpectraBucket = new ItemWhiteSpectraBucket(5000).setUnlocalizedName("Bucket of White Spectra");

		//Game Registry
		
		 GameRegistry.registerBlock(WhiteSpectraStill, modid + WhiteSpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(WhiteSpectraFlowing, modid + WhiteSpectraFlowing.getUnlocalizedName2());
		
		 //Language Registry
		 //Blocks
		 
		 //Liquid
		 
		 LanguageRegistry.addName(WhiteSpectraStill, "White Spectra (Still)");
		 
		 //Items
		 
		 //LanguageRegistry.addName(WhiteSpectraBucket, "Bucket of White Spectra");
		 
		 //Armour
		 
		 //ItemStacks
		 
		 //Recipes
			 
		 }
	@PostInit public void postInit(FMLPostInitializationEvent evt) {

		}
	 }
	 

