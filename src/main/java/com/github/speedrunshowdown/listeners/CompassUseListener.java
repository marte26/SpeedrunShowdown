package com.github.speedrunshowdown.listeners;

import com.github.speedrunshowdown.SpeedrunShowdown;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.CompassMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scoreboard.Team;

import java.util.ArrayList;

public class CompassUseListener implements Listener {
    @EventHandler
    public void onPlayerUse(PlayerInteractEvent event) {
        SpeedrunShowdown plugin = SpeedrunShowdown.getInstance();

        // If plugin is running and interaction is with hand, check item in hand
        if (plugin.isRunning() && event.getHand() == EquipmentSlot.HAND) {
            Player player = event.getPlayer();
            ItemStack item = player.getInventory().getItemInMainHand();

            // If item in hand is compass, track player
            if (item.getType() == Material.COMPASS) {
                Location location = player.getLocation();
                Action action = event.getAction();

                // Create list of other players to track
                ArrayList<Player> otherPlayers = new ArrayList<>();

                for (Team team : plugin.getScoreboardManager().getScoreboard().getTeams()) {
                    // If compass right clicked and team does not contain the current player
                    if (
                            (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) &&
                                    !team.hasEntry(player.getName())
                    ) {
                        // Loop over all entries on team
                        for (String entry : team.getEntries()) {
                            Player otherPlayer = plugin.getServer().getPlayer(entry);
                            // If other player exists, is alive, and is in the same world, add to list
                            if (
                                    otherPlayer != null &&
                                            otherPlayer.getGameMode() != GameMode.SPECTATOR &&
                                            otherPlayer.getWorld().getEnvironment() == player.getWorld().getEnvironment()
                            ) {
                                otherPlayers.add(otherPlayer);
                            }
                        }
                    }
                    // Else if left clicked and team does contain the current player
                    else if (
                            (action == Action.LEFT_CLICK_AIR || action == Action.LEFT_CLICK_BLOCK) &&
                                    team.hasEntry(player.getName())
                    ) {
                        // Loop over all entries on team
                        for (String entry : team.getEntries()) {
                            Player otherPlayer = plugin.getServer().getPlayer(entry);
                            // If other player exists, is alive, and is in the same world, add to list
                            if (
                                    otherPlayer != null &&
                                            otherPlayer.getGameMode() != GameMode.SPECTATOR &&
                                            otherPlayer.getWorld().getEnvironment() == player.getWorld().getEnvironment() &&
                                            otherPlayer.getUniqueId() != player.getUniqueId()
                            ) {
                                otherPlayers.add(otherPlayer);
                            }
                        }
                    }
                }

                // If no players found, give warning
                if (otherPlayers.isEmpty()) {
                    rename(item, ChatColor.WHITE + "No players found to track");
                    player.playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1, 1);
                }
                // Else point compass to nearest player
                else {
                    // Find closest player
                    Player closestPlayer = otherPlayers.get(0);
                    double closestDistance = Double.MAX_VALUE;

                    for (Player otherPlayer : otherPlayers) {
                        double distance = otherPlayer.getLocation().distance(location);
                        if (distance < closestDistance) {
                            closestDistance = distance;
                            closestPlayer = otherPlayer;
                        }
                    }

                    CompassMeta compassMeta = (CompassMeta) item.getItemMeta();
                    compassMeta.setLodestoneTracked(false);
                    compassMeta.setLodestone(closestPlayer.getLocation());
                    item.setItemMeta(compassMeta);
                    rename(
                            item,
                            ChatColor.WHITE + "Now pointing to " +
                                    plugin.getScoreboardManager().getTeam(closestPlayer).getColor() +
                                    closestPlayer.getName() + ChatColor.WHITE + "'s last location"
                    );
                    player.playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1, 1);
                }
            }
        }
    }

    private ItemStack rename(ItemStack item, String displayName) {
        ItemMeta itemMeta = item.getItemMeta();
        String oldDisplayName = itemMeta.getDisplayName();

        // If display name is the same, add spaces to force the name to display
        if (displayName.equals(oldDisplayName)) {
            // Adding spaces on both sides keeps it centered
            displayName = " " + displayName + " ";
        }

        itemMeta.setDisplayName(displayName);
        item.setItemMeta(itemMeta);
        return item.clone();
    }
}