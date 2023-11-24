package com.hib.hib_springboot;

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
		st.setId("11");
		st.setRollno("11553");

//        Session se=sf.getCurrentSession();
//        Transaction tt=se.beginTransaction();
		session.save(st);
		session.getTransaction().commit();
		System.out.println("Done");

	}
}
