package com.edwin.BackendToDo.Services;

import org.springframework.stereotype.Service;

import com.edwin.BackendToDo.model.User;
import com.edwin.BackendToDo.repository.UserRepository;

@Service
public class UserServices {

	private UserRepository userRepository;
	
	public void save(User user) {
		userRepository.save(user);
	}

}
