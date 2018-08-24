package com.dolphinsmemory.exam.domain;

import java.util.Date;

public class Students {
	private long studentId;
	private String firstName;
	private String lastName;
	private String email;
	private Date dob;
	private String userName;
	
	
	public Students(long studentId, String firstName ) {
		this.studentId = studentId;
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	
}
