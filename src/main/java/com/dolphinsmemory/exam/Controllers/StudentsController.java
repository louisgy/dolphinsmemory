package com.dolphinsmemory.exam.Controllers;

import java.net.URI;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.dolphinsmemory.exam.model.Student;
import com.dolphinsmemory.exam.repository.StudentRepository;

@RestController
public class StudentsController {
	
	private static final String template = "Hello, %s!";
	

    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/students")
    public ResponseEntity<Object> createStudent(@RequestBody Student student){
    	Student savedStudent = studentRepository.save(student);
    	URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedStudent.getId()).toUri();

		return ResponseEntity.created(location).build();
    }

	
}
