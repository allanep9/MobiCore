package com.allanep9.mobicore.items;

import com.allanep9.mobicore.MobiCore;
import com.allanep9.mobicore.items.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class InvarChestplate extends ArmorItem {
    public InvarChestplate() {
        super(ArmorMaterials.INVAR, EquipmentSlotType.CHEST, new Properties().group(MobiCore.INVAR));
    }
}
