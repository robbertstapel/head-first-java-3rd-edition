package model.order;

public enum OrderStatus {
    NEW,
    SENT_TO_KITCHEN,
    IN_PROGRESS, // Added for Chef's use
    READY,      // Added for Chef's use
    COMPLETED,
    DELIVERED
}
