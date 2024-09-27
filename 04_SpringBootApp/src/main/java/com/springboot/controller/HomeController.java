package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.services.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/createUser")
	public String registerUser() {
		
		String msg = userService.saveUser();
		System.out.println(msg);
		return "success";
	}
}
