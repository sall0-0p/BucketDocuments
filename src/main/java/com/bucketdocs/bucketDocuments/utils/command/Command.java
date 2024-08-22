package com.bucketdocs.bucketDocuments.utils.command;

import org.bukkit.command.CommandSender;

public interface Command {
    void execute(CommandSender sender, String[] args);
}
