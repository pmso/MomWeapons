package com.pmso.momweapons;

import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pmso.momweapons.init.ModItems;
import com.pmso.momweapons.util.MomWeaponsTabs;


// The value here should match an entry in the META-INF/mods.toml file
@Mod("momweapons")
public class MomWeapons
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    
    public static final String MOD_ID="momweapons";
    
    public static IEventBus MOD_EVENT_BUS;
    
    public static final ItemGroup TAB= new MomWeaponsTabs();

    public MomWeapons() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        
        MOD_EVENT_BUS=FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(MOD_EVENT_BUS);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
	public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
	}

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    
    public static ResourceLocation prefix(String name) {
		return new ResourceLocation(MOD_ID, name);
	}
}
