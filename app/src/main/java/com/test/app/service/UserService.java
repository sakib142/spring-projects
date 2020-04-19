package com.test.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.app.exception.UserCreationFailedException;
import com.test.app.model.User;
import com.test.app.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User createUser(User user) throws UserCreationFailedException {
		if ((user.getEmail() == null || user.getName() == null))
			throw new UserCreationFailedException("User Creation failed");
		else {
			return userRepository.createUser(user);
		}

	}

	public List<User> getAllUsers() {
		return userRepository.getAllUser();
	}

}
