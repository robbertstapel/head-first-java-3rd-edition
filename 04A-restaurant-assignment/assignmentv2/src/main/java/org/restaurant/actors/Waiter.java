package org.restaurant.actors;

import lombok.Getter;
import lombok.Setter;
import org.restaurant.events.ReadyToOrderEvent;
import org.restaurant.events.ReadyToOrderListener;

@Getter
@Setter
public class Waiter implements ReadyToOrderListener {

    private String name;

    @Override
    public void onReadyToOrder(ReadyToOrderEvent event) {
        System.out.println("Waiter: " + event.getSource() + " is ready to order!");
    }
}
