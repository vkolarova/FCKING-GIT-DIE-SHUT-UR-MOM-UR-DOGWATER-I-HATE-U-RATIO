package com.salt.salt.datagen;




import com.salt.salt.Salt;
import com.salt.salt.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;





public class Items extends ItemModelProvider {
	

	public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, Salt.MODID, existingFileHelper);
		
	}

	@Override
	protected void registerModels() {
		singleTexture(
				
				Registration.SALTITEM.get().getRegistryName().getPath(), 
				new ResourceLocation("item/handheld"), 
				new ResourceLocation(Salt.MODID, "item/salttex"));
}
	
	
}
