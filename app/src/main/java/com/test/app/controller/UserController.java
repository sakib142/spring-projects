package com.test.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.app.exception.UserCreationFailedException;
import com.test.app.model.User;
import com.test.app.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.POST)
	public User createUser(@RequestBody User user) throws UserCreationFailedException {
		return userService.createUser(user);
	}

	@RequestMapping("/{name}")
	public List<User> getAllUsers(@PathVariable (value = "name") String id) {
		return userService.getAllUsers();
	}

}
