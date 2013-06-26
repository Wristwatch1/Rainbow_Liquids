package mods.Wristwatch1_RainbowWater;

import java.util.logging.Level;

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
import mods.Wristwatch1_RainbowWater.buckethandlers.BlackSpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.buckethandlers.BlueSpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.buckethandlers.BrownSpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.buckethandlers.CyanSpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.buckethandlers.GreenSpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.buckethandlers.GreySpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.buckethandlers.LightBlueSpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.buckethandlers.LightGreySpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.buckethandlers.LimeGreenSpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.buckethandlers.MagentaSpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.buckethandlers.OrangeSpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.buckethandlers.PinkSpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.buckethandlers.PurpleSpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.buckethandlers.RedSpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.buckethandlers.WhiteSpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.buckethandlers.YellowSpectraBucketHandler;
import mods.Wristwatch1_RainbowWater.item.ItemBlackSpectraBucket;
import mods.Wristwatch1_RainbowWater.item.ItemBlueSpectraBucket;
import mods.Wristwatch1_RainbowWater.item.ItemBrownSpectraBucket;
import mods.Wristwatch1_RainbowWater.item.ItemCyanSpectraBucket;
import mods.Wristwatch1_RainbowWater.item.ItemGreenSpectraBucket;
import mods.Wristwatch1_RainbowWater.item.ItemGreySpectraBucket;
import mods.Wristwatch1_RainbowWater.item.ItemLightBlueSpectraBucket;
import mods.Wristwatch1_RainbowWater.item.ItemLightGreySpectraBucket;
import mods.Wristwatch1_RainbowWater.item.ItemLimeGreenSpectraBucket;
import mods.Wristwatch1_RainbowWater.item.ItemMagentaSpectraBucket;
import mods.Wristwatch1_RainbowWater.item.ItemOrangeSpectraBucket;
import mods.Wristwatch1_RainbowWater.item.ItemPinkSpectraBucket;
import mods.Wristwatch1_RainbowWater.item.ItemPurpleSpectraBucket;
import mods.Wristwatch1_RainbowWater.item.ItemRedSpectraBucket;
import mods.Wristwatch1_RainbowWater.item.ItemWhiteSpectraBucket;
import mods.Wristwatch1_RainbowWater.item.ItemYellowSpectraBucket;
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

@Mod( modid = rainbowwater.modid, name = "Rainbow Water", version = "0.5.7")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class rainbowwater

