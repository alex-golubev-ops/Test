package com.golubev.analyzer.parser;

import com.golubev.analyzer.entity.AbstractEntity;
import com.golubev.analyzer.entity.Order;
import com.golubev.analyzer.entity.Product;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductParser implements Parser{

    private final String fileName;

    public ProductParser(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public List<? extends AbstractEntity> getValue() {
        List<Product> products = new ArrayList<>();
        try {
            List<String> lines = Files
                    .lines(Paths.get(fileName))
                    .collect(Collectors.toList());

            for (String line : lines) {
                String[] ProductLine = line.split(",");
               Product product = new Product(ProductLine[0],Double.parseDouble(ProductLine[1]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
}

