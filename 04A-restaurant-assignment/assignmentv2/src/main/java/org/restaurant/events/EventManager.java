package org.restaurant.events;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private final Map<Class<?>, List<EventListener>> listeners = new HashMap<>();

    public <T> void registerListener(Class<T> eventType, EventListener<T> listener) {
        listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
    }

    public <T> void unregisterListener(Class<T> eventType, EventListener<T> listener) {
        listeners.computeIfPresent(eventType, (k, v) -> {
            v.remove(listener);
            return v;
        });
    }

    public <T> void postEvent(T event) {
        List<EventListener> eventListeners = listeners.get(event.getClass());
        if (eventListeners != null) {
            for (EventListener listener : eventListeners) {
                listener.onEvent(event);
            }
        }
    }
}
