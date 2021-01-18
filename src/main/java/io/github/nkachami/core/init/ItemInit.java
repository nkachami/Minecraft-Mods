package io.github.nkachami.core.init;

import io.github.nkachami.TestMod;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID); 
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("itemtest", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.DRIED_KELP)));
	
	
	
	
}
