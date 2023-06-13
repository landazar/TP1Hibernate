package com.inti.model;

public class Passager {

	private int idPassager;
	private String nom;
	private String prenom;
	
	public Passager() {
		super();
	}

	public Passager(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Passager(int idPassager, String nom, String prenom) {
		super();
		this.idPassager = idPassager;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getIdPassager() {
		return idPassager;
	}

	public void setIdPassager(int idPassager) {
		this.idPassager = idPassager;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Passager [idPassager=" + idPassager + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
}