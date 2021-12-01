package com.techcross.primaryKeys;

import org.hibernate.Session;

import com.techcross.util.HibernateUtils;

public class PrimaryKeysApp {
	public static void main(String[] args) {
		UserDetails2 userDetails = new UserDetails2();

		userDetails.setUserName("Shubham3");
		
		Session session = HibernateUtils.getSessionFactory().openSession();

		session.beginTransaction();

		session.save(userDetails);

		session.getTransaction().commit();

		session.close();
	}
}
