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
import com.inti.model.Passager;
import com.inti.model.Reservation;
import com.inti.model.Vol;
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
		
		// A mettre dans traitement BDD
		
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
			
	        Reservation reservation1 = new Reservation(LocalDate.now());
	        
	        Client client1 = new Client(prenom, nom, adresse, Integer.parseInt(telephone), email);
	        
	        reservation1.setClient(client1);
	        
	        Passager p1 = new Passager(nom, prenom);
	        
	        reservation1.setPassager(p1);
	        
			Vol v1 = session.load(Vol.class, Integer.parseInt(vol));
			
			reservation1.setVol(v1);
			
			
			
		
			
			session.save(reservation1);
		
			
			session.getTransaction().commit();			
			this.getServletContext().getRequestDispatcher("/WEB-INF/creerReservation.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
			
//			logger.error("Erreur  !");
			
			session.getTransaction().rollback();
		}
	}
	}


