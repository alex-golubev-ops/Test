package com.golubev.analyzer.parser;

import com.golubev.analyzer.entity.AbstractEntity;
import com.golubev.analyzer.entity.Order;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderParser implements Parser {

    private final String fileName;

    public OrderParser(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public List<? extends AbstractEntity> getValue() {
        List<Order> orders = new ArrayList<>();
        try {
            List<String> lines = Files
                    .lines(Paths.get(fileName))
                    .collect(Collectors.toList());

            for (String line : lines) {
                String[] orderLine = line.split(",");
                Order order = new Order(orderLine[0], LocalDateTime.parse(orderLine[1],
                        DateTimeFormatter.ofPattern("YYYY-MM-DDTHH:mm:SS")));
                orders.add(order);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return orders;
    }


}
