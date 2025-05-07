package com.example.cleanarchitecture.adapter.in.kafka;

import com.example.cleanarchitecture.application.dto.OrderRequestDto;
import com.example.cleanarchitecture.domain.port.in.CreateOrderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaOrderListener {

    @Autowired
    private CreateOrderUseCase createOrderUseCase;

    @KafkaListener(topics = "order-topic", groupId = "order-group", containerFactory = "orderKafkaListenerContainerFactory")
    public void handleOrder(OrderRequestDto request) {
        // Directly call the UseCase
        createOrderUseCase.createOrder(request);
        System.out.println("Handled order from Kafka: " + request);
    }
}
