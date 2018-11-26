package com.dolphinsmemory.exam.service;

import java.util.List;

import com.dolphinsmemory.exam.model.User;

public interface UserService {
	public User createUser(User user);
	public User editUser(User user);
	public User findUser();
	public List<User>findAllUsers();
	public boolean authenticate(String username, String email, String password);
}
