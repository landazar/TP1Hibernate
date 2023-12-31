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
import com.inti.model.Client;
import com.inti.model.CompagnieAerienne;
import com.inti.model.InfosEscale;
import com.inti.model.Ville;
import com.inti.model.Vol;

import com.inti.model.Vol;

public class TraitementBDD {
	
    private Session session;
	

    private Logger logger = LogManager.getLogger();

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
	
	public void ajouterReservation(Reservation reservation) {
	   
	    try {
	        session.beginTransaction();
	        session.save(reservation);
	        session.getTransaction().commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        session.getTransaction().rollback();
	    } finally {
	        session.close();
	    }
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


    public List<Vol> getListeVol() {
    	
        List<Vol> listeV = new ArrayList<>();
        try {
            session.beginTransaction();

            listeV = session.createNativeQuery("SELECT * FROM Vol", Vol.class).list();

            logger.debug("Récupération de la liste des vols");

            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();

            logger.debug("Erreur de récupération des vols");

            session.getTransaction().rollback();
        }

        return listeV;
    }
    
    
	public List<Vol> getChercherVols(String depart, String arrive , String dateDepart ) {
		   
		List<Vol> listeCV = new ArrayList<>();

	    try {
	        session.beginTransaction();
	        
	        String requeteChercher = "SELECT * FROM vol WHERE " +
	        	    "(idAeroportD IN (SELECT idAeroport FROM aeroportdepart WHERE idVille IN " +
	        	    "(SELECT idVille FROM ville WHERE nom = '" + depart + "')) AND " +
	        	    "(idAeroportA IN (SELECT idAeroport FROM aeroportarrivee WHERE idVille IN " +
	        	    "(SELECT idVille FROM ville WHERE nom = '" + arrive + "'))) AND " +
	        	    "dateDepart = '" + dateDepart + "') ORDER BY dateDepart, heureDepart ;";
	        
	        listeCV = session.createNativeQuery(requeteChercher, Vol.class).list();
	        
	        logger.debug("index : Récupération de la liste des Vols de " + depart + " à " + arrive + " du " + dateDepart);
	        
	        session.getTransaction().commit();

	    } catch (Exception e) {
            e.printStackTrace();
            logger.debug("index : Erreur de récupération des vols de getChercherVols");
            session.getTransaction().rollback();
	    } 

	    return listeCV;
	}
    
    
    
    

    public void deleteVol(int id) {
        try {
            session.beginTransaction();

            Vol v1 = session.load(Vol.class, id);
            session.delete(v1);

            logger.debug("Suppression du vol : " + v1);

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();

            logger.debug("Erreur de suppression du vol avec l'id : " + id);

            session.getTransaction().rollback();
        }
    }

    public void updateVol(Vol vol) {
        try {
            session.beginTransaction();

            Vol v1 = session.get(Vol.class, vol.getIdVol());
            v1.setHeureDepart(vol.getHeureDepart());
            v1.setDateDepart(vol.getDateDepart());
            v1.setHeureArrivee(vol.getHeureArrivee());
            v1.setDateArrivee(vol.getDateArrivee());
            
            session.update(v1);

            logger.debug("Mise à jour du vol avec l'ID: " + vol.getIdVol());

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();

            logger.debug("Erreur lors de la mise à jour du vol avec l'ID: " + vol.getIdVol());

            session.getTransaction().rollback();
        }
    }

    public Vol getVolById(int id) {
        Vol v1 = null;
        try {
            session.beginTransaction();

            v1 = session.get(Vol.class, id);

            logger.debug("Récupération du vol avec l'id : " + id);

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();

            logger.debug("Erreur de récupération du vol avec l'id : " + id);

            session.getTransaction().rollback();
        }
        return v1;
    }

	public void creerVol(LocalDate dateDepart, String heureDepart, LocalDate dateArrivee, String heureArrivee, String nomCompagnie,
						String nomAeroportDepart, String nomAeroportArrivee, String nomVilleDepart, String nomVilleArrivee, String escale,
						String heureD, String heureA, String aeroportEscale, String villeE)
	{
		/**
		 * Fonction a amélioré en mettant une liste d'aéroport et une liste de compagnie pour qu'on puisse choisir
		 * sans forcément créer plusieurs fois la même compagnie ou aéroport dans la base de données
		 */
		try {
			List<InfosEscale> listeInfos = null;
			List<AeroportArrivee> listeAeroportA = null;
			List<AeroportDepart> listeAeroportD = null;
			session.beginTransaction();
			
			logger.debug("Début des transactions pour enregistrer un vol");
			
			Vol v1 = new Vol(dateDepart, heureDepart, dateArrivee, heureArrivee);
			
			List<CompagnieAerienne> listeCompagnie = List.of(new CompagnieAerienne(nomCompagnie));
			
			AeroportDepart ad1 = new AeroportDepart(nomAeroportDepart);
			
			AeroportArrivee aa1 = new AeroportArrivee(nomAeroportArrivee);
			
			Ville vd1 = new Ville(nomVilleDepart);
			
			Ville va1 = new Ville(nomVilleArrivee);
			
			//A modifier pour que les jonctions de table infosEscales et les aeroport se remplissent car il y a une erreur
			
//			if(escale.equals("Escale"))
//			{
//				InfosEscale ie1 = new InfosEscale(heureA, heureD);
//				Ville ve1 = new Ville(villeE);
//				AeroportArrivee aa2 = new AeroportArrivee(aeroportEscale);
//				listeAeroportA = List.of(aa2);
//				aa2.setVille(ve1);
//				AeroportDepart ad2 = new AeroportDepart(aeroportEscale);
//				listeAeroportD = List.of(ad2);
//				ad2.setVille(ve1);
//				ie1.setListeAeroportDepart(listeAeroportD);
//				ie1.setListeAeroportArrivee(listeAeroportA);
//				listeInfos = List.of(ie1);
//				
//				v1.setListeInfos(listeInfos);
//			}
			
			
			
			aa1.setVille(va1);
			ad1.setVille(vd1);
			v1.setListeCompagnie(listeCompagnie);
			v1.setAeroportArrivee(aa1);
			v1.setAeroportDepart(ad1);
			
			
			
			session.save(v1);
			
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
			logger.error("Erreur d'enregistrement d'un vol");
			
			session.getTransaction().rollback();
		}
	}
	
	public Vol getVol(int idVol) {
	    Vol vol = null;
	    try {
	        session.beginTransaction();
	        
	        logger.debug("Début des transactions pour récupérer un vol");
	        
	        vol = session.get(Vol.class, idVol);
	        
	        session.getTransaction().commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        
	        logger.error("Erreur lors de la récupération du vol");
	        
	        session.getTransaction().rollback();
	    }
	    
	    return vol;
	}
	
	public Client getClient(int idClient)
	{
	    Client client  = null;
	    try {
	        session.beginTransaction();
	        
	        logger.debug("Début des transactions pour récupérer un client");
	        
	        client = session.get(Client.class, idClient);
	        
	        session.getTransaction().commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        
	        logger.error("Erreur lors de la récupération du client");
	        
	        session.getTransaction().rollback();
	    }
	    
	    return client;
	}

}
