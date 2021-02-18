package com.edwin.BackendToDo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwin.BackendToDo.model.User;
import com.edwin.BackendToDo.repository.UserRepository;

@Service
public class UserServices {

	@Autowired
	UserRepository userRepository;
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public User getUser(int id) {
		User user = userRepository.findUserByUserId(id);
		return user;
	}
}
