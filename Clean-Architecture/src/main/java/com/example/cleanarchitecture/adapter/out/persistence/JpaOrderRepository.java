package com.example.cleanarchitecture.adapter.out.persistence;

import com.example.cleanarchitecture.domain.model.Order;
import com.example.cleanarchitecture.domain.port.out.SaveOrderPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JpaOrderRepository implements SaveOrderPort {

    @Autowired
    private SpringDataOrderRepository repository;

    @Override
    public void save(Order order) {
        repository.save(OrderJpaEntity.from(order));
    }
}
