package com.inti.model;

import java.util.List;
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
public class InfosEscale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idInfosEscale;
	private String heureArrivee;
	private String heureDepart;
	
	@ManyToMany
	 @JoinTable(name = "vol_compagnie",
	 	joinColumns= @JoinColumn(name = "idInfosEscale"),
	 	inverseJoinColumns= @JoinColumn (name="idVol"))
	private List<Vol> listeVol;
	
	@ManyToMany()
	 @JoinTable(name = "AeroportA_infosEscale",
	 	joinColumns= @JoinColumn(name = "idInfosEscale"),
	 	inverseJoinColumns= @JoinColumn (name="idAeroportA"))
	private List<AeroportArrivee> listeAeroportArrivee;
	
	@ManyToMany()
	 @JoinTable(name = "AeroportD_infosEscale",
	 	joinColumns= @JoinColumn(name = "idInfosEscale"),
	 	inverseJoinColumns= @JoinColumn (name="idAeroportD"))
	private List<AeroportDepart> listeAeroportDepart;
	
	public InfosEscale() {
		super();
	}

	public InfosEscale(String heureArrivee, String heureDepart) {
		super();
		this.heureArrivee = heureArrivee;
		this.heureDepart = heureDepart;
	}

	public InfosEscale(int idInfosEscale, String heureArrivee, String heureDepart) {
		super();
		this.idInfosEscale = idInfosEscale;
		this.heureArrivee = heureArrivee;
		this.heureDepart = heureDepart;
	}

	public int getIdInfosEscale() {
		return idInfosEscale;
	}

	public void setIdInfosEscale(int idInfosEscale) {
		this.idInfosEscale = idInfosEscale;
	}

	public String getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(String heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	public String getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}

	public List<Vol> getListeVol() {
		return listeVol;
	}

	public void setListeVol(List<Vol> listeVol) {
		this.listeVol = listeVol;
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
		return "infosEscale [idInfosEscale=" + idInfosEscale + ", heureArrivee=" + heureArrivee + ", heureDepart="
				+ heureDepart + "]";
	}

	
}
