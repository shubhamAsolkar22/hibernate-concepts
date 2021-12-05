package com.fkog.oneToMany;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USER_DETAILS_9")
public class UserDetails9 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	private String userName;

	@OneToMany(mappedBy = "user" ,cascade = {CascadeType.ALL} )
	private Collection<Vehicle2> vehicle = Collections.EMPTY_LIST;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Collection<Vehicle2> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Collection<Vehicle2> vehicle) {
		this.vehicle = vehicle;
	}



}
