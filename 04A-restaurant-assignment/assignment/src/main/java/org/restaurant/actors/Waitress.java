package org.restaurant.actors;

import lombok.RequiredArgsConstructor;
import lombok.NonNull;
import lombok.Getter;
import lombok.Setter;

import org.restaurant.items.Menu;
import org.restaurant.items.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// The Waitress
@Getter // return name
@Setter // this.name = name;
@RequiredArgsConstructor // used for name with @NonNull, so I can instantiate like: new Waitress("Jessica");
public class Waitress {

    // Instance variables
    @NonNull
    private String name;
    private List<String> noteBook = new ArrayList<>();

    // Use console to interact with the customer
    public List<String> takeCustomerOrder() {
        // Use try-with-resources to automatically close the scanner
        try (Scanner inputScanner = new Scanner(System.in)) {

            // Ask for the Starter
            System.out.print("Would you like a starter? (yes/no): ");
            boolean wantsStarter = inputScanner.nextLine().trim().toLowerCase().contains("y");
            if (wantsStarter) {
                noteBook.add(Menu.starter);
                System.out.println("Starter added to your order.");
            }

            // Ask for the Main Course
            System.out.print("Would you like a main course? (yes/no): ");
            boolean wantsMainCourse = inputScanner.nextLine().trim().toLowerCase().contains("y");
            if (wantsMainCourse) {
                noteBook.add(Menu.mainCourse);
                System.out.println("Main course added to your order.");
            }

            // Ask for the Dessert
            System.out.print("Would you like a dessert? (yes/no): ");
            boolean wantsDessert = inputScanner.nextLine().trim().toLowerCase().contains("y");
            if (wantsDessert) {
                noteBook.add(Menu.dessert);
                System.out.println("Dessert added to your order.");
            }
        }

        if (noteBook.isEmpty()) { // Leave the customer with no order
            System.out.println("It looks like you haven't ordered anything. Goodbye!");
        } else { // Inform the customer
            System.out.println("Thanks! Ill create the final order " + noteBook + " and inform the Chef!");
        }
        return noteBook;
    }

    public Order processOrder(List<String> noteBook){
        Order finalOrder = new Order(noteBook);
        System.out.println(finalOrder.getOrderId() + " Order created!");
        return finalOrder;
    }

}