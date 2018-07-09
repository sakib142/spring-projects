package com.retry.retryApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class RetryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetryAppApplication.class, args);
	}
}
