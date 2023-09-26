package com.AOP.SpringBootAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Advice {

	@Before("execution (* com.AOP.SpringBootAOP.StudentController.myname())")
	 void msg1() {
		 System.err.println("welcome");
	}
		 @After("execution (* com.AOP.SpringBootAOP.StudentController.myname())")
		 void msg2() {
			 System.err.println("bye");
	 }
}
