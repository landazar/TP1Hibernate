package com.inti.model;

public class AeroportArrivee {
	
	private int idAeroport;
	private String nom;
	
	public AeroportArrivee() {
		super();
	}

	public AeroportArrivee(String nom) {
		super();
		this.nom = nom;
	}

	public AeroportArrivee(int idAeroport, String nom) {
		super();
		this.idAeroport = idAeroport;
		this.nom = nom;
	}

	public int getIdAeroport() {
		return idAeroport;
	}

	public void setIdAeroport(int idAeroport) {
		this.idAeroport = idAeroport;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "AeroportArrivee [idAeroport=" + idAeroport + ", nom=" + nom + "]";
	}
	
	
	
	

}
