package com.github.speedrunshowdown.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;
import java.util.Map;

public class GUI {
    private static final Map<String, GUI> guis = new HashMap<>();

    private final String name;
    private final Inventory inventory;
    private final Map<Integer, GUIItem> items;

    public GUI(String name, int rows) {
        this.name = getValidName(name);
        // Maximum number of rows is 6
        rows = Math.min(rows, 6);
        this.inventory = Bukkit.createInventory(null, rows * 9, this.name);
        this.items = new HashMap<>(rows * 9);

        guis.put(this.name, this);
    }

    public GUI(String name, GUIItem... guiItems) {
        this(name, (int) Math.ceil(guiItems.length / 9.0));
        addItem(guiItems);
    }

    public static GUI getGui(String name) {
        return guis.get(name);
    }

    public void setItem(int slot, GUIItem item) {
        items.put(slot, item);
        inventory.setItem(slot, item.getItemStack());
    }

    public void addItem(GUIItem... items) {
        // For each item to add
        for (GUIItem item : items) {
            // Search for free slot in inventory
            for (int i = 0; i < inventory.getSize(); i++) {
                // If slot empty, add item
                if (this.items.get(i) == null) {
                    setItem(i, item);
                    break;
                }
            }
        }
    }

    public GUIItem getItem(int slot) {
        return items.get(slot);
    }

    public void show(Player... players) {
        // For all players
        for (Player player : players) {
            // Create inventory
            Inventory inventory = Bukkit.createInventory(
                    player,
                    this.inventory.getSize(),
                    name
            );
            // Set contents of the inventory
            inventory.setContents(this.inventory.getContents());
            // Open inventory
            player.openInventory(inventory);
        }
    }

    private String getValidName(String name) {
        // If name is taken, append reset character and try again
        if (guis.containsKey(name)) {
            return getValidName(name + ChatColor.RESET);
        }
        // Else, return valid name
        else {
            return name;
        }
    }
}
