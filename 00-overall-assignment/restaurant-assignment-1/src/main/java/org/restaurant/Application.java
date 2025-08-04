package org.restaurant;

import org.restaurant.actors.Chef;
import org.restaurant.actors.Customer;
import org.restaurant.actors.Waitress;
import org.restaurant.items.Menu;
import org.restaurant.items.Order;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Chef chef = new Chef(1, "Gordon");
        Waitress waitress = new Waitress("Sarah");
        Customer customer = new Customer("Robbert");
        Scanner scanner = new Scanner(System.in);

        Menu.display();

//        waitress.greetCustomer(customer);
//        Order customerOrder = waitress.takeOrder(customer, scanner);
//        Order cookedMeal = chef.cookMeal(customerOrder);
//        waitress.serveMeal(customer, cookedMeal);
//        scanner.close();
    }
}