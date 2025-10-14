package org.restaurant;

import org.restaurant.actors.Waitress;
import org.restaurant.actors.Chef;

public class Application {

    public static void main(String[] args) {
        Waitress waitress = new Waitress("Jessica");
        Chef chef = new Chef("Bob");

        waitress.setListener(chef);
        chef.setListener(waitress);

        waitress.takeOrder();
    }

}