package com.random.coffeeshop.entity;

public class Coffee implements Item {
    private String itemName;
    private String itemDescription;
    private int itemQuantity;
    private double itemPrice;
    private int sequence;

    public Coffee(String name, String description, int quantity, double price, int sequence) {
        this.itemName = name;
        this.itemDescription = description;
        this.itemQuantity = quantity;
        this.itemPrice = price;
        this.sequence = sequence;
    }

    @Override
    public double getPrice() {
        return itemPrice;
    }

    @Override
    public int getQuantity() {
        return itemQuantity;
    }

    @Override
    public String getName() {
        return itemName;
    }

    @Override
    public String getDescription() {
        return itemDescription;
    }

    @Override
    public void setName(String name) {
        this.itemName = name;
    }

    @Override
    public void setDescription(String description) {
        this.itemDescription = description;
    }

    @Override
    public void setQuantity(int quantity) {
        this.itemQuantity = quantity;
    }

    @Override
    public void setPrice(double price) {
        this.itemPrice = price;
    }

    @Override
    public int getSequence() {
        return 0;
    }

    @Override
    public void setGetSequence() {

    }
}