package com.dolphinsmemory.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dolphinsmemory.exam.model.Course;

@Repository
public interface CourseRepository  extends JpaRepository<Course, Integer>{
	Course findById(int i);
}
	


