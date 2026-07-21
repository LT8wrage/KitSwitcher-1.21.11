package net.lt8wrage.kitswitcher.kits;

import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;

public class SwordKit {
    public static void give(ServerPlayer player) {
            player.getInventory().clearContent();


            ItemStack sword = new ItemStack(Items.DIAMOND_SWORD);
            sword.enchant(
                    player.level().registryAccess()
                            .lookupOrThrow(Registries.ENCHANTMENT)
                            .getOrThrow(Enchantments.UNBREAKING),
                    3
            );


            ItemStack helmet = new ItemStack(Items.DIAMOND_HELMET);
            ItemStack chest = new ItemStack(Items.DIAMOND_CHESTPLATE);
            ItemStack legs = new ItemStack(Items.DIAMOND_LEGGINGS);
            ItemStack boots = new ItemStack(Items.DIAMOND_BOOTS);

            helmet.enchant(
                    player.level().registryAccess()
                            .lookupOrThrow(Registries.ENCHANTMENT)
                            .getOrThrow(Enchantments.PROTECTION),
                    4
            );

            chest.enchant(
                    player.level().registryAccess()
                            .lookupOrThrow(Registries.ENCHANTMENT)
                            .getOrThrow(Enchantments.PROTECTION),
                    4
            );

            legs.enchant(
                    player.level().registryAccess()
                            .lookupOrThrow(Registries.ENCHANTMENT)
                            .getOrThrow(Enchantments.PROTECTION),
                    4
            );

            boots.enchant(
                    player.level().registryAccess()
                            .lookupOrThrow(Registries.ENCHANTMENT)
                            .getOrThrow(Enchantments.PROTECTION),
                    4

            );

            // Equip armor
            player.setItemSlot(EquipmentSlot.HEAD, helmet);
            player.setItemSlot(EquipmentSlot.CHEST, chest);
            player.setItemSlot(EquipmentSlot.LEGS, legs);
            player.setItemSlot(EquipmentSlot.FEET, boots);

// Give sword
            player.getInventory().add(sword);

    }
}



