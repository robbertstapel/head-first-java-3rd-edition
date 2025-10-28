package org.restaurant.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.restaurant.items.Order;

@Getter
@AllArgsConstructor
public class OrderCookedEvent {
    private final Order order;
}
