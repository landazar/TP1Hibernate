package com.inti.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	
	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory()
	{
		try {
		return new Configuration().configure().buildSessionFactory();
		} 
		catch (Exception e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		
		if (sessionFactory != null)
		{
			return sessionFactory;
		}
		else
		{
			return buildSessionFactory();
		}
	}
	
	

}
