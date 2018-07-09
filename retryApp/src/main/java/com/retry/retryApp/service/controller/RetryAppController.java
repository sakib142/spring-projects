package com.retry.retryApp.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.retry.retryApp.service.RetryService;

@RestController
public class RetryAppController {

	@Autowired
	RetryService retryService;

	@RequestMapping(value = "/retryTest", method = RequestMethod.GET)
	public ResponseEntity<String> springReTryTest() {

		System.out.println("Inside Retry Test controller");

		try {
			retryService.retryTest();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<String>("Successfull", HttpStatus.OK);
	}

}
