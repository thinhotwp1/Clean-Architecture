package com.example.cleanarchitecture.application.dto;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class OrderRequestDto {
    private String product;
    private int quantity;
    private BigDecimal price;

}
