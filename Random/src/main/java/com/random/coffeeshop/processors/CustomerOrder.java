package com.random.coffeeshop.processors;

import com.random.coffeeshop.entity.Item;
import com.random.coffeeshop.entity.OrderItems;

import java.util.Scanner;

public class CustomerOrder {

    private OrderItems orderItems;
    private Scanner scanner = new Scanner(System.in);

    public CustomerOrder(OrderItems orderItems) {
        this.orderItems = orderItems;
    }


    public void takeOrder() {
        boolean ordering = true;

        System.out.println("Welcome to The Coffee Shop");
        while (ordering) {
            System.out.println("What would you like to order?");
            System.out.print("1. Add a coffee");
            String input = scanner.nextLine();

            Item item = createItemFromInput(input);
            orderItems.addItem(item);

            System.out.println("Would you like to add another item?");
            System.out.println("Enter Y or N");
            String input2 = scanner.nextLine();
            if (input2.equalsIgnoreCase("N")) {
                ordering = false;
            }
        }


        scanner.close();
    }


    private Item createItemFromInput(String input) {
        Item item = new Item();
        item.setName(input);
        item.setQuantity(1);
        item.setPrice(5.99);
        return item;
    }

}
