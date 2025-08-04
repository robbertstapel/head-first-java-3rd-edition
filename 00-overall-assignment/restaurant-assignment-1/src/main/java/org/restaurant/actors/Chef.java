package org.restaurant.actors;

import org.restaurant.items.Order;

public class Chef {
    private final int id;
    private final String name;

    public Chef(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Order cookMeal(Order order) {
        System.out.printf("Chef %s received the order: %s\n", this.name, order);
        System.out.printf("Chef %s is now cooking the %s, %s, and %s.\n",
                this.name, order.getStarter(), order.getMainCourse(), order.getDessert());

        // Simulate cooking
        System.out.printf("Chef %s has finished the meal. It's ready for pickup!\n", this.name);
        return order;
    }
}