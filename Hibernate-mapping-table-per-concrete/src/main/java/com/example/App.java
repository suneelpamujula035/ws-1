package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure("hibernate.cfg.xml");//If we did not specify the file name it will automatically considered "hibernate.cfg.xml" file
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee e = new Employee();
		e.setName("karthik");
		RegularEmployee re = new RegularEmployee();
		re.setName("jagadheesh");
		re.setSalary(10000);
		re.setBonous(2000);
		ContractEmployee ce = new ContractEmployee();
		ce.setName("saleem");
		ce.setPayPerHour(1000);
		ce.setTime_Hour(22);
		session.save(e);
		session.save(re);
		session.save(ce);
		tx.commit();
		
	}
}
