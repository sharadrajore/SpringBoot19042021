package com.zensar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
//@RestController
public class MyController {
	
	// http://localhost:8080/
	
	@RequestMapping("/")
	//@ResponseBody
	public String sayHello() {
		return "hi";
	}

}
