package com.x.com.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("Emp-config.xml");
		System.out.println("Configuration Object Created Successfully");
		SessionFactory sf = cfg.buildSessionFactory();
		System.out.println("SessionFactory Object Created Successfully");
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Emp e = new Emp();
		e.setId("10");
		e.setName("Hanfan Wang");
		s.persist(e);
		tx.commit();
		System.out.println("Success");
		s.close();
		sf.close();
		
	}
}
