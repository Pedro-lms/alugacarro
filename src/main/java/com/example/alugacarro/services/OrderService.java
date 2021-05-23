package com.example.alugacarro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.alugacarro.entities.Order;
import com.example.alugacarro.repositories.OrderRepository;

@Service //Poderia passar o @Component, mas por questão de especificação semântica, foi passado o @service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findbyAll(@PathVariable String cpf) {
		Order obj = (Order) repository.findAll();
		return obj;
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
