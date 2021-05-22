package com.example.alugacarro.entities;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;

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
	private Date dataDevolvida;
	private Date dataMarcada;

	
	public Payment() {
		super();
	}

	public Payment(Long id, Date dataDevolvida, Date dataMarcada) {
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

	public Date getDataDevolvida() {
		return dataDevolvida;
	}

	public void setDataDevolvida(Date dataDevolvida) {
		this.dataDevolvida = dataDevolvida;
	}

	public Date getDataMarcada() {
		return dataMarcada;
	}

	public void setDataMarcada(Date dataMarcada) {
		this.dataMarcada = dataMarcada;
	}{

	try{
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
		Date dataMarcada = (Date) sdformat.parse("2020-01-25");
		Date dataDevolvida = (Date) sdformat.parse("2020-01-23");
		System.out.println("Date-1: " + sdformat.format(dataMarcada));
		System.out.println("Date-2: " + sdformat.format(dataDevolvida));
		if (dataMarcada.compareTo(dataDevolvida) > 0) {
			System.out.println("Date-1 is after Date-2");
		} else if (dataMarcada.compareTo(dataDevolvida) < 0) {
			System.out.println("Date-1 is before Date-2");
		} else if (dataMarcada.compareTo(dataDevolvida) == 0) {
			System.out.println("Date-1 is same as Date-2");
		}
	}catch (java.text.ParseException e) {
		e.printStackTrace();
	}
}
}