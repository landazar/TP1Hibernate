package com.inti.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.*;
import org.hibernate.Session;

import com.inti.model.Client;
import com.inti.model.Reservation;
import com.inti.model.Vol;
import com.inti.util.HibernateUtil;
import com.inti.util.TraitementBDD;

/**
 * 
 * Servlet qui va être appelé par l'url se terminant par : creerRes
 * Objectif : redigirer la requête http vers une page jsp contenant un
 * formulaire pour saisir les propriétés d'un client avec les détails.

 * 
 * @author Me
 *
 */
@WebServlet("/creerRes")
public class CreerReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Logger logger = LogManager.getLogger();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreerReservationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * Permet de rediriger les objets request et response vers la page creerRes.jsp
	 * 
	 * @param request : la requête http qu'on récupère
	 * @param response : l'objet utilisé pour envoyer la réponse au navigateur (client)
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			
			session.beginTransaction();
			
			TraitementBDD tbdd = new TraitementBDD();
			Vol vol = tbdd.getVol(Integer.parseInt(request.getParameter("idVol")));
			
			request.setAttribute("vol", vol);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
			logger.error("Erreur d'enregistrement d'une réservation !");
			
			session.getTransaction().rollback();
		}

		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/creerReservation.jsp").forward(request, response);
		
	}

	/**
	 * Permet de récupérer les valeurs saisies par un utilisateur dans le formulaire
	 * et de les enregistrer en BDD.
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			
			session.beginTransaction();
			
			logger.debug("Début des transactions pour insérer un client");
			
			
			Reservation r1 = new Reservation(LocalDate.now(), Integer.parseInt( request.getParameter("idVol")));
		
			
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
			logger.error("Erreur d'enregistrement d'une réservation !");
			
			session.getTransaction().rollback();
		}
	}

}
