package com.dolphinsmemory.administration.model;

import javax.persistence.Entity;

@Entity
public class User {
	
	private int id;
	private String email;
	private String password;
	private String frstName;
	private String lastName;
	
	
	public User() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFrstName() {
		return frstName;
	}
	public void setFrstName(String frstName) {
		this.frstName = frstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	
}
