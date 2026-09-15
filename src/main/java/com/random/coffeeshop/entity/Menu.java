package com.random.coffeeshop.entity;


import java.util.List;

public class Menu {
   private List<Item> menuItems;

   public Menu(List<Item> menuItems) {
        this.menuItems = menuItems;
    }

    public void setMenuItems(List<Item> menuItems) {
        this.menuItems = menuItems;
    }

    public List<Item> getMenuItems() {
        return menuItems;
    }

    public void addItem(Item item) {
        if (item != null) {
            menuItems.add(item);
        }
    }

    public void removeItem(Item item) {
        menuItems.remove(item);
    }
}
