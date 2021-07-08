package me.bigtallahasee.mobblocker;

import me.bigtallahasee.mobblocker.events.BlacklistMobs;
import org.bukkit.plugin.java.JavaPlugin;

public final class MobBlocker extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("MobBlocker has started!!!");

        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BlacklistMobs(), this);


    }
}
