package org.restaurant;

import org.restaurant.actors.Chef;
import org.restaurant.actors.Waitress;
import org.restaurant.events.EventManager;
import org.restaurant.events.OrderCookedEvent;
import org.restaurant.events.OrderReceivedEvent;

public class Application {

    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        Waitress waitress = new Waitress("Jessica", eventManager);
        Chef chef = new Chef("Bob", eventManager);

        eventManager.registerListener(OrderReceivedEvent.class, chef);
        eventManager.registerListener(OrderCookedEvent.class, waitress);

        waitress.takeOrder();
    }

}
