package com.github.speedrunshowdown.border;

import org.bukkit.WorldBorder;
import org.bukkit.entity.Player;

import com.github.speedrunshowdown.SpeedrunShowdown;

public class WorldBorderManager {
    private static final int OVERWORLD_BORDER_SIZE = 5632; // blocks
    private static final int NETHER_BORDER_SIZE = OVERWORLD_BORDER_SIZE / 8; // blocks
    private static final int END_BORDER_SIZE = 1000;

    private boolean enabled = false;
    private SpeedrunShowdown plugin;
    private WorldBorder overworldBorder, netherBorder, endBorder;

    public WorldBorderManager() {
        plugin = SpeedrunShowdown.getInstance();

        // Create three borders, one for each world
        overworldBorder = plugin.getServer().createWorldBorder();
        netherBorder = plugin.getServer().createWorldBorder();
        endBorder = plugin.getServer().createWorldBorder();

        // Set sizes
        overworldBorder.setSize(OVERWORLD_BORDER_SIZE);
        netherBorder.setSize(NETHER_BORDER_SIZE);
        endBorder.setSize(END_BORDER_SIZE);
    }

    public void init() {
        update();
        updateWorldBorderForAllPlayers();
    }

    public void update() {
        // Update world border for all players if config file changes
        boolean newEnabled = plugin.getConfig().getBoolean("world-border");
        if (enabled != newEnabled) {
            enabled = newEnabled;
            updateWorldBorderForAllPlayers();
        }
    }

    public void updateWorldBorderForAllPlayers() {
        for (Player player : plugin.getServer().getOnlinePlayers()) {
            updatePlayerWorldBorder(player);
        }
    }

    public void updatePlayerWorldBorder(Player player) {
        if (enabled) {
            if (plugin.getConfig().getBoolean("world-border")) {
                // Switch the player's world border depending on the world they are in
                switch (player.getWorld().getEnvironment()) {
                    case NORMAL:
                        player.setWorldBorder(overworldBorder);
                        break;
                    case NETHER:
                        player.setWorldBorder(netherBorder);
                        break;
                    case THE_END:
                        player.setWorldBorder(endBorder);
                        break;
                    default:
                        player.setWorldBorder(null);
                }
            }
        } else {
            player.setWorldBorder(null);
        }
    }

    public void reset() {
        // Reset the world border for each player
        for (Player player : plugin.getServer().getOnlinePlayers()) {
            player.setWorldBorder(null);
        }
    }
}