package com.dolphinsmemory.administration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dolphinsmemory.administration.impl.UserServiceImpl;
import com.dolphinsmemory.administration.model.User;

@RestController
public class UserResource {
	final UserServiceImpl userServiceimplemented ;
	
	

public UserResource(UserServiceImpl userServiceimplemented) {
		super();
		this.userServiceimplemented = userServiceimplemented;
	}



@PostMapping("/new-user")
ResponseEntity<String> newUser (@RequestBody User newUser) {
	if(userServiceimplemented.createUser(newUser) != null ) {
	 return new ResponseEntity<>(
	          "Account successfully created", 
	          HttpStatus.OK);
	}
	else  return new ResponseEntity<>(
	          "Account Creation Failed", 
	          HttpStatus.BAD_REQUEST);
}
}
