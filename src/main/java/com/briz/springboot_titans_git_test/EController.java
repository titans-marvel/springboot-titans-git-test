package com.briz.springboot_titans_git_test;

 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EController
{
	@RequestMapping("/aatish")
	public String getaatish() 
  {
		return "End point created by aatish!";

  }

		@RequestMapping("/hello")
	public String hello(){
		return "Navinn Sinha!";
	}
  
	@RequestMapping("/test")
	public String test() {
		return "This is a test endpoint";
	}
	
	@RequestMapping("/greet")
	public String greet() {
		return "Welcome to Spring Boot!";
	}
	

	@RequestMapping("/info")
	public String info() {
		return "This is some information about the application.";
	} 

	
		@RequestMapping("testing")
		public String hello1() {
			return "testing";
			
		}
}
