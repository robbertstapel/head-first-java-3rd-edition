package org.restaurant.actors;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.restaurant.items.Order;

@Getter
@Setter
@RequiredArgsConstructor
public class Chef {
    // Instance variables
    @NonNull
    private String name;

    // Instance methods
    public Order cookOrder (Order order){
        System.out.println("Cooking..." + order.getOrderFromNotebook());
        try {
            Thread.sleep(3000);
            System.out.println("Order is ready! " + order.getOrderId());
        } catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("after try catch");
        return order;
    }
}