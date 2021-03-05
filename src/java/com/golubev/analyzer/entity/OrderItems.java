package com.golubev.analyzer.entity;

public class OrderItems extends AbstractEntity {


    private String productId;

    private int quantity;

    public OrderItems(String orderId, String productId, int quantity) {
        super(orderId);
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getOrderId() {
        return id;
    }

    public void setOrderId(String orderId) {
        this.id = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
