package com.inti.model;

public class Aeroport {
	private int idAeroport;
	private String nom;
	
	public Aeroport(String nom) {
		super();
		this.nom = nom;
	}

	public Aeroport(int idAeroport, String nom) {
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
		return "Aeroport [idAeroport=" + idAeroport + ", nom=" + nom + "]";
	}
	
	

}
