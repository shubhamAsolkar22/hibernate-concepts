package com.fkog.savingCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "TBL_USER_DETAILS_5")
public class UserDetails5 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	private String userName;

	@ElementCollection
	@JoinTable(name = "TBL_USER_ADDRESSES", joinColumns = @JoinColumn(name = "USER_ID")
	)
    @GenericGenerator(name = "sequencegen", strategy = "sequence")
	@CollectionId(column =@Column( name="ADDRESS_ID") ,generator = "sequencegen", type = @Type(type="long"))
	private Collection<Address> addresses = new ArrayList<>();

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

	public Collection<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Collection<Address> addresses) {
		this.addresses = addresses;
	}

}
