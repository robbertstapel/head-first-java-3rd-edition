package org.restaurant.actors;

import org.restaurant.items.Order;

public class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void receiveMeal(Order meal) {
        System.out.printf("Customer %s received the meal: %s\n", this.name, meal);
        System.out.printf("Customer %s is happy! Thank you!\n", this.name);
    }
}