package com.edwin.BackendToDo.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwin.BackendToDo.model.Task;
import com.edwin.BackendToDo.repository.TaskRepository;

@Service
public class TaskServices {
	
	@Autowired
	TaskRepository taskRepository;
	
	public List<Task> getTasks() {
		List<Task> allTask = taskRepository.findAll();
		if(allTask.size() == 0) return allTask;
		return allTask;
	}
	
	public void createTask(Task task) {
		taskRepository.save(task);
	}
	
	public Task getTaskByTaskId(int taskId) {
		Task task = taskRepository.findTaskByTaskId(taskId);
		if(task == null) return null;
		return task;
	}
}
