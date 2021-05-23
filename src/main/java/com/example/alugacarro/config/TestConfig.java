package com.example.alugacarro.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.alugacarro.entities.Client;
import com.example.alugacarro.entities.Order;
import com.example.alugacarro.entities.Payment;
import com.example.alugacarro.entities.TotalValue;
import com.example.alugacarro.entities.Vehicle;
import com.example.alugacarro.entities.enums.OrderStatus;
import com.example.alugacarro.repositories.ClientRepository;
import com.example.alugacarro.repositories.OrderRepository;
import com.example.alugacarro.repositories.PaymentRepository;
import com.example.alugacarro.repositories.TotalValueRepository;
import com.example.alugacarro.repositories.VehicleRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	@Autowired 
	private OrderRepository orderRepository;
	
	@Autowired
	private TotalValueRepository totalValueRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Client c1 = new Client( 1L, "Maria ", "12121212121", "maria@gmail.com",Instant.parse("2021-06-20T19:53:07Z"), Instant.parse("2019-06-20T19:53:07Z"));
		Client c2 = new Client( 2L, "Pedro","977777777", "pedro@gmail.com", Instant.parse("2021-06-20T19:53:07Z"), Instant.parse("2019-06-20T19:53:07Z"));		
		
		Vehicle v1 = new Vehicle(1L, "Volskwagen", "Gol", "Azul", "USP1234", 50.00);

		Order o1 = new Order(1L, OrderStatus.PAGO,  Instant.parse("2021-06-20T19:53:07Z"), c1);
		
		Payment p1 = new Payment(1L, Instant.parse("2021-06-20T19:53:07Z"),Instant.parse("2021-04-20T19:53:07Z"));
		
		TotalValue t1 = new TotalValue(1L, 5, 50.0, 10.0, 120.0);
		
		clientRepository.saveAll(Arrays.asList(c1, c2));
		vehicleRepository.saveAll(Arrays.asList(v1));
		orderRepository.saveAll(Arrays.asList(o1));
		paymentRepository.saveAll(Arrays.asList(p1));
		totalValueRepository.saveAll(Arrays.asList(t1));

	}
}
