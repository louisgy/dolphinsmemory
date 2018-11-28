package com.dolphinsmemory.exam.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

@Component
@Embeddable
public class EnrollementId implements Serializable {

		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int studentId;
	
	private int courseSessionId;
	
	
	public EnrollementId() {
		super();
	}

	public EnrollementId(int studentId, int courseSessionId) {
		super();
		this.studentId = studentId;
		this.courseSessionId = courseSessionId;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getCourseSessionId() {
		return courseSessionId;
	}
	
	public void setCourseSessionId(int courseSessionId) {
		this.courseSessionId = courseSessionId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseSessionId;
		result = prime * result + studentId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnrollementId other = (EnrollementId) obj;
		if (courseSessionId != other.courseSessionId)
			return false;
		if (studentId != other.studentId)
			return false;
		return true;
	}
	
	
}
