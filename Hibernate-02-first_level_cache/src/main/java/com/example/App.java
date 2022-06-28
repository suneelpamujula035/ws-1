package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {

	public static void main(String[] args) {
		
		Student s = null;
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory(reg);
		Session session1 = sf.openSession();
		Transaction tx1 = session1.beginTransaction();
		s = (Student)session1.get(Student.class, 101);
		System.out.println(s);
		s = (Student)session1.get(Student.class, 101);
		System.out.println(s);
		s = (Student)session1.get(Student.class, 101);
		System.out.println(s);
		System.out.println("---------------------------------------");
		tx1.commit();
		session1.close();
		Session session2 = sf.openSession();
		Transaction tx2 = session2.beginTransaction();
		s = (Student)session2.get(Student.class, 101);
		System.out.println(s);
		s = (Student)session2.get(Student.class, 101);
		System.out.println(s);
		s = (Student)session2.get(Student.class, 101);
		System.out.println(s);
		System.out.println("---------------------------------------");
		tx2.commit();
		session2.close();

		
	}
}
