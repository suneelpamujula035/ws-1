package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee e = new Employee();
		e.setName("fahim");
		RegularEmployee re = new RegularEmployee();
		re.setName("pawan");
		re.setSalary(250000);
		re.setBonous(5400);
		ContractEmployee ce = new ContractEmployee();
		ce.setName("naresh");
		ce.setPayPerHour(2300);
		ce.setTime_Hour(16);
		session.save(e);
		session.save(re);
		session.save(ce);
		tx.commit();
		session.close();
	}
}
