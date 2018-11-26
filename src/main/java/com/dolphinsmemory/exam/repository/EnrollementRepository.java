package com.dolphinsmemory.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dolphinsmemory.exam.model.Enrollement;
import com.dolphinsmemory.exam.model.EnrollementId;

public interface EnrollementRepository extends JpaRepository<Enrollement, EnrollementId>{

}
