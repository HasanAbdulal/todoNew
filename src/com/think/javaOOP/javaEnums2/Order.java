package com.think.javaOOP.javaEnums2;

public class Order {
    public enum OrderStatus {
        PENDING, PREPARING, COMPLETED, HOLD, CANCELED, DELIVERED, CLOSED
    }

    // Properties of the Order class
    private OrderStatus status;

    public boolean isDelivered() {
        /* if (getStatus() == OrderStatus.DELIVERED) {
            return true;
        }
        return false;
        */
        return getStatus() == OrderStatus.DELIVERED;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
