package com.inti.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idReservation;
	private LocalDate date;
	private int numero;

	@ManyToOne
	@JoinColumn(name = "idVol")
	private Vol vol;
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	@ManyToOne
	@JoinColumn(name = "idPassager")
	private Passager passager;
	
	public Reservation() {}
	
	public Reservation(LocalDate date, int numero) {
		super();
		this.date = date;
		this.numero = numero;
	}


	public Reservation(int idReservation, LocalDate date, int numero) {
		super();
		this.idReservation = idReservation;
		this.date = date;
		this.numero = numero;
	}






	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", date=" + date + ", numero=" + numero + "]";
	}

	public int getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}

	
	
	
	
	
}
