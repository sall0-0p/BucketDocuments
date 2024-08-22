package com.bucketdocs.bucketDocuments.utils.command;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.HashMap;
import java.util.Map;

public class CommandHandler implements CommandExecutor {
    private final Map<String, Command> commands = new HashMap<>();

    public CommandHandler() {
        //
    }

    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {


        return true;
    }
}
