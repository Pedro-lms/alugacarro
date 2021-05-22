package com.example.alugacarro.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_totalvalue")
public class TotalValue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private Double diaria;
	private int numeroDeDias;
	private Double multa;
	private Double total;
	
	public TotalValue() {
	}

	public TotalValue(Long id, int numeroDeDias, Double diaria, Double multa, Double total) {
		this.id = id;
		this.numeroDeDias = numeroDeDias;
		this.diaria = diaria;
		this.multa = multa;
		this.total = total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumeroDeDias() {
		return numeroDeDias;
	}

	public void setNumeroDeDias(int numeroDeDias) {
		this.numeroDeDias = numeroDeDias;
	}

	public Double getDiaria() {
		return diaria;
	}

	public void setDiaria(Double diaria) {
		this.diaria = diaria;
	}

	public Double getMulta() {
		return multa;
	}

	public void setMulta(Double multa) {
		multa = diaria;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		total = diaria * numeroDeDias + multa;
	}
	
	
	
}
