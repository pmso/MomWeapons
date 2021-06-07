package com.pmso.momweapons.init;

import com.pmso.momweapons.MomWeapons;
import com.pmso.momweapons.client.items.WearableWeapon;
import com.pmso.momweapons.util.enums.ModArmorMaterial;

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
			() -> new WearableWeapon(ModArmorMaterial.LEATHER_SLIPPER,10,10 ,EquipmentSlotType.FEET,
					new Item.Properties().group(MomWeapons.TAB),true));
	
	public static final RegistryObject<ArmorItem> LEATHER_SLIPPERS = ITEMS.register("leather_slippers",
			() -> new ArmorItem(ModArmorMaterial.LEATHER_SLIPPER,EquipmentSlotType.FEET,
					new Item.Properties().group(MomWeapons.TAB)));
	

	public static final RegistryObject<ArmorItem> CHAINMAIL_SLIPPER = ITEMS.register("chainmail_slipper",
			() -> new WearableWeapon(ModArmorMaterial.CHAINMAIL_SLIPPER,10,10 ,EquipmentSlotType.FEET,
					new Item.Properties().group(MomWeapons.TAB),true));
	
	public static final RegistryObject<ArmorItem> CHAINMAIL_SLIPPERS = ITEMS.register("chainmail_slippers",
			() -> new ArmorItem(ModArmorMaterial.CHAINMAIL_SLIPPERS,EquipmentSlotType.FEET,
					new Item.Properties().group(MomWeapons.TAB)));
	

	public static final RegistryObject<ArmorItem> IRON_SLIPPER = ITEMS.register("iron_slipper",
			() -> new WearableWeapon(ModArmorMaterial.IRON_SLIPPER,10,10 ,EquipmentSlotType.FEET,
					new Item.Properties().group(MomWeapons.TAB),true));
	
	public static final RegistryObject<ArmorItem> IRON_SLIPPERS = ITEMS.register("iron_slippers",
			() -> new ArmorItem(ModArmorMaterial.IRON_SLIPPERS,EquipmentSlotType.FEET,
					new Item.Properties().group(MomWeapons.TAB)));


	public static final RegistryObject<ArmorItem> GOLD_SLIPPER = ITEMS.register("gold_slipper",
			() -> new WearableWeapon(ModArmorMaterial.GOLD_SLIPPER,10,10 ,EquipmentSlotType.FEET,
					new Item.Properties().group(MomWeapons.TAB),true));
	
	public static final RegistryObject<ArmorItem> GOLD_SLIPPERS = ITEMS.register("gold_slippers",
			() -> new ArmorItem(ModArmorMaterial.GOLD_SLIPPERS,EquipmentSlotType.FEET,
					new Item.Properties().group(MomWeapons.TAB)));


	public static final RegistryObject<ArmorItem> DIAMOND_SLIPPER = ITEMS.register("diamond_slipper",
			() -> new WearableWeapon(ModArmorMaterial.DIAMOND_SLIPPER,10,10 ,EquipmentSlotType.FEET,
					new Item.Properties().group(MomWeapons.TAB),true));
	
	public static final RegistryObject<ArmorItem> DIAMOND_SLIPPERS = ITEMS.register("diamond_slippers",
			() -> new ArmorItem(ModArmorMaterial.DIAMOND_SLIPPERS,EquipmentSlotType.FEET,
					new Item.Properties().group(MomWeapons.TAB)));


	public static final RegistryObject<ArmorItem> NETHERITE_SLIPPER = ITEMS.register("netherite_slipper",
			() -> new WearableWeapon(ModArmorMaterial.NETHERITE_SLIPPER,10,10 ,EquipmentSlotType.FEET,
					new Item.Properties().group(MomWeapons.TAB),true));
	
	public static final RegistryObject<ArmorItem> NETHERITE_SLIPPERS = ITEMS.register("netherite_slippers",
			() -> new ArmorItem(ModArmorMaterial.NETHERITE_SLIPPERS,EquipmentSlotType.FEET,
					new Item.Properties().group(MomWeapons.TAB)));
}
