package com.fkog.attributeOverrides;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USER_DETAILS_3")
public class UserDetails4 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	private String userName;
	
	@Embedded //not mandatory but good for code readability
	@AttributeOverride(name="street" , column=@Column(name="HOME_STREET"))
	@AttributeOverride(name="city" , column=@Column(name="HOME_CITY"))
	@AttributeOverride(name="state" , column=@Column(name="HOME_STATE"))
	@AttributeOverride(name="pincode" , column=@Column(name="HOME_PINCODE"))
	private Address homeAddress;
	@Embedded
	private Address officeAddress;
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

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	
}
