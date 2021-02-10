package com.edwin.BackendToDo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class TodoController {
	
	@GetMapping
	public String status() {
		return "todo is working";
	}
	
}

