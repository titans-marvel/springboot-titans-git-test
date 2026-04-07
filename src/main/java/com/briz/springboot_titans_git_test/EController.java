package com.briz.springboot_titans_git_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EController {

		@RequestMapping("/mukesh")
	public String hello(){
		return "Hello World!";
	}
		@RequestMapping("testing")
		public String hello1() {
			return "testing";
			
		}
}