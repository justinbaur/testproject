package com.testproject.testproject.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestService{

    @Value("${name}")
	String ttt;

    public void greeting(){
		System.out.println("Hello " + ttt);
    }
    
}