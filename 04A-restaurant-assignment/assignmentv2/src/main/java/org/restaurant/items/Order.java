package org.restaurant.items;

import lombok.Getter;
import lombok.Setter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class Order {
    private final UUID orderId = UUID.randomUUID();
    private final LocalDateTime createdAt = LocalDateTime.now();
    @NonNull
    private List<String> order;
    private String status = "created";

}