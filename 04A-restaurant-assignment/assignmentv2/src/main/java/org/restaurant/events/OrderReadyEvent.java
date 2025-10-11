package org.restaurant.events;

import lombok.Getter;
import org.restaurant.items.Order;
import java.util.EventObject;

// The getter allows listeners to access the order
@Getter
public class OrderReadyEvent extends EventObject {
    // this is final because we create a single event for each order that is ready
    // when an order is ready the constructor takes it along with the Chef, being the source where the even is sent from.
    // docs: The object on which the Event initially occurred
    private final Order order;

    // this takes the source (Chef, in this case) and the event data (Order in this case).
    public OrderReadyEvent(Object source, Order order) {
        super(source);
        this.order = order;
    }

}
