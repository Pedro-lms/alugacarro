package com.example.alugacarro.config;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.alugacarro.entities.Client;
import com.example.alugacarro.repositories.ClientRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public void run(String... args) throws Exception {
		Client c1 = new Client( 1L, "Maria ", "12121212121", "maria@gmail.com",Instant.parse("2019-06-20T19:53:07Z"), Instant.parse("2019-06-20T19:53:07Z"));
		Client c2 = new Client( 2L, "Pedro","977777777", "pedro@gmail.com", Instant.parse("2019-06-20T19:53:07Z"), Instant.parse("2019-06-20T19:53:07Z"));		
	}
}
