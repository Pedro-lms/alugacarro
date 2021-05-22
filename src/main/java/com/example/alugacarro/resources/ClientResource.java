package com.example.alugacarro.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.alugacarro.entities.Client;
import com.example.alugacarro.services.ClienteService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Client> findById(@PathVariable Long id){
		Client obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	/*
	@Autowired
	private ClienteService service;
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{cpf}")
	public ResponseEntity<Client> findByAll(@PathVariable String cpf){
		Client obj = service.findbyAll(cpf);
		return ResponseEntity.ok().body(obj); Depois verifica pro cpf
	}*/

}
