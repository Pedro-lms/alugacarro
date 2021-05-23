package com.example.alugacarro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.alugacarro.entities.Client;
import com.example.alugacarro.repositories.ClientRepository;

@Service //Poderia passar o @Component, mas por questão de especificação semântica, foi passado o @service
public class ClienteService {

	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll(){
		return repository.findAll();
	}
	
	public Client findbyAll(@PathVariable String cpf) {
		Client obj = (Client) repository.findAll();
		return obj;
	}
	
	public Client findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		return obj.get();
	}
	
	public Client insert(Client obj) {
		return repository.save(obj);
	}
}
