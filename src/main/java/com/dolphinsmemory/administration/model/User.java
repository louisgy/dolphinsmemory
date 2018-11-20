package com.dolphinsmemory.administration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@TableGenerator(name = "User_Id_Gen", table = "userId_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", pkColumnValue = "Addr_Gen", initialValue = 50000, allocationSize = 100)
public class User {
	
	@Id
	@GeneratedValue(generator = "User_Id_Gen")
	private int id;
	
	private String email;
	
	private String password;
	
	@NotNull
	@Size(min = 2, max = 32)
	private String frstName;
	
	@NotNull
	@Size(min = 2, max = 32)
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
