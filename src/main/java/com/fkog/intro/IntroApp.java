package com.fkog.intro;

import java.util.Date;

import org.hibernate.Session;

import com.fkog.util.HibernateUtils;

public class IntroApp {
	public static void main(String[] args) {
		UserDetails userDetails = new UserDetails();

		userDetails.setUserId(5);
		
		userDetails.setUserName("Shubham3");
		
		userDetails.setJoiningDate(new Date());
		
		userDetails.setAddress("Heaven");
		
		userDetails.setTransientProperty("sdasds");

		//		Open session -> begin transaction -> do something with entities -> commit transaction
		
		Session session = HibernateUtils.getSessionFactory().openSession();

		session.beginTransaction();

		session.save(userDetails);

		session.getTransaction().commit();

		session.close();

		session = HibernateUtils.getSessionFactory().openSession();

		session.beginTransaction();

		UserDetails ud = session.get(UserDetails.class, 5);
		
		session.getTransaction().commit();

		session.close();
		
		System.out.println(ud.getUserName());
	}
}
