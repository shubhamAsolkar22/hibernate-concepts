package com.fkog.manyToMany;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fkog.oneToMany.Vehicle2;

@Entity
@Table(name = "TBL_USER_DETAILS_10")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	private String userName;

	@ManyToMany(cascade = CascadeType.ALL/* ,mappedBy = "userList" */)
	private Collection<Vehicle> vehicles = Collections.EMPTY_LIST;

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

	public Collection<Vehicle> getVehicle() {
		return vehicles;
	}

	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicles = vehicle;
	}

}
