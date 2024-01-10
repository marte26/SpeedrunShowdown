package com.github.speedrunshowdown.border;

import com.github.speedrunshowdown.SpeedrunShowdown;
import org.bukkit.WorldBorder;

public class WorldBorderManager {
    private static final int PREGAME_BORDER_SIZE = 32; // blocks
    private static final int OVERWORLD_BORDER_SIZE = 6000; // blocks
    private static final int NETHER_BORDER_SIZE = OVERWORLD_BORDER_SIZE / 8; // blocks
    private static final int END_BORDER_SIZE = 1000; // blocks

    private final WorldBorder overworldBorder, netherBorder, endBorder;

    public WorldBorderManager() {
        SpeedrunShowdown plugin = SpeedrunShowdown.getInstance();

        // Create three borders, one for each world
        overworldBorder = plugin.getServer().getWorld("world").getWorldBorder();
        netherBorder = plugin.getServer().getWorld("world_nether").getWorldBorder();
        endBorder = plugin.getServer().getWorld("world_the_end").getWorldBorder();

        // Set border sizes (overworld is small before game starts)
        overworldBorder.setSize(PREGAME_BORDER_SIZE);
        netherBorder.setSize(NETHER_BORDER_SIZE);
        endBorder.setSize(END_BORDER_SIZE);

        // Move border to spawn location
        overworldBorder.setCenter(plugin.getServer().getWorld("world").getSpawnLocation());
    }

    public void init() {
        // Change overworld border to default size
        overworldBorder.setSize(OVERWORLD_BORDER_SIZE);
        overworldBorder.setCenter(0, 0);
    }

    public void reset() {
        overworldBorder.reset();
        netherBorder.reset();
        endBorder.reset();
    }
}
