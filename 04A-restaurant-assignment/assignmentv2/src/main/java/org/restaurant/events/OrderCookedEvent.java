package org.restaurant.events;

import lombok.Getter;
import org.restaurant.items.Order;
import java.util.EventObject;

// The getter allows listeners to access the order
@Getter
public class OrderCookedEvent extends EventObject {
    private final Order order;

    public OrderCookedEvent(Object source, Order order) {
        super(source);
        this.order = order;
    }

}
