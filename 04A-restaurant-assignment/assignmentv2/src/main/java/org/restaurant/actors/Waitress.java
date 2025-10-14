package org.restaurant.actors;

import lombok.RequiredArgsConstructor;
import lombok.NonNull;
import lombok.Getter;
import lombok.Setter;

import org.restaurant.events.OrderCookedEvent;
import org.restaurant.events.OrderCookedListener;
import org.restaurant.events.OrderReceivedEvent;
import org.restaurant.events.OrderReceivedListener;
import org.restaurant.items.Menu;
import org.restaurant.items.Order;
import org.restaurant.utils.Communicator;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Waitress implements OrderCookedListener {

    @NonNull
    private String name;
    private List<String> noteBook = new ArrayList<>();

    private OrderReceivedListener listener;

    public Waitress(String name){
        this.name = name;
    }

    public Order takeOrder(){
        Communicator prompt = new Communicator();
        for (String menuItem : Menu.getItems()) {
            if (prompt.askYesNoQuestion("Waitress: Would you like a " + menuItem + "?")) {
                noteBook.add(menuItem);
            }
        }
        Order order = new Order(noteBook);
        OrderReceivedEvent event = new OrderReceivedEvent(this, order);
        listener.onOrderReceived(event);
        return order;
    }

    @Override
    public void onOrderReady(OrderCookedEvent event) {
        Order order = event.getOrder();
        System.out.println("Waitress: received order: " + order.getOrderId());
        serveCustomer(order);
    }

    public void serveCustomer(Order order){
        System.out.println("Waitress: served: " + order.getOrderId() + " to customer.");
    }

}