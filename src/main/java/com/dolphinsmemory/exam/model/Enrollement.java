package com.dolphinsmemory.exam.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Enrollement {

	 @Id
	 @Column(name="ENROLLEMENT_ID")
     private EnrollementId id;


	private Date enrolledDate;
	private long grade;
	private boolean isComplete;
	
	
	
	public Enrollement(EnrollementId id, Date enrolledDate, long grade, boolean isComplete, Student student,
			CourseSession courseSession) {
		super();
		this.id = id;
		this.enrolledDate = enrolledDate;
		this.grade = grade;
		this.isComplete = isComplete;
		this.student = student;
		this.courseSession = courseSession;
	}

	@MapsId("studentId")
	@ManyToOne
	@JoinColumn(name="STUDENT_ID")
	private Student student;
	
	@MapsId("courseSessionId")
	@ManyToOne
	@JoinColumn(name="COURSE_SESSION_ID")
	private CourseSession courseSession;

	public EnrollementId getId() {
		return id;
	}

	public void setId(EnrollementId id) {
		this.id = id;
	}

	public Date getEnrolledDate() {
		return enrolledDate;
	}

	public void setEnrolledDate(Date enrolledDate) {
		this.enrolledDate = enrolledDate;
	}

	public long getGrade() {
		return grade;
	}

	public void setGrade(long grade) {
		this.grade = grade;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public CourseSession getCourseSession() {
		return courseSession;
	}

	public void setCourseSession(CourseSession courseSession) {
		this.courseSession = courseSession;
	}

	
	

}

