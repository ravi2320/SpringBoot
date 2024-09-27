package com.springboot.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/index")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String index() {
		return "index";
	}

	@RequestMapping("/about")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String about() {
		return "about";
	}
}
