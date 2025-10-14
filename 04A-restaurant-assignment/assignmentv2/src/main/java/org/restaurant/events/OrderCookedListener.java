package org.restaurant.events;

import java.util.EventListener;

public interface OrderCookedListener extends EventListener {
    void onOrderReady(OrderCookedEvent event);
}
