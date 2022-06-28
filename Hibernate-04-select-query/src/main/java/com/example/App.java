package com.example;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {

	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student2.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
//		Query query = session.createQuery("from Student2");//to get all records
//		List list = query.list();
//		list.stream().forEach(System.out::println);

//		Query query=session.createQuery("from Student2");//for pagination
//		query.setFirstResult(5);  
//		query.setMaxResults(10);  
//		List list=query.list();//will return the records from 5 to 10th number  
//		list.stream().forEach(System.out::println);
		
//		Query q=session.createQuery("update Student2 set name=:n where id=:i");//update query
//		q.setParameter("n","Udit Kumar");  
//		q.setParameter("i",111);  
//		  
//		int status=q.executeUpdate();  
//		System.out.println(status);
		
//		Query query=session.createQuery("delete from Student2 where id=100");//delete query
//		query.executeUpdate(); 
		
//		Query q=session.createQuery("select sum(salary) from Student2");//total salary of all employees
//		List<Integer> list=q.list();  
//		System.out.println(list.get(0));  
		
//		Query q=session.createQuery("select max(salary) from Student2");//to get maxium salary of the employee
		
//		Query q=session.createQuery("select min(salary) from Student2");//to get minium salary of the employee
		
//		Query q=session.createQuery("select count(id) from Student2");//to count total number of employees
		
//		Query q=session.createQuery("select avg(salary) from Student2");//to get average salary of each employee
		
		tx.commit();
		session.close();
		
	}
}
