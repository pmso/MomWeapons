package com.pmso.momweapons.client.items;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;

public class ModelArmorSlipper extends ModelArmor {
	
	private final ModelRenderer bootL;
	private final ModelRenderer bootR;
	private final boolean oneFoot;

	public ModelArmorSlipper(EquipmentSlotType slot, boolean oneFoot) {
		super(slot);

		this.textureWidth = 64;
		this.textureHeight =32;
		float s = 0.01F;
		
		//boots
		this.bootL = new ModelRenderer(this, 0, 16);
		this.bootL.mirror = true;
		this.bootL.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.bootL.addBox(-2.39F, 8.5F, -2.49F, 5, 4, 5, s);

		this.bootR = new ModelRenderer(this, 0, 16);
		if(!oneFoot) {
		this.bootR.setRotationPoint(-2.0F, 12.0F, 0.0F);
		this.bootR.addBox(-2.5F, 8.5F, -2.51F, 5, 4, 5, s);
		}
		this.oneFoot=oneFoot;
	}
	
	@Override
	public void render(MatrixStack ms, IVertexBuilder buffer, int light, int overlay, float r, float g, float b, float a) {

		bootL.showModel = slot == EquipmentSlotType.FEET;
		bootR.showModel = false;
		if(!oneFoot) {
		bootR.showModel = slot == EquipmentSlotType.FEET;
		}
		bipedHeadwear.showModel = false;

		if (slot != EquipmentSlotType.LEGS) {
			bipedRightLeg = bootR;
			bipedLeftLeg = bootL;
		}

		super.render(ms, buffer, light, overlay, r, g, b, a);
	}

}
