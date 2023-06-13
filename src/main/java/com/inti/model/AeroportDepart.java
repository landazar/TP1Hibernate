package com.inti.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class AeroportDepart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAeroport;
	private String nom;
	
	@OneToMany(mappedBy = "aeroportDepart")
	private List<Vol> listeVol;
	
	@ManyToOne
	@JoinColumn(name = "idVille")
	private Ville ville;
	
	@ManyToMany
	 @JoinTable(name = "AeroportD_infosEscale",
	 	joinColumns= @JoinColumn(name = "idAeroportD"),
	 	inverseJoinColumns= @JoinColumn (name="idInfosEscale"))
	private List<InfosEscale> listeInfos;
	
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

	public List<Vol> getListeVol() {
		return listeVol;
	}

	public void setListeVol(List<Vol> listeVol) {
		this.listeVol = listeVol;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public List<InfosEscale> getListeInfos() {
		return listeInfos;
	}

	public void setListeInfos(List<InfosEscale> listeInfos) {
		this.listeInfos = listeInfos;
	}

	@Override
	public String toString() {
		return "AeroportDepart [idAeroport=" + idAeroport + ", nom=" + nom + "]";
	}
	
	
	
	
	

}
