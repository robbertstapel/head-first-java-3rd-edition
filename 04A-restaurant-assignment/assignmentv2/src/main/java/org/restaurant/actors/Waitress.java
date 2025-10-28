package org.restaurant.actors;

import lombok.*;
import org.restaurant.events.EventManager;
import org.restaurant.events.EventListener;
import org.restaurant.events.OrderCookedEvent;
import org.restaurant.events.OrderReceivedEvent;
import org.restaurant.items.Menu;
import org.restaurant.items.Order;
import org.restaurant.utils.Communicator;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class Waitress implements EventListener<OrderCookedEvent> {

    @NonNull
    private String name;
    private List<String> noteBook = new ArrayList<>();
    @NonNull
    private final EventManager eventManager;

    public Order takeOrder() {
        Communicator prompt = new Communicator();
        for (String menuItem : Menu.getItems()) {
            if (prompt.askYesNoQuestion("Waitress: Would you like a " + menuItem + "?")) {
                noteBook.add(menuItem);
            }
        }
        Order order = new Order(noteBook);
        System.out.println("Waitress: took order: " + order.getOrderId());
        eventManager.postEvent(new OrderReceivedEvent(order));
        return order;
    }

    @Override
    public void onEvent(OrderCookedEvent event) {
        Order order = event.getOrder();
        System.out.println("Waitress: received cooked order: " + order.getOrderId());
        serveCustomer(order);
    }

    public void serveCustomer(Order order) {
        System.out.println("Waitress: served: " + order.getOrderId() + " to customer.");
    }

}
