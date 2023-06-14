package com.inti.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inti.util.TraitementBDD;

/**
 * Servlet implementation class CreerVolServlet
 */
@WebServlet("/creerVol")
public class CreerVolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreerVolServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/creerVol.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TraitementBDD tbdd = new TraitementBDD();
		
		tbdd.creerVol(LocalDate.parse(request.getParameter("dateDepart")), request.getParameter("heureDepart"),
					LocalDate.parse(request.getParameter("dateArrivee")), request.getParameter("heureArrivee"),
					request.getParameter("compagnieA"), request.getParameter("aeroportDepart"), 
					request.getParameter("aeroportArrivee"), request.getParameter("villeDepart"), 
					request.getParameter("villeArrivee"));
		
		response.sendRedirect("creerVol");
	}

}
