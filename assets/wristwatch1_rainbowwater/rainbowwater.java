package assets.wristwatch1_rainbowwater;

import java.util.logging.Level;

import assets.wristwatch1_rainbowwater.block.BlockBlackSpectra;
import assets.wristwatch1_rainbowwater.block.BlockBlueSpectra;
import assets.wristwatch1_rainbowwater.block.BlockBrownSpectra;
import assets.wristwatch1_rainbowwater.block.BlockCyanSpectra;
import assets.wristwatch1_rainbowwater.block.BlockGreenSpectra;
import assets.wristwatch1_rainbowwater.block.BlockGreySpectra;
import assets.wristwatch1_rainbowwater.block.BlockLightBlueSpectra;
import assets.wristwatch1_rainbowwater.block.BlockLightGreySpectra;
import assets.wristwatch1_rainbowwater.block.BlockLimeGreenSpectra;
import assets.wristwatch1_rainbowwater.block.BlockMagentaSpectra;
import assets.wristwatch1_rainbowwater.block.BlockOrangeSpectra;
import assets.wristwatch1_rainbowwater.block.BlockPinkSpectra;
import assets.wristwatch1_rainbowwater.block.BlockProtoSpectra;
import assets.wristwatch1_rainbowwater.block.BlockPurpleSpectra;
import assets.wristwatch1_rainbowwater.block.BlockRedSpectra;
import assets.wristwatch1_rainbowwater.block.BlockWhiteSpectra;
import assets.wristwatch1_rainbowwater.block.BlockYellowSpectra;
import assets.wristwatch1_rainbowwater.buckethandlers.BlackSpectraBucketHandler;
import assets.wristwatch1_rainbowwater.buckethandlers.BlueSpectraBucketHandler;
import assets.wristwatch1_rainbowwater.buckethandlers.BrownSpectraBucketHandler;
import assets.wristwatch1_rainbowwater.buckethandlers.CyanSpectraBucketHandler;
import assets.wristwatch1_rainbowwater.buckethandlers.GreenSpectraBucketHandler;
import assets.wristwatch1_rainbowwater.buckethandlers.GreySpectraBucketHandler;
import assets.wristwatch1_rainbowwater.buckethandlers.LightBlueSpectraBucketHandler;
import assets.wristwatch1_rainbowwater.buckethandlers.LightGreySpectraBucketHandler;
import assets.wristwatch1_rainbowwater.buckethandlers.LimeGreenSpectraBucketHandler;
import assets.wristwatch1_rainbowwater.buckethandlers.MagentaSpectraBucketHandler;
import assets.wristwatch1_rainbowwater.buckethandlers.OrangeSpectraBucketHandler;
import assets.wristwatch1_rainbowwater.buckethandlers.PinkSpectraBucketHandler;
import assets.wristwatch1_rainbowwater.buckethandlers.ProtoSpectraBucketHandler;
import assets.wristwatch1_rainbowwater.buckethandlers.PurpleSpectraBucketHandler;
import assets.wristwatch1_rainbowwater.buckethandlers.RedSpectraBucketHandler;
import assets.wristwatch1_rainbowwater.buckethandlers.WhiteSpectraBucketHandler;
import assets.wristwatch1_rainbowwater.buckethandlers.YellowSpectraBucketHandler;
import assets.wristwatch1_rainbowwater.item.ItemBlackSpectraBucket;
import assets.wristwatch1_rainbowwater.item.ItemBlueSpectraBucket;
import assets.wristwatch1_rainbowwater.item.ItemBrownSpectraBucket;
import assets.wristwatch1_rainbowwater.item.ItemCyanSpectraBucket;
import assets.wristwatch1_rainbowwater.item.ItemGreenSpectraBucket;
import assets.wristwatch1_rainbowwater.item.ItemGreySpectraBucket;
import assets.wristwatch1_rainbowwater.item.ItemLightBlueSpectraBucket;
import assets.wristwatch1_rainbowwater.item.ItemLightGreySpectraBucket;
import assets.wristwatch1_rainbowwater.item.ItemLimeGreenSpectraBucket;
import assets.wristwatch1_rainbowwater.item.ItemMagentaSpectraBucket;
import assets.wristwatch1_rainbowwater.item.ItemOrangeSpectraBucket;
import assets.wristwatch1_rainbowwater.item.ItemPinkSpectraBucket;
import assets.wristwatch1_rainbowwater.item.ItemProtoSpectraBucket;
import assets.wristwatch1_rainbowwater.item.ItemPurpleSpectraBucket;
import assets.wristwatch1_rainbowwater.item.ItemRedSpectraBucket;
import assets.wristwatch1_rainbowwater.item.ItemWhiteSpectraBucket;
import assets.wristwatch1_rainbowwater.item.ItemYellowSpectraBucket;
import assets.wristwatch1_rainbowwater.tabs.TabFluids;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;
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
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod( modid = rainbowwater.modid, name = "Rainbow Water", version = "1.1.1") //mod details
@NetworkMod(clientSideRequired = true, serverSideRequired = false) //keep these so mod will work in both SSP and SMP

