package com.dolphinsmemory.exam.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dolphinsmemory.exam.model.User;
import com.dolphinsmemory.exam.repository.UserRepository;
import com.dolphinsmemory.exam.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private  final UserRepository userRepository;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User createUser(User user) {
		//if email already existi in database or email format incorrect
//		if(userRepository.findByEmail(user.getEmail() != null)){
//			return ("Email is being used");
//		} else if if(userRepository.findByEmail((user.getEmail() = null)){
//			return ("username is being used");
//		}
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
