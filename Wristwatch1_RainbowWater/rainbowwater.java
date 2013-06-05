package mods.Wristwatch1_RainbowWater;

import java.util.logging.Level;

import mods.Wristwatch1_RainbowWater.buckethandlers.WhiteSpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.block.BlockBlackSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockBlackSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockBlueSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockBlueSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockBrownSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockBrownSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockCyanSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockCyanSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockGreenSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockGreenSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockGreySpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockGreySpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockLightBlueSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockLightBlueSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockLightGreySpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockLightGreySpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockLimeGreenSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockLimeGreenSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockMagentaSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockMagentaSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockOrangeSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockOrangeSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockPinkSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockPinkSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockPurpleSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockPurpleSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockRedSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockRedSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockWhiteSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockWhiteSpectraStill;
import mods.Wristwatch1_RainbowWater.block.BlockYellowSpectraFlowing;
import mods.Wristwatch1_RainbowWater.block.BlockYellowSpectraStill;
import mods.Wristwatch1_RainbowWater.item.ItemWhiteSpectraBucket;
import mods.Wristwatch1_RainbowWater.tabs.TabLiquids;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.liquids.LiquidContainerData;
import net.minecraftforge.liquids.LiquidContainerRegistry;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidStack;
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

