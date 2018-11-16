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
		//if email already existi in database or email format incorrect
		
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
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean authenticate(String username, String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}




	
	

}
