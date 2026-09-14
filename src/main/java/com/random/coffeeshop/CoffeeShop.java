package com.random.coffeeshop;

import com.random.coffeeshop.entity.OrderItems;
import com.random.coffeeshop.processors.CheckOut;
import com.random.coffeeshop.processors.CustomerOrder;

public final class CoffeeShop {

    public static void main(String[] args) {
        OrderItems order = new OrderItems();

        CustomerOrder customer = new CustomerOrder(order);
        customer.takeOrder();

        CheckOut checkOut = new CheckOut(order);
        checkOut.processOrder();
    }
}


