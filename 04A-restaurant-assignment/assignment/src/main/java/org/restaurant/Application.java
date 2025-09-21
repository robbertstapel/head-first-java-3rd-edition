package org.restaurant;

import org.restaurant.actors.Waitress;
import org.restaurant.actors.Chef;
import org.restaurant.items.Order;
import org.restaurant.items.Menu;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        // Fill restaurant with Waitress and Chef and wait for customers
        Waitress waitress = new Waitress("Jessica");
        Chef chef = new Chef("Bob");

        // Customer arrives
        System.out.println("Hello, my name is " + waitress.getName() + ". \n" +
                            "Our menu consists of " + Menu.starter + ", " + Menu.mainCourse + " and " + Menu.dessert + ". \n" +
                            "The Chef today is " + chef.getName() + "."
        );

        List<String> noteBook = waitress.takeCustomerOrder();

        if (noteBook.isEmpty()) {
            System.out.println("It looks like you haven't ordered anything. Goodbye!");
        } else {
            Order finalOrder = waitress.processOrder(noteBook); // final order is reference Order@31cefde0
            // Waitress instructs Chef with notebook.
            chef.cookOrder(finalOrder);
        }
    }
}