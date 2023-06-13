package com.inti.util;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;



public class TraitementBDD {
	private static final Logger logger = LogManager.getLogger();
	
	private Session session;
	
	public TraitementBDD() {
		session = HibernateUtil.getSessionFactory().openSession();
	}

	
	
}
