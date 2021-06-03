package com.pmso.momweapons.init;

import com.pmso.momweapons.Tugaflavours;
import com.pmso.momweapons.client.items.ModItem;
import com.pmso.momweapons.util.enums.ModArmourMaterial;
import com.pmso.momweapons.util.enums.ModItemTier;

import net.minecraft.item.Rarity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			MomWeapons.MOD_ID);

}
