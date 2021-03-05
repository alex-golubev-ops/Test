package com.golubev.analyzer.parser;

import com.golubev.analyzer.entity.AbstractEntity;
import com.golubev.analyzer.entity.Order;
import com.golubev.analyzer.entity.OrderItems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderItemsParser implements Parser {

    private final String fileName;

    public OrderItemsParser(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<? extends AbstractEntity> getValue() {
        List<OrderItems> orderItems = new ArrayList<>();
        try {
            List<String> lines = Files
                    .lines(Paths.get(fileName))
                    .collect(Collectors.toList());

            for (String line : lines) {
                String[] orderItemsLine = line.split(",");
               OrderItems orderItem = new OrderItems(orderItemsLine[0],
                       orderItemsLine[1],
                       Integer.parseInt(orderItemsLine[2]));
                orderItems.add(orderItem);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return orderItems;
    }
}
