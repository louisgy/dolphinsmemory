package com.dolphinsmemory.exam.domain;

public class Students {
	private long studentId;
	private String firstName;
	
	
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
