package com.test.app.service;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.app.exception.UserCreationFailedException;
import com.test.app.model.User;
import com.test.app.repository.UserRepository;

@SpringBootTest
public class UserServiceTest {

	@Mock
	UserRepository userRepository;

	@InjectMocks
	UserService userService;

	@Test
	public void createUser() throws UserCreationFailedException {
		User user = new User("Sakib", "Banglore", "99999", "skb.parker@gmail.com");
		Mockito.when(userRepository.createUser(user)).thenReturn(user);
		assertEquals(userService.createUser(user), user);
		// Mockito.verify(mock, mode)
	}

	@Test
	public void createUserWithoutEmail() {
		User user = new User("Sakib", "Banglore", "99999", null);
		try {
			userService.createUser(user);
			assertFalse(true);
		} catch (UserCreationFailedException e) {
		}

	}

}
