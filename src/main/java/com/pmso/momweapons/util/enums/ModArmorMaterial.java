package com.pmso.momweapons.util.enums;

import java.util.function.Supplier;

import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.SoundEvents;
import net.minecraft.item.Items;

import com.pmso.momweapons.MomWeapons;

public enum ModArmorMaterial implements IArmorMaterial {

	LEATHER_SLIPPER(MomWeapons.MOD_ID+":leather_slipper",11,new int[] { 1, 3, 3, 1 },18, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 2, () -> { return Ingredient.fromItems(Items.LEATHER); },0),
	LEATHER_SLIPPERS(MomWeapons.MOD_ID+":leather_slippers",11,new int[] { 1, 3, 3, 1 },18, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 2, () -> { return Ingredient.fromItems(Items.LEATHER); },0),

	CHAINMAIL_SLIPPER(MomWeapons.MOD_ID+":chainmail_slipper",11,new int[] { 1, 3, 3, 1 },18, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2, () -> { return Ingredient.fromItems(Items.CHAIN); },0),
	CHAINMAIL_SLIPPERS(MomWeapons.MOD_ID+":chainmail_slippers",11,new int[] { 1, 3, 3, 1 },18, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2, () -> { return Ingredient.fromItems(Items.CHAIN); },0),

	IRON_SLIPPER(MomWeapons.MOD_ID+":iron_slipper",11,new int[] { 1, 3, 3, 1 },18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2, () -> { return Ingredient.fromItems(Items.IRON_INGOT); },0),
	IRON_SLIPPERS(MomWeapons.MOD_ID+":iron_slippers",11,new int[] { 1, 3, 3, 1 },18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2, () -> { return Ingredient.fromItems(Items.IRON_INGOT); },0),

	GOLD_SLIPPER(MomWeapons.MOD_ID+":gold_slipper",11,new int[] { 1, 3, 3, 1 },18, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2, () -> { return Ingredient.fromItems(Items.GOLD_INGOT); },0),
	GOLD_SLIPPERS(MomWeapons.MOD_ID+":gold_slippers",11,new int[] { 1, 3, 3, 1 },18, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2, () -> { return Ingredient.fromItems(Items.GOLD_INGOT); },0),
	
	DIAMOND_SLIPPER(MomWeapons.MOD_ID+":diamond_slipper",11,new int[] { 1, 3, 3, 1 },18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2, () -> { return Ingredient.fromItems(Items.DIAMOND); },0),
	DIAMOND_SLIPPERS(MomWeapons.MOD_ID+":diamond_slippers",11,new int[] { 1, 3, 3, 1 },18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2, () -> { return Ingredient.fromItems(Items.DIAMOND); },0),

	NETHERITE_SLIPPER(MomWeapons.MOD_ID+":netherite_slipper",11,new int[] { 1, 3, 3, 1 },18, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2, () -> { return Ingredient.fromItems(Items.NETHERITE_INGOT); },0.1f),
	NETHERITE_SLIPPERS(MomWeapons.MOD_ID+":netherite_slippers",11,new int[] { 1, 3, 3, 1 },18, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2, () -> { return Ingredient.fromItems(Items.NETHERITE_INGOT); },0.1f);
	
	private static final int[] MAX_DAMAGE_ARRAY = new int[] { 11, 16, 15, 13 };
    private final String name;
    private final int maxDamageFactor; //Durability, Iron=15, Diamond=33, Gold=7, Leather=5
    private final int[] damageReductionAmountArray; //Armor Bar Protection, 1 = 1/2 armor bar
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness; //Increases Protection, 0.0F=Iron/Gold/Leather, 2.0F=Diamond, 3.0F=Netherite
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance; //1.0F=No Knockback, 0.0F=Disabled 
	
	ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability,
            SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockbackResistance) {
		this.name=name;
		this.maxDamageFactor=maxDamageFactor;
		this.damageReductionAmountArray=damageReductionAmountArray;
		this.enchantability=enchantability;
		this.soundEvent=soundEvent;
		this.toughness=toughness;
		this.repairMaterial=repairMaterial;
		this.knockbackResistance=knockbackResistance;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getEnchantability() {
		return enchantability;
	}

	@Override /*func_230304_f_*/
	public float getKnockbackResistance() {
		return knockbackResistance;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return repairMaterial.get();
	}

	@Override
	public SoundEvent getSoundEvent() {
		return soundEvent;
	}

	@Override
	public float getToughness() {
		return toughness;
	}
}
