package com.hib.hib_springboot;

import java.util.Date;
import java.util.Random;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
//        Configuration cfg=new Configuration();
//        cfg.configure("hibernate.cfg.xml");
		Session session = Hibernate5Util.getSessionFactory().openSession();
		session.beginTransaction();
		Student st = new Student();
		st.setId("00"+Integer.toString(new Random().nextInt(1000)));
		st.setRollno("11"+new Random().nextInt(10000));

//        Session se=sf.getCurrentSession();
//        Transaction tt=se.beginTransaction();
		
System.out.println("creating object of address class");
		
		Address add=new Address();
		add.setStreet("Unit 3");
		add.setAddedDate(new Date());
		add.setCity("BBSR");
		add.setX(23.55);
		
		session.save(st);
		session.save(add);
		session.getTransaction().commit();
		System.out.println("Done");
		

	}
}
