package com.inti.model;

public class infosEscale {
	private int idInfosEscale;
	private String heureArrivee;
	private String heureDepart;
	
	public infosEscale() {
		super();
	}

	public infosEscale(String heureArrivee, String heureDepart) {
		super();
		this.heureArrivee = heureArrivee;
		this.heureDepart = heureDepart;
	}

	public infosEscale(int idInfosEscale, String heureArrivee, String heureDepart) {
		super();
		this.idInfosEscale = idInfosEscale;
		this.heureArrivee = heureArrivee;
		this.heureDepart = heureDepart;
	}

	public int getIdInfosEscale() {
		return idInfosEscale;
	}

	public void setIdInfosEscale(int idInfosEscale) {
		this.idInfosEscale = idInfosEscale;
	}

	public String getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(String heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	public String getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}

	@Override
	public String toString() {
		return "infosEscale [idInfosEscale=" + idInfosEscale + ", heureArrivee=" + heureArrivee + ", heureDepart="
				+ heureDepart + "]";
	}

	
}
