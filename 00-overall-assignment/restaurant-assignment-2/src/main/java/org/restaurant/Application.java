package org.restaurant;

import org.restaurant.actors.Waitress;
import org.restaurant.items.Order;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        Waitress myWaitress = new Waitress();
        System.out.println("Hello, my name is " + myWaitress.getName() + " here is our menu:");
        myWaitress.presentMenu();

        Order orderOne = new Order(Arrays.asList("1", "2", "3"));
        myWaitress.takeOrder(orderOne);

//        myOrder.setCustomerOrder(Arrays.asList("1", "2", "3"));
//        System.out.println(myOrder.getCustomerOrder());
    }
}