public class rainbowwater

{
	public static final String modid = "wristwatch1_rainbowwater"; //sets MODID
	
	@Instance ("wristwatch1_rainbowwater")
	public static rainbowwater instance;
	
	@SidedProxy (clientSide = "assets.wristwatch1_rainbowwater.ClientProxyRainbowWater", serverSide = "mod.wristwatch1_rainbowwater.CommonProxyRainbowWater")
	public static CommonProxyRainbowWater proxy; //sets the proxys
	
	
	
	//Fluids (Tells the code there is a fluid)
	
	public static Fluid ProtoSpectra;
	
	public static Fluid WhiteSpectra;
	
	public static Fluid OrangeSpectra;
	
	public static Fluid MagentaSpectra;
	
	public static Fluid LightBlueSpectra;
	
	public static Fluid YellowSpectra;
	
	public static Fluid LimeGreenSpectra;
	
	public static Fluid PinkSpectra;
	
	public static Fluid GreySpectra;
	
	public static Fluid LightGreySpectra;
	
	public static Fluid CyanSpectra;
	
	public static Fluid PurpleSpectra;
	
	public static Fluid BlueSpectra;
	
	public static Fluid BrownSpectra;
	
	public static Fluid GreenSpectra;
	
	public static Fluid RedSpectra;
	
	public static Fluid BlackSpectra;
	
	
	//Blocks
	
	public static Block BlockProtoSpectra;
	
	public static Block BlockWhiteSpectra;
	
	public static Block BlockOrangeSpectra;
	
	public static Block BlockMagentaSpectra;
	
	public static Block BlockLightBlueSpectra;
	
	public static Block BlockYellowSpectra;
	
	public static Block BlockLimeGreenSpectra;
	
	public static Block BlockPinkSpectra;
	
	public static Block BlockGreySpectra;
	
	public static Block BlockLightGreySpectra;
	
	public static Block BlockCyanSpectra;
	
	public static Block BlockPurpleSpectra;

	public static Block BlockBlueSpectra;
	
	public static Block BlockBrownSpectra;
	
	public static Block BlockGreenSpectra;
	
	public static Block BlockRedSpectra;
	
	public static Block BlockBlackSpectra;
	
	
	
	
	
	//Items (you know what these are:) )
	
	public static Item ProtoSpectraBucket;
	
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
	
	
	
	//CreativeTabs
	
	public static CreativeTabs tabFluids = new TabFluids(CreativeTabs.getNextID(),"Wristwatch1tabFluids"); //Creates Creative tab
	 
