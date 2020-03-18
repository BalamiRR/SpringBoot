 package com.fuatkara.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	//localhost:8080/index
	@RequestMapping(value="/index")
	public String Method() {
		System.out.println("Method print!!");
		return "Methods";
	}

	@RequestMapping(value="/ms")
	public String printT() {
		System.out.println("Methods");
		return "MethodSyso";
	}
	
	
	
	
	
	
	
	
}
