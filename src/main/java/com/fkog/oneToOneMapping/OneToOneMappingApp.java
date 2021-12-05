package com.fkog.oneToOneMapping;

import org.hibernate.Session;

import com.fkog.util.HibernateUtils;

public class OneToOneMappingApp {
	public static void main(String[] args) {
		UserDetails7 userDetails = new UserDetails7();
		userDetails.setUserName("Shubham7");

		Vehicle v = new Vehicle();
		v.setVehicleName("splendor");

		userDetails.setVehicle(v);
		
		Session session = HibernateUtils.getSessionFactory().openSession();

		session.beginTransaction();

		session.save(userDetails);
		
		session.getTransaction().commit();

		session.close();
	}
}
