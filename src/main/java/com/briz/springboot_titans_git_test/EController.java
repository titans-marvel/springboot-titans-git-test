package com.briz.springboot_titans_git_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EController
{
	@GetMapping("/aatish")
	public String hello() 
  {
		return "Hii This is a endpoint which is created by aatish";

}


	@GetMapping("/nitin")
	public String getNitin() {
		return "Hello this is an endpoint created by Nitin";
	}
	
	@GetMapping("/teestaatish")
	public String getTeesta() {
		return "Hello this is an endpoint created by Teestaatish";
	}
}
