package com.pmso.momweapons.client.items;

import java.util.UUID;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.LazyValue;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;

public class WearableWeapon extends ArmorItem {
	
	private static final UUID[] ARMOR_MODIFIERS = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};
	   private final float attackDamage;
	   
	   private final Multimap<Attribute, AttributeModifier> toolAttributes;

		private final LazyValue<BipedModel<?>> model;
		private final boolean oneFoot;
	
	public WearableWeapon(IArmorMaterial materialIn,int attackDamageIn, float attackSpeedIn, EquipmentSlotType slot, Properties builderIn,boolean oneFoot) {
		super(materialIn, slot, builderIn);
		this.oneFoot=oneFoot;
		this.model = DistExecutor.unsafeRunForDist(() -> () -> new LazyValue<>(() -> this.provideArmorModelForSlot(slot)),
				() -> () -> null);
		this.attackDamage = attackDamageIn;
		Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
	      builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", (double)this.attackDamage, AttributeModifier.Operation.ADDITION));
	      builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", (double)attackSpeedIn, AttributeModifier.Operation.ADDITION));
	      this.toolAttributes = builder.build();
	}

	@Override
	public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot) {
		 return equipmentSlot == EquipmentSlotType.MAINHAND ? this.toolAttributes : super.getAttributeModifiers(equipmentSlot);
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	@SuppressWarnings("unchecked")
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack,
			EquipmentSlotType armorSlot, A _default) {
		return (A) model.getValue();
	}
	

	@OnlyIn(Dist.CLIENT)
	public BipedModel<?> provideArmorModelForSlot(EquipmentSlotType slot) {
		return new ModelArmorSlipper(slot,oneFoot);
	}
}
