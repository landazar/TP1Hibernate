package com.inti.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.inti.model.Client;
import com.inti.model.Reservation;
import com.inti.util.HibernateUtil;
import com.inti.util.TraitementBDD;

/**
 * Servlet implementation class NouvelleReservationServlet
 */
@WebServlet("/nouvelleRes")
public class NouvelleReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NouvelleReservationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/nouvelleReservation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			
			session.beginTransaction();
			
//			logger.debug("Début des transactions ");
			
	        String prenom = request.getParameter("prenom");
	        String nom = request.getParameter("nom");
	        String adresse = request.getParameter("adresse");
	        String telephone = request.getParameter("telephone");
	        String email = request.getParameter("email");
	        String vol = request.getParameter("vol");
			
	        Client client1 = new Client(prenom, nom, adresse, Integer.parseInt(telephone), email);
			session.getTransaction().commit();
			
			client1.setListeReservation(new ArrayList<>());
			
			Reservation reservation1 = new Reservation(LocalDate.now());
			
			client1.getListeReservation().add(reservation1);
			
			TraitementBDD tbdd = new TraitementBDD();
			tbdd.ajouterReservation(reservation1);
			
						
			this.getServletContext().getRequestDispatcher("/WEB-INF/afficherReservation.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
			
//			logger.error("Erreur  !");
			
			session.getTransaction().rollback();
		}
	}
	}


