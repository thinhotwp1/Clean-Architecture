package com.example.cleanarchitecture.domain.port.in;

import com.example.cleanarchitecture.application.dto.OrderRequestDto;
import com.example.cleanarchitecture.application.dto.OrderResponseDto;

public interface CreateOrderUseCase {
    OrderResponseDto createOrder(OrderRequestDto order);
}
