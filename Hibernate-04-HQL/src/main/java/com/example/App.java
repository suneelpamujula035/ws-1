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
		Query query = session.createQuery("from Student2");
		List list = query.list();
		list.stream().forEach(System.out::println);
//		Random r = new Random();
//		for(int i=0; i<=50; i++)
//		{
//			Student s = new Student(i, "Name-"+i,r.nextInt(100), "address="+i);
//			session.save(s);
//		}
		
//		Query<Student2> query = session.createQuery("from hibernate1.Student2");
//		List<Student2> students = query.list();
//		for(Student2 stu : students)
//		{
//			System.out.println(stu);
//		}
		
//		Query query = session.createQuery("from hibernate1.Student2 where id=16");
//		Student2 student = (Student2) query.uniqueResult();
		
		//Student s = (Student)session.get(Student.class, 43);
//		Student s = (Student)session.createQuery("from Student");
//		System.out.println(s);
		tx.commit();
		session.close();
		
	}
}
