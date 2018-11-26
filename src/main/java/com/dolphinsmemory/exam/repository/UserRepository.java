package com.dolphinsmemory.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dolphinsmemory.exam.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
