package com.github.speedrunshowdown.gui;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.function.Consumer;

public class GUIItem {
    private final ItemStack itemStack;
    private final Consumer<InventoryClickEvent> onClick;

    public GUIItem(ItemStack itemStack, Consumer<InventoryClickEvent> onClick) {
        this.itemStack = itemStack;
        this.onClick = onClick;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public void onClick(InventoryClickEvent event) {
        onClick.accept(event);
    }
}
