package com.dolphinsmemory.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.dolphinsmemory.exam.model.CourseSession;

public interface CourseSessionRepository extends JpaRepository<CourseSession, Integer>{

}
