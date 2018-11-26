package com.dolphinsmemory.exam.Controllers;

import javax.validation.Valid;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dolphinsmemory.exam.impl.UserServiceImpl;
import com.dolphinsmemory.exam.model.User;

@RestController
public class UserResource {
	
	final UserServiceImpl userServiceimplemented ;
	

public UserResource(UserServiceImpl userServiceimplemented) {
		super();
		this.userServiceimplemented = userServiceimplemented;
	}


@PostMapping("/new-user")
ResponseEntity<String> newUser (@Valid @RequestBody  User newUser, BindingResult bindingResult) {

	if (bindingResult.hasErrors()) {
		String errorMessage = "";
		for (FieldError fieldError : bindingResult.getFieldErrors()) {
			errorMessage += fieldError.getField() + " is invalid"+"\n";
		}

		System.out.println("\n\n"+errorMessage+"\n\n");
		return new ResponseEntity<>(
		          errorMessage, 
		          HttpStatus.BAD_REQUEST);
	}
	
	else if(userServiceimplemented.createUser(newUser) != null ) {
	 return new ResponseEntity<>(
	          "Account successfully created", 
	          HttpStatus.OK);
	}
	else  return new ResponseEntity<>(
	          "Account Creation Failed", 
	          HttpStatus.BAD_REQUEST);
	
}
}
