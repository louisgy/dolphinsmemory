package com.dolphinsmemory.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dolphinsmemory.exam.model.Student;

@Component
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
