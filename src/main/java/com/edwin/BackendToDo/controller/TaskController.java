package com.edwin.BackendToDo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.edwin.BackendToDo.Services.TaskServices;
import com.edwin.BackendToDo.model.Task;

@RestController
@RequestMapping("/task")
public class TaskController {
	
	@Autowired
	private TaskServices taskService;
	
	@GetMapping("/all")
	public @ResponseBody Iterable<Task> getAllTask() {
		return taskService.getTasks();
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> createTask() {
		taskService.createTask();
		return new ResponseEntity<>("The task is created", HttpStatus.OK);
	}
	
}
