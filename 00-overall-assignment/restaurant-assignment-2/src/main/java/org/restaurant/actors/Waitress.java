package org.restaurant.actors;

import org.restaurant.items.Menu;
import org.restaurant.items.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Waitress {
    // Instance variables
    private String name;

    // Instance methods
    public void presentMenu(){
        System.out.println(Menu.starter);
        System.out.println(Menu.mainCourse);
        System.out.println(Menu.dessert);
    }

    List<String> customerOrderItems = new ArrayList<>();

    public void takeCustomerOrder() {
        // Use try-with-resources to automatically close the scanner
        try (Scanner inputScanner = new Scanner(System.in)) {
            // Ask for the Starter
            System.out.print("Would you like a starter? (yes/no): ");
            boolean wantsStarter = inputScanner.nextLine().trim().equalsIgnoreCase("yes");
            if (wantsStarter) {
                customerOrderItems.add("1");
                System.out.println("Starter added to your order.");
            }

            // Ask for the Main Course
            System.out.print("Would you like a main course? (yes/no): ");
            boolean wantsMainCourse = inputScanner.nextLine().trim().equalsIgnoreCase("yes");
            if (wantsMainCourse) {
                customerOrderItems.add("2");
                System.out.println("Main course added to your order.");
            }

            // Ask for the Dessert
            System.out.print("Would you like a dessert? (yes/no): ");
            boolean wantsDessert = inputScanner.nextLine().trim().equalsIgnoreCase("yes");
            if (wantsDessert) {
                customerOrderItems.add("3");
                System.out.println("Dessert added to your order.");
            }
        }

        if (customerOrderItems.isEmpty()) {
            System.out.println("It looks like you haven't ordered anything. Goodbye!");
        } else {
            // Create the final order and have the waitress process it
            Order finalOrder = new Order(customerOrderItems);
            this.takeOrder(finalOrder);
        }
    }

    public Waitress(String name) {
        this.name = name;
    }

    public Order takeOrder (Order order){
        System.out.println("Order taken " + order.getOrderId());
        return order;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}