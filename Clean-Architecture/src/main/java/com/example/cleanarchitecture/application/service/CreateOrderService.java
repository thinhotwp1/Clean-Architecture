package com.example.cleanarchitecture.application.service;

import com.example.cleanarchitecture.application.dto.OrderRequestDto;
import com.example.cleanarchitecture.application.dto.OrderResponseDto;
import com.example.cleanarchitecture.domain.model.Order;
import com.example.cleanarchitecture.domain.port.in.CreateOrderUseCase;
import com.example.cleanarchitecture.domain.port.out.SaveOrderPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateOrderService implements CreateOrderUseCase {

    @Autowired
    private SaveOrderPort saveOrderPort;

    @Override
    public OrderResponseDto createOrder(OrderRequestDto dto) {
        // Có thể thêm rule, validate, v.v.
        saveOrderPort.save(new Order(dto.getProduct(), dto.getQuantity(), dto.getPrice()));
        return new OrderResponseDto(dto.getProduct(), dto.getPrice());
    }
}
