package com.inti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class CompagnieAerienne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCompagnieAerienne;
	private String nom;
	
	
	 @ManyToMany
	 @JoinTable(name = "vol_compagnie",
			 	joinColumns= @JoinColumn(name = "idCompagnieAerienne"),
			 	inverseJoinColumns= @JoinColumn (name="idVol"))
	private List<Vol> listeVol;
	
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

	public List<Vol> getListeVol() {
		return listeVol;
	}

	public void setListeVol(List<Vol> listeVol) {
		this.listeVol = listeVol;
	}

	@Override
	public String toString() {
		return "CompagnieAerienne [idCompagnieAerienne=" + idCompagnieAerienne + ", nom=" + nom + "]";
	}
	


	
	
	
	

}
