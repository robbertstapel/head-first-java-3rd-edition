package org.restaurant.actors;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.restaurant.events.OrderReceivedEvent;
import org.restaurant.events.OrderReceivedListener;
import org.restaurant.items.Order;
import org.restaurant.events.OrderCookedEvent;
import org.restaurant.events.OrderCookedListener;

@Getter
@Setter
public class Chef implements OrderReceivedListener {
    @NonNull
    private String name;

    private OrderCookedListener listener;

    public Chef(String name){
        this.name = name;
    }

    @Override
    public void onOrderReceived(OrderReceivedEvent event) {
        cook(event.getOrder());
    }

    public void cook(Order order) {
        try {
            Thread.sleep(3000);
            order.setStatus("ready");
            OrderCookedEvent event = new OrderCookedEvent(this, order);
            listener.onOrderReady(event);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }


}
