package com.dolphinsmemory.exam.Controllers;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dolphinsmemory.exam.model.Course;
import com.dolphinsmemory.exam.repository.CourseRepository;

@RestController
public class CoursesController {

private final CourseRepository repository;

CoursesController(CourseRepository repository){
	this.repository=repository;
}
@GetMapping("/courses")
List<Course> all() {
	return repository.findAll();
}

@PostMapping("/courses")
Course newCourse (@RequestBody Course newCourse) {
	return repository.save(newCourse);
}


}