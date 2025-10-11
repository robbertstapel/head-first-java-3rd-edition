package org.restaurant;

import org.restaurant.actors.Customer;
import org.restaurant.actors.Waiter;
import org.restaurant.actors.Waitress;
import org.restaurant.actors.Chef;
import org.restaurant.items.Menu;
import org.restaurant.items.Order;

import java.util.List;

public class Application {

    public static void main(String[] args) {
//        Waitress waitress = new Waitress("Jessica");
//        Chef chef = new Chef("Bob");
//        chef.addOrderReadyListener(waitress);
//
//        waitress.greetCustomer();
//        List<String> noteBook = waitress.takeOrder();
//
//        if (noteBook.isEmpty()) {
//            System.out.println("It looks like you haven't ordered anything. Goodbye!");
//        } else {
//            Order finalOrder = waitress.createOrder(noteBook);
//            chef.takeOrder(finalOrder);
//        }

        // 1. Create the actors
        Customer customer = new Customer();
        customer.setName("Robbert");

        Waiter waiter = new Waiter();
        waiter.setName("James");

        // 2. Connect the listener (waiter) to the event source (customer)
        customer.setListener(waiter);

        // 3. The customer is now ready to order, which will trigger the event
        customer.readyToOrder("Steak Frites");
    }

}