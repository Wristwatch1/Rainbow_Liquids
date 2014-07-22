package com.wristwatch1_rainbowwater;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.fluids.FluidRegistry;
import com.wristwatch1_rainbowwater.block.BlockBlackSpectra;
import com.wristwatch1_rainbowwater.block.BlockBlueSpectra;
import com.wristwatch1_rainbowwater.block.BlockBrownSpectra;
import com.wristwatch1_rainbowwater.block.BlockCyanSpectra;
import com.wristwatch1_rainbowwater.block.BlockGreenSpectra;
import com.wristwatch1_rainbowwater.block.BlockGreySpectra;
import com.wristwatch1_rainbowwater.block.BlockLightBlueSpectra;
import com.wristwatch1_rainbowwater.block.BlockLightGreySpectra;
import com.wristwatch1_rainbowwater.block.BlockLimeGreenSpectra;
import com.wristwatch1_rainbowwater.block.BlockMagentaSpectra;
import com.wristwatch1_rainbowwater.block.BlockOrangeSpectra;
import com.wristwatch1_rainbowwater.block.BlockPinkSpectra;
import com.wristwatch1_rainbowwater.block.BlockProtoSpectra;
import com.wristwatch1_rainbowwater.block.BlockPurpleSpectra;
import com.wristwatch1_rainbowwater.block.BlockRedSpectra;
import com.wristwatch1_rainbowwater.block.BlockWhiteSpectra;
import com.wristwatch1_rainbowwater.block.BlockYellowSpectra;
import com.wristwatch1_rainbowwater.buckethandlers.BlackSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.BlueSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.BrownSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.CyanSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.GreenSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.GreySpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.LightBlueSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.LightGreySpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.LimeGreenSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.MagentaSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.OrangeSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.PinkSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.BlackSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.BlueSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.BrownSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.CyanSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.GreenSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.GreySpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.LightBlueSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.LightGreySpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.LimeGreenSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.MagentaSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.OrangeSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.PinkSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.ProtoSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.PurpleSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.RedSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.WhiteSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.YellowSpectraBucketHandler;
import com.wristwatch1_rainbowwater.eventhooks.RainbowWaterEventHooks;
import com.wristwatch1_rainbowwater.buckethandlers.PurpleSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.RedSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.WhiteSpectraBucketHandler;
import com.wristwatch1_rainbowwater.buckethandlers.YellowSpectraBucketHandler;
import com.wristwatch1_rainbowwater.item.ItemBlackSpectraBucket;
import com.wristwatch1_rainbowwater.item.ItemBlueSpectraBucket;
import com.wristwatch1_rainbowwater.item.ItemBrownSpectraBucket;
import com.wristwatch1_rainbowwater.item.ItemCyanSpectraBucket;
import com.wristwatch1_rainbowwater.item.ItemGreenSpectraBucket;
import com.wristwatch1_rainbowwater.item.ItemGreySpectraBucket;
import com.wristwatch1_rainbowwater.item.ItemLightBlueSpectraBucket;
import com.wristwatch1_rainbowwater.item.ItemLightGreySpectraBucket;
import com.wristwatch1_rainbowwater.item.ItemLimeGreenSpectraBucket;
import com.wristwatch1_rainbowwater.item.ItemMagentaSpectraBucket;
import com.wristwatch1_rainbowwater.item.ItemOrangeSpectraBucket;
import com.wristwatch1_rainbowwater.item.ItemPinkSpectraBucket;
import com.wristwatch1_rainbowwater.item.ItemProtoSpectraBucket;
import com.wristwatch1_rainbowwater.item.ItemPurpleSpectraBucket;
import com.wristwatch1_rainbowwater.item.ItemRedSpectraBucket;
import com.wristwatch1_rainbowwater.item.ItemWhiteSpectraBucket;
import com.wristwatch1_rainbowwater.item.ItemYellowSpectraBucket;
import com.wristwatch1_rainbowwater.potion.PotionYourmod;
import com.wristwatch1_rainbowwater.tabs.TabFluids;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod( modid = rainbowwater.modid, name = "Rainbow Liquids", version = "1.2.2 for MC 1.7.2", dependencies = "after:coloredlightscore") //Mod details


