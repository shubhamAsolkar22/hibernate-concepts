package com.fkog.oneToMany;

import java.util.List;

import org.hibernate.Session;

import com.fkog.util.HibernateUtils;

public class OneToManyMappingApp {
	public static void main(String[] args) {
		UserDetails8 userDetails = new UserDetails8();
		userDetails.setUserName("Shubham7");

		Vehicle v = new Vehicle();
		v.setVehicleName("splendor");
		Vehicle v2 = new Vehicle();
		v2.setVehicleName("MG ZS ev");

		userDetails.setVehicle(List.of(v,v2));
		
		Session session = HibernateUtils.getSessionFactory().openSession();

		session.beginTransaction();

		session.save(userDetails);
		
		session.getTransaction().commit();

		session.close();
	}
}
