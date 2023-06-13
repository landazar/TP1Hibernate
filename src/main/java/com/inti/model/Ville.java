package com.inti.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVille;
	private String nom;
	
	@OneToMany(mappedBy = "ville")
	private List<AeroportArrivee> listeAeroportArrivee;
	@OneToMany(mappedBy = "ville")
	private List<AeroportDepart> listeAeroportDepart;
	
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

	public List<AeroportArrivee> getListeAeroportArrivee() {
		return listeAeroportArrivee;
	}

	public void setListeAeroportArrivee(List<AeroportArrivee> listeAeroportArrivee) {
		this.listeAeroportArrivee = listeAeroportArrivee;
	}

	public List<AeroportDepart> getListeAeroportDepart() {
		return listeAeroportDepart;
	}

	public void setListeAeroportDepart(List<AeroportDepart> listeAeroportDepart) {
		this.listeAeroportDepart = listeAeroportDepart;
	}

	@Override
	public String toString() {
		return "Ville [idVille=" + idVille + ", nom=" + nom + "]";
	}
	
	
	
}
