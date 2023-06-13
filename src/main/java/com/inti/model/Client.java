package com.inti.model;

public class Client {

	private int idClient;
	private String Prénom;
	private String Nom;
	private String Adresse;
	private int telephone;
	private String email;
	
	public Client() {
		super();
	}

	public Client(String prénom, String nom, String adresse, int telephone, String email) {
		super();
		Prénom = prénom;
		Nom = nom;
		Adresse = adresse;
		this.telephone = telephone;
		this.email = email;
	}

	public Client(int idClient, String prénom, String nom, String adresse, int telephone, String email) {
		super();
		this.idClient = idClient;
		Prénom = prénom;
		Nom = nom;
		Adresse = adresse;
		this.telephone = telephone;
		this.email = email;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getPrénom() {
		return Prénom;
	}

	public void setPrénom(String prénom) {
		Prénom = prénom;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", Prénom=" + Prénom + ", Nom=" + Nom + ", Adresse=" + Adresse
				+ ", telephone=" + telephone + ", email=" + email + "]";
	}
	
	
	
	
}
