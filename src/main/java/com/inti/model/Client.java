package com.inti.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//commentaire
@Entity
@Table
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClient;
	private String Prénom;
	private String Nom;
	private String Adresse;
	private int telephone;
	private String email;
	
	@OneToMany(mappedBy = "client")
	private List<Reservation> listeReservation;
	
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

	public List<Reservation> getListeReservation() {
		return listeReservation;
	}

	public void setListeReservation(List<Reservation> listeReservation) {
		this.listeReservation = listeReservation;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", Prénom=" + Prénom + ", Nom=" + Nom + ", Adresse=" + Adresse
				+ ", telephone=" + telephone + ", email=" + email + "]";
	}
	
	
	
	
}
