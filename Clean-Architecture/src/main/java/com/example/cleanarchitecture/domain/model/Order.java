package com.example.cleanarchitecture.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {
    private String product;
    private int quantity;
    private BigDecimal price;

    public Order(String product, int quantity, BigDecimal price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public BigDecimal total() {
        return price.multiply(BigDecimal.valueOf(quantity));
    }

}