public class rainbowwater

{
	public static final String modid = "wristwatch1_rainbowwater"; //sets MODID
	
	@Instance ("wristwatch1_rainbowwater")
	public static rainbowwater instance;
	
	@SidedProxy (clientSide = "com.wristwatch1_rainbowwater.ClientProxyRainbowWater", serverSide = "mod.wristwatch1_rainbowwater.commonProxyRainbowWater")
	public static CommonProxyRainbowWater proxy; //sets the proxys
	
	
	
	//CreativeTabs
	
		public static CreativeTabs tabFluids = new TabFluids(CreativeTabs.getNextID(),"Wristwatch1tabFluids"); //Creates Creative tab
	
		
		
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
	
	
	//Potion
	
	public static Potion CustomPotion;
	
	
	//Armour
	
	
	
	 
	
	
	@EventHandler public void preInit(FMLPreInitializationEvent evt) {
		
		proxy.registerRenderThings(); //Without this, buckets wont fill
		
		
		{
			Potion[] potionTypes = null;
			for (Field f : Potion.class.getDeclaredFields()) 
			{
				f.setAccessible(true);
				try 
				{
					if (f.getName().equals("potionTypes") || f.getName().equals("field_76425_a")) 
					{
						Field modfield = Field.class.getDeclaredField("modifiers");
						modfield.setAccessible(true);
						modfield.setInt(f, f.getModifiers() & ~Modifier.FINAL);
						
						potionTypes = (Potion[])f.get(null);
						final Potion[] newPotionTypes = new Potion[256];
						System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
						f.set(null, newPotionTypes);
						}
					}
				catch (Exception e) 
				{
					System.err.println("Severe error, please report this to the mod author:");
					System.err.println(e);
					}
				}
			MinecraftForge.EVENT_BUS.register(new RainbowWaterEventHooks());
			}
		
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
		 
	}
	

