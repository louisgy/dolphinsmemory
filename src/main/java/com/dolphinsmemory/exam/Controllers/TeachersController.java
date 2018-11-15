package com.dolphinsmemory.exam.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dolphinsmemory.exam.model.Teacher;
import com.dolphinsmemory.exam.repository.TeacherRepository;

@RestController
public class TeachersController {
	private final TeacherRepository repository;

	public TeachersController(TeacherRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/teachers")
	List<Teacher> all() {
		return repository.findAll();
	}

	@PostMapping("/teachers")
	Teacher newTeacher (@RequestBody Teacher newTeacher) {
		return repository.save(newTeacher);
	}
	
}
