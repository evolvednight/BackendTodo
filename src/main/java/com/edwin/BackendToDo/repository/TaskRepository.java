package com.edwin.BackendToDo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edwin.BackendToDo.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{
	Task findTaskByTaskId(int id);
}
