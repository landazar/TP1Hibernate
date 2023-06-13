package com.inti.model;

import java.time.LocalDate;

public class Vol {

	 private int idVol;
	 private LocalDate dateDepart;
	 private String heureDepart;
	 private LocalDate dateArrivee;
	 private String heureArrivee;
	 
	 
	public Vol() {
		super();
	}


	public Vol(LocalDate dateDepart, String heureDepart, LocalDate dateArrivee, String heureArrivee) {
		super();
		this.dateDepart = dateDepart;
		this.heureDepart = heureDepart;
		this.dateArrivee = dateArrivee;
		this.heureArrivee = heureArrivee;
	}


	public Vol(int idVol, LocalDate dateDepart, String heureDepart, LocalDate dateArrivee, String heureArrivee) {
		super();
		this.idVol = idVol;
		this.dateDepart = dateDepart;
		this.heureDepart = heureDepart;
		this.dateArrivee = dateArrivee;
		this.heureArrivee = heureArrivee;
	}


	public int getIdVol() {
		return idVol;
	}


	public void setIdVol(int idVol) {
		this.idVol = idVol;
	}


	public LocalDate getDateDepart() {
		return dateDepart;
	}


	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}


	public String getHeureDepart() {
		return heureDepart;
	}


	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}


	public LocalDate getDateArrivee() {
		return dateArrivee;
	}


	public void setDateArrivee(LocalDate dateArrivee) {
		this.dateArrivee = dateArrivee;
	}


	public String getHeureArrivee() {
		return heureArrivee;
	}


	public void setHeureArrivee(String heureArrivee) {
		this.heureArrivee = heureArrivee;
	}


	@Override
	public String toString() {
		return "Vol [idVol=" + idVol + ", dateDepart=" + dateDepart + ", heureDepart=" + heureDepart + ", dateArrivee="
				+ dateArrivee + ", heureArrivee=" + heureArrivee + "]";
	}
	 
	
	 
	
}
