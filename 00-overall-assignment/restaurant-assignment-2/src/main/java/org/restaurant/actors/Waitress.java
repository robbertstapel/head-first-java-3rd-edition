package org.restaurant.actors;

import org.restaurant.items.Menu;
import org.restaurant.items.Order;

public class Waitress {
    // Instance variables
    private String name;

    // Instance methods
    public void presentMenu(){
        System.out.println(Menu.starter);
        System.out.println(Menu.mainCourse);
        System.out.println(Menu.dessert);
    }

    public Order takeOrder (Order order){
        System.out.println("Order taken " + order.getOrderId());
        return order;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

}