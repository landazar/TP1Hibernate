package com.inti.model;

public class AeroportDepart {
	
	private int idAeroport;
	private String nom;
	
	public AeroportDepart() {
		super();
	}

	public AeroportDepart(String nom) {
		super();
		this.nom = nom;
	}

	public AeroportDepart(int idAeroport, String nom) {
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
		return "AeroportDepart [idAeroport=" + idAeroport + ", nom=" + nom + "]";
	}
	
	
	
	
	

}
