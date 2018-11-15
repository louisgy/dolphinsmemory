package com.dolphinsmemory.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dolphinsmemory.exam.model.Course;
import com.dolphinsmemory.exam.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
	Teacher findById(int i);
}
