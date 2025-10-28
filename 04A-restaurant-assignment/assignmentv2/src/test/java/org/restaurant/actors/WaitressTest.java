package org.restaurant.actors;

import org.restaurant.events.EventManager;
import org.restaurant.items.Menu;
import org.restaurant.items.Order;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class WaitressTest {
    private Waitress waitress;
    private final EventManager eventManager;

    WaitressTest(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    @BeforeEach
    void setUp() {
        waitress = new Waitress("Jessica", eventManager);
    }

    @Test
    void waitressShouldTellName() {
        assertEquals("Jessica", waitress.getName());
    }

    @Test
    void waitressShouldCreateOrderWithAllMenuItems() {
        List<String> allItems = Menu.getItems();
        Order order = waitress.createOrder(allItems);
        assertNotNull(order);
        assertEquals(allItems, order.getOrder());
    }
}
