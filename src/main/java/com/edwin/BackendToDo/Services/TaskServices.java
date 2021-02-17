package com.edwin.BackendToDo.Services;


import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edwin.BackendToDo.model.Task;
import com.edwin.BackendToDo.repository.TaskRepository;

@Service
public class TaskServices {
	
	private TaskRepository taskRepository;
	
	public List<Task> getTasks() {
		List<Task> allTask = taskRepository.findAll();
		if(allTask.size() == 0) return null;
		return allTask;
	}
	
	public void createTask() {
		Task newTask = new Task(1, "Do this shit", new Date(), new Date());
		taskRepository.save(newTask);
	}
}
