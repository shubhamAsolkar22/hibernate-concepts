package com.fkog.manyToMany;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_VEHICLE3")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long vehicelId;
	
	private String vehicleName;

	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "vehicles")
	private Collection<UserDetails> userList = Collections.EMPTY_LIST;

	public long getVehicelId() {
		return vehicelId;
	}

	public void setVehicelId(long vehicelId) {
		this.vehicelId = vehicelId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public Collection<UserDetails> getUserList() {
		return userList;
	}

	public void setUserList(Collection<UserDetails> userList) {
		this.userList = userList;
	}

}
