package com.fkog.savingCollections;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.fkog.util.HibernateUtils;

public class SavingCollectionApps {
	public static void main(String[] args) {

		UserDetails5 ud5 = new UserDetails5();
		ud5.setUserName("Shubham_ud3");

		Address add1 = new Address();
		add1.setCity("Mumbai");
		add1.setPincode("400014");
		add1.setState("Maharashtra");
		add1.setStreet("D.P. Rd.");
		
		Address add2 = new Address();
		add2.setCity("Banglore");
		add2.setPincode("400017");
		add2.setState("Karnataka");
		add2.setStreet("Church street");
		
		Set<Address> addressSet = new HashSet<>();
		addressSet.add(add1);
		addressSet.add(add2);
		
		ud5.setAddresses(addressSet);
		
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(ud5);
		
		session.getTransaction().commit();
		
		session.close();
	
	}
}
