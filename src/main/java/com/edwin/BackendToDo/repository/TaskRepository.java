package com.edwin.BackendToDo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwin.BackendToDo.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{
	
}
