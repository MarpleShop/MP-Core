package xyz.luenn.core;

import org.bukkit.plugin.java.JavaPlugin;

public final class MarpleCore extends JavaPlugin {

    private static MarpleCore instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static MarpleCore getInstance() {
        return instance;
    }
}
