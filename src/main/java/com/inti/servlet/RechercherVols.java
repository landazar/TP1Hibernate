package com.inti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.inti.util.TraitementBDD;

/**
 * Servlet implementation class RechercherVol
 */
@WebServlet("/com/inti/servlet/RechercherVols")
public class RechercherVols extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Logger logger = LogManager.getLogger();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RechercherVols() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        TraitementBDD tbdd = new TraitementBDD();
        
        request.setAttribute("listeV", tbdd.getChercherVols(request.getParameter("dep"), request.getParameter("arr"), request.getParameter("date")));
        logger.debug("Envoi de la listeV personalisé à l'index ");
        this.getServletContext().getRequestDispatcher("/WEB-INF/AfficherVol.jsp").forward(request, response);
    }

}
