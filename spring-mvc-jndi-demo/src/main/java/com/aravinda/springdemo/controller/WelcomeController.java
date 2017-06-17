package com.aravinda.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.aravinda.springdemo.service.GenericWelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService service;

	@RequestMapping
	public String doWelcome(Model model){
		
		//1. Retrive the process data
		List<String> messages = service.getWeclomeMessage("Aravinda Madushanka");
		
		//2. Add data to the model
		model.addAttribute("welcomeMsg", messages);
		
		//3. return logical view name
		return "welcome"; // /WEB_INF/views/welcome.jsp
	}
}
