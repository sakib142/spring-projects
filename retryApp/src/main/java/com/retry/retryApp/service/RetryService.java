package com.retry.retryApp.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class RetryService {

	// try the method 9 times with 2 seconds delay.
	@Retryable(maxAttempts = 9, value = Exception.class, backoff = @Backoff(delay = 2000))
	public void retryTest() throws Exception {

		System.out.println("Retrying....!");
		throw new Exception();
	}

}
