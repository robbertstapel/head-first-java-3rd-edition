package org.restaurant;

import org.restaurant.actors.Waitress;
import org.restaurant.items.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Waitress myWaitress = new Waitress("Jessica");
        System.out.println("Hello, my name is " + myWaitress.getName() + ". Our menu consists of a Starter, a Main Course, and a Dessert.");
        // myWaitress.presentMenu();
        myWaitress.takeCustomerOrder();
    }
}