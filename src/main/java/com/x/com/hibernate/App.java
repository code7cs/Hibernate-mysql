package com.x.com.hibernate;

import java.io.Serializable;

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
//		e.setId("11");
//		e.setName("Nagendra");
//		s.update(e);
//		s.persist(e);
		e.setId("13");
		e.setName("Peter  W");
		Serializable id = s.save(e);
		System.out.println(id);
		tx.commit();
		System.out.println("Success");
//		System.out.println(s.get(Emp.class, "10"));
//		System.out.println(s.load(Emp.class, "11"));
		s.close();
		sf.close();
		
	}
}
