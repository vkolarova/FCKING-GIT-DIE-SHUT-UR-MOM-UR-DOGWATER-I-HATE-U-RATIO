package com.salt.salt;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.salt.salt.setup.Registration;

//import com.salt.salt.setup.Registration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



// The value here should match an entry in the META-INF/mods.toml file
@Mod(Salt.MODID)
public class Salt
{
    // Directly reference a log4j logger.
	private static final Logger LOGGER = LogManager.getLogger();
    
    public static final String MODID = "salt";
    public static final String NAME = "salt_mod";
    public static final String VERSION = "1.0";
  

    
   

    public Salt() {
    	
    	Registration.init();
    	
    	
    	
        	// Register the setup method for modloading
    	
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);     

     
        	// Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
    }


    

   
    
    
    
}
