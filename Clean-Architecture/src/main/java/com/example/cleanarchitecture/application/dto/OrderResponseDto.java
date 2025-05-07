package com.example.cleanarchitecture.application.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderResponseDto {
    private String product;
    private BigDecimal total;

    public OrderResponseDto(String product, BigDecimal total) {
        this.product = product;
        this.total = total;
    }
}
