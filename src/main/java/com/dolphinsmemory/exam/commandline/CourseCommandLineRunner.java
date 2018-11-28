package com.dolphinsmemory.exam.commandline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.dolphinsmemory.exam.model.Course;
import com.dolphinsmemory.exam.repository.CourseRepository;

@Order(value=4)
@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	CourseRepository courseRepository;
	

	@Override
	public void run(String... args) throws Exception {
		courseRepository.save(new Course("Training","programming","Perl Prog","Perl method","CO234"));
		courseRepository.save(new Course("writing","french","French Action","foreign Language","FR234"));
		courseRepository.save(new Course("Grammar","programming","Java","Java theory","JV342"));
		courseRepository.save(new Course("Maths","Algebra","Applied Maths","math for business","MA344"));
		
	}

}
