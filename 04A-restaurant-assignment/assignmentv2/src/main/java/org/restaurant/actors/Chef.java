package org.restaurant.actors;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.restaurant.events.EventManager;
import org.restaurant.events.EventListener;
import org.restaurant.events.OrderCookedEvent;
import org.restaurant.events.OrderReceivedEvent;
import org.restaurant.items.Order;

@Getter
@Setter
public class Chef implements EventListener<OrderReceivedEvent> {
    @NonNull
    private String name;

    private final EventManager eventManager;

    public Chef(String name, EventManager eventManager){
        this.name = name;
        this.eventManager = eventManager;
    }

    @Override
    public void onEvent(OrderReceivedEvent event) {
        cook(event.getOrder());
    }

    public void cook(Order order) {
        try {
            Thread.sleep(3000);
            order.setStatus("ready");
            System.out.println("Chef: cooked order: " + order.getOrderId());
            eventManager.postEvent(new OrderCookedEvent(order));
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
