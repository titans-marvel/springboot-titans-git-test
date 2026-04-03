package com.briz.springboot_titans_git_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EController {

		@RequestMapping("/hello")
	public String hello(){
		return "Navin!";
	}
}
