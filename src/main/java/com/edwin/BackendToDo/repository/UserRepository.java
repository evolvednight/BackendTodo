package com.edwin.BackendToDo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwin.BackendToDo.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
