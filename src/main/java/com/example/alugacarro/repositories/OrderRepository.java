package com.example.alugacarro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.alugacarro.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
