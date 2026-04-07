package com.briz.springboot_titans_git_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EController
{
		@RequestMapping("/hello briztech")
	public String hello(){
		return "Navin Sinha!";
	}
	@RequestMapping("/info")
	public String info() {
		return "This is some information about the application.";
	}
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring Boot!";
	}
	@RequestMapping("/greet")
	public String greet() {
		return "Greetings from Spring Boot!";
	}
	@RequestMapping("/info")
	public String info() {
		return "This is an info endpoint";
	}
}

    

		@RequestMapping("testing")
		public String hello1() {
			return "testing";
			
		}
}
