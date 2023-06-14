package com.inti.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
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
public class Vol {

	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVol;
	 private LocalDate dateDepart;
	 private String heureDepart;
	 private LocalDate dateArrivee;
	 private String heureArrivee;
	 
	 @OneToMany(mappedBy = "vol")
	private List<Reservation> listeReservation;
	 
	 @ManyToMany(cascade = CascadeType.ALL)
	 @JoinTable(name = "vol_compagnie",
			 	joinColumns= @JoinColumn(name = "idVol"),
			 	inverseJoinColumns= @JoinColumn (name="idCompagnieAerienne"))
	private List<CompagnieAerienne> listeCompagnie;
	 
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "idAeroportA")
	private AeroportArrivee aeroportArrivee;
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "idAeroportD")
	private AeroportDepart aeroportDepart;
	 
	 @ManyToMany(cascade = CascadeType.ALL)
	 @JoinTable(name = "vol_compagnie",
	 	joinColumns= @JoinColumn(name = "idVol"),
	 	inverseJoinColumns= @JoinColumn (name="idInfosEscale"))
	private List<InfosEscale> listeInfos;
	 
	public Vol() {
		super();
	}


	public Vol(LocalDate dateDepart, String heureDepart, LocalDate dateArrivee, String heureArrivee) {
		super();
		this.dateDepart = dateDepart;
		this.heureDepart = heureDepart;
		this.dateArrivee = dateArrivee;
		this.heureArrivee = heureArrivee;
	}


	public Vol(int idVol, LocalDate dateDepart, String heureDepart, LocalDate dateArrivee, String heureArrivee) {
		super();
		this.idVol = idVol;
		this.dateDepart = dateDepart;
		this.heureDepart = heureDepart;
		this.dateArrivee = dateArrivee;
		this.heureArrivee = heureArrivee;
	}


	public int getIdVol() {
		return idVol;
	}


	public void setIdVol(int idVol) {
		this.idVol = idVol;
	}


	public LocalDate getDateDepart() {
		return dateDepart;
	}


	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}


	public String getHeureDepart() {
		return heureDepart;
	}


	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}


	public LocalDate getDateArrivee() {
		return dateArrivee;
	}


	public void setDateArrivee(LocalDate dateArrivee) {
		this.dateArrivee = dateArrivee;
	}


	public String getHeureArrivee() {
		return heureArrivee;
	}


	public void setHeureArrivee(String heureArrivee) {
		this.heureArrivee = heureArrivee;
	}


	public List<Reservation> getListeReservation() {
		return listeReservation;
	}


	public void setListeReservation(List<Reservation> listeReservation) {
		this.listeReservation = listeReservation;
	}


	public List<CompagnieAerienne> getListeCompagnie() {
		return listeCompagnie;
	}


	public void setListeCompagnie(List<CompagnieAerienne> listeCompagnie) {
		this.listeCompagnie = listeCompagnie;
	}


	public AeroportArrivee getAeroportArrivee() {
		return aeroportArrivee;
	}


	public void setAeroportArrivee(AeroportArrivee aeroportArrivee) {
		this.aeroportArrivee = aeroportArrivee;
	}


	public AeroportDepart getAeroportDepart() {
		return aeroportDepart;
	}


	public void setAeroportDepart(AeroportDepart aeroportDepart) {
		this.aeroportDepart = aeroportDepart;
	}


	public List<InfosEscale> getListeInfos() {
		return listeInfos;
	}


	public void setListeInfos(List<InfosEscale> listeInfos) {
		this.listeInfos = listeInfos;
	}


	@Override
	public String toString() {
		return "Vol [idVol=" + idVol + ", dateDepart=" + dateDepart + ", heureDepart=" + heureDepart + ", dateArrivee="
				+ dateArrivee + ", heureArrivee=" + heureArrivee + "]";
	}
	 
	
	 
	
}
