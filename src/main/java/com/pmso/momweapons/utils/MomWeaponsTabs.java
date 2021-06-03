package com.pmso.momweapons.util;

import java.util.Comparator;

import com.pmso.momweapons.init.ModItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class MomWeaponsTabs extends ItemGroup{

	public TugaFlavoursTabs() {
		super("momWeaponsTab");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ModItems.LEATHER_SLIPPER.get());
	}
	
	
	@Override
	public void fill(NonNullList<ItemStack> items) {
		super.fill(items);
		items.sort(new Comparator<ItemStack>() {

			@Override
			public int compare(ItemStack a, ItemStack b) {
				// TODO Auto-generated method stub
				return a.getItem().getName().toString().compareToIgnoreCase(b.getItem().getName().toString());
			}
		});
	}
	
	@Override
	public boolean hasSearchBar() {
		return false;
	}
}
