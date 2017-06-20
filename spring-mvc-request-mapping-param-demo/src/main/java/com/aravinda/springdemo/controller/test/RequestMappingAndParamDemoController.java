package com.aravinda.springdemo.controller.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/reqMapParamDemo")
public class RequestMappingAndParamDemoController {
	
	public static Logger LOGGER = LoggerFactory.getLogger(RequestMappingAndParamDemoController.class);

	@RequestMapping(value="/home")
	public String home(){
		return "reqMapParamDemoHome";
	}
	
	@RequestMapping("/test1")
	public String requestMappingAndParamTest1(@RequestParam("orgName") String orgName,Model model){
		model.addAttribute("orgname", orgName);
		model.addAttribute("testserial", "234234-fdsfsd-q123ad-1231");
		return "requestMappingAndParamResults";	
	}
	
}
