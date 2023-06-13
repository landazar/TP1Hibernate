package com.inti.model;

public class CompagnieAerienne {
	
	private int idCompagnieAerienne;
	private String nom;
	
	public CompagnieAerienne() {
		super();
	}

	public CompagnieAerienne(String nom) {
		super();
		this.nom = nom;
	}
	public CompagnieAerienne(int idCompagnieAerienne, String nom) {
		super();
		this.idCompagnieAerienne = idCompagnieAerienne;
		this.nom = nom;
	}

	public int getIdCompagnieAerienne() {
		return idCompagnieAerienne;
	}

	public void setIdCompagnieAerienne(int idCompagnieAerienne) {
		this.idCompagnieAerienne = idCompagnieAerienne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "CompagnieAerienne [idCompagnieAerienne=" + idCompagnieAerienne + ", nom=" + nom + "]";
	}
	


	
	
	
	

}
