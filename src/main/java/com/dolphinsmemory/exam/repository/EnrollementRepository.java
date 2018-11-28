package com.dolphinsmemory.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dolphinsmemory.exam.model.Enrollement;
import com.dolphinsmemory.exam.model.EnrollementId;

@Component
@Repository
public interface EnrollementRepository extends JpaRepository<Enrollement, EnrollementId>{

}
