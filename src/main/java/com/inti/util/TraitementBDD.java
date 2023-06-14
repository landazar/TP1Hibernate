package com.inti.util;


import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.inti.model.Reservation;



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

	
	
}
