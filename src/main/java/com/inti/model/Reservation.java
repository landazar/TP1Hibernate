package com.inti.model;

import java.time.LocalDate;

public class Reservation {

	private int idReservation;
	private LocalDate date;
	
	
	private int numero;

	
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

	
	
	
	
	
}
