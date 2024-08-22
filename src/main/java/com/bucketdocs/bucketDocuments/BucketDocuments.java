package com.bucketdocs.bucketDocuments;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class BucketDocuments extends JavaPlugin {
    private static BucketDocuments plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static BucketDocuments getInstance() {
        return plugin;
    }
}
