package me.bigtallahasee.mobblocker;

import me.bigtallahasee.mobblocker.commands.Commands;
import me.bigtallahasee.mobblocker.events.BlacklistMobs;
import me.bigtallahasee.mobblocker.utils.Logger;
import me.bigtallahasee.mobblocker.utils.Settings;
import me.bigtallahasee.mobblocker.utils.UpdateChecker;
import org.bukkit.event.player.*;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;

public class MobBlocker extends JavaPlugin {

    public static MobBlocker instance;

    public List<Class<?>> exemptEvents = Arrays.asList(new Class[]{AsyncPlayerPreLoginEvent.class, PlayerJoinEvent.class, PlayerKickEvent.class, PlayerLoginEvent.class, PlayerPreLoginEvent.class, PlayerQuitEvent.class});

    private boolean isExemptEnabled = true;

    public String blockedMessage;

    public boolean isUpdatesEnabled = true;
    //private boolean spawn = true;
    //ArrayList<String> exceptions = new ArrayList<String>();
    //int spawnrate = -1;
    public static MobBlocker plugin;


    @Override
    public void onEnable() {
        System.out.println("MobBlocker has started!!!");

        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BlacklistMobs(), this);


        getCommand("mb").setExecutor(new Commands());
        getCommand("mb").setTabCompleter(new Commands());


        getConfig().options().copyDefaults();
        saveDefaultConfig();

        //Update Checker
        new UpdateChecker(this, 94047).getLatestVersion(version -> {
            if (this.getDescription().getVersion().equalsIgnoreCase(version)) {
                Logger.log(Logger.LogLevel.SUCCESS, ("MobBlocker is up to date!"));
            } else {
                Logger.log(Logger.LogLevel.OUTLINE, "*********************************************************************");
                Logger.log(Logger.LogLevel.WARNING, ("MobBlocker is outdated!"));
                Logger.log(Logger.LogLevel.WARNING, ("Newest version: " + version));
                Logger.log(Logger.LogLevel.WARNING, ("Your version: " + Settings.VERSION));
                Logger.log(Logger.LogLevel.WARNING, ("Please Update Here: " + Settings.PLUGIN_URL + UpdateChecker.resourceId));
                Logger.log(Logger.LogLevel.OUTLINE, "*********************************************************************");
            }
        });
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static MobBlocker getPlugin() {
        return plugin;
    }

    public static Plugin getInstance() {
        return instance;
    }
}




