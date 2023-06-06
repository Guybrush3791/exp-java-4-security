package org.java.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@GetMapping("/")
	public String getGuestHome() {
		
		return "home";
	}
	
	@GetMapping("/users")
	public String getUserHome() {
		
		return "users";
	}
	
	@GetMapping("/admin")
	@ResponseBody
	public String getAdminHome() {
		
		return "admins - only admin";
	}
	
	
}
