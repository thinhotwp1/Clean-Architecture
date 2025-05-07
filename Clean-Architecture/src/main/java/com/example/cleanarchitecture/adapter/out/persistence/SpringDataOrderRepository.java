package com.example.cleanarchitecture.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataOrderRepository extends JpaRepository<OrderJpaEntity, Long> {
}
