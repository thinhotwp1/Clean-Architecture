package com.example.cleanarchitecture.domain.port.out;

import com.example.cleanarchitecture.domain.model.Order;

public interface SaveOrderPort {
    void save(Order order);
}
