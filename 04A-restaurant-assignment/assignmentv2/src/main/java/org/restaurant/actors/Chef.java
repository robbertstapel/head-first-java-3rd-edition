package org.restaurant.actors;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.restaurant.items.Order;
import org.restaurant.events.OrderReadyEvent;
import org.restaurant.events.OrderReadyListener;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class Chef {
    @NonNull
    private String name;

    private final List<OrderReadyListener> listeners = new ArrayList<>();

    public void addOrderReadyListener(OrderReadyListener listener) {
        listeners.add(listener);
    }

    public void takeOrder(Order order) {
        System.out.println("Chef: Received order: " + order.getOrder() + " with id: " + order.getOrderId());
        cookOrder(order);
    }

    private void cookOrder(Order order) {
        try {
            Thread.sleep(3000);
            System.out.println("Chef: Order is cooked: " + order.getOrderId());
            serveCookedOrder(order);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private void serveCookedOrder(Order order) {
        // create a new OrderReadyEvent with the order
        OrderReadyEvent event = new OrderReadyEvent(this, order);
        // also call onOrderReady for each listener
        for (OrderReadyListener listener : listeners) {
            listener.onOrderReady(event);
        }
    }
}
