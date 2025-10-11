package org.restaurant.actors;

import lombok.Getter;
import lombok.Setter;
import org.restaurant.events.ReadyToOrderEvent;
import org.restaurant.events.ReadyToOrderListener;
import org.restaurant.items.Menu;

@Getter
@Setter
public class Customer {
    private String name;
    private ReadyToOrderListener listener;

    public void readyToOrder(String menu) {
        if (listener != null) {
            ReadyToOrderEvent event = new ReadyToOrderEvent(this, "I want a pizza");
            listener.onReadyToOrder(event);
        }
    }
}