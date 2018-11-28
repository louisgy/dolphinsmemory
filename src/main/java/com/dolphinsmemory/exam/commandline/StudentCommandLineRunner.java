package com.dolphinsmemory.exam.commandline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dolphinsmemory.exam.model.Student;
import com.dolphinsmemory.exam.repository.StudentRepository;

@Component
public class StudentCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory
			.getLogger(StudentCommandLineRunner.class);
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		studentRepository.save(new Student("David","Charles"));
		studentRepository.save(new Student("Joseph","Desources"));
		studentRepository.save(new Student("Pierre","Lariviere"));
		studentRepository.save(new Student("Jerome","Desir"));
		studentRepository.save(new Student("Saget","Classen"));
		studentRepository.save(new Student("Ruth","Derismas"));
		studentRepository.save(new Student("Luc","Fatima"));

		
		
	}

}