	@EventHandler
	  public void load(FMLInitializationEvent event) 
	  {
		//Fluids (Defining the files, and registering them)
		
		ProtoSpectra = new Fluid ("ProtoSpectra").setDensity(10).setViscosity(1000);
		
		WhiteSpectra = new Fluid ("WhiteSpectra").setDensity(10).setViscosity(1000);
		
		OrangeSpectra = new Fluid ("OrangeSpectra").setDensity(10).setViscosity(1000);
		
		MagentaSpectra = new Fluid ("MagentaSpectra").setDensity(10).setViscosity(1000);
		
		LightBlueSpectra = new Fluid ("LightBlueSpectra").setDensity(10).setViscosity(1000);
		
		YellowSpectra = new Fluid ("YellowSpectra").setDensity(10).setViscosity(1000);
		
		LimeGreenSpectra = new Fluid ("LimeGreenSpectra").setDensity(10).setViscosity(1000);
		
		PinkSpectra = new Fluid ("PinkSpectra").setDensity(10).setViscosity(1000);
		
		GreySpectra = new Fluid ("GreySpectra").setDensity(10).setViscosity(1000);
		
		LightGreySpectra = new Fluid ("LightGreySpectra").setDensity(10).setViscosity(1000);
		
		CyanSpectra = new Fluid ("CyanSpectra").setDensity(10).setViscosity(1000);
		
		PurpleSpectra = new Fluid ("PurpleSpectra").setDensity(10).setViscosity(1000);
		
		BlueSpectra = new Fluid ("BlueSpectra").setDensity(10).setViscosity(1000);
		
		BrownSpectra = new Fluid ("BrownSpectra").setDensity(10).setViscosity(1000);
		
		GreenSpectra = new Fluid ("GreenSpectra").setDensity(10).setViscosity(1000);
		
		RedSpectra = new Fluid ("RedSpectra").setDensity(10).setViscosity(1000);
		
		BlackSpectra = new Fluid ("BlackSpectra").setDensity(10).setViscosity(1000);
		
		
		FluidRegistry.registerFluid(ProtoSpectra);
		
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
		
		
		
		//Blocks (links to the class files and sets BLOCKID's and unlocalized names)
		
		BlockProtoSpectra = new BlockProtoSpectra(ProtoSpectra, Material.water);//.setBlockName("BlockProtoSpectra");  //2382
		
		BlockWhiteSpectra = new BlockWhiteSpectra(WhiteSpectra, Material.water);//.setBlockTextureName(modid + ":" + BlockWhiteSpectra);  //2378
		
		BlockOrangeSpectra = new BlockOrangeSpectra(OrangeSpectra, Material.water); //.setBlockName("BlockOrangeSpecta");  //2370
			
		BlockMagentaSpectra = new BlockMagentaSpectra(MagentaSpectra, Material.water); //.setBlockName("BlockMagentaSpectra");  //2368
		
		BlockLightBlueSpectra = new BlockLightBlueSpectra(LightBlueSpectra, Material.water); //.setBlockName("BlockLightBlueSpectra");  //2362

		BlockYellowSpectra = new BlockYellowSpectra(YellowSpectra, Material.water); //.setBlockName("BlockYellowSpectra");  //2380

		BlockLimeGreenSpectra = new BlockLimeGreenSpectra(LimeGreenSpectra, Material.water); //.setBlockName("BlockLimeGreenSpectra");  //2366

		BlockPinkSpectra = new BlockPinkSpectra(PinkSpectra, Material.water); //.setBlockName("BlockPinkSpectra");  //2372

		BlockGreySpectra = new BlockGreySpectra(GreySpectra, Material.water); //.setBlockName("BlockGreySpectra");  //2360

		BlockLightGreySpectra = new BlockLightGreySpectra(LightGreySpectra, Material.water); //.setBlockName("BlockLightGreySpectra");  //2364

		BlockCyanSpectra = new BlockCyanSpectra(CyanSpectra, Material.water); //.setBlockName("BlockCyanSpectra");  //2356

		BlockPurpleSpectra = new BlockPurpleSpectra(PurpleSpectra, Material.water); //.setBlockName("BlockPurpleSpectra");  //2374
		
		BlockBlueSpectra = new BlockBlueSpectra(BlueSpectra, Material.water); //.setBlockName("BlockBlueSpectra");  //2352
		
		BlockBrownSpectra = new BlockBrownSpectra(BrownSpectra, Material.water); //.setBlockName("BlockBrownSpectra");  //2354
		
		BlockGreenSpectra = new BlockGreenSpectra(GreenSpectra, Material.water); //.setBlockName("BlockGreenSpectra");  //2358
		
		BlockRedSpectra = new BlockRedSpectra(RedSpectra, Material.water); //.setBlockName("BlockRedSpectra");  //2376
		
		BlockBlackSpectra = new BlockBlackSpectra(BlackSpectra, Material.water); //.setBlockName("BlockBlackSpectra");  //2350
		
		//Items (Links to the class files and sets ITEMID'S, unlocalized names and container items) 
		
		ProtoSpectraBucket = new ItemProtoSpectraBucket(BlockProtoSpectra).setUnlocalizedName("ItemProtoSpectraBucket").setContainerItem(Items.bucket);  //3857, BlockProtoSpectra.blockID
		
		WhiteSpectraBucket = new ItemWhiteSpectraBucket(BlockWhiteSpectra).setUnlocalizedName("ItemWhiteSpectraBucket").setContainerItem(Items.bucket);  //3841, BlockWhiteSpectra.blockID

		OrangeSpectraBucket = new ItemOrangeSpectraBucket(BlockOrangeSpectra).setUnlocalizedName("ItemOrangeSpectraBucket").setContainerItem(Items.bucket);  //3842, BlockOrangeSpectra.blockID

		MagentaSpectraBucket = new ItemMagentaSpectraBucket(BlockMagentaSpectra).setUnlocalizedName("ItemMagentaSpectraBucket").setContainerItem(Items.bucket);  //3843, BlockMagentaSpectra.blockID
		
		LightBlueSpectraBucket = new ItemLightBlueSpectraBucket(BlockLightBlueSpectra).setUnlocalizedName("ItemLightBlueSpectraBucket").setContainerItem(Items.bucket);  //3844, BlockLightBlueSpectra.blockID
		
		YellowSpectraBucket = new ItemYellowSpectraBucket(BlockYellowSpectra).setUnlocalizedName("ItemYellowSpectraBucket").setContainerItem(Items.bucket);  //3845, BlockYellowSpectra.blockID
		
		LimeGreenSpectraBucket = new ItemLimeGreenSpectraBucket(BlockLimeGreenSpectra).setUnlocalizedName("ItemLimeGreenSpectraBucket").setContainerItem(Items.bucket);  //3846, BlockLimeGreenSpectra.blockID

		PinkSpectraBucket = new ItemPinkSpectraBucket(BlockPinkSpectra).setUnlocalizedName("ItemPinkSpectraBucket").setContainerItem(Items.bucket);  //3847, BlockPinkSpectra.blockID
		
		GreySpectraBucket = new ItemGreySpectraBucket(BlockGreySpectra).setUnlocalizedName("ItemGreySpectraBucket").setContainerItem(Items.bucket);  //3848, BlockGreySpectra.blockID
		
		LightGreySpectraBucket = new ItemLightGreySpectraBucket(BlockLightGreySpectra).setUnlocalizedName("ItemLightGreySpectraBucket").setContainerItem(Items.bucket);  //3849, BlockLightGreySpectra.blockID

		CyanSpectraBucket = new ItemCyanSpectraBucket(BlockCyanSpectra).setUnlocalizedName("ItemCyanSpectraBucket").setContainerItem(Items.bucket);  //3850, BlockCyanSpectra.blockID

		PurpleSpectraBucket = new ItemPurpleSpectraBucket(BlockPurpleSpectra).setUnlocalizedName("ItemPurpleSpectraBucket").setContainerItem(Items.bucket);  //3851, BlockPurpleSpectra.blockID
		
		BlueSpectraBucket = new ItemBlueSpectraBucket(BlockBlueSpectra).setUnlocalizedName("ItemBlueSpectraBucket").setContainerItem(Items.bucket);  //3852, BlockBlueSpectra.blockID

		BrownSpectraBucket = new ItemBrownSpectraBucket(BlockBrownSpectra).setUnlocalizedName("ItemBrownSpectraBucket").setContainerItem(Items.bucket);  //3853, BlockBrownSpectra.blockID

		GreenSpectraBucket = new ItemGreenSpectraBucket(BlockGreenSpectra).setUnlocalizedName("ItemGreenSpectraBucket").setContainerItem(Items.bucket);  //3854, BlockGreenSpectra.blockID

		RedSpectraBucket = new ItemRedSpectraBucket(BlockRedSpectra).setUnlocalizedName("ItemRedSpectraBucket").setContainerItem(Items.bucket);  //3855, BlockRedSpectra.blockID

		BlackSpectraBucket = new ItemBlackSpectraBucket(BlockBlackSpectra).setUnlocalizedName("ItemBlackSpectraBucket").setContainerItem(Items.bucket); //3856, BlockBlackSpectra.blockID
		
		//Potions
		
		CustomPotion = (new PotionYourmod(32, false, 5149489)).setIconIndex(7, 2).setPotionName("potion.customPotion");
		
		//Game Registry (Registers the blocks and items to the game)
		
		//Blocks
		
		 GameRegistry.registerBlock(BlockProtoSpectra, "ProtoSpectra");
		
		 GameRegistry.registerBlock(BlockWhiteSpectra, "WhiteSpectra");
		 
		 GameRegistry.registerBlock(BlockOrangeSpectra, "OrangeSpectra");
		
		 GameRegistry.registerBlock(BlockMagentaSpectra, "MagentaSpectra");
		 
		 GameRegistry.registerBlock(BlockLightBlueSpectra, "LightBlueSpectra");
		 
		 GameRegistry.registerBlock(BlockYellowSpectra, "YellowSpectra");
		 
		 GameRegistry.registerBlock(BlockLimeGreenSpectra, "LimeGreenSpectra");

		 GameRegistry.registerBlock(BlockPinkSpectra, "PinkSpectra");

		 GameRegistry.registerBlock(BlockGreySpectra, "BlockGreySpectra");

		 GameRegistry.registerBlock(BlockLightGreySpectra, "BlockLightGreySpectra");

		 GameRegistry.registerBlock(BlockCyanSpectra, "BlockCyanSpectra");

		 GameRegistry.registerBlock(BlockPurpleSpectra, "BlockPurpleSpectra");
		
		 GameRegistry.registerBlock(BlockBlueSpectra, "BlockBlueSpectra");
		 
		 GameRegistry.registerBlock(BlockBrownSpectra, "BlockBrownSpectra");
		 
		 GameRegistry.registerBlock(BlockGreenSpectra, "BlockGreenSpectra");
		 
		 GameRegistry.registerBlock(BlockRedSpectra, "BlockRedSpectra");
		 
		 GameRegistry.registerBlock(BlockBlackSpectra, "BlockBlackSpectra");
		 
		 //Items
		 
		 GameRegistry.registerItem(ProtoSpectraBucket, "ProtoSpectraBucket");
		 
		 GameRegistry.registerItem(WhiteSpectraBucket, "WhiteSpectraBucket");
		 
		 GameRegistry.registerItem(OrangeSpectraBucket, "OrangeSpectraBucket");
		 
		 GameRegistry.registerItem(MagentaSpectraBucket, "MagentaSpectraBucket");
		 
		 GameRegistry.registerItem(LightBlueSpectraBucket, "LightBlueSpectraBucket");
		 
		 GameRegistry.registerItem(YellowSpectraBucket, "YellowSpectraBucket");
		 
		 GameRegistry.registerItem(LimeGreenSpectraBucket, "LimeGreenSpectraBucket");
		 
		 GameRegistry.registerItem(PinkSpectraBucket, "PinkSpectraBucket");
		 
		 GameRegistry.registerItem(GreySpectraBucket, "GreySpectraBucket");
		 
		 GameRegistry.registerItem(LightGreySpectraBucket, "LightGreySpectraBucket");
		 
		 GameRegistry.registerItem(CyanSpectraBucket, "CyanSpectraBucket");
		 
		 GameRegistry.registerItem(PurpleSpectraBucket, "PurpleSpectraBucket");
		 
		 GameRegistry.registerItem(BlueSpectraBucket, "BlueSpectraBucket");
		 
		 GameRegistry.registerItem(BrownSpectraBucket, "BrownSpectraBucket");
		 
		 GameRegistry.registerItem(GreenSpectraBucket, "GreenSpectraBucket");
		 
		 GameRegistry.registerItem(RedSpectraBucket, "RedSpectraBucket");
		 
		 GameRegistry.registerItem(BlackSpectraBucket, "BlackSpectraBucket");
		 
		 
		 
		 //Language Registry
		 
		 //Blocks
		 
		 //Fluid (Gives the fluids their in-game names)
		 
		 //LanguageRegistry.addName(BlockProtoSpectra, "Prototype Spectra");
		 
		 //LanguageRegistry.addName(BlockWhiteSpectra, "White Spectra");
		 
		 //LanguageRegistry.addName(BlockOrangeSpectra, "Orange Spectra");
		 
		 //LanguageRegistry.addName(BlockMagentaSpectra, "Magenta Spectra");
		 
		 //LanguageRegistry.addName(BlockLightBlueSpectra, "Light Blue Spectra");
		 
		 //LanguageRegistry.addName(BlockYellowSpectra, "Yellow Spectra");
		 
		 //LanguageRegistry.addName(BlockLimeGreenSpectra, "Lime Green Spectra");
		 
		 //LanguageRegistry.addName(BlockPinkSpectra, "Pink Spectra");
		 
		 //LanguageRegistry.addName(BlockGreySpectra, "Grey Spectra");

		 //LanguageRegistry.addName(BlockLightGreySpectra, "Light Grey Spectra");

		 //LanguageRegistry.addName(BlockCyanSpectra, "Cyan Spectra");

		 //LanguageRegistry.addName(BlockPurpleSpectra, "Purple Spectra");

		 //LanguageRegistry.addName(BlockBlueSpectra, "Blue Spectra");
		 
		 //LanguageRegistry.addName(BlockBrownSpectra, "Brown Spectra");
		 
		 //LanguageRegistry.addName(BlockGreenSpectra, "Green Spectra");
		 
		 //LanguageRegistry.addName(BlockRedSpectra, "Red Spectra");

		 //LanguageRegistry.addName(BlockBlackSpectra, "Black Spectra");
		 
		 //Items (Gives the items their in-game names)
		 
		 //LanguageRegistry.addName(ProtoSpectraBucket, "Bucket of Prototype Spectra");
		 
		 //LanguageRegistry.addName(WhiteSpectraBucket, "Bucket of White Spectra");
		 
		 //LanguageRegistry.addName(OrangeSpectraBucket, "Bucket of Orange Spectra");
		 
		 //LanguageRegistry.addName(MagentaSpectraBucket, "Bucket of Magenta Spectra");
		 
		 //LanguageRegistry.addName(LightBlueSpectraBucket, "Bucket of Light Blue Spectra");
		 
		 //LanguageRegistry.addName(YellowSpectraBucket, "Bucket of Yellow Spectra");
		 
		 //LanguageRegistry.addName(LimeGreenSpectraBucket, "Bucket of Lime Green Spectra");
		 
		 //LanguageRegistry.addName(PinkSpectraBucket, "Bucket of Pink Spectra");
		 
		 //LanguageRegistry.addName(GreySpectraBucket, "Bucket of Grey Spectra");
		 
		 //LanguageRegistry.addName(LightGreySpectraBucket, "Bucket of Light Grey Spectra");
		 
		 //LanguageRegistry.addName(CyanSpectraBucket, "Bucket of Cyan Spectra");
		 
		 //LanguageRegistry.addName(PurpleSpectraBucket, "Bucket of Purple Spectra");
		 
		 //LanguageRegistry.addName(BlueSpectraBucket, "Bucket of Blue Spectra");

		 //LanguageRegistry.addName(BrownSpectraBucket, "Bucket of Brown Spectra");

		 //LanguageRegistry.addName(GreenSpectraBucket, "Bucket of Green Spectra");

		 //LanguageRegistry.addName(RedSpectraBucket, "Bucket of Red Spectra");

		 //LanguageRegistry.addName(BlackSpectraBucket, "Bucket of Black Spectra");
		 
		 //Armour
		 
		 
		 //ItemStacks (Used for crafting)
		 
		 ItemStack waterBucketStack = new ItemStack(Items.water_bucket);
		 
		 ItemStack emptyBucketStack = new ItemStack(Items.bucket);
		 
		 ItemStack waterBottleStack = new ItemStack(Items.potionitem, 0);
		 
		 ItemStack whiteDyeStack = new ItemStack(Items.dye, 1, 15);

		 ItemStack orangeDyeStack = new ItemStack(Items.dye, 1, 14);

		 ItemStack magentaDyeStack = new ItemStack(Items.dye, 1, 13);

		 ItemStack lightblueDyeStack = new ItemStack(Items.dye, 1, 12);

		 ItemStack yellowDyeStack = new ItemStack(Items.dye, 1, 11);

		 ItemStack limegreenDyeStack = new ItemStack(Items.dye, 1, 10);

		 ItemStack pinkDyeStack = new ItemStack(Items.dye, 1, 9);

		 ItemStack greyDyeStack = new ItemStack(Items.dye, 1, 8);

		 ItemStack lightgreyDyeStack = new ItemStack(Items.dye, 1, 7);

		 ItemStack cyanDyeStack = new ItemStack(Items.dye, 1, 6);

		 ItemStack purpleDyeStack = new ItemStack(Items.dye, 1, 5);

		 ItemStack blueDyeStack = new ItemStack(Items.dye, 1, 4);

		 ItemStack brownDyeStack = new ItemStack(Items.dye, 1, 3);

		 ItemStack greenDyeStack = new ItemStack(Items.dye, 1, 2);

		 ItemStack redDyeStack = new ItemStack(Items.dye, 1, 1);

		 ItemStack blackDyeStack = new ItemStack(Items.dye, 1, 0);
		 
		 
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
		 
		 //Fluid Name Registry
		 
		 ProtoSpectra.setUnlocalizedName(BlockProtoSpectra.getUnlocalizedName());
		 
		 WhiteSpectra.setUnlocalizedName(BlockWhiteSpectra.getUnlocalizedName());
		 
		 OrangeSpectra.setUnlocalizedName(BlockOrangeSpectra.getUnlocalizedName());
		 
		 MagentaSpectra.setUnlocalizedName(BlockMagentaSpectra.getUnlocalizedName());
		 
		 LightBlueSpectra.setUnlocalizedName(BlockLightBlueSpectra.getUnlocalizedName());
		 
		 YellowSpectra.setUnlocalizedName(BlockYellowSpectra.getUnlocalizedName());
		 
		 LimeGreenSpectra.setUnlocalizedName(BlockLimeGreenSpectra.getUnlocalizedName());
		 
		 PinkSpectra.setUnlocalizedName(BlockPinkSpectra.getUnlocalizedName());
		 
		 GreySpectra.setUnlocalizedName(BlockGreySpectra.getUnlocalizedName());
		 
		 LightGreySpectra.setUnlocalizedName(BlockLightGreySpectra.getUnlocalizedName());
		 
		 CyanSpectra.setUnlocalizedName(BlockCyanSpectra.getUnlocalizedName());
		 
		 PurpleSpectra.setUnlocalizedName(BlockPurpleSpectra.getUnlocalizedName());
		 
		 BlueSpectra.setUnlocalizedName(BlockBlueSpectra.getUnlocalizedName());
		 
		 BrownSpectra.setUnlocalizedName(BlockBrownSpectra.getUnlocalizedName());
		 
		 GreenSpectra.setUnlocalizedName(BlockGreenSpectra.getUnlocalizedName());
		 
		 RedSpectra.setUnlocalizedName(BlockRedSpectra.getUnlocalizedName());
		 
		 BlackSpectra.setUnlocalizedName(BlockBlackSpectra.getUnlocalizedName());
		 
		 
		 //ContainerRegistery (Links the bucket to the fluid)
		 
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.ProtoSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.ProtoSpectraBucket), new ItemStack(Items.bucket)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.WhiteSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.WhiteSpectraBucket), new ItemStack(Items.bucket)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.OrangeSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.OrangeSpectraBucket), new ItemStack(Items.bucket)));
		
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.MagentaSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.MagentaSpectraBucket), new ItemStack(Items.bucket)));
		 
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.LightBlueSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.LightBlueSpectraBucket), new ItemStack(Items.bucket)));
		 
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.YellowSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.YellowSpectraBucket), new ItemStack(Items.bucket)));
		 
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.LimeGreenSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.LimeGreenSpectraBucket), new ItemStack(Items.bucket)));
		 
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.PinkSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.PinkSpectraBucket), new ItemStack(Items.bucket)));
		 
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.GreySpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.GreySpectraBucket), new ItemStack(Items.bucket)));
		 
		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.LightGreySpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.LightGreySpectraBucket), new ItemStack(Items.bucket)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.CyanSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.CyanSpectraBucket), new ItemStack(Items.bucket)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.PurpleSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.PurpleSpectraBucket), new ItemStack(Items.bucket)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.BlueSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.BlueSpectraBucket), new ItemStack(Items.bucket)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.BrownSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.BrownSpectraBucket), new ItemStack(Items.bucket)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.GreenSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.GreenSpectraBucket), new ItemStack(Items.bucket)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.RedSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.RedSpectraBucket), new ItemStack(Items.bucket)));

		 FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(rainbowwater.BlackSpectra.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(rainbowwater.BlackSpectraBucket), new ItemStack(Items.bucket)));
		 
		 
		 ProtoSpectraBucketHandler.INSTANCE.buckets.put(BlockProtoSpectra, ProtoSpectraBucket);
		
		 WhiteSpectraBucketHandler.INSTANCE.buckets.put(BlockWhiteSpectra, WhiteSpectraBucket);
		 
		 OrangeSpectraBucketHandler.INSTANCE.buckets.put(BlockOrangeSpectra, OrangeSpectraBucket);
		 
		 MagentaSpectraBucketHandler.INSTANCE.buckets.put(BlockMagentaSpectra, MagentaSpectraBucket);
		 
		 LightBlueSpectraBucketHandler.INSTANCE.buckets.put(BlockLightBlueSpectra, LightBlueSpectraBucket);
		
		 YellowSpectraBucketHandler.INSTANCE.buckets.put(BlockYellowSpectra, YellowSpectraBucket);
			
		 LimeGreenSpectraBucketHandler.INSTANCE.buckets.put(BlockLimeGreenSpectra, LimeGreenSpectraBucket);
		 
		 PinkSpectraBucketHandler.INSTANCE.buckets.put(BlockPinkSpectra, PinkSpectraBucket);
		 
		 GreySpectraBucketHandler.INSTANCE.buckets.put(BlockGreySpectra, GreySpectraBucket);
		 
		 LightGreySpectraBucketHandler.INSTANCE.buckets.put(BlockLightGreySpectra, LightGreySpectraBucket);
		 
		 CyanSpectraBucketHandler.INSTANCE.buckets.put(BlockCyanSpectra, CyanSpectraBucket);
		 
		 PurpleSpectraBucketHandler.INSTANCE.buckets.put(BlockPurpleSpectra, PurpleSpectraBucket);
		 
		 BlueSpectraBucketHandler.INSTANCE.buckets.put(BlockBlueSpectra, BlueSpectraBucket);
		 
		 BrownSpectraBucketHandler.INSTANCE.buckets.put(BlockBrownSpectra, BrownSpectraBucket);
		 
		 GreenSpectraBucketHandler.INSTANCE.buckets.put(BlockGreenSpectra, GreenSpectraBucket);
		 
		 RedSpectraBucketHandler.INSTANCE.buckets.put(BlockRedSpectra, RedSpectraBucket);
		 
		 BlackSpectraBucketHandler.INSTANCE.buckets.put(BlockBlackSpectra, BlackSpectraBucket);
		 
		 
		 MinecraftForge.EVENT_BUS.register(ProtoSpectraBucketHandler.INSTANCE);
		 
		 MinecraftForge.EVENT_BUS.register(WhiteSpectraBucketHandler.INSTANCE);
		 
		 MinecraftForge.EVENT_BUS.register(OrangeSpectraBucketHandler.INSTANCE);
		 
		 MinecraftForge.EVENT_BUS.register(MagentaSpectraBucketHandler.INSTANCE);
		 
		 MinecraftForge.EVENT_BUS.register(LightBlueSpectraBucketHandler.INSTANCE);
		 
		 MinecraftForge.EVENT_BUS.register(YellowSpectraBucketHandler.INSTANCE);
		 
		 MinecraftForge.EVENT_BUS.register(LimeGreenSpectraBucketHandler.INSTANCE);
		 
		 MinecraftForge.EVENT_BUS.register(PinkSpectraBucketHandler.INSTANCE);
		 
		 MinecraftForge.EVENT_BUS.register(GreySpectraBucketHandler.INSTANCE);
		 
		 MinecraftForge.EVENT_BUS.register(LightGreySpectraBucketHandler.INSTANCE);
		 
		 MinecraftForge.EVENT_BUS.register(CyanSpectraBucketHandler.INSTANCE);
		 
		 MinecraftForge.EVENT_BUS.register(PurpleSpectraBucketHandler.INSTANCE);
		 
		 MinecraftForge.EVENT_BUS.register(BlueSpectraBucketHandler.INSTANCE);
		 
		 MinecraftForge.EVENT_BUS.register(BrownSpectraBucketHandler.INSTANCE);
		 
		 MinecraftForge.EVENT_BUS.register(GreenSpectraBucketHandler.INSTANCE);
		 
		 MinecraftForge.EVENT_BUS.register(RedSpectraBucketHandler.INSTANCE);
		 
		 MinecraftForge.EVENT_BUS.register(BlackSpectraBucketHandler.INSTANCE);
		 
	  }
		/* @ForgeSubscribe
		 @SideOnly(Side.CLIENT)
			public void textureHook(TextureStitchEvent.Post event) {
				if (event.map.textureType == 0) {
					WhiteSpectra.setIcons(rainbowwater.BlockWhiteSpectra.getBlockTextureFromSide(1));
				}
			}*/
	
	
		 {
		//EventBus
		 MinecraftForge.EVENT_BUS.register(this); //Closes the stuff
		 }
		 
	@EventHandler public void postInit(FMLPostInitializationEvent evt) {

		}
	 }
	 

