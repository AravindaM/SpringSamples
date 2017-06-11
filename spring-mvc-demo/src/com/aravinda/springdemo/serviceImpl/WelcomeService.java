package com.aravinda.springdemo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.aravinda.springdemo.service.GenericWelcomeService;

public class WelcomeService implements GenericWelcomeService {

	@Override
	public List<String> getWeclomeMessage(String name) {
		 List<String> messages = new ArrayList<>();
		 messages.add("Hello!!! ");
		 messages.add(name);
		 messages.add(" , Welcome to the Spring MVC Course.");
		 
		 return messages;
	}

}
