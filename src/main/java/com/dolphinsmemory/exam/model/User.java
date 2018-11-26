package com.dolphinsmemory.exam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.dolphinsmemory.validator.ValidPassword;

@Entity
@TableGenerator(name = "User_Id_Gen", table = "userId_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", pkColumnValue = "Addr_Gen", initialValue = 50000, allocationSize = 100)
public class User {
	
	@Id
	@GeneratedValue(generator = "User_Id_Gen")
	private int id;
	
	@Email
	private String email;
	
	@ValidPassword
	private String password;
	
	@Transient
	private String password1;
	
	
	@NotNull
	@Size(min = 2, max = 32)
	private String firstName;
	
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
	public String getFirstName() {
		return firstName;
	}
	public void setFrstName(String frstName) {
		this.firstName = frstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	
}
