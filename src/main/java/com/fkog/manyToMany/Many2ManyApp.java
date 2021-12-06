package com.fkog.manyToMany;

import java.util.List;

import org.hibernate.Session;

import com.fkog.util.HibernateUtils;

public class Many2ManyApp {
	public static void main(String[] args) {

		UserDetails ud = new UserDetails();
		ud.setUserName("Shubham");

		Vehicle v = new Vehicle();
		v.setVehicleName("splendor");
		Vehicle v2 = new Vehicle();
		v2.setVehicleName("MG ZS ev");

		List<UserDetails> udl = List.of(ud);
		List<Vehicle> vl = List.of(v, v2);

		v.setUserList(udl);
		v2.setUserList(udl);

		ud.setVehicle(vl);

		Session session = HibernateUtils.getSessionFactory().openSession();

		session.beginTransaction();

		session.save(ud);
		session.save(v);
		session.save(v2);

		session.getTransaction().commit();

		session.close();

	}
}
