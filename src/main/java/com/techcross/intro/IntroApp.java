package com.techcross.intro;

import org.hibernate.Session;

import com.techcross.util.HibernateUtils;

public class IntroApp {
	public static void main(String[] args) {
		UserDetails userDetails = new UserDetails();
		userDetails.setUserId(1);
		userDetails.setUserName("Shubham");
//		Open session -> begin transaction -> do something with entities -> commit transaction
		Session session = HibernateUtils.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		session.save(userDetails);
		
		session.getTransaction().commit();

	}
}
