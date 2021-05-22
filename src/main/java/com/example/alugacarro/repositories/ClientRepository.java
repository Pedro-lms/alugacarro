package com.example.alugacarro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.alugacarro.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
