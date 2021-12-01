package com.fkog.embeddingObjects;

import org.hibernate.Session;

import com.fkog.util.HibernateUtils;

public class EmbedingObjectsApp {
	public static void main(String[] args) {
		UserDetails3 ud3 = new UserDetails3();
		ud3.setUserName("Shubham_ud3");

		Address address = new Address();
		address.setCity("Mumbai");
		address.setPincode("400014");
		address.setState("Maharashtra");
		address.setStreet("D.P. Rd.");
		
		ud3.setAddress(address);
		
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(ud3);
		
		session.getTransaction().commit();
		
		session.close();
	}
}