{
	public static final String modid = "Wristwatch1_RainbowWater";
	
	@Instance ("Wristwatch1_RainbowWater")
	public static rainbowwater instance;
	
	@SidedProxy (clientSide = "mods.Wristwatch1_RainbowWater.ClientProxyRainbowWater", serverSide = "mod.Wristwatch1_RainbowWater.CommonProxyRainbowWater")
	public static CommonProxyRainbowWater proxy;

	//Blocks
	
	//Liquid Stacks
	
	public static LiquidStack WhiteSpectra;
	
	public static LiquidStack OrangeSpectra;
	
	public static LiquidStack MagentaSpectra;
	
	public static LiquidStack LightBlueSpectra;
	
	public static LiquidStack YellowSpectra;
	
	public static LiquidStack LimeGreenSpectra;
	
	public static LiquidStack PinkSpectra;
	
	public static LiquidStack GreySpectra;
	
	public static LiquidStack LightGreySpectra;
	
	public static LiquidStack CyanSpectra;
	
	public static LiquidStack PurpleSpectra;
	
	public static LiquidStack BlueSpectra;
	
	public static LiquidStack BrownSpectra;
	
	public static LiquidStack GreenSpectra;
	
	public static LiquidStack RedSpectra;
	
	public static LiquidStack BlackSpectra;
	
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
	
	public static Item OrangeSpectraBucket;
	
	public static Item MagentaSpectraBucket;
	
	public static Item LightBlueSpectraBucket;
	
	public static Item YellowSpectraBucket;
	
	public static Item LimeGreenSpectraBucket;
	
	public static Item PinkSpectraBucket;
	
	public static Item GreySpectraBucket;
	
	public static Item LightGreySpectraBucket;
	
	public static Item CyanSpectraBucket;
	
	public static Item PurpleSpectraBucket;
	
	public static Item BlueSpectraBucket;
	
	public static Item BrownSpectraBucket;
	
	public static Item GreenSpectraBucket;
	
	public static Item RedSpectraBucket;
	
	public static Item BlackSpectraBucket;
	
	//Armour
	
	//ItemIDs
	
	public static int WhiteSpectraBucketID;
	
	public static int OrangeSpectraBucketID;
	
	public static int MagentaSpectraBucketID;
	
	public static int LightBlueSpectraBucketID;
	
	public static int YellowSpectraBucketID;
	
	public static int LimeGreenSpectraBucketID;
	
	public static int PinkSpectraBucketID;
	
	public static int GreySpectraBucketID;
	
	public static int LightGreySpectraBucketID;
	
	public static int CyanSpectraBucketID;
	
	public static int PurpleSpectraBucketID;
	
	public static int BlueSpectraBucketID;
	
	public static int BrownSpectraBucketID;
	
	public static int GreenSpectraBucketID;
	
	public static int RedSpectraBucketID;
	
	public static int BlackSpectraBucketID;
	
	//CreativeTabs
	
	public static CreativeTabs tabLiquids = new TabLiquids(CreativeTabs.getNextID(),"Wristwatch1TabLiquids"); 
	 
	@PreInit public void preInit(FMLPreInitializationEvent evt) {
		
		proxy.registerRenderThings();
		
		 MinecraftForge.EVENT_BUS.register(new WhiteSpectraBucketHandler());
		 
		 MinecraftForge.EVENT_BUS.register(new OrangeSpectraBucketHandler());
		 
		 MinecraftForge.EVENT_BUS.register(new MagentaSpectraBucketHandler());
		 
		 MinecraftForge.EVENT_BUS.register(new LightBlueSpectraBucketHandler());
		 
		 MinecraftForge.EVENT_BUS.register(new YellowSpectraBucketHandler());
		 
		 MinecraftForge.EVENT_BUS.register(new LimeGreenSpectraBucketHandler());
		 
		 MinecraftForge.EVENT_BUS.register(new PinkSpectraBucketHandler());
		 
		 MinecraftForge.EVENT_BUS.register(new GreySpectraBucketHandler());
		 
		 MinecraftForge.EVENT_BUS.register(new LightGreySpectraBucketHandler());
		 
		 MinecraftForge.EVENT_BUS.register(new CyanSpectraBucketHandler());
		 
		 MinecraftForge.EVENT_BUS.register(new PurpleSpectraBucketHandler());
		 
		 MinecraftForge.EVENT_BUS.register(new BlueSpectraBucketHandler());
		 
		 MinecraftForge.EVENT_BUS.register(new BrownSpectraBucketHandler());

		 MinecraftForge.EVENT_BUS.register(new GreenSpectraBucketHandler());
		 
		 MinecraftForge.EVENT_BUS.register(new RedSpectraBucketHandler());
		 
		 MinecraftForge.EVENT_BUS.register(new BlackSpectraBucketHandler());
		 
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
		
		WhiteSpectraBucketID = cfg.getItem("White Spectra Bucket", 3841).getInt();
		
		OrangeSpectraBucketID = cfg.getItem("Orange Spectra Bucket", 3842).getInt();
		
		MagentaSpectraBucketID = cfg.getItem("Magenta Spectra Bucket", 3843).getInt();
		
		LightBlueSpectraBucketID = cfg.getItem("Light Blue Spectra Bucket", 3844).getInt();
		
		YellowSpectraBucketID = cfg.getItem("Yellow Spectra Bucket", 3845).getInt();
		
		LimeGreenSpectraBucketID = cfg.getItem("Lime Green Spectra Bucket", 3846).getInt();
		
		PinkSpectraBucketID = cfg.getItem("Pink Spectra Bucket", 3847).getInt();
		
		GreySpectraBucketID = cfg.getItem("Grey Spectra Bucket", 3848).getInt();
		
		LightGreySpectraBucketID = cfg.getItem("Light Grey Spectra Bucket", 3849).getInt();
		
		CyanSpectraBucketID = cfg.getItem("Cyan Spectra Bucket", 3850).getInt();
		
		PurpleSpectraBucketID = cfg.getItem("Purple Spectra Bucket", 3851).getInt();

		BlueSpectraBucketID = cfg.getItem("Blue Spectra Bucket", 3852).getInt();

		BrownSpectraBucketID = cfg.getItem("Brown Spectra Bucket", 3853).getInt();

		GreenSpectraBucketID = cfg.getItem("Green Spectra Bucket", 3854).getInt();
		
		RedSpectraBucketID = cfg.getItem("Red Spectra Bucket", 3855).getInt();

		BlackSpectraBucketID = cfg.getItem("Black Spectra Bucket", 3856).getInt();
		
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
		
		WhiteSpectraBucket = new ItemWhiteSpectraBucket(WhiteSpectraBucketID, WhiteSpectraFlowing.blockID).setUnlocalizedName("ItemWhiteSpectraBucket").setContainerItem(Item.bucketEmpty);

		OrangeSpectraBucket = new ItemOrangeSpectraBucket(OrangeSpectraBucketID, OrangeSpectraFlowing.blockID).setUnlocalizedName("ItemOrangeSpectraBucket").setContainerItem(Item.bucketEmpty);

		MagentaSpectraBucket = new ItemMagentaSpectraBucket(MagentaSpectraBucketID, MagentaSpectraFlowing.blockID).setUnlocalizedName("ItemMagentaSpectraBucket").setContainerItem(Item.bucketEmpty);
		
		LightBlueSpectraBucket = new ItemLightBlueSpectraBucket(LightBlueSpectraBucketID, LightBlueSpectraFlowing.blockID).setUnlocalizedName("ItemLightBlueSpectraBucket").setContainerItem(Item.bucketEmpty);
		
		YellowSpectraBucket = new ItemYellowSpectraBucket(YellowSpectraBucketID, YellowSpectraFlowing.blockID).setUnlocalizedName("ItemYellowSpectraBucket").setContainerItem(Item.bucketEmpty);
		
		LimeGreenSpectraBucket = new ItemLimeGreenSpectraBucket(LimeGreenSpectraBucketID, LimeGreenSpectraFlowing.blockID).setUnlocalizedName("ItemLimeGreenSpectraBucket").setContainerItem(Item.bucketEmpty);

		PinkSpectraBucket = new ItemPinkSpectraBucket(PinkSpectraBucketID, PinkSpectraFlowing.blockID).setUnlocalizedName("ItemPinkSpectraBucket").setContainerItem(Item.bucketEmpty);
		
		GreySpectraBucket = new ItemGreySpectraBucket(GreySpectraBucketID, GreySpectraFlowing.blockID).setUnlocalizedName("ItemGreySpectraBucket").setContainerItem(Item.bucketEmpty);
		
		LightGreySpectraBucket = new ItemLightGreySpectraBucket(LightGreySpectraBucketID, LightGreySpectraFlowing.blockID).setUnlocalizedName("ItemLightGreySpectraBucket").setContainerItem(Item.bucketEmpty);

		CyanSpectraBucket = new ItemCyanSpectraBucket(CyanSpectraBucketID, CyanSpectraFlowing.blockID).setUnlocalizedName("ItemCyanSpectraBucket").setContainerItem(Item.bucketEmpty);

		PurpleSpectraBucket = new ItemPurpleSpectraBucket(PurpleSpectraBucketID, PurpleSpectraFlowing.blockID).setUnlocalizedName("ItemPurpleSpectraBucket").setContainerItem(Item.bucketEmpty);
		
		BlueSpectraBucket = new ItemBlueSpectraBucket(BlueSpectraBucketID, BlueSpectraFlowing.blockID).setUnlocalizedName("ItemBlueSpectraBucket").setContainerItem(Item.bucketEmpty);

		BrownSpectraBucket = new ItemBrownSpectraBucket(BrownSpectraBucketID, BrownSpectraFlowing.blockID).setUnlocalizedName("ItemBrownSpectraBucket").setContainerItem(Item.bucketEmpty);

		GreenSpectraBucket = new ItemGreenSpectraBucket(GreenSpectraBucketID, GreenSpectraFlowing.blockID).setUnlocalizedName("ItemGreenSpectraBucket").setContainerItem(Item.bucketEmpty);

		RedSpectraBucket = new ItemRedSpectraBucket(RedSpectraBucketID, RedSpectraFlowing.blockID).setUnlocalizedName("ItemRedSpectraBucket").setContainerItem(Item.bucketEmpty);

		BlackSpectraBucket = new ItemBlackSpectraBucket(BlackSpectraBucketID, BlackSpectraFlowing.blockID).setUnlocalizedName("ItemBlackSpectraBucket").setContainerItem(Item.bucketEmpty);
		
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
		 
		 LanguageRegistry.addName(OrangeSpectraBucket, "Bucket of Orange Spectra");
		 
		 LanguageRegistry.addName(MagentaSpectraBucket, "Bucket of Magenta Spectra");
		 
		 LanguageRegistry.addName(LightBlueSpectraBucket, "Bucket of Light Blue Spectra");
		 
		 LanguageRegistry.addName(YellowSpectraBucket, "Bucket of Yellow Spectra");
		 
		 LanguageRegistry.addName(LimeGreenSpectraBucket, "Bucket of Lime Green Spectra");
		 
		 LanguageRegistry.addName(PinkSpectraBucket, "Bucket of Pink Spectra");
		 
		 LanguageRegistry.addName(GreySpectraBucket, "Bucket of Grey Spectra");
		 
		 LanguageRegistry.addName(LightGreySpectraBucket, "Bucket of Light Grey Spectra");
		 
		 LanguageRegistry.addName(CyanSpectraBucket, "Bucket of Cyan Spectra");
		 
		 LanguageRegistry.addName(PurpleSpectraBucket, "Bucket of Purple Spectra");
		 
		 LanguageRegistry.addName(BlueSpectraBucket, "Bucket of Blue Spectra");

		 LanguageRegistry.addName(BrownSpectraBucket, "Bucket of Brown Spectra");

		 LanguageRegistry.addName(GreenSpectraBucket, "Bucket of Green Spectra");

		 LanguageRegistry.addName(RedSpectraBucket, "Bucket of Red Spectra");

		 LanguageRegistry.addName(BlackSpectraBucket, "Bucket of Black Spectra");
		 
		 //Armour
		 
		 //ItemStacks
		 
		 ItemStack waterBucketStack = new ItemStack(Item.bucketWater);
		 
		 ItemStack emptyBucketStack = new ItemStack(Item.bucketEmpty);
		 
		 ItemStack waterBottleStack = new ItemStack(Item.potion, 0);
		 
		 ItemStack whiteDyeStack = new ItemStack(Item.dyePowder, 1, 15);

		 ItemStack orangeDyeStack = new ItemStack(Item.dyePowder, 1, 14);

		 ItemStack magentaDyeStack = new ItemStack(Item.dyePowder, 1, 13);

		 ItemStack lightblueDyeStack = new ItemStack(Item.dyePowder, 1, 12);

		 ItemStack yellowDyeStack = new ItemStack(Item.dyePowder, 1, 11);

		 ItemStack limegreenDyeStack = new ItemStack(Item.dyePowder, 1, 10);

		 ItemStack pinkDyeStack = new ItemStack(Item.dyePowder, 1, 9);

		 ItemStack greyDyeStack = new ItemStack(Item.dyePowder, 1, 8);

		 ItemStack lightgreyDyeStack = new ItemStack(Item.dyePowder, 1, 7);

		 ItemStack cyanDyeStack = new ItemStack(Item.dyePowder, 1, 6);

		 ItemStack purpleDyeStack = new ItemStack(Item.dyePowder, 1, 5);

		 ItemStack blueDyeStack = new ItemStack(Item.dyePowder, 1, 4);

		 ItemStack brownDyeStack = new ItemStack(Item.dyePowder, 1, 3);

		 ItemStack greenDyeStack = new ItemStack(Item.dyePowder, 1, 2);

		 ItemStack redDyeStack = new ItemStack(Item.dyePowder, 1, 1);

		 ItemStack blackDyeStack = new ItemStack(Item.dyePowder, 1, 0);
		 
		 //Recipes
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(rainbowwater.WhiteSpectraBucket, 1),
	                whiteDyeStack, waterBottleStack, waterBottleStack,
	                waterBottleStack, emptyBucketStack);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(rainbowwater.OrangeSpectraBucket, 1),
	                orangeDyeStack, waterBottleStack, waterBottleStack,
	                waterBottleStack, emptyBucketStack);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(rainbowwater.MagentaSpectraBucket, 1),
	                magentaDyeStack, waterBottleStack, waterBottleStack,
	                waterBottleStack, emptyBucketStack);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(rainbowwater.LightBlueSpectraBucket, 1),
	                lightblueDyeStack, waterBottleStack, waterBottleStack,
	                waterBottleStack, emptyBucketStack);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(rainbowwater.YellowSpectraBucket, 1),
	                yellowDyeStack, waterBottleStack, waterBottleStack,
	                waterBottleStack, emptyBucketStack);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(rainbowwater.LimeGreenSpectraBucket, 1),
	                limegreenDyeStack, waterBottleStack, waterBottleStack,
	                waterBottleStack, emptyBucketStack);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(rainbowwater.PinkSpectraBucket, 1),
	                pinkDyeStack, waterBottleStack, waterBottleStack,
	                waterBottleStack, emptyBucketStack);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(rainbowwater.GreySpectraBucket, 1),
	                greyDyeStack, waterBottleStack, waterBottleStack,
	                waterBottleStack, emptyBucketStack);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(rainbowwater.LightGreySpectraBucket, 1),
	                lightgreyDyeStack, waterBottleStack, waterBottleStack,
	                waterBottleStack, emptyBucketStack);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(rainbowwater.CyanSpectraBucket, 1),
	                cyanDyeStack, waterBottleStack, waterBottleStack,
	                waterBottleStack, emptyBucketStack);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(rainbowwater.PurpleSpectraBucket, 1),
	                purpleDyeStack, waterBottleStack, waterBottleStack,
	                waterBottleStack, emptyBucketStack);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(rainbowwater.BlueSpectraBucket, 1),
	                blueDyeStack, waterBottleStack, waterBottleStack,
	                waterBottleStack, emptyBucketStack);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(rainbowwater.BrownSpectraBucket, 1),
	                brownDyeStack, waterBottleStack, waterBottleStack,
	                waterBottleStack, emptyBucketStack);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(rainbowwater.GreenSpectraBucket, 1),
	                greenDyeStack, waterBottleStack, waterBottleStack,
	                waterBottleStack, emptyBucketStack);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(rainbowwater.RedSpectraBucket, 1),
	                redDyeStack, waterBottleStack, waterBottleStack,
	                waterBottleStack, emptyBucketStack);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(rainbowwater.BlackSpectraBucket, 1),
	                blackDyeStack, waterBottleStack, waterBottleStack,
	                waterBottleStack, emptyBucketStack);
		 
		 //Liquid Dictionary
		 
		 WhiteSpectra = LiquidDictionary.getOrCreateLiquid("White Spectra", new LiquidStack(WhiteSpectraStill, 1));

		 OrangeSpectra = LiquidDictionary.getOrCreateLiquid("Orange Spectra", new LiquidStack(OrangeSpectraStill, 1));

		 MagentaSpectra = LiquidDictionary.getOrCreateLiquid("Magenta Spectra", new LiquidStack(MagentaSpectraStill, 1));

		 LightBlueSpectra = LiquidDictionary.getOrCreateLiquid("Light Blue Spectra", new LiquidStack(LightBlueSpectraStill, 1));
		 
		 YellowSpectra = LiquidDictionary.getOrCreateLiquid("Yellow Spectra", new LiquidStack(YellowSpectraStill, 1));
		 
		 LimeGreenSpectra = LiquidDictionary.getOrCreateLiquid("Lime Green Spectra", new LiquidStack(LimeGreenSpectraStill, 1));
		 
		 PinkSpectra = LiquidDictionary.getOrCreateLiquid("Pink Spectra", new LiquidStack(PinkSpectraStill, 1));
		 
		 GreySpectra = LiquidDictionary.getOrCreateLiquid("Grey Spectra", new LiquidStack(GreySpectraStill, 1));
		 
		 LightGreySpectra = LiquidDictionary.getOrCreateLiquid("Light Grey Spectra", new LiquidStack(LightGreySpectraStill, 1));
		 
		 CyanSpectra = LiquidDictionary.getOrCreateLiquid("Cyan Spectra", new LiquidStack(CyanSpectraStill, 1));
		 
		 PurpleSpectra = LiquidDictionary.getOrCreateLiquid("Purple Spectra", new LiquidStack(PurpleSpectraStill, 1));
		 
		 BlueSpectra = LiquidDictionary.getOrCreateLiquid("Blue Spectra", new LiquidStack(BlueSpectraStill, 1));

		 BrownSpectra = LiquidDictionary.getOrCreateLiquid("Brown Spectra", new LiquidStack(BrownSpectraStill, 1));

		 GreenSpectra = LiquidDictionary.getOrCreateLiquid("Green Spectra", new LiquidStack(GreenSpectraStill, 1));

		 RedSpectra = LiquidDictionary.getOrCreateLiquid("Red Spectra", new LiquidStack(RedSpectraStill, 1));

		 BlackSpectra = LiquidDictionary.getOrCreateLiquid("Black Spectra", new LiquidStack(BlackSpectraStill, 1));
		 
		 //ContainerRegistery
		 
		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("White Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(WhiteSpectraBucket), new ItemStack(Item.bucketEmpty)));

		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Orange Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(OrangeSpectraBucket), new ItemStack(Item.bucketEmpty)));
		
		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Magenta Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(MagentaSpectraBucket), new ItemStack(Item.bucketEmpty)));
		 
		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Light Blue Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(LightBlueSpectraBucket), new ItemStack(Item.bucketEmpty)));
		 
		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Yellow Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(YellowSpectraBucket), new ItemStack(Item.bucketEmpty)));
		 
		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Lime Green Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(LimeGreenSpectraBucket), new ItemStack(Item.bucketEmpty)));
		 
		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Pink Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(PinkSpectraBucket), new ItemStack(Item.bucketEmpty)));
		 
		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Grey Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(GreySpectraBucket), new ItemStack(Item.bucketEmpty)));
		 
		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Light Grey Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(LightGreySpectraBucket), new ItemStack(Item.bucketEmpty)));

		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Cyan Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(CyanSpectraBucket), new ItemStack(Item.bucketEmpty)));

		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Purple Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(PurpleSpectraBucket), new ItemStack(Item.bucketEmpty)));

		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Blue Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(BlueSpectraBucket), new ItemStack(Item.bucketEmpty)));

		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Brown Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(BrownSpectraBucket), new ItemStack(Item.bucketEmpty)));

		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Green Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(GreenSpectraBucket), new ItemStack(Item.bucketEmpty)));

		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Red Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(RedSpectraBucket), new ItemStack(Item.bucketEmpty)));

		 LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Black Spectra", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(BlackSpectraBucket), new ItemStack(Item.bucketEmpty)));
		 
		//EventBus
		 MinecraftForge.EVENT_BUS.register(this);
		 
		 }
	@PostInit public void postInit(FMLPostInitializationEvent evt) {

		}
	 }
	 

