package org.restaurant.items;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter // return orderId, createdAt, customerOrder
@Setter // this.customerOrder = customerOrder, this.orderId = orderId, this.createdAt = createdAt
@RequiredArgsConstructor // Order can only be taken if we have a note to work with
public class Order {

    // Instance variables
    private final UUID orderId = UUID.randomUUID();
    private final LocalDateTime createdAt = LocalDateTime.now();
    @NonNull
    private List<String> orderFromNotebook;

}