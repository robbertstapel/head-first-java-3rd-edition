package org.restaurant.events;

import lombok.Getter;
import org.restaurant.items.Order;

import java.util.EventObject;

@Getter
public class OrderReceivedEvent extends EventObject {
    private final Order order;

    public OrderReceivedEvent(Object source, Order order) {
        super(source);
        this.order = order;
    }

}
