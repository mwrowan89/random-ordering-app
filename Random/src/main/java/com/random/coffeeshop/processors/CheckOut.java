package com.random.coffeeshop.processors;

import com.random.coffeeshop.entity.OrderItems;
import com.random.coffeeshop.entity.Item;

public class CheckOut {

    private final OrderItems order;

    public CheckOut(OrderItems order) {
        this.order = order;
    }

    public void processOrder() {
        if (order.getItems().isEmpty()) {
            System.out.println("No items to checkout.");
            return;
        }

        displayOrderSummary();
        double total = calculateTotal();
        System.out.println("Total: $" + String.format("%.2f", total));
    }

    private void displayOrderSummary() {
        System.out.println("\n--- Order Summary ---");
        for (Item item : order.getItems()) {
            double itemTotal = item.getPrice() * item.getQuantity();
            System.out.println(item.getName() + " x" + item.getQuantity() +
                    " @ $" + String.format("%.2f", item.getPrice()) + " = $" + String.format("%.2f", itemTotal));
        }
        System.out.println("---------------------");
    }

    public double calculateTotal() {
        return order.getItems().stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
    }
}
