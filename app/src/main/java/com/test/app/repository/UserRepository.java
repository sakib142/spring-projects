package com.test.app.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.app.model.User;

@Repository
public class UserRepository {

	private List<User> userList = new ArrayList<User>(
			Arrays.asList(new User("Sakib", "Bangalore", "9999", "skb@gmail.com")));

	public User createUser(User user) {
		userList.add(user);
		return user;
	}

	public List<User> getAllUser() {
		return userList;
	}

	public User getAllUser(String name) {
		return userList.parallelStream().filter(user -> user.getName().equalsIgnoreCase(name)).findFirst().get();
	}

}
