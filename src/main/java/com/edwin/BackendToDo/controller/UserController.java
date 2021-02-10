package com.edwin.BackendToDo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edwin.BackendToDo.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/{id}")
	public User getUser() {
		User user = new User();
		return user;
	}
	
	@PostMapping("/")
	public void createUser() {
		
	}

}
