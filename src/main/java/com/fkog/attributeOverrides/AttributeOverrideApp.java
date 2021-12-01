package com.techcross.attributeOverrides;

import org.hibernate.Session;

import com.techcross.util.HibernateUtils;

public class AttributeOverrideApp {
	public static void main(String[] args) {
		UserDetails4 ud4 = new UserDetails4();
		ud4.setUserName("Shubham_ud3");

		Address homeAddress = new Address();
		homeAddress.setCity("Mumbai");
		homeAddress.setPincode("400014");
		homeAddress.setState("Maharashtra");
		homeAddress.setStreet("D.P. Rd.");
		
		ud4.setHomeAddress(homeAddress);
		
		
		Address officeAddress = new Address();
		officeAddress.setCity("Mumbai");
		officeAddress.setPincode("400014");
		officeAddress.setState("Maharashtra");
		officeAddress.setStreet("D.P. Rd.");
		
		ud4.setOfficeAddress(officeAddress);
		
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(ud4);
		
		session.getTransaction().commit();
		
		session.close();
	}
}
