package com.dolphinsmemory.exam.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dolphinsmemory.exam.model.Course;
import com.dolphinsmemory.exam.model.CourseSession;
import com.dolphinsmemory.exam.model.Teacher;
import com.dolphinsmemory.exam.repository.CourseRepository;
import com.dolphinsmemory.exam.repository.CourseSessionRepository;
import com.dolphinsmemory.exam.repository.TeacherRepository;
import com.dolphinsmemory.exception.ResourceNotFoundException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class CoursesSessionController {

private final CourseSessionRepository courseSessionrepository;
private final CourseRepository courseRepository;
private final TeacherRepository teacherRepository;

public CoursesSessionController(CourseSessionRepository courseSessionrepository, CourseRepository courseRepository,TeacherRepository teacherRepository) {
	this.courseSessionrepository = courseSessionrepository;
	this.courseRepository = courseRepository;
	this.teacherRepository  =teacherRepository;
}

@GetMapping("/coursesession")
List<CourseSession> all() {
	return courseSessionrepository.findAll();
}


@PostMapping("/coursession/{courseid}/{teacherid}/coursesessions")
CourseSession newCourseSession (@PathVariable (value = "teacherid") Integer teacherId, @PathVariable (value = "courseid") Integer courseId,@RequestBody CourseSession newCourseSession) {

	// This code below works well ------------------------------------
	//	Course course = courseRepository.findById(courseId);
//	Teacher teacher = teacherRepository.findById(teacherId);
//System.out.println(course.toString());
//	newCourseSession.setCourse(course);
//	newCourseSession.setTeacher(teacher);
//	return courseSessionrepository.save(newCourseSession);
//	return courseRepository.findById(parseIntid)

	// This code below works well -------------------------------------
//	return courseRepository.findById(courseId).map(course -> {
//		newCourseSession.setCourse(course);
//		Teacher teacher = teacherRepository.findById(teacherId);
//		newCourseSession.setTeacher(teacher);
//        return courseSessionrepository.save(newCourseSession);
//    }).orElseThrow(() -> new ResourceNotFoundException("PostId " + courseId + " not found"));
//	
	return courseRepository.findById(courseId).map(course -> {
		newCourseSession.setCourse(course);
		
	 	teacherRepository.findById(teacherId).map(teacher ->{
			 newCourseSession.setTeacher(teacher); 
			 return courseSessionrepository.save(newCourseSession);
		}).orElseThrow(() -> new ResourceNotFoundException("teacherId " + teacherId + " not found"));
		
		//this return is not necessary, I believe
        return courseSessionrepository.save(newCourseSession);
    }).orElseThrow(() -> new ResourceNotFoundException("PostId " + courseId + " not found"));
	
	

}

}
