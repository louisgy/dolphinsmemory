package com.dolphinsmemory.exam.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dolphinsmemory.exam.model.Enrollement;
import com.dolphinsmemory.exam.model.EnrollementId;
import com.dolphinsmemory.exam.model.Student;
import com.dolphinsmemory.exam.model.CourseSession;
import com.dolphinsmemory.exam.repository.CourseSessionRepository;
import com.dolphinsmemory.exam.repository.EnrollementRepository;
import com.dolphinsmemory.exam.repository.StudentRepository;

@RestController
public class EnrollementController {
	
	@Autowired
	private EnrollementRepository enrollementRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseSessionRepository courseSessionRepository;
	
	@Autowired
	private Enrollement enrollement ;

	@PostMapping("/enrollement/{studentId}/{courseSessionId}")
	public Enrollement registerStudentForCourse(
			@PathVariable int  studentId,@PathVariable int  courseSessionId) {

 Optional<Student> s = studentRepository.findById(studentId);
 Optional<CourseSession> c = courseSessionRepository.findById(courseSessionId);
		return enrollementRepository.save(new Enrollement(new EnrollementId(234,234), null, courseSessionId, false, null, null));
//				,"2018-10-23"
//				,234L
//				,false
//				,s
//				,c);
		
		
	}
}
