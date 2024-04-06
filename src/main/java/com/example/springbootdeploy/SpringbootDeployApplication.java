package com.example.springbootdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDeployApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootDeployApplication.class, args);
	}

	@GetMapping
	public String getHello(){
		return "welcome to home";
	}

}
