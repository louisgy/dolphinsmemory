package com.dolphinsmemory.exam.Controllers;

import java.net.URI;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.dolphinsmemory.exam.model.Student;
import com.dolphinsmemory.exam.repository.StudentRepository;

import advice.StudentNotFoundException;

@RestController
public class StudentsController {
	
	private final StudentRepository repository;
	
	StudentsController(StudentRepository repository) {
		this.repository=repository;
	}
	
	@GetMapping("/students")
	List<Student> all() {
		return repository.findAll();
	}

	@PostMapping("/students")
	Student newStudent(@RequestBody Student newStudent) {
		return repository.save(newStudent);
	}
	
	@GetMapping("/students/{id}")
	Student one(@PathVariable int id) {
		return repository.findById(id)
			.orElseThrow(() -> new StudentNotFoundException(id));
	}
	
	@PutMapping("/students/{id}")
	Student replaceStudent(@RequestBody Student newStudent, @PathVariable int id) {

		return repository.findById(id)
			.map(student -> {
				student.setFirstName(newStudent.getFirstName());
				student.setLastName(newStudent.getLastName());
				return repository.save(student);
			})
			.orElseGet(() -> {
				newStudent.setId(id);
				return repository.save(newStudent);
			});
	}

	@DeleteMapping("/students/{id}")
	void deleteEmployee(@PathVariable int id) {
		repository.deleteById(id);
	}

//    @Autowired
//    private  StudentRepository studentRepository;
//    @PostMapping("/students")
//    public ResponseEntity<Object> createStudent(@RequestBody Student student){
//    	Student savedStudent = studentRepository.save(student);
//    	URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//				.buildAndExpand(savedStudent.getId()).toUri();
//
//		return ResponseEntity.created(location).build();
//    }

	
}
