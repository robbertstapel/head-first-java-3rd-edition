package org.restaurant.actors;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.restaurant.items.Order;
import org.restaurant.utils.OrderReadyCallback;

@Getter
@RequiredArgsConstructor
public class Chef {
    @NonNull
    private String name;
    @NonNull
    private final OrderReadyCallback orderReadyCallback;

    public void takeOrder (Order order){
        System.out.println("Chef: Received order: " + order.getOrder() + " with id: " + order.getOrderId());
        cookOrder(order);
    }

    private void cookOrder(Order order){
        try {
            Thread.sleep(3000);
            System.out.println("Chef: Order is cooked: " + order.getOrderId());
            serveCookedOrder(order);
        } catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private void serveCookedOrder(Order order) {
        orderReadyCallback.onOrderReady(order);
    }
}