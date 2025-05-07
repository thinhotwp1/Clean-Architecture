package com.example.cleanarchitecture.adapter.in.web;

import com.example.cleanarchitecture.application.dto.OrderRequestDto;
import com.example.cleanarchitecture.application.dto.OrderResponseDto;
import com.example.cleanarchitecture.domain.model.Order;
import com.example.cleanarchitecture.domain.port.in.CreateOrderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private CreateOrderUseCase createOrderServiceRest;

    @PostMapping
    public OrderResponseDto createOrder(@RequestBody OrderRequestDto dto) {
        return createOrderServiceRest.createOrder(dto);
    }

}
