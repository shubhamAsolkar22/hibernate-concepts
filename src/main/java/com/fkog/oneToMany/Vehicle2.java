
package com.fkog.oneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_VEHICLE2")
public class Vehicle2 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long vehicelId;
	private String vehicleName;

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private UserDetails9 user;

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

	public UserDetails9 getUser() {
		return user;
	}

	public void setUser(UserDetails9 user) {
		this.user = user;
	}

}
