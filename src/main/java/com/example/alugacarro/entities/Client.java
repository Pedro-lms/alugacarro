package com.example.alugacarro.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_client")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id //Aqui declara-se o objeto id, como o principal objeto relacional ao banco de dados
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Identificando a chave primária
	private Long id;
	private String cpf;
	private String nome;
	private String email;
	private Instant dataDeRetirada;
	private Instant dataDeDevolucao;
	
	@JsonIgnore
	@OneToMany(mappedBy = "client")
	public List<Vehicle> vehicles = new ArrayList<>();
	
	public Client() {
	}

	public Client(Long id, String nome, String cpf, String email, Instant dataDeRetirada, Instant dataDeDevolucao) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataDeRetirada = dataDeRetirada;
		this.dataDeDevolucao = dataDeDevolucao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Instant getDataDeRetirada() {
		return dataDeRetirada;
	}

	public void setDataDeRetirada(Instant dataDeRetirada) {
		this.dataDeRetirada = dataDeRetirada;
	}

	public Instant getDataDeDevolucao() {
		return dataDeDevolucao;
	}

	public void setDataDeDevolucao(Instant dataDeDevolucao) {
		this.dataDeDevolucao = dataDeDevolucao;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
}
