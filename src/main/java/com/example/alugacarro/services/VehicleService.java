package com.example.alugacarro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.alugacarro.entities.Vehicle;
import com.example.alugacarro.repositories.VehicleRepository;

@Service //Poderia passar o @Component, mas por questão de especificação semântica, foi passado o @service
public class VehicleService {

	@Autowired
	private VehicleRepository repository;
	
	public List<Vehicle> findAll(){
		return repository.findAll();
	}
	
	public Vehicle findbyAll(@PathVariable String cpf) {
		Vehicle obj = (Vehicle) repository.findAll();
		return obj;
	}
	
	public Vehicle findById(Long id) {
		Optional<Vehicle> obj = repository.findById(id);
		return obj.get();
	}
	
}
