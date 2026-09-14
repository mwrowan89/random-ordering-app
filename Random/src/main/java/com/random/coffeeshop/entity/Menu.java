package com.random.coffeeshop.entity;


import java.util.List;

public class Menu {
   List<Item> menuItems;
   public Menu(List<Item> menuItems) {
        this.menuItems = menuItems;
   }

    public void setMenuItems(List<Item> menuItems) {
        this.menuItems = menuItems;
    }
    public List<Item> getMenuItems() {
       return menuItems;
    }

    private Item addItemsToMenu(Item item) {
        item.setName(item.getName());
        item.setQuantity(item.getQuantity());
        item.setPrice(item.getPrice());
        return item;
    }



}
