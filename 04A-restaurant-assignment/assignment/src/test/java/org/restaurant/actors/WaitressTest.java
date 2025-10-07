package org.restaurant.actors;

import org.restaurant.items.Menu;
import org.restaurant.items.Order;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class WaitressTest {
    private Waitress waitress;

    @BeforeEach
    void setUp() {
        waitress = new Waitress("Jessica");
    }

    @Test
    void waitressShouldTellName() {
        assertEquals("Jessica", waitress.getName());
    }

    @Test
    void waitressShouldCreateOrderWithMenuItems() {
        List<String> noteBook = Arrays.asList(
                Menu.starter,
                Menu.mainCourse,
                Menu.dessert
        );

        Order order = waitress.createOrder(noteBook);

        assertNotNull(order);
        assertEquals(3, order.getOrder().size());
        assertTrue(order.getOrder().contains(Menu.starter));
    }

    @Test
    void waitressShouldCreateOrderWithAllMenuItems() {
        List<String> allItems = Menu.getItems();

        Order order = waitress.createOrder(allItems);

        assertNotNull(order);
        assertEquals(allItems, order.getOrder());
    }
}