@Mod( modid = rainbowwater.modid, name = "Rainbow Water", version = "0.3.32")
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
	
	public static LiquidStack WhiteSpectra;
	
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
	
	public static Block LightGreySpectraStill;
	
	public static Block LightGreySpectraFlowing;
	
	public static Block CyanSpectraStill;
	
	public static Block CyanSpectraFlowing;
	
	public static Block PurpleSpectraStill;
	
	public static Block PurpleSpectraFlowing;

	public static Block BlueSpectraStill;
	
	public static Block BlueSpectraFlowing;
	
	public static Block BrownSpectraStill;
	
	public static Block BrownSpectraFlowing;
	
	public static Block GreenSpectraStill;
	
	public static Block GreenSpectraFlowing;
	
	public static Block RedSpectraStill;
	
	public static Block RedSpectraFlowing;
	
	public static Block BlackSpectraStill;
	
	public static Block BlackSpectraFlowing;
	
	//Liquid id's
	
	public static int WhiteSpectraID;
	
	public static int OrangeSpectraID;
	
	public static int MagentaSpectraID;
	
	public static int LightBlueSpectraID;
	
	public static int YellowSpectraID;
	
	public static int LimeGreenSpectraID;
	
	public static int PinkSpectraID;
	
	public static int GreySpectraID;
	
	public static int LightGreySpectraID;
	
	public static int CyanSpectraID;
	
	public static int PurpleSpectraID;
	
	public static int BlueSpectraID;
	
	public static int BrownSpectraID;
	
	public static int GreenSpectraID;
	
	public static int RedSpectraID;
	
	public static int BlackSpectraID;
	
	//BlockIDs
	
	//Items
	
	public static Item WhiteSpectraBucket;
	
	//Armour
	
	//ItemIDs
	
	public static int WhiteSpectraBucketID;
	
	//CreativeTabs
	
	public static CreativeTabs tabLiquids = new TabLiquids(CreativeTabs.getNextID(),"Wristwatch1TabLiquids"); 
	 
	@PreInit public void preInit(FMLPreInitializationEvent evt) {
		
		proxy.registerRenderThings();
		
		 MinecraftForge.EVENT_BUS.register(new WhiteSpectraBucketHandler());
		 
		Configuration cfg = new Configuration(evt.getSuggestedConfigurationFile());
	
	try {
		
		WhiteSpectraID = cfg.getBlock("White Spectra", 979).getInt();
		
		OrangeSpectraID = cfg.getBlock("Orange Spectra", 981).getInt();
		
		MagentaSpectraID = cfg.getBlock("Magenta Spectra", 983).getInt();
		
		LightBlueSpectraID = cfg.getBlock("Light Blue Spectra", 985).getInt();
		
		YellowSpectraID = cfg.getBlock("Yellow Spectra", 987).getInt();
		
		LimeGreenSpectraID = cfg.getBlock("Lime Green Spectra", 989).getInt();
		
		PinkSpectraID = cfg.getBlock("Pink Spectra", 991).getInt();
		
		GreySpectraID = cfg.getBlock("Grey Spectra", 993).getInt();
		
		LightGreySpectraID = cfg.getBlock("Light Grey Spectra", 995).getInt();
		
		CyanSpectraID = cfg.getBlock("Cyan Spectra", 997).getInt();
		
		PurpleSpectraID = cfg.getBlock("Purple Spectra", 999).getInt();
		
		BlueSpectraID = cfg.getBlock("Blue Spectra", 1001).getInt();
		
		BrownSpectraID = cfg.getBlock("Brown Spectra", 1003).getInt();
		
		GreenSpectraID = cfg.getBlock("Green Spectra", 1005).getInt();
		
		RedSpectraID = cfg.getBlock("Red Spectra", 1007).getInt();
		
		BlackSpectraID = cfg.getBlock("Black Spectra", 1009).getInt();
		
		WhiteSpectraBucketID = cfg.getItem("White Spectra Bucket", 525).getInt();
		
		
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

		LightGreySpectraStill = new BlockLightGreySpectraStill(LightGreySpectraID, Material.water).setUnlocalizedName("BlockLightGreySpectraStill");
		
		LightGreySpectraFlowing = new BlockLightGreySpectraFlowing(LightGreySpectraID - 1, Material.water).setUnlocalizedName("BlockLightGreySpectraFlowing");

		CyanSpectraStill = new BlockCyanSpectraStill(CyanSpectraID, Material.water).setUnlocalizedName("BlockCyanSpectraStill");
		
		CyanSpectraFlowing = new BlockCyanSpectraFlowing(CyanSpectraID - 1, Material.water).setUnlocalizedName("BlockCyanSpectraFlowing");

		PurpleSpectraStill = new BlockPurpleSpectraStill(PurpleSpectraID, Material.water).setUnlocalizedName("BlockPurpleSpectraStill");
		
		PurpleSpectraFlowing = new BlockPurpleSpectraFlowing(PurpleSpectraID - 1, Material.water).setUnlocalizedName("BlockPurpleSpectraFlowing");

		BlueSpectraStill = new BlockBlueSpectraStill(BlueSpectraID, Material.water).setUnlocalizedName("BlockBlueSpectraStill");
		
		BlueSpectraFlowing = new BlockBlueSpectraFlowing(BlueSpectraID - 1, Material.water).setUnlocalizedName("BlockBlueSpectraFlowing");

		BrownSpectraStill = new BlockBrownSpectraStill(BrownSpectraID, Material.water).setUnlocalizedName("BlockBrownSpectraStill");
		
		BrownSpectraFlowing = new BlockBrownSpectraFlowing(BrownSpectraID - 1, Material.water).setUnlocalizedName("BlockBrownSpectraFlowing");

		GreenSpectraStill = new BlockGreenSpectraStill(GreenSpectraID, Material.water).setUnlocalizedName("BlockGreenSpectraStill");
		
		GreenSpectraFlowing = new BlockGreenSpectraFlowing(GreenSpectraID - 1, Material.water).setUnlocalizedName("BlockGreenSpectraFlowing");

		RedSpectraStill = new BlockRedSpectraStill(RedSpectraID, Material.water).setUnlocalizedName("BlockRedSpectraStill");
		
		RedSpectraFlowing = new BlockRedSpectraFlowing(RedSpectraID - 1, Material.water).setUnlocalizedName("BlockRedSpectraFlowing");

		BlackSpectraStill = new BlockBlackSpectraStill(BlackSpectraID, Material.water).setUnlocalizedName("BlockBlackSpectraStill");
		
		BlackSpectraFlowing = new BlockBlackSpectraFlowing(BlackSpectraID - 1, Material.water).setUnlocalizedName("BlockBlackSpectraFlowing");

		//Items
		
		WhiteSpectraBucket = new ItemWhiteSpectraBucket(WhiteSpectraBucketID).setUnlocalizedName("ItemWhiteSpectraBucket");

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

		 GameRegistry.registerBlock(LightGreySpectraStill, modid + LightGreySpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(LightGreySpectraFlowing, modid + LightGreySpectraFlowing.getUnlocalizedName2());

		 GameRegistry.registerBlock(CyanSpectraStill, modid + CyanSpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(CyanSpectraFlowing, modid + CyanSpectraFlowing.getUnlocalizedName2());

		 GameRegistry.registerBlock(PurpleSpectraStill, modid + PurpleSpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(PurpleSpectraFlowing, modid + PurpleSpectraFlowing.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(BlueSpectraStill, modid + BlueSpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(BlueSpectraFlowing, modid + BlueSpectraFlowing.getUnlocalizedName2());

		 GameRegistry.registerBlock(BrownSpectraStill, modid + BrownSpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(BrownSpectraFlowing, modid + BrownSpectraFlowing.getUnlocalizedName2());

		 GameRegistry.registerBlock(GreenSpectraStill, modid + GreenSpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(GreenSpectraFlowing, modid + GreenSpectraFlowing.getUnlocalizedName2());

		 GameRegistry.registerBlock(RedSpectraStill, modid + RedSpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(RedSpectraFlowing, modid + RedSpectraFlowing.getUnlocalizedName2());

		 GameRegistry.registerBlock(BlackSpectraStill, modid + BlackSpectraStill.getUnlocalizedName2());
		 
		 GameRegistry.registerBlock(BlackSpectraFlowing, modid + BlackSpectraFlowing.getUnlocalizedName2());

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

		 LanguageRegistry.addName(LightGreySpectraStill, "Light Grey Spectra (Still)");

		 LanguageRegistry.addName(CyanSpectraStill, "Cyan Spectra (Still)");

		 LanguageRegistry.addName(PurpleSpectraStill, "Purple Spectra (Still)");

		 LanguageRegistry.addName(BlueSpectraStill, "Blue Spectra (Still)");
		 
		 LanguageRegistry.addName(BrownSpectraStill, "Brown Spectra (Still)");
		 
		 LanguageRegistry.addName(GreenSpectraStill, "Green Spectra (Still)");
		 
		 LanguageRegistry.addName(RedSpectraStill, "Red Spectra (Still)");

		 LanguageRegistry.addName(BlackSpectraStill, "Black Spectra (Still)");
		 
		 //Items
		 
		 LanguageRegistry.addName(WhiteSpectraBucket, "Bucket of White Spectra");
		 
		 //Armour
		 
		 //ItemStacks
		 
		 //Recipes
		 
		 //Liquid Dictionary
		 
		 WhiteSpectra = LiquidDictionary.getOrCreateLiquid("White Spectra", new LiquidStack(WhiteSpectraStill, 1));

		 //ContainerRegistery
		 
		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("White Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(WhiteSpectraBucket), new ItemStack(Item.bucketEmpty)));

		 }
	@PostInit public void postInit(FMLPostInitializationEvent evt) {

		}
	 }
	 

