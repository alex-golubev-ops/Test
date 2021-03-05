package com.golubev.analyzer.entity;

import java.time.LocalDateTime;

public class Order extends AbstractEntity {

    private LocalDateTime dateTime;

    public Order(String id, LocalDateTime dateTime) {
        super(id);
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }


}
