package com.testproject.testproject;

import javax.annotation.PostConstruct;

import com.testproject.testproject.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestprojectApplication {

	@Autowired
	TestService service;

	public static void main(String[] args) {
		SpringApplication.run(TestprojectApplication.class, args);
		
	}

	@PostConstruct
	public void init(){
		service.greeting();
	}
}
