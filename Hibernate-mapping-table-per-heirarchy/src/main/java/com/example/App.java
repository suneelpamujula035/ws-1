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
		
//		AnnotationConfiguration config = new AnnotationConfiguration().config.configure();
//		Configuration config = new Configuration().configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory = config.buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Employee e = new Employee();
		e.setName("guru");
		RegularEmployee re = new RegularEmployee();
		re.setName("Kiran");
		re.setSalary(10000);
		re.setBonous(2000);
		ContractEmployee ce = new ContractEmployee();
		ce.setName("ganesh");
		ce.setPayPerHour(1000);
		ce.setTime_Hour(22);
		session.save(e);
		session.save(re);
		session.save(ce);
		tx.commit();
		
//		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
//    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//    	SessionFactory sf = con.buildSessionFactory(reg);
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
//		tx.commit();
//		session.close();
	}
}
