package org.restaurant.utils;

import org.restaurant.items.Order;

@FunctionalInterface
public interface OrderReadyCallback {
    void onOrderReady(Order order);
}
