package com.dolphinsmemory.exam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dolphinsmemory.exam.model.Student;
import com.dolphinsmemory.exam.repository.StudentRepository;

@SpringBootApplication
public class DolphinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DolphinsApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner demo(StudentRepository studentRepository) {
//		
//		return(args) -> {
//			studentRepository.save(new Student("","first","last","email","11/12/12","username","domain","grade","f",""));
//		};
//	}
}
