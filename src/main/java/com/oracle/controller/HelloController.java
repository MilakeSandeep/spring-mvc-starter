package com.oracle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	// http://localhost:8080/spring-mvc/sayHello.do
	
	@GetMapping(path = "/sayHello.do")
	public String sayHello()
	{
		return "hello";   		//return to /WEB-INF/views/hello.jsp
	}
}
