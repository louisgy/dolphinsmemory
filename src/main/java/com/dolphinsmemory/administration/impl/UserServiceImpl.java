package com.dolphinsmemory.administration.impl;

import java.util.List;

import com.dolphinsmemory.administration.UserRepository;
import com.dolphinsmemory.administration.UserService;
import com.dolphinsmemory.administration.model.User;

public class UserServiceImpl implements UserService{

	private  final UserRepository userRepository;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	
	}

	@Override
	public User editUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean authenticateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
