package org.restaurant.actors;

import lombok.RequiredArgsConstructor;
import lombok.NonNull;
import lombok.Getter;
import lombok.Setter;

import org.restaurant.events.OrderReadyEvent;
import org.restaurant.events.OrderReadyListener;
import org.restaurant.items.Menu;
import org.restaurant.items.Order;
import org.restaurant.utils.Communicator;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class Waitress implements OrderReadyListener {

    @NonNull
    private String name;
    private List<String> noteBook = new ArrayList<>();

    public void greetCustomer(){
        System.out.println("Waitress: Hello, my name is " + name + ".");
    }

    public List<String> takeOrder() {
        Communicator prompt = new Communicator();
        for (String menuItem : Menu.getItems()) {
            if (prompt.askYesNoQuestion("Waitress: Would you like a " + menuItem + "?")) {
                noteBook.add(menuItem);
            }
        }
        return noteBook;
    }

    public Order createOrder(List<String> noteBook){
        Order finalOrder = new Order(noteBook);
        System.out.println("Waitress: created order: " + finalOrder.getOrderId() + " and send it to chef.");
        return finalOrder;
    }

    @Override
    public void onOrderReady(OrderReadyEvent event) {
        Order order = event.getOrder();
        System.out.println("Waitress: received order: " + order.getOrderId());
        serveCustomer(order);
    }

    public void serveCustomer(Order order){
        System.out.println("Waitress: served: " + order.getOrderId() + " to customer.");
    }

}