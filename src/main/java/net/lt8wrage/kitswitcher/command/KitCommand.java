package net.lt8wrage.kitswitcher.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class KitCommand {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(
                Commands.literal("kit")
                        // 1.21.11 Correct Mojang Mappings for permission check

                        .then(Commands.literal("create")
                                .executes(ctx -> {
                                    // /kit create logic
                                    return 1;
                                }))

                        .then(Commands.literal("delete")
                                .executes(ctx -> {
                                    // /kit delete logic
                                    return 1;
                                }))

                        .then(Commands.literal("modify")
                                .executes(ctx -> {
                                    // /kit modify logic
                                    return 1;
                                }))

                        .then(Commands.literal("get")
                                .then(Commands.literal("Sword")
                                        .executes(ctx -> {

                                            return 1;
                                        }))

                                .then(Commands.literal("Axe")
                                        .executes(ctx -> {

                                            return 0;
                                        }))

                                .then(Commands.literal("Mace")
                                        .executes(ctx -> {

                                            return 0;
                                        }))
                                .then(Commands.literal("UHC")
                                        .executes(ctx -> {

                                            return 0;
                                        }))
                                .then(Commands.literal("Pot")
                                        .executes(ctx -> {

                                            return 0;
                                        }))
                                .then(Commands.literal("SMP")
                                        .executes(ctx -> {

                                            return 0;
                                        }))
                                .then(Commands.literal("Vanilla")
                                        .executes(ctx -> {

                                            return 0;
                                        }))
                        )

                        // Root execution logic (/kit)
                        .executes(context -> {
                            context.getSource().sendSuccess(
                                    () -> Component.literal("Hello, world!"),
                                    false
                            );
                            return 1;
                        })
        );
    }
}