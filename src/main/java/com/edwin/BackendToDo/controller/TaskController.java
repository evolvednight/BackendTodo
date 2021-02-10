package com.edwin.BackendToDo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.edwin.BackendToDo.model.Task;
import com.edwin.BackendToDo.repository.TaskRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/task")
public class TaskController {
	
	@Autowired
	private TaskRepository taskRepository;
	
	@GetMapping("/all")
	public @ResponseBody Iterable<Task> getAllTask() {
		return taskRepository.findAll();
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> createTask() {
		return new ResponseEntity<>("The task is created", HttpStatus.OK);
	}
	
}
