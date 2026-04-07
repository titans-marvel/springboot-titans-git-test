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

public class EController {

		@RequestMapping("/hello")
	public String hello(){
		return "Navinn Sinha!";
	}
	@RequestMapping("/info")
	public String info() {
		return "This is some information about the application.";
	}
}
