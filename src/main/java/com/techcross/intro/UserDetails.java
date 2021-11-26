package com.techcross.intro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_USER_DETAILS")
public class UserDetails {
	@Id
	@Column(name="USER_ID",nullable = false)
	private int userId;
	@Column(name="USER_NAME",nullable = false)
	private String userName;
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
	
	
}
