package com.random.coffeeshop.entity;

public class Tea implements Item {
    private String itemName;
    private String itemDescription;
    private int itemQuantity;
    private double itemPrice;

    public Tea(String name, String description, int quantity, double price) {
        this.itemName = name;
        this.itemDescription = description;
        this.itemQuantity = quantity;
        this.itemPrice = price;
    }

    @Override
    public double getPrice() {
        return itemPrice;
    }

    @Override
    public double getQuantity() {
        return itemQuantity;
    }

    @Override
    public String getName() {
        return itemName;
    }

    public String getDescription() {
        return itemDescription;
    }

    public void setQuantity(int quantity) {
        this.itemQuantity = quantity;
    }

    public void setPrice(double price) {
        this.itemPrice = price;
    }
}
