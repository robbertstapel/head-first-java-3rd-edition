package org.restaurant.items;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Order {
    // Instance variables
    private final UUID orderId = UUID.randomUUID();
    private final LocalDateTime createdAt = LocalDateTime.now();
    private List<String> customerOrder;

    // Constructor
    public Order(List<String> customerOrder) {
        this.customerOrder = customerOrder;
    }

    // Getters and Setters
    public UUID getOrderId() {
        return orderId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<String> getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(List<String> customerOrder) {
        this.customerOrder = customerOrder;
    }
}