	@PreInit public void preInit(FMLPreInitializationEvent evt) {
		
		proxy.registerRenderThings(); //Without this, buckets wont fill
		
		 MinecraftForge.EVENT_BUS.register(new ProtoSpectraBucketHandler());
		
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
		
		//Config ID's where here, but not anymore.
		
	} catch (Exception e) {
		
		FMLLog.log(Level.SEVERE, e, "Rainbow Water has problems loading configs");
		
		} finally {
			
			cfg.save();
			}
	}
	
	@Init
	  public void load(FMLInitializationEvent event) 
	  {
		//Fluids (Links to the class files)
		
		ProtoSpectra = new assets.wristwatch1_rainbowwater.fluid.ProtoSpectra();
		
		WhiteSpectra = new assets.wristwatch1_rainbowwater.fluid.WhiteSpectra();
		
		OrangeSpectra = new assets.wristwatch1_rainbowwater.fluid.OrangeSpectra();
		
		MagentaSpectra = new assets.wristwatch1_rainbowwater.fluid.MagentaSpectra();
		
		LightBlueSpectra = new assets.wristwatch1_rainbowwater.fluid.LightBlueSpectra();
		
		YellowSpectra = new assets.wristwatch1_rainbowwater.fluid.YellowSpectra();
		
		LimeGreenSpectra = new assets.wristwatch1_rainbowwater.fluid.LimeGreenSpectra();
		
		PinkSpectra = new assets.wristwatch1_rainbowwater.fluid.PinkSpectra();
		
		GreySpectra = new assets.wristwatch1_rainbowwater.fluid.GreySpectra();
		
		LightGreySpectra = new assets.wristwatch1_rainbowwater.fluid.LightGreySpectra();
		
		CyanSpectra = new assets.wristwatch1_rainbowwater.fluid.CyanSpectra();
		
		PurpleSpectra = new assets.wristwatch1_rainbowwater.fluid.PurpleSpectra();
		
		BlueSpectra = new assets.wristwatch1_rainbowwater.fluid.BlueSpectra();
		
		BrownSpectra = new assets.wristwatch1_rainbowwater.fluid.BrownSpectra();
		
		GreenSpectra = new assets.wristwatch1_rainbowwater.fluid.GreenSpectra();
		
		RedSpectra = new assets.wristwatch1_rainbowwater.fluid.RedSpectra();
		
		BlackSpectra = new assets.wristwatch1_rainbowwater.fluid.BlackSpectra();
		
		//Blocks (links to the class files and sets BLOCKID's and unlocalized names)
		
		BlockProtoSpectra = new BlockProtoSpectra(2382).setUnlocalizedName("BlockProtoSpectra"); 
		
		BlockWhiteSpectra = new BlockWhiteSpectra(2378).setUnlocalizedName("BlockWhiteSpectra");
		
		BlockOrangeSpectra = new BlockOrangeSpectra(2370).setUnlocalizedName("BlockOrangeSpecta");
			
		BlockMagentaSpectra = new BlockMagentaSpectra(2368).setUnlocalizedName("BlockMagentaSpectra");
		
		BlockLightBlueSpectra = new BlockLightBlueSpectra(2362).setUnlocalizedName("BlockLightBlueSpectra");

		BlockYellowSpectra = new BlockYellowSpectra(2380).setUnlocalizedName("BlockYellowSpectra");

		BlockLimeGreenSpectra = new BlockLimeGreenSpectra(2366).setUnlocalizedName("BlockLimeGreenSpectra");

		BlockPinkSpectra = new BlockPinkSpectra(2372).setUnlocalizedName("BlockPinkSpectra");

		BlockGreySpectra = new BlockGreySpectra(2360).setUnlocalizedName("BlockGreySpectra");

		BlockLightGreySpectra = new BlockLightGreySpectra(2364).setUnlocalizedName("BlockLightGreySpectra");

		BlockCyanSpectra = new BlockCyanSpectra(2356).setUnlocalizedName("BlockCyanSpectra");

		BlockPurpleSpectra = new BlockPurpleSpectra(2374).setUnlocalizedName("BlockPurpleSpectra");
		
		BlockBlueSpectra = new BlockBlueSpectra(2352).setUnlocalizedName("BlockBlueSpectra");
		
		BlockBrownSpectra = new BlockBrownSpectra(2354).setUnlocalizedName("BlockBrownSpectra");
		
		BlockGreenSpectra = new BlockGreenSpectra(2358).setUnlocalizedName("BlockGreenSpectra");
		
		BlockRedSpectra = new BlockRedSpectra(2376).setUnlocalizedName("BlockRedSpectra");
		
		BlockBlackSpectra = new BlockBlackSpectra(2350).setUnlocalizedName("BlockBlackSpectra");
		
		//Items (Links to the class files and sets ITEMID'S, unlocalized names and container items) 
		
		ProtoSpectraBucket = new ItemProtoSpectraBucket(3857, BlockProtoSpectra.blockID).setUnlocalizedName("ItemProtoSpectraBucket").setContainerItem(Item.bucketEmpty);
		
		WhiteSpectraBucket = new ItemWhiteSpectraBucket(3841, BlockWhiteSpectra.blockID).setUnlocalizedName("ItemWhiteSpectraBucket").setContainerItem(Item.bucketEmpty);

		OrangeSpectraBucket = new ItemOrangeSpectraBucket(3842, BlockOrangeSpectra.blockID).setUnlocalizedName("ItemOrangeSpectraBucket").setContainerItem(Item.bucketEmpty);

		MagentaSpectraBucket = new ItemMagentaSpectraBucket(3843, BlockMagentaSpectra.blockID).setUnlocalizedName("ItemMagentaSpectraBucket").setContainerItem(Item.bucketEmpty);
		
		LightBlueSpectraBucket = new ItemLightBlueSpectraBucket(3844, BlockLightBlueSpectra.blockID).setUnlocalizedName("ItemLightBlueSpectraBucket").setContainerItem(Item.bucketEmpty);
		
		YellowSpectraBucket = new ItemYellowSpectraBucket(3845, BlockYellowSpectra.blockID).setUnlocalizedName("ItemYellowSpectraBucket").setContainerItem(Item.bucketEmpty);
		
		LimeGreenSpectraBucket = new ItemLimeGreenSpectraBucket(3846, BlockLimeGreenSpectra.blockID).setUnlocalizedName("ItemLimeGreenSpectraBucket").setContainerItem(Item.bucketEmpty);

		PinkSpectraBucket = new ItemPinkSpectraBucket(3847, BlockPinkSpectra.blockID).setUnlocalizedName("ItemPinkSpectraBucket").setContainerItem(Item.bucketEmpty);
		
		GreySpectraBucket = new ItemGreySpectraBucket(3848, BlockGreySpectra.blockID).setUnlocalizedName("ItemGreySpectraBucket").setContainerItem(Item.bucketEmpty);
		
		LightGreySpectraBucket = new ItemLightGreySpectraBucket(3849, BlockLightGreySpectra.blockID).setUnlocalizedName("ItemLightGreySpectraBucket").setContainerItem(Item.bucketEmpty);

		CyanSpectraBucket = new ItemCyanSpectraBucket(3850, BlockCyanSpectra.blockID).setUnlocalizedName("ItemCyanSpectraBucket").setContainerItem(Item.bucketEmpty);

		PurpleSpectraBucket = new ItemPurpleSpectraBucket(3851, BlockPurpleSpectra.blockID).setUnlocalizedName("ItemPurpleSpectraBucket").setContainerItem(Item.bucketEmpty);
		
		BlueSpectraBucket = new ItemBlueSpectraBucket(3852, BlockBlueSpectra.blockID).setUnlocalizedName("ItemBlueSpectraBucket").setContainerItem(Item.bucketEmpty);

		BrownSpectraBucket = new ItemBrownSpectraBucket(3853, BlockBrownSpectra.blockID).setUnlocalizedName("ItemBrownSpectraBucket").setContainerItem(Item.bucketEmpty);

		GreenSpectraBucket = new ItemGreenSpectraBucket(3854, BlockGreenSpectra.blockID).setUnlocalizedName("ItemGreenSpectraBucket").setContainerItem(Item.bucketEmpty);

		RedSpectraBucket = new ItemRedSpectraBucket(3855, BlockRedSpectra.blockID).setUnlocalizedName("ItemRedSpectraBucket").setContainerItem(Item.bucketEmpty);

		BlackSpectraBucket = new ItemBlackSpectraBucket(3856, BlockBlackSpectra.blockID).setUnlocalizedName("ItemBlackSpectraBucket").setContainerItem(Item.bucketEmpty);
		
		
		//Game Registry (Registers the block to the game)
		
		 GameRegistry.registerBlock(BlockProtoSpectra, modid + BlockProtoSpectra.getUnlocalizedName());
		
		 GameRegistry.registerBlock(BlockWhiteSpectra, modid + BlockWhiteSpectra.getUnlocalizedName());
		 
		 GameRegistry.registerBlock(BlockOrangeSpectra, modid + BlockOrangeSpectra.getUnlocalizedName());
		
		 GameRegistry.registerBlock(BlockMagentaSpectra, modid + BlockMagentaSpectra.getUnlocalizedName());
		 
		 GameRegistry.registerBlock(BlockLightBlueSpectra, modid + BlockLightBlueSpectra.getUnlocalizedName());
		 
		 GameRegistry.registerBlock(BlockYellowSpectra, modid + BlockYellowSpectra.getUnlocalizedName());
		 
		 GameRegistry.registerBlock(BlockLimeGreenSpectra, modid + BlockLimeGreenSpectra.getUnlocalizedName());

		 GameRegistry.registerBlock(BlockPinkSpectra, modid + BlockPinkSpectra.getUnlocalizedName());

		 GameRegistry.registerBlock(BlockGreySpectra, modid + BlockGreySpectra.getUnlocalizedName());

		 GameRegistry.registerBlock(BlockLightGreySpectra, modid + BlockLightGreySpectra.getUnlocalizedName());

		 GameRegistry.registerBlock(BlockCyanSpectra, modid + BlockCyanSpectra.getUnlocalizedName());

		 GameRegistry.registerBlock(BlockPurpleSpectra, modid + BlockPurpleSpectra.getUnlocalizedName());
		
		 GameRegistry.registerBlock(BlockBlueSpectra, modid + BlockBlueSpectra.getUnlocalizedName());
		 
		 GameRegistry.registerBlock(BlockBrownSpectra, modid + BlockBrownSpectra.getUnlocalizedName());
		 
		 GameRegistry.registerBlock(BlockGreenSpectra, modid + BlockGreenSpectra.getUnlocalizedName());
		 
		 GameRegistry.registerBlock(BlockRedSpectra, modid + BlockRedSpectra.getUnlocalizedName());
		 
		 GameRegistry.registerBlock(BlockBlackSpectra, modid + BlockBlackSpectra.getUnlocalizedName());
		 
		 
		 //Language Registry
		 
		 //Blocks
		 
		 //Fluid (Gives the fluids their in-game names)
		 
		 LanguageRegistry.addName(BlockProtoSpectra, "Prototype Spectra");
		 
		 LanguageRegistry.addName(BlockWhiteSpectra, "White Spectra");
		 
		 LanguageRegistry.addName(BlockOrangeSpectra, "Orange Spectra");
		 
		 LanguageRegistry.addName(BlockMagentaSpectra, "Magenta Spectra");
		 
		 LanguageRegistry.addName(BlockLightBlueSpectra, "Light Blue Spectra");
		 
		 LanguageRegistry.addName(BlockYellowSpectra, "Yellow Spectra");
		 
		 LanguageRegistry.addName(BlockLimeGreenSpectra, "Lime Green Spectra");
		 
		 LanguageRegistry.addName(BlockPinkSpectra, "Pink Spectra");
		 
		 LanguageRegistry.addName(BlockGreySpectra, "Grey Spectra");

		 LanguageRegistry.addName(BlockLightGreySpectra, "Light Grey Spectra");

		 LanguageRegistry.addName(BlockCyanSpectra, "Cyan Spectra");

		 LanguageRegistry.addName(BlockPurpleSpectra, "Purple Spectra");

		 LanguageRegistry.addName(BlockBlueSpectra, "Blue Spectra");
		 
		 LanguageRegistry.addName(BlockBrownSpectra, "Brown Spectra");
		 
		 LanguageRegistry.addName(BlockGreenSpectra, "Green Spectra");
		 
		 LanguageRegistry.addName(BlockRedSpectra, "Red Spectra");

		 LanguageRegistry.addName(BlockBlackSpectra, "Black Spectra");
		 
		 //Items (Gives the items their in-game names)
		 
		 LanguageRegistry.addName(ProtoSpectraBucket, "Bucket of Prototype Spectra");
		 
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
		 
		 
		 //ItemStacks (Used for crafting)
		 
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
		 
		 
		 //Recipes (The crafting recipes for the blocks and items)
		 
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
		 
		 //FluidRegistry
		 
		 FluidRegistry.registerFluid(WhiteSpectra);
		 
		 FluidRegistry.registerFluid(OrangeSpectra);
		 
		 FluidRegistry.registerFluid(MagentaSpectra);
		 
		 FluidRegistry.registerFluid(LightBlueSpectra);
		 
		 FluidRegistry.registerFluid(YellowSpectra);
		 
		 FluidRegistry.registerFluid(LimeGreenSpectra);
		 
		 FluidRegistry.registerFluid(PinkSpectra);
		 
		 FluidRegistry.registerFluid(GreySpectra);
		 
		 FluidRegistry.registerFluid(LightGreySpectra);
		 
		 FluidRegistry.registerFluid(CyanSpectra);
		 
		 FluidRegistry.registerFluid(PurpleSpectra);
		 
		 FluidRegistry.registerFluid(BlueSpectra);
		 
		 FluidRegistry.registerFluid(BrownSpectra);
		 
		 FluidRegistry.registerFluid(GreenSpectra);
		 
		 FluidRegistry.registerFluid(RedSpectra);
		 
		 FluidRegistry.registerFluid(BlackSpectra);
		 
		 
		 //ContainerRegistery (Links the bucket to the fluid)
		 
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.ProtoSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.ProtoSpectraBucket), new ItemStack(Item.bucketEmpty)));
		 
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.WhiteSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.WhiteSpectraBucket), new ItemStack(Item.bucketEmpty)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.OrangeSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.OrangeSpectraBucket), new ItemStack(Item.bucketEmpty)));
		
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.MagentaSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.MagentaSpectraBucket), new ItemStack(Item.bucketEmpty)));
		 
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.LightBlueSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.LightBlueSpectraBucket), new ItemStack(Item.bucketEmpty)));
		 
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.YellowSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.YellowSpectraBucket), new ItemStack(Item.bucketEmpty)));
		 
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.LimeGreenSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.LimeGreenSpectraBucket), new ItemStack(Item.bucketEmpty)));
		 
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.PinkSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.PinkSpectraBucket), new ItemStack(Item.bucketEmpty)));
		 
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.GreySpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.GreySpectraBucket), new ItemStack(Item.bucketEmpty)));
		 
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.LightGreySpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.LightGreySpectraBucket), new ItemStack(Item.bucketEmpty)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.CyanSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.CyanSpectraBucket), new ItemStack(Item.bucketEmpty)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.PurpleSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.PurpleSpectraBucket), new ItemStack(Item.bucketEmpty)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.BlueSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.BlueSpectraBucket), new ItemStack(Item.bucketEmpty)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.BrownSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.BrownSpectraBucket), new ItemStack(Item.bucketEmpty)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.GreenSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.GreenSpectraBucket), new ItemStack(Item.bucketEmpty)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.RedSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.RedSpectraBucket), new ItemStack(Item.bucketEmpty)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.BlackSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.BlackSpectraBucket), new ItemStack(Item.bucketEmpty)));
		 
	  }
		 @ForgeSubscribe
		 @SideOnly(Side.CLIENT)
			public void textureHook(TextureStitchEvent.Post event) {
				if (event.map.textureType == 0) {
					WhiteSpectra.setIcons(rainbowwater.BlockWhiteSpectra.getBlockTextureFromSide(1));
				}
			}
	
	
		 {
		//EventBus
		 MinecraftForge.EVENT_BUS.register(this); //Closes the stuff
		 }
		 
	@PostInit public void postInit(FMLPostInitializationEvent evt) {

		}
	 }
	 

