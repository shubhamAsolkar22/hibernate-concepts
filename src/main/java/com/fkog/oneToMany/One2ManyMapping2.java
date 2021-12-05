package com.fkog.oneToMany;

import java.util.List;

import org.hibernate.Session;

import com.fkog.util.HibernateUtils;

public class One2ManyMapping2 {

	public static void main(String[] args) {
		UserDetails9 userDetails = new UserDetails9();
		userDetails.setUserName("Shubham7");

		Vehicle2 v = new Vehicle2();
		v.setVehicleName("splendor");
		Vehicle2 v2 = new Vehicle2();
		v2.setVehicleName("MG ZS ev");
		
		v.setUser(userDetails);
		v2.setUser(userDetails);
		
		userDetails.setVehicle(List.of(v,v2));
		
		Session session = HibernateUtils.getSessionFactory().openSession();

		session.beginTransaction();

		session.save(userDetails);
		session.save(v);
		session.save(v2);
		
		session.getTransaction().commit();

		session.close();
	}

}
