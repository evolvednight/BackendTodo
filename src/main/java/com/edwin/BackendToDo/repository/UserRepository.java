package com.edwin.BackendToDo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edwin.BackendToDo.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
