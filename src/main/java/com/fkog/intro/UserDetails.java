package com.techcross.intro;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "TBL_USER_DETAILS")
public class UserDetails {
	@Id
	@Column(name = "USER_ID", nullable = false)
	private int userId;

	@Column(name = "USER_NAME", nullable = false)
	private String userName;

	@Column(name = "JOINING_DATE", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date joiningDate;

	@Column(name = "ADDRESS", nullable = true)
	@Lob
	private String address;

	@Transient
	private String transientProperty;

	public String getTransientProperty() {
		return transientProperty;
	}

	public void setTransientProperty(String transientProperty) {
		this.transientProperty = transientProperty;
	}

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

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
