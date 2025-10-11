package org.restaurant.events;

import java.util.EventListener;

public interface OrderReadyListener extends EventListener {
    void onOrderReady(OrderReadyEvent event);
}
