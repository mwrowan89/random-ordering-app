package com.random.coffeeshop.entity;

public interface Item {
    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    int getQuantity();

    void setQuantity(int quantity);

    double getPrice();

    void setPrice(double price);
}
