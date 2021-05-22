package com.example.alugacarro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.alugacarro.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
