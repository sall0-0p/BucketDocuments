package com.bucketdocs.bucketDocuments;

import com.bucketdocs.bucketDocuments.utils.Messages;
import org.bukkit.plugin.java.JavaPlugin;

public final class BucketDocuments extends JavaPlugin {
    private static BucketDocuments plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        saveDefaultConfig();
        Messages.load();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static BucketDocuments getInstance() {
        return plugin;
    }
}
