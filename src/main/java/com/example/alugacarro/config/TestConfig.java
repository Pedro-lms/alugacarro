package com.example.alugacarro.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.alugacarro.entities.Client;
import com.example.alugacarro.entities.Order;
import com.example.alugacarro.entities.Vehicle;
import com.example.alugacarro.entities.enums.OrderStatus;
import com.example.alugacarro.repositories.ClientRepository;
import com.example.alugacarro.repositories.VehicleRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Client c1 = new Client( 1L, "Maria ", "12121212121", "maria@gmail.com",Instant.parse("2021-06-20T19:53:07Z"), Instant.parse("2019-06-20T19:53:07Z"));
		Client c2 = new Client( 2L, "Pedro","977777777", "pedro@gmail.com", Instant.parse("2021-06-20T19:53:07Z"), Instant.parse("2019-06-20T19:53:07Z"));		
		
		Vehicle v1 = new Vehicle(1L, "Volskwagen", "Gol", "Azul", "USP1234", 50.00);

		Order o1 = new Order(1L, OrderStatus.PAGO,  Instant.parse("2021-06-20T19:53:07Z"), c1);
		
		clientRepository.saveAll(Arrays.asList(c1, c2));
		vehicleRepository.saveAll(Arrays.asList(v1));
	}
}
