package com.bucketdocs.bucketDocuments.commands;

import com.bucketdocs.bucketDocuments.utils.command.Command;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.command.CommandSender;

public class ReloadCommand implements Command {
    private static final MiniMessage mm = MiniMessage.miniMessage();

    public void execute(CommandSender sender, String[] args) {
        try {
            
        } catch (Exception e) {
            Component parsed = mm.deserialize(e.getMessage());
        }
    }
}
