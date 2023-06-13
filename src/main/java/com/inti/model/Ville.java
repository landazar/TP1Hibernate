package com.inti.model;

public class Ville {

	private int idVille;
	private String nom;
	
	public Ville() {
		super();
	}

	public Ville(String nom) {
		super();
		this.nom = nom;
	}

	public Ville(int idVille, String nom) {
		super();
		this.idVille = idVille;
		this.nom = nom;
	}

	public int getIdVille() {
		return idVille;
	}

	public void setIdVille(int idVille) {
		this.idVille = idVille;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Ville [idVille=" + idVille + ", nom=" + nom + "]";
	}
	
	
	
}
