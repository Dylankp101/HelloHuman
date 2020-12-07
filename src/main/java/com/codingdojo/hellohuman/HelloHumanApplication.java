package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

@SpringBootApplication
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	@RequestMapping("/")
	public String hello(){
		return "HELLO HUMAN";
	}
	@RequestMapping("/{fname}")
	public String human(@PathVariable ("fname")String fname ) {
		return "Hello " + fname;
	}
	@RequestMapping("/{fname}/{lname}")
	public String human(@PathVariable ("fname")String fname, @PathVariable ("lname")String lname) {
		return "Hello " + fname + lname;
	}
}
