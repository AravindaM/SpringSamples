package com.aravinda.springdemo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aravinda.springdemo.service.RandomizerRequestScope;
import com.aravinda.springdemo.service.RandomizerSessionScope;

@Controller
public class ScopeController {

	@Autowired
	RandomizerRequestScope requestScope;

	@Autowired
	RandomizerSessionScope sessionScope;

	@RequestMapping("/")
	public void getRandom(HttpServletResponse response) throws Exception {
		response.getWriter().write("***************** Request Scope***************** </br>");
		response.getWriter().write(" Old Number: " + requestScope.getRandomNumber() + "</br>");
		requestScope.generateRandomNumber();
		response.getWriter().write(" New Number: " + requestScope.getRandomNumber() + "</br>");
		response.getWriter().write(" Object reference: " + requestScope + "</br>");
		
		
		response.getWriter().write("***************** Session Scope***************** </br>");
		response.getWriter().write(" Old Number: " + sessionScope.getRandomNumber() + "</br>");
		sessionScope.generateRandomNumber();
		response.getWriter().write(" New Number: " + sessionScope.getRandomNumber() + "</br>");
		response.getWriter().write(" Object reference: " + sessionScope + "</br>");
	}
}
