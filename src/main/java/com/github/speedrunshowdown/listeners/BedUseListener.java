package com.github.speedrunshowdown.listeners;

import com.github.speedrunshowdown.Constants;
import com.github.speedrunshowdown.SpeedrunShowdown;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World.Environment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class BedUseListener implements Listener {
    public static boolean isBed(Material material) {
        for (Material bed : Constants.BEDS) {
            if (material == bed) {
                return true;
            }
        }
        return false;
    }

    @EventHandler
    public void onBedUse(PlayerInteractEvent event) {
        SpeedrunShowdown plugin = SpeedrunShowdown.getInstance();

        // If plugin is running and plugin should prevent respawn anchor explosions
        // and respawn anchor right clicked in the wrong dimension, cancel event
        if (
                plugin.isRunning() &&
                        plugin.getConfig().getBoolean("prevent-respawn-anchor-explosions") &&
                        event.getClickedBlock() != null &&
                        isBed(event.getClickedBlock().getType()) &&
                        event.getAction() == Action.RIGHT_CLICK_BLOCK &&
                        event.getPlayer().getWorld().getEnvironment() != Environment.NORMAL
        ) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(
                    ChatColor.RED + "Cannot use beds in this dimension!"
            );
        }
    }
}