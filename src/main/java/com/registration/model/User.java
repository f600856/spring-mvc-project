package com.registration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	private String mobile;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "salt")
	private String salt;
	
	@Column(name = "hash")
	private String hash;

	public User() {
		super();
	}
	public User(String mobile, String firstName, String lastName, String gender, String salt, String hash) {
		this.mobile = mobile;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.salt = salt;
		this.hash = hash;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getSalt() {
		return salt;
	}
	
	public String getHash() {
		return hash;
	}
}
