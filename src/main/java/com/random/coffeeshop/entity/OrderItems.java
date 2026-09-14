package com.random.coffeeshop.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderItems {

    private final List<Item> items;

    public OrderItems() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item != null) {
            items.add(item);
        }
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public int getTotalItems() {
        return items.size();
    }

    public void clearItems() {
        items.clear();
    }
}
