package com.edwin.BackendToDo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edwin.BackendToDo.Services.UserServices;
import com.edwin.BackendToDo.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired 
	UserServices userServices;
	
	@GetMapping("/{id}")
	public User getUser() {
		User user = new User();
		return user;
	}
	
	@PostMapping("/")
	public void createUser(@RequestBody User user) {
		userServices.save(user);
	}

}
