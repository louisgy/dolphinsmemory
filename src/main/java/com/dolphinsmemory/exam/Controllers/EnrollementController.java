package com.dolphinsmemory.exam.Controllers;

import java.text.ParseException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dolphinsmemory.exam.model.Enrollement;
import com.dolphinsmemory.exam.model.EnrollementId;
import com.dolphinsmemory.exam.repository.CourseSessionRepository;
import com.dolphinsmemory.exam.repository.EnrollementRepository;
import com.dolphinsmemory.exam.repository.StudentRepository;
import com.dolphinsmemory.exception.ResourceNotFoundException;

@RestController
public class EnrollementController {

	@Autowired
	private EnrollementRepository enrollementRepository;

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseSessionRepository courseSessionRepository;
	

	@PostMapping("/enrolle/{studentId}/{courseSessionId}/enrollement")
	public Enrollement EnrollStudent(@PathVariable int studentId, @PathVariable int courseSessionId,@RequestBody Enrollement newEnrollement)
			throws ParseException {
		
		newEnrollement.setId(new EnrollementId(studentId,courseSessionId)); // use optional for null EnrollementId 
		return studentRepository.findById(studentId).map(student ->{
			
			newEnrollement.setStudent(student);
			
			courseSessionRepository.findById(courseSessionId).map(courseSession ->{
				newEnrollement.setCourseSession(courseSession);
				
				
				return enrollementRepository.save(newEnrollement);
			}).orElseThrow(() -> new ResourceNotFoundException("Course Sesssion id: " + courseSessionId + " not found"));
			
			return newEnrollement;
		}).orElseThrow(() -> new ResourceNotFoundException("Student id " + studentId + " not found"));
		


	}
}
