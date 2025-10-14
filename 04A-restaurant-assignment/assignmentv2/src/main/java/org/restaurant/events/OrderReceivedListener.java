package org.restaurant.events;

import java.util.EventListener;

public interface OrderReceivedListener extends EventListener {
    void onOrderReceived(OrderReceivedEvent event);
}
