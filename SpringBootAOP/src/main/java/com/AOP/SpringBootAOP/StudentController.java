package com.AOP.SpringBootAOP;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@RequestMapping("gopal")
	String myname() {
		
	System.out.println("hi raj");
	
	return "Hello Raj";
}
	}
