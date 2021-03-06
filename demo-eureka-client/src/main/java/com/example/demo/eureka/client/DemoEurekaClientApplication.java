package com.example.demo.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class DemoEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaClientApplication.class, args);
	}


	@Value("${foo}")
	String foo;

	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return "hi "+name;
	}

	@RequestMapping("/foo")
	public String foo() {
		return foo;
	}
}
