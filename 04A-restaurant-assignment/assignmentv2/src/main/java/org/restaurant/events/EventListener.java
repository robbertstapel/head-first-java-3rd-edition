package org.restaurant.events;

public interface EventListener<T> {
    void onEvent(T event);
}
