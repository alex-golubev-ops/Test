package com.golubev.analyzer.entity;

public class Product extends AbstractEntity {

    private double price;

    public Product(String id, double price) {
        super(id);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
