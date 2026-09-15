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
    private CheckOut checkOut;

    public CustomerOrder(OrderItems orderItems) {
        this.orderItems = orderItems;

        menu = new Menu(new ArrayList<>());
        menu.addItem(new Coffee("House Blend", "Freshly brewed coffee", 1, 2.99, 1));
        menu.addItem(new Coffee("Latte", "Espresso with steamed milk", 1, 4.49, 2));
        menu.addItem(new Tea("Earl Grey", "Black tea with bergamot", 1, 2.49, 3));
    }

    public void takeOrder() {
        boolean ordering = true;

        System.out.println("Welcome to The Coffee Shop");
        displayMenu(menu);
        while (ordering) {
            System.out.println("What would you like to order?");
            System.out.print("1 2 3?");
            int input = scanner.nextInt();

            addItemToOrder(input);

            System.out.println("Would you like to add another item?");
            System.out.println("Enter Y or N");
            int input2 = scanner.nextInt();
            if (input2 == 0) {
                ordering = false;
            }
        }


        scanner.close();
    }

    public void addItemToOrder(int input) {
        if(input > 0){
            System.out.println("yes");
            orderItems.addItem(menu.getMenuItems().get(input - 1));
        }
        else {
            System.out.println("no");
        }

    }

    private static void displayMenu(Menu menu) {
        System.out.println("--- Menu ---");

        for (int i = 0; i < menu.getMenuItems().size(); i++) {
            System.out.println(i + 1  + ". " +menu.getMenuItems().get(i).getName());
        }
        System.out.println("------------");
    }

}
