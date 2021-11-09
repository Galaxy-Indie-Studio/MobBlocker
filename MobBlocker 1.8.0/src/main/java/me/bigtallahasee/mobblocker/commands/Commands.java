package me.bigtallahasee.mobblocker.commands;

import me.bigtallahasee.mobblocker.MobBlocker;
import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class Commands implements TabExecutor {
    Plugin plugin = MobBlocker.getPlugin(MobBlocker.class);

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        if (player.isOp() || player.hasPermission("mobblocker.admin")) {
            if (args.length >= 0) {
                if (command.getName().equals("mb"))
                    if (args[0].equalsIgnoreCase("block")) {
                        if (args[1].equalsIgnoreCase("passive")) {
                            if (args[2].equalsIgnoreCase("axolotl")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Axolotl Spawning!");
                                    plugin.getConfig().set("Block-Axolotl", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disbaled Axolotl Spawning!");
                                    plugin.getConfig().set("Block-Axolotl", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("bat")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Bat Spawning!");
                                    plugin.getConfig().set("Block-Bat", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Bat Spawning");
                                    plugin.getConfig().set("Block-Bat", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("cat")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Cat Spawning!");
                                    plugin.getConfig().set("Block-Cat", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Cat Spawning");
                                    plugin.getConfig().set("Block-Cat", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("chicken")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Chicken Spawning!");
                                    plugin.getConfig().set("Block-Chicken", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Chicken Spawning!");
                                    plugin.getConfig().set("Block-Chicke", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("cod")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Cod Spawning!");
                                    plugin.getConfig().set("Block-Cod", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Cod Spawning!");
                                    plugin.getConfig().set("Block-Cod", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("cow")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Cow Spawning!");
                                    plugin.getConfig().set("Block-Cow", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Cow Spawning!");
                                    plugin.getConfig().set("Block-Cow", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("dolphin")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Dolphin Spawning!");
                                    plugin.getConfig().set("Block-Dolphin", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Dolphin Spawning!");
                                    plugin.getConfig().set("Block-Dolphin", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("donkey")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Donkey Spawning!");
                                    plugin.getConfig().set("Block-Donkey", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Donkey Spawning!");
                                    plugin.getConfig().set("Block-Donkey", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("fox")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Fox Spawning!");
                                    plugin.getConfig().set("Block-Fox", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Fox Spawning!");
                                    plugin.getConfig().set("Block-Fox", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("glowsquid")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Glow Squid Spawning!");
                                    player.sendMessage(ChatColor.BLACK + "-------------------------------------");
                                    plugin.getConfig().set("Block-Glow-Squid", false);
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Tip:");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Make sure you enable squid as well");
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Glow Squid Spawning!");
                                    plugin.getConfig().set("Block-Glow-Squid", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("horse")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Horse Spawning!");
                                    plugin.getConfig().set("Block-Horse", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Horse Spawning!");
                                    plugin.getConfig().set("Block-Horse", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("mooshrom")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Mooshrom Spawning!");
                                    player.sendMessage(ChatColor.BLACK + "-----------------------------------");
                                    plugin.getConfig().set("Block-Mooshrom", false);
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Tip:");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Make sure you enable cow as well");
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Mooshrom Spawning!");
                                    plugin.getConfig().set("Block-Mooshrom", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("mule")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Mule Spawning!");
                                    plugin.getConfig().set("Block-Mule", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Mule Spawning!");
                                    plugin.getConfig().set("Block-Mule", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("ocelot")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Ocelot Spawning!");
                                    plugin.getConfig().set("Block-Ocelot", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Ocelot Spawning!");
                                    plugin.getConfig().set("Block-Ocelot", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("parrot")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Parrot Spawning!");
                                    plugin.getConfig().set("Block-Parrot", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Parrot Spawning!");
                                    plugin.getConfig().set("Block-Parrot", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("pig")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Pig Spawning!");
                                    plugin.getConfig().set("Block-Pig", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Pig Spawning!");
                                    plugin.getConfig().set("Block-Pig", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("pufferfish")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Pufferfish Spawning!");
                                    plugin.getConfig().set("Block-Pufferfish", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Pufferfish Spawning!");
                                    plugin.getConfig().set("Block-Pufferfish", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("rabbit")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Rabbit Spawning!");
                                    plugin.getConfig().set("Block-Rabbit", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Rabbit Spawning!");
                                    plugin.getConfig().set("Block-Rabbit", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("salmon")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Salmon Spawning!");
                                    plugin.getConfig().set("Block-Salmon", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Salmon Spawning!");
                                    plugin.getConfig().set("Block-Salmon", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("sheep")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Sheep Spawning!");
                                    plugin.getConfig().set("Block-Sheep", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Sheep Spawning!");
                                    plugin.getConfig().set("Block-Sheep", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("squid")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Squid Spawning!");
                                    plugin.getConfig().set("Block-Squid", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Squid Spawning!");
                                    plugin.getConfig().set("Block-Squid", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("strider")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Strider Spawning!");
                                    plugin.getConfig().set("Block-Strider", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Strider Spawning!");
                                    plugin.getConfig().set("Block-Strider", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("tropicalfish")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Tropical Fish Spawning!");
                                    plugin.getConfig().set("Block-Tropical-Fish", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Tropical Spawning!");
                                    plugin.getConfig().set("Block-Tropical-Fish", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("turtle")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Turtle Spawning!");
                                    plugin.getConfig().set("Block-Turtle", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Turtle Spawning!");
                                    plugin.getConfig().set("Block-Turtle", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("villager")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Villager Spawning!");
                                    plugin.getConfig().set("Block-Villager", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Villager Spawning!");
                                    plugin.getConfig().set("Block-Villager", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("wanderingtrader")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Wandering Trader Spawning!");
                                    plugin.getConfig().set("Block-Wandering-Trader", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Wandering Trader Spawning!");
                                    plugin.getConfig().set("Block-Wandering-Trader", true);
                                }
                            }
                        }
                        if (args[1].equalsIgnoreCase("neutral")) {
                            if (args[2].equalsIgnoreCase("bee")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Bee Spawning!");
                                    plugin.getConfig().set("Block-Bee", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Bee Spawning!");
                                    plugin.getConfig().set("Block-Bee", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("goat")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Goat Spawning!");
                                    plugin.getConfig().set("Block-Goat", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Goat Spawning!");
                                    plugin.getConfig().set("Block-Goat", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("irongolem")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Iron Golem Spawning!");
                                    plugin.getConfig().set("Block-Iron-Golem", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Iron Golem Spawning!");
                                    plugin.getConfig().set("Block-Iron-Golem", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("llama")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Llama Spawning!");
                                    plugin.getConfig().set("Block-Llama", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Llama Spawning!");
                                    plugin.getConfig().set("Block-Llama", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("panda")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Panda Spawning!");
                                    plugin.getConfig().set("Block-Panda", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Panda Spawning!");
                                    plugin.getConfig().set("Block-Panda", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("polarbear")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Polar Bear Spawning!");
                                    plugin.getConfig().set("Block-Polar-Bear", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Polar Bear Spawning!");
                                    plugin.getConfig().set("Block-Polar-Bear", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("traderllama")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Trader Llama Spawning!");
                                    plugin.getConfig().set("Block-Trader-Llama", false);
                                    player.sendMessage(ChatColor.BLACK + "----------------------------------------");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Tip:");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Make sure you enable llama as well");
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Trader Llama Spawning!");
                                    plugin.getConfig().set("Block-Trader-Llama", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("wolf")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Wolf Spawning!");
                                    plugin.getConfig().set("Block-Wolf", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Wolf Spawning!");
                                    plugin.getConfig().set("Block-Wolf", true);
                                }
                            }
                        }
                        if (args[1].equalsIgnoreCase("hostile")) {
                            if (args[2].equalsIgnoreCase("warden")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Warden Spawning!");
                                    plugin.getConfig().set("Block-Warden", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Warden Spawning!");
                                    plugin.getConfig().set("Block-Warden", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("blaze")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Blaze Spawning!");
                                    plugin.getConfig().set("Block-Blaze", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Blaze Spawning!");
                                    plugin.getConfig().set("Block-Blaze", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("cavespider")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Cave Spider Spawning!");
                                    plugin.getConfig().set("Block-Cave-Spider", false);
                                    player.sendMessage(ChatColor.BLACK + "----------------------------------------");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Tip:");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Make sure you enable cave spider as well");
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Cave Spider Spawning!");
                                    plugin.getConfig().set("Block-Cave-Spider", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("creeper")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Creeper Spawning!");
                                    plugin.getConfig().set("Block-Creeper", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Creeper Spawning!");
                                    plugin.getConfig().set("Block-Creeper", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("drowned")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Drowned Spawning!");
                                    plugin.getConfig().set("Block-Drowned", false);
                                    player.sendMessage(ChatColor.BLACK + "----------------------------------------");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Tip:");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Make sure you enable llama as well");
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Drowned Spawning!");
                                    plugin.getConfig().set("Block-Drowned", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("elderguardian")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Elder Guardian Spawning!");
                                    plugin.getConfig().set("Block-Elder-Guardian", false);
                                    player.sendMessage(ChatColor.BLACK + "----------------------------------------");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Tip:");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Make sure you enable llama as well");
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Elder Guardian Spawning!");
                                    plugin.getConfig().set("Block-Elder-Guardian", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("enderdragon")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Ender Dragon Spawning!");
                                    plugin.getConfig().set("Block-Ender-Dragon", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Ender Dragon Spawning!");
                                    plugin.getConfig().set("Block-Ender-Dragon", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("enderman")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Enderman Spawning!");
                                    plugin.getConfig().set("Block-Enderman", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Enderman Spawning!");
                                    plugin.getConfig().set("Block-Enderman", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("Endermite")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Endermite Spawning!");
                                    plugin.getConfig().set("Block-Endermite", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Endermite Spawning!");
                                    plugin.getConfig().set("Block-Endermite", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("Evoker")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Evoker Spawning!");
                                    plugin.getConfig().set("Block-Evoker", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Evoker Spawning!");
                                    plugin.getConfig().set("Block-Evoker", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("Ghast")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Ghast Spawning!");
                                    plugin.getConfig().set("Block-Ghast", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Ghast Spawning!");
                                    plugin.getConfig().set("Block-Ghast", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("Guardian")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Guardian Spawning!");
                                    plugin.getConfig().set("Block-Guardian", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Guardian Spawning!");
                                    plugin.getConfig().set("Block-Guardian", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("hoglin")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Hoglin Spawning!");
                                    plugin.getConfig().set("Block-Hoglin", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Hoglin Spawning!");
                                    plugin.getConfig().set("Block-Hoglin", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("husk")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Husk Spawning!");
                                    plugin.getConfig().set("Block-Husk", false);
                                    player.sendMessage(ChatColor.BLACK + "----------------------------------------");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Tip:");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Make sure you enable zombie as well");
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Husk Spawning!");
                                    plugin.getConfig().set("Block-Husk", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("magmacube")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Magma Cube Spawning!");
                                    plugin.getConfig().set("Block-Magma-Cube", false);
                                    player.sendMessage(ChatColor.BLACK + "----------------------------------------");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Tip:");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Make sure you enable slime as well");
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Magma Cube Spawning!");
                                    plugin.getConfig().set("Block-Magma-Cube", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("phantom")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Phantom Spawning!");
                                    plugin.getConfig().set("Block-Phantom", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Phantom Spawning!");
                                    plugin.getConfig().set("Block-Phantom", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("piglin")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Piglin Spawning!");
                                    plugin.getConfig().set("Block-Piglin", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Piglin Spawning!");
                                    plugin.getConfig().set("Block-Piglin", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("piglinbrute")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Piglin Brute Spawning!");
                                    plugin.getConfig().set("Block-Piglin-Brute", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Piglin Brute Spawning!");
                                    plugin.getConfig().set("Block-Piglin-Brute", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("pillager")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Pillager Spawning!");
                                    plugin.getConfig().set("Block-Pillager", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Pillager Spawning!");
                                    plugin.getConfig().set("Block-Pillager", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("ravager")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Ravager Spawning!");
                                    plugin.getConfig().set("Block-Ravager", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Ravager Spawning!");
                                    plugin.getConfig().set("Block-Ravager", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("Shulker")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Shulker Spawning!");
                                    plugin.getConfig().set("Block-Shulker", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Shulker Spawning!");
                                    plugin.getConfig().set("Block-Shulker", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("silverfish")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Silverfish Spawning!");
                                    plugin.getConfig().set("Block-Silverfish", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Silverfish Spawning!");
                                    plugin.getConfig().set("Block-Silverfish", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("skeleton")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Skeleton Spawning!");
                                    plugin.getConfig().set("Block-Skeleton", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Skeleton Spawning!");
                                    plugin.getConfig().set("Block-Skeleton", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("slime")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Slime Spawning!");
                                    plugin.getConfig().set("Block-Slime", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Slime Spawning!");
                                    plugin.getConfig().set("Block-Slime", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("spider")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Spider Spawning!");
                                    plugin.getConfig().set("Block-Spider", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Spider Spawning!");
                                    plugin.getConfig().set("Block-Spider", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("stray")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Stray Spawning!");
                                    plugin.getConfig().set("Block-Stray", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Stray Spawning!");
                                    plugin.getConfig().set("Block-Stray", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("vex")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Vex Spawning!");
                                    plugin.getConfig().set("Block-Vex", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Vex Spawning!");
                                    plugin.getConfig().set("Block-Vex", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("vindicator")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Vindicator Spawning!");
                                    plugin.getConfig().set("Block-Vindicator", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Vindicator Spawning!");
                                    plugin.getConfig().set("Block-Vindicator", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("witch")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Witch Spawning!");
                                    plugin.getConfig().set("Block-Witch", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Witch Spawning!");
                                    plugin.getConfig().set("Block-Witch", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("wither")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Wither Spawning!");
                                    plugin.getConfig().set("Block-Wither", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Wither Spawning!");
                                    plugin.getConfig().set("Block-Wither", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("witherskeleton")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Wither Skeleton Spawning!");
                                    plugin.getConfig().set("Block-Wither-Skeleton", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Wither Skeleton Spawning!");
                                    plugin.getConfig().set("Block-Wither-Skeleton", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("zoglin")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Zoglin Spawning!");
                                    plugin.getConfig().set("Block-Zoglin", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Zoglin Spawning!");
                                    plugin.getConfig().set("Block-Zoglin", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("zombie")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Zombie Spawning!");
                                    plugin.getConfig().set("Block-Zombie", false);
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Zombie Spawning!");
                                    plugin.getConfig().set("Block-Zombie", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("zombiepigman")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Zombie Pigman Spawning!");
                                    plugin.getConfig().set("Block-Zombie-Pigman", false);
                                    player.sendMessage(ChatColor.BLACK + "----------------------------------------");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Tip:");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Make sure you enable zombie as well");
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Zombie-Pigman Spawning!");
                                    plugin.getConfig().set("Block-Zombie-Pigmean", true);
                                }
                            }
                            if (args[2].equalsIgnoreCase("zombievillager")) {
                                if (args[3].equalsIgnoreCase("false")) {
                                    player.sendMessage(ChatColor.GREEN + "You have enabled Zombie Villager Spawning!");
                                    plugin.getConfig().set("Block-Zombie-Villager", false);
                                    player.sendMessage(ChatColor.BLACK + "----------------------------------------");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Tip:");
                                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Make sure you enable llama as well");
                                }
                                if (args[3].equalsIgnoreCase("true")) {
                                    player.sendMessage(ChatColor.RED + "You have disabled Zombier Villager Spawning!");
                                    plugin.getConfig().set("Block-Zombie-Villager", true);
                                }
                            }
                        }

                        if (args[1].equalsIgnoreCase("all")) {
                            if (args[2].equalsIgnoreCase("false")) {
                                player.sendMessage(ChatColor.RED + "You have disabled all mobs");
                                plugin.getConfig().set("Block-Axolotl", false);
                                plugin.getConfig().set("Block-Bat", false);
                                plugin.getConfig().set("Block-Bee", false);
                                plugin.getConfig().set("Block-Blaze", false);
                                plugin.getConfig().set("Block-Cat", false);
                                plugin.getConfig().set("Block-Cave-Spider", false);
                                plugin.getConfig().set("Block-Chicken", false);
                                plugin.getConfig().set("Block-Cod", false);
                                plugin.getConfig().set("Block-Cow", false);
                                plugin.getConfig().set("Block-Creeper", false);
                                plugin.getConfig().set("Block-Dolphin", false);
                                plugin.getConfig().set("Block-Donkey", false);
                                plugin.getConfig().set("Block-Drowned", false);
                                plugin.getConfig().set("Block-Elder-Guardian", false);
                                plugin.getConfig().set("Block-Enderman", false);
                                plugin.getConfig().set("Block-Endermite", false);
                                plugin.getConfig().set("Block-Evoker", false);
                                plugin.getConfig().set("Block-Fox", false);
                                plugin.getConfig().set("Block-Ghast", false);
                                plugin.getConfig().set("Block-Glow-Squid", false);
                                plugin.getConfig().set("Block-Goat", false);
                                plugin.getConfig().set("Block-Guardian", false);
                                plugin.getConfig().set("Block-Hoglin", false);
                                plugin.getConfig().set("Block-Horse", false);
                                plugin.getConfig().set("Block-Husk", false);
                                plugin.getConfig().set("Block-Llama", false);
                                plugin.getConfig().set("Block-Magma-Cube", false);
                                plugin.getConfig().set("Block-Mooshrom", false);
                                plugin.getConfig().set("Block-Mule", false);
                                plugin.getConfig().set("Block-Ocelot", false);
                                plugin.getConfig().set("Block-Panda", false);
                                plugin.getConfig().set("Block-Parrot", false);
                                plugin.getConfig().set("Block-Phantom", false);
                                plugin.getConfig().set("Block-Pig", false);
                                plugin.getConfig().set("Block-Piglin", false);
                                plugin.getConfig().set("Block-Piglin-Brute", false);
                                plugin.getConfig().set("Block-Pillager", false);
                                plugin.getConfig().set("Block-Polar-Bear", false);
                                plugin.getConfig().set("Block-Pufferfish", false);
                                plugin.getConfig().set("Block-Rabbit", false);
                                plugin.getConfig().set("Block-Ravager", false);
                                plugin.getConfig().set("Block-Salmon", false);
                                plugin.getConfig().set("Block-Sheep", false);
                                plugin.getConfig().set("Block-Shulker", false);
                                plugin.getConfig().set("Block-Silverfish", false);
                                plugin.getConfig().set("Block-Skeleton", false);
                                plugin.getConfig().set("Block-Skeleton-Horse", false);
                                plugin.getConfig().set("Block-Slime", false);
                                plugin.getConfig().set("Block-Spider", false);
                                plugin.getConfig().set("Block-Squid", false);
                                plugin.getConfig().set("Block-Stray", false);
                                plugin.getConfig().set("Block-Strider", false);
                                plugin.getConfig().set("Block-Trader-Llama", false);
                                plugin.getConfig().set("Block-Tropical-Fish", false);
                                plugin.getConfig().set("Block-Turtle", false);
                                plugin.getConfig().set("Block-Vex", false);
                                plugin.getConfig().set("Block-Villager", false);
                                plugin.getConfig().set("Block-Vindicator", false);
                                plugin.getConfig().set("Block-Wandering-Trader", false);
                                plugin.getConfig().set("Block-Warden", false);
                                plugin.getConfig().set("Block-Witch", false);
                                plugin.getConfig().set("Block-Wither-Skeleton", false);
                                plugin.getConfig().set("Block-Wolf", false);
                                plugin.getConfig().set("Block-Zoglin", false);
                                plugin.getConfig().set("Block-Zombie", false);
                                plugin.getConfig().set("Block-Zombie-Horse", false);
                                plugin.getConfig().set("Block-Zombie-Villager", false);
                                plugin.getConfig().set("Block-Zombie-Pigman", false);
                            }

                            if (args[2].equalsIgnoreCase("true")) {
                                player.sendMessage(ChatColor.RED + "You have disabled all mobs from spawning!");
                                plugin.getConfig().set("Block-Axolotl", true);
                                plugin.getConfig().set("Block-Bat", true);
                                plugin.getConfig().set("Block-Bee", true);
                                plugin.getConfig().set("Block-Blaze", true);
                                plugin.getConfig().set("Block-Cat", true);
                                plugin.getConfig().set("Block-Cave-Spider", true);
                                plugin.getConfig().set("Block-Chicken", true);
                                plugin.getConfig().set("Block-Cod", true);
                                plugin.getConfig().set("Block-Cow", true);
                                plugin.getConfig().set("Block-Creeper", true);
                                plugin.getConfig().set("Block-Dolphin", true);
                                plugin.getConfig().set("Block-Donkey", true);
                                plugin.getConfig().set("Block-Drowned", true);
                                plugin.getConfig().set("Block-Elder-Guardian", true);
                                plugin.getConfig().set("Block-Enderman", true);
                                plugin.getConfig().set("Block-Endermite", true);
                                plugin.getConfig().set("Block-Evoker", true);
                                plugin.getConfig().set("Block-Fox", true);
                                plugin.getConfig().set("Block-Ghast", true);
                                plugin.getConfig().set("Block-Glow-Squid", true);
                                plugin.getConfig().set("Block-Goat", true);
                                plugin.getConfig().set("Block-Guardian", true);
                                plugin.getConfig().set("Block-Hoglin", true);
                                plugin.getConfig().set("Block-Horse", true);
                                plugin.getConfig().set("Block-Husk", true);
                                plugin.getConfig().set("Block-Llama", true);
                                plugin.getConfig().set("Block-Magma-Cube", true);
                                plugin.getConfig().set("Block-Mooshrom", true);
                                plugin.getConfig().set("Block-Mule", true);
                                plugin.getConfig().set("Block-Ocelot", true);
                                plugin.getConfig().set("Block-Panda", true);
                                plugin.getConfig().set("Block-Parrot", true);
                                plugin.getConfig().set("Block-Phantom", true);
                                plugin.getConfig().set("Block-Pig", true);
                                plugin.getConfig().set("Block-Piglin", true);
                                plugin.getConfig().set("Block-Piglin-Brute", true);
                                plugin.getConfig().set("Block-Pillager", true);
                                plugin.getConfig().set("Block-Polar-Bear", true);
                                plugin.getConfig().set("Block-Pufferfish", true);
                                plugin.getConfig().set("Block-Rabbit", true);
                                plugin.getConfig().set("Block-Ravager", true);
                                plugin.getConfig().set("Block-Salmon", true);
                                plugin.getConfig().set("Block-Sheep", true);
                                plugin.getConfig().set("Block-Shulker", true);
                                plugin.getConfig().set("Block-Silverfish", true);
                                plugin.getConfig().set("Block-Skeleton", true);
                                plugin.getConfig().set("Block-Skeleton-Horse", true);
                                plugin.getConfig().set("Block-Slime", true);
                                plugin.getConfig().set("Block-Spider", true);
                                plugin.getConfig().set("Block-Squid", true);
                                plugin.getConfig().set("Block-Stray", true);
                                plugin.getConfig().set("Block-Strider", true);
                                plugin.getConfig().set("Block-Trader-Llama", true);
                                plugin.getConfig().set("Block-Tropical-Fish", true);
                                plugin.getConfig().set("Block-Turtle", true);
                                plugin.getConfig().set("Block-Vex", true);
                                plugin.getConfig().set("Block-Villager", true);
                                plugin.getConfig().set("Block-Vindicator", true);
                                plugin.getConfig().set("Block-Wandering-Trader", true);
                                plugin.getConfig().set("Blcok-Warden", true);
                                plugin.getConfig().set("Block-Witch", true);
                                plugin.getConfig().set("Block-Wither-Skeleton", true);
                                plugin.getConfig().set("Block-Wolf", true);
                                plugin.getConfig().set("Block-Zoglin", true);
                                plugin.getConfig().set("Block-Zombie", true);
                                plugin.getConfig().set("Block-Zombie-Horse", true);
                                plugin.getConfig().set("Block-Zombie-Villager", true);
                                plugin.getConfig().set("Block-Zombie-Pigman", true);
                            }
                        }
                    }
                if (args[0].equalsIgnoreCase("reload")) {
                    if (args[1].equalsIgnoreCase("config")) {
                        plugin.reloadConfig();
                        player.sendMessage(ChatColor.GREEN + "Config was successfully loaded!");
                    }
                }
            }
        } else {
            player.sendMessage(ChatColor.RED + "You do not have the proper permissions to");
            player.sendMessage(ChatColor.RED + "execute these commands! If this is a mistake");
            player.sendMessage(ChatColor.RED + "contact your server admin!");
            player.sendMessage(ChatColor.RED + "Required Permission (mobblocker.admin)");
        }


        return false;
    }

    @Nullable
    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, @NotNull String[] args) {
        List<String> list = Arrays.asList("block", "reload");
        String input = args[0].toLowerCase();

        List<String> completions = null;
        for (String s : list) {
            if (s.startsWith(input)) {
                if (completions == null) {
                    completions = new ArrayList<>();
                }
                completions.add(s);
            }
        }
        if (completions != null) {
            Collections.sort(completions);
            return completions;
        }
        return completions;
    }
}
