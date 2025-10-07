package org.restaurant;

import org.restaurant.actors.Waitress;
import org.restaurant.actors.Chef;
import org.restaurant.items.Order;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        Waitress waitress = new Waitress("Jessica");
        Chef chef = new Chef("Bob", waitress::receiveCookedOrder);

        waitress.greetCustomer();
        List<String> noteBook = waitress.takeOrder();

        if (noteBook.isEmpty()) {
            System.out.println("It looks like you haven't ordered anything. Goodbye!");
        } else {
            Order finalOrder = waitress.createOrder(noteBook);
            chef.takeOrder(finalOrder);
        }
    }
}