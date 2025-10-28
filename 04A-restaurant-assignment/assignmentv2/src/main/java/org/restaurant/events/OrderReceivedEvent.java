package org.restaurant.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.restaurant.items.Order;

@Getter
@AllArgsConstructor
public class OrderReceivedEvent {
    private final Order order;
}
