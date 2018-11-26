package com.dolphinsmemory.exam.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@TableGenerator(name = "Address_Gen", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", pkColumnValue = "Addr_Gen", initialValue = 10000, allocationSize = 100)
public class Student {

	@Id
	@GeneratedValue(generator = "Address_Gen")
	@Column(name="STUDENT_ID")
	private int id;

	@NotNull
	@Size(min = 2, max = 32)
	private String firstName;   

	@NotNull
	@Size(min = 2, max = 32)
	private String lastName;
	
	public Student() {
		
	}

	public Student(String firstName,String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
//	@Email
//	private String email; // email

//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	@NotNull(message = "Please provide a date.")
//	private Date dob;

//	@Column(unique = true)
//	private String userName;
//	private String domain; // Physics
//	private String grade; // Applied physics

	// @NotNull(message = "Please pick a selection")
//	private String sex;
//
//	@NotNull(message = "Please provide a password.")
//	private String password;

//	@Transient
//	private String confirmPassword;

	
//	@Transient
//	public String getConfirmPassword() {
//		return confirmPassword;
//	}

//	public void setConfirmPassword(String confirmPassword) {
//		this.confirmPassword = confirmPassword;
//	}

	









	// public List<StudentsEnrolled> getEnrolled() {
	// return enrolled;
	// }
	//
	// public void setEnrolled(List<StudentsEnrolled> enrolled) {
	// this.enrolled = enrolled;
	// }

	// public String getFirstName() {
	// return firstName;
	// }
	// public void setFirstName(String firstName) {
	// this.firstName = firstName;
	// }
	// public String getLastName() {
	// return lastName;
	// }
	// public void setLastName(String lastName) {
	// this.lastName = lastName;
	// }
	// public String getEmail() {
	// return email;
	// }
	// public void setEmail(String email) {
	// this.email = email;
	// }
	// public String getDomain() {
	// return domain;
	// }
	// public void setDomain(String domain) {
	// this.domain = domain;
	// }
	// public String getGrade() {
	// return grade;
	// }
	// public void setGrade(String grade) {
	// this.grade = grade;
	 }
