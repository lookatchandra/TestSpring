package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@RestController
@RequestMapping("/test")
public class TestMain {

	@GetMapping("/message")
	public String getMain() {
		return "Hello World!!!!!";
	}
	
	public static void main(String[] args)  throws Exception{
		SpringApplication.run(TestMain.class, args);
		//ObjectMapper
	}
}
