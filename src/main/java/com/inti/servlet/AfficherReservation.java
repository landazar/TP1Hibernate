package com.inti.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inti.model.Reservation;
import com.inti.util.TraitementBDD;


@WebServlet("/afficherReservation")
public class AfficherReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AfficherReservation() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TraitementBDD traitementBDD = new TraitementBDD();
		List<Reservation> listeReservations = traitementBDD.recupererListeReservations();
		
		request.setAttribute("listeReservations", listeReservations);
		
		request.getRequestDispatcher("/WEB-INF/afficherReservation.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
