package com.edwin.BackendToDo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TodoController {
	
	@GetMapping("/")
	public String status() {
		return "todo is working";
	}
	
}

