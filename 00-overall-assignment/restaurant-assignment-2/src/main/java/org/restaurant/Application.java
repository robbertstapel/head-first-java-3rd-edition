package org.restaurant;

import org.restaurant.actors.Waitress;
import org.restaurant.items.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Waitress myWaitress = new Waitress();
        System.out.println("Hello, my name is " + myWaitress.getName() + ". Our menu consists of a Starter, a Main Course, and a Dessert.");
        // myWaitress.presentMenu();

        List<String> customerOrderItems = new ArrayList<>();

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
            myWaitress.takeOrder(finalOrder);
        }
    }
}