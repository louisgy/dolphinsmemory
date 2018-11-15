package com.dolphinsmemory.administration;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dolphinsmemory.administration.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
