package com.example.cleanarchitecture.adapter.out.persistence;

import com.example.cleanarchitecture.domain.model.Order;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Setter
@Getter
public class OrderJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product;
    private int quantity;
    private BigDecimal totalPrice;

    public static OrderJpaEntity from(Order order) {
        OrderJpaEntity orderJpaEntity = new OrderJpaEntity();
        orderJpaEntity.product = order.getProduct();
        orderJpaEntity.quantity = order.getQuantity();
        orderJpaEntity.totalPrice = order.getPrice();
        return orderJpaEntity;
    }
}
