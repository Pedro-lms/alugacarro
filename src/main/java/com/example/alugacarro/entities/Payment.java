package com.example.alugacarro.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_payment")
public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private Instant dataDevolvida;
	private Instant dataMarcada;

	
	public Payment() {
		super();
	}

	public Payment(Long id, Instant dataDevolvida, Instant dataMarcada) {
		this.id = id;
		this.dataDevolvida = dataDevolvida;
		this.dataMarcada = dataMarcada;
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Instant getDataDevolvida() {
		return dataDevolvida;
	}

	public void setDataDevolvida(Instant dataDevolvida) {
		this.dataDevolvida = dataDevolvida;
	}

	public Instant getDataMarcada() {
		return dataMarcada;
	}

	public void setDataMarcada(Instant dataMarcada) {
		this.dataMarcada = dataMarcada;
	}{

	/*SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
	Instant dataMarcada =  sdformat.parse("2020-01-25");
	Instant dataDevolvida =  sdformat.parse("2020-01-23");
	System.out.println("Instant-1: " + sdformat.format(dataMarcada));
	System.out.println("Instant-2: " + sdformat.format(dataDevolvida));*/
	if (dataMarcada.compareTo(dataDevolvida) > 0) {
		System.out.println("Instant-1 is after Instant-2");
	} else if (dataMarcada.compareTo(dataDevolvida) < 0) {
		System.out.println("Instant-1 is before Instant-2");
	} else if (dataMarcada.compareTo(dataDevolvida) == 0) {
		System.out.println("Instant-1 is same as Instant-2");
	}
}
}