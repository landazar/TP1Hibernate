package com.inti.util;


import java.util.ArrayList;
import java.time.LocalDate;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.inti.model.Reservation;
import com.inti.model.AeroportArrivee;
import com.inti.model.AeroportDepart;
import com.inti.model.CompagnieAerienne;
import com.inti.model.Ville;
import com.inti.model.Vol;



public class TraitementBDD {
	private static final Logger logger = LogManager.getLogger();
	
	private Session session;
	
	public TraitementBDD() {
		session = HibernateUtil.getSessionFactory().openSession();
	}
	
	public List<Reservation> recupererListeReservations(){
		List<Reservation> listeReservation = new ArrayList<>();
		try {
			
			session.beginTransaction();	
			listeReservation = session.createNativeQuery("select * from Reservation", Reservation.class).list();
			System.out.println(listeReservation);
			logger.debug("recuperation de la liste des résérvations");
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return listeReservation;	
	}
	
	public void supprimerReservations(int idReservation){
		try {
			
			session.beginTransaction();	
			Reservation r1 = session.load(Reservation.class, idReservation);
			logger.debug("récupération de la réservation selon son id dans la BDD");
			session.delete(r1);
			logger.debug("supression de la réservation");
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}	
	}

	public void creerVol(LocalDate dateDepart, String heureDepart, LocalDate dateArrivee, String heureArrivee, String nomCompagnie,
						String nomAeroportDepart, String nomAeroportArrivee, String nomVilleDepart, String nomVilleArrivee)
	{
		/**
		 * Fonction a amélioré en mettant une liste d'aéroport et une liste de compagnie pour qu'on puisse choisir
		 * sans forcément créer plusiuers fois la même compagnie ou aéroport dans la base de données
		 */
		try {
			
			session.beginTransaction();
			
			logger.debug("Début des transactions pour enregistrer un vol");
			
			Vol v1 = new Vol(dateDepart, heureDepart, dateArrivee, heureArrivee);
			
			List<CompagnieAerienne> listeCompagnie = List.of(new CompagnieAerienne(nomCompagnie));
			
			AeroportDepart ad1 = new AeroportDepart(nomAeroportDepart);
			
			AeroportArrivee aa1 = new AeroportArrivee(nomAeroportArrivee);
			
			Ville vd1 = new Ville(nomVilleDepart);
			
			Ville va1 = new Ville(nomVilleArrivee);
			
			
			v1.setListeCompagnie(listeCompagnie);
			
			v1.setAeroportArrivee(aa1);
			v1.setAeroportDepart(ad1);
			
			aa1.setVille(va1);
			ad1.setVille(vd1);
			
			session.save(v1);
			
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
			logger.error("Erreur d'enregistrement d'un vol");
			
			session.getTransaction().rollback();
		}
	}
	
	
}
