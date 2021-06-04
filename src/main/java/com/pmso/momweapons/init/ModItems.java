package com.pmso.momweapons.init;

import com.pmso.momweapons.MomWeapons;
import com.pmso.momweapons.client.items.WearableWeapon;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			MomWeapons.MOD_ID);
	

	public static final RegistryObject<ArmorItem> LEATHER_SLIPPER = ITEMS.register("leather_slipper",
			() -> new WearableWeapon(ArmorMaterial.LEATHER,10,10 ,EquipmentSlotType.FEET,
					new Item.Properties().group(MomWeapons.TAB)));

}
