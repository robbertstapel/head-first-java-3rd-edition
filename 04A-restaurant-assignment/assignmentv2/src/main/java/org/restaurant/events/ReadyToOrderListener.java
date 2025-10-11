package org.restaurant.events;

import java.util.EventListener;

public interface ReadyToOrderListener extends EventListener {
    void onReadyToOrder(ReadyToOrderEvent event);
}
