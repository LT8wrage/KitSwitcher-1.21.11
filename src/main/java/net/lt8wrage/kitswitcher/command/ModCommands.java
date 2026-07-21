package net.lt8wrage.kitswitcher.command;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.RegisterCommandsEvent;

public class ModCommands {
    public static void register(IEventBus modEventBus) {
        NeoForge.EVENT_BUS.addListener(ModCommands::onRegisterCommands);
    }

    private static void onRegisterCommands(RegisterCommandsEvent event) {
        KitCommand.register(event.getDispatcher());
    }
}
