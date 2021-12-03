package com.fkog.eagerAndLazy;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.fkog.util.HibernateUtils;

public class EagerAndLazyApp {
	public static void main(String[] args) {

		UserDetails6 ud6 = new UserDetails6();
		ud6.setUserName("Shubham_ud3");

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

		ud6.setAddresses(addressSet);

		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();

		session.save(ud6);

		session.getTransaction().commit();

		session.close();
		
		ud6 = null;
		
		session = HibernateUtils.getSessionFactory().openSession();
		ud6 = session.get(UserDetails6.class, 1);
		//addresses not fetched
		//only proxy userdetails object without adresses
		session.close(); //will prevent adresses from  being fetched if fetch type is lazy.
		System.out.println(ud6.getAddresses().size());;
		//now it runs query addresses
		//this is lazy initialization.
		
	}
}
