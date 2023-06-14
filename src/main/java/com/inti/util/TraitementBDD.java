package com.inti.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.inti.model.Vol;

public class TraitementBDD {
	
    private Session session;
	
    private Logger logger = LogManager.getLogger();

    public TraitementBDD() {
        session = HibernateUtil.getSessionFactory().openSession();
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
}
