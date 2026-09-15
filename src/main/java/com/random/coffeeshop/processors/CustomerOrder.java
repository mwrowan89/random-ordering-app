package com.random.coffeeshop.processors;

import com.random.coffeeshop.entity.Coffee;
import com.random.coffeeshop.entity.Item;
import com.random.coffeeshop.entity.Menu;
import com.random.coffeeshop.entity.OrderItems;
import com.random.coffeeshop.entity.Tea;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerOrder {

    private OrderItems orderItems;
    private Scanner scanner = new Scanner(System.in);
    private Menu menu;

    public CustomerOrder(OrderItems orderItems) {
        this.orderItems = orderItems;

        menu = new Menu(new ArrayList<>());
        menu.addItem(new Coffee("House Blend", "Freshly brewed coffee", 1, 2.99));
        menu.addItem(new Coffee("Latte", "Espresso with steamed milk", 1, 4.49));
        menu.addItem(new Tea("Earl Grey", "Black tea with bergamot", 1, 2.49));
    }

    public void takeOrder() {
        boolean ordering = true;

        System.out.println("Welcome to The Coffee Shop");
        displayMenu(menu);
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


    private static void displayMenu(Menu menu) {
        System.out.println("--- Menu ---");
        for (Item item : menu.getMenuItems()) {
            System.out.printf("%s: %s ($%.2f)%n",
                    item.getName(), item.getDescription(), item.getPrice());
        }
        System.out.println("------------");
    }

    private Item createItemFromInput(String input) {
        return new Coffee(input, "", 1, 5.99);
    }
}
