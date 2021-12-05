package com.fkog.oneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_VEHICLE")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long vehicelId;
	private String vehicleName;
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

	
}
