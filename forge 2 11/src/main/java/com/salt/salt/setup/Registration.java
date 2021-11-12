package com.salt.salt.setup;

import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.salt.salt.items.SaltItem;

import static com.salt.salt.Salt.MODID;




public class Registration {

	
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
	
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	
	
	public static final RegistryObject<Item> SALTITEM = ITEMS.register("saltitem", () -> new SaltItem(new Item.Properties()));
